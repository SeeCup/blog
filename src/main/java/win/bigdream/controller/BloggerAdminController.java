/**
 * 
 */
package win.bigdream.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import net.sf.json.JSONObject;
import win.bigdream.entity.Blog;
import win.bigdream.entity.Blogger;
import win.bigdream.service.BlogService;
import win.bigdream.service.BloggerService;
import win.bigdream.util.ResponseUtil;

/**
 * 管理博主Controller层
 * @author hh
 *
 */
@Controller
@RequestMapping("/admin/blog")
public class BloggerAdminController {
	
	@Resource
	private BlogService blogService;
	
	/**
	 * 添加或者修改博客信息
	 * @param blog
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save(Blog blog,HttpServletResponse response) throws Exception{
		int resultTotal = 0;
		if(blog.getId()==null){
			resultTotal = blogService.add(blog);
		}else{
			
		}
		JSONObject result = new JSONObject();
		if(resultTotal>0){
			result.put("success", true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response, result);
		return null;
	}

}
