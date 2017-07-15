package win.bigdream.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import win.bigdream.service.TestService;

/**
 * 测试Control
 * @author hh
 *
 */
@Controller
@RequestMapping("/Test")
public class TestController {
	
	@Resource
	private TestService testService;
	
	@RequestMapping("index")
	public ModelAndView testIndex(){
		ModelAndView model = new ModelAndView("/WEB-INF/page/test");
		System.out.println("进来了");
		return model;
	}
	
	@RequestMapping("data")
	public ModelAndView data(HttpServletRequest request,HttpServletResponse response,@RequestParam HashMap<String,Object> param){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("Data", testService.getTest());
		ModelAndView model = new ModelAndView("/WEB-INF/page/data",map);
		return model;
	}

}
