package win.bigdream.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import win.bigdream.entity.Blog;
import win.bigdream.entity.PageBean;
import win.bigdream.service.BlogService;
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
	public ModelAndView index(@RequestParam(value="page",required=false)String page){
		ModelAndView model = new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		PageBean pageBean = new PageBean(Integer.parseInt(page), 10);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("start", pageBean.getStart());
		map.put("size", pageBean.getPageSize());
		List<Blog> blogList = blogService.list(map);
		model.addObject("blogList", blogList);
		model.addObject("pageTitle","java开源博客系统");
		model.addObject("mainPage","/foreground/blog/list.jsp");
		model.setViewName("mainTemp");
		return model;
	}

}
