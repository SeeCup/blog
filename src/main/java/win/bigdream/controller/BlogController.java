/**
 * 
 */
package win.bigdream.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import win.bigdream.entity.Blog;
import win.bigdream.service.BlogService;

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
	
	@RequestMapping("/articles/{id}")
	public ModelAndView details(@PathVariable("id")Integer id,HttpServletRequest request)throws Exception{
		ModelAndView model = new ModelAndView();
		Blog blog = blogService.findById(id);
		model.addObject("blog",blog);
		blog.setReplyHit(blog.getClickHit()+1);
		blogService.update(blog);
		model.addObject("pageTitle",blog.getTitle()+"java开源博客系统");
		model.addObject("mainPage","/foreground/blog/view.jsp");
		model.setViewName("mainTemp");
		return model;
	}

}
