package win.bigdream.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import win.bigdream.entity.Blog;
import win.bigdream.entity.PageBean;
import win.bigdream.service.BlogService;
import win.bigdream.util.PageUtil;
import win.bigdream.util.StringUtil;

/**
 * 博客主页
 * @author hh
 *
 */
@Controller
@RequestMapping("/")
public class IndexController {
	
	@Resource
	private BlogService blogService;
	
	@RequestMapping("/index")
	public ModelAndView index(@RequestParam(value="page",required=false)String page,@RequestParam(value="typeId",required=false)String typeId,@RequestParam(value="releaseDateStr",required=false)String releaseDateStr,HttpServletRequest request){
		ModelAndView model = new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), 10);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		map.put("typeId", typeId);
		map.put("releaseDateStr", releaseDateStr);
		List<Blog> blogList = blogService.list(map);
		//博客图片从数据库content的html解析出来
		for(Blog blog:blogList){
			List<String> imageList = blog.getImageList();
			String blogInfo = blog.getContent();
			Document doc = Jsoup.parse(blogInfo);
			Elements jpgs = doc.select("img[src$=.jpg]");
			for(int i=0;i<jpgs.size();i++){
				Element jpg = jpgs.get(i);
				imageList.add(jpg.toString());
				if(i==2){
					break;
				}
			}
		}
		model.addObject("blogList", blogList);
		StringBuffer param = new StringBuffer();
		model.addObject("pageCode",PageUtil.genPagination(request.getContextPath()+"/index.html", blogService.getTotal(map), Integer.parseInt(page), 10, param.toString()));
		model.addObject("pageTitle","java开源博客系统");
		model.addObject("mainPage","/foreground/blog/list.jsp");
		model.setViewName("mainTemp");
		return model;
	}
	
	
	/**
	 * 源码下载页面
	 * @return
	 */
	@RequestMapping("/download")
	public ModelAndView download(){
		ModelAndView model = new ModelAndView();
		model.addObject("pageTitle","本站源码下载页面_java开源博客系统");
		model.addObject("mainPage","/foreground/system/download.jsp");
		model.setViewName("mainTemp");
		return model;
	}
}
