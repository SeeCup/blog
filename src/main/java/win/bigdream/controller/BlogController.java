/**
 * 
 */
package win.bigdream.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import win.bigdream.entity.Blog;
import win.bigdream.service.BlogService;
import win.bigdream.service.CommentService;
import win.bigdream.util.StringUtil;

/**
 * 博客文章Controller
 * @author hh
 *
 */
@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@Resource
	private BlogService blogService;
	
	@Resource
	private CommentService commentService;
	
	@RequestMapping("/articles/{id}")
	public ModelAndView details(@PathVariable("id")Integer id,HttpServletRequest request)throws Exception{
		ModelAndView model = new ModelAndView();
		Blog blog = blogService.findById(id);
		//增加关键词
		String keyWords = blog.getKeyWord();
		if(StringUtil.isNotEmpty(keyWords)){
			String arr[] = keyWords.split(" ");
			model.addObject("keyWords", StringUtil.filterWhite(Arrays.asList(arr)));
		}else{
			model.addObject("keyWords",null);
		}
		model.addObject("blog",blog);
		blog.setReplyHit(blog.getClickHit()+1);
		blogService.update(blog);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("blogId", blog.getId());
		map.put("state", "1");
		model.addObject("commentList",commentService.list(map));
		model.addObject("pageCode", this.getUpAndDownPageCode(blogService.getLastBlog(id), blogService.getNextBlog(id), request.getServletContext().getContextPath()));
		model.addObject("pageTitle",blog.getTitle()+"java开源博客系统");
		model.addObject("mainPage","/foreground/blog/view.jsp");
		model.setViewName("mainTemp");
		return model;
	}
	
	/**
	 * 获取博客上一页和下一页
	 * @param lastBlog
	 * @param nextBlog
	 * @param projectContext
	 * @return
	 */
	private String getUpAndDownPageCode(Blog lastBlog,Blog nextBlog,String projectContext){
		StringBuffer pageCode = new StringBuffer();
		if(lastBlog==null || lastBlog.getId()==null){
			pageCode.append("<p>上一篇：没有了<p>");
		}else{
			pageCode.append("<p>上一篇：<a href="+projectContext+"/blog/articles/"+lastBlog.getId()+".html>"+lastBlog.getTitle()+"</a><p>");
		}
		if(nextBlog==null || nextBlog.getId()==null){
			pageCode.append("<p>下一篇：没有了<p>");
		}else{
			pageCode.append("<p>下一篇：<a href="+projectContext+"/blog/articles/"+nextBlog.getId()+".html>"+nextBlog.getTitle()+"</a><p>");
		}
		return pageCode.toString();
	}
	
}
