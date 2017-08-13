/**
 * 
 */
package win.bigdream.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import win.bigdream.entity.Blog;
import win.bigdream.entity.Comment;
import win.bigdream.service.BlogService;
import win.bigdream.service.CommentService;
import win.bigdream.util.ResponseUtil;

/**
 * 评论Controller层
 * @author hh
 *
 */
@Controller
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	private CommentService commentService;
	
	@Resource
	private BlogService blogService;
	
	@RequestMapping("save")
	public String save(Comment comment,@RequestParam("imageCode")String imageCode,
			HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception{
		String sRand = (String) session.getAttribute("sRand");
		JSONObject result = new JSONObject();
		int resultTotal = 0;
		//验证
		if(!imageCode.equals(sRand)){
			result.put("success", false);
			result.put("errorInfo", "输入验证码错误！");
		}else{//获取用户ip，增加评论，回复数加1
			String userIp = request.getRemoteAddr();
			comment.setUserIp(userIp);
			if(comment.getId() == null){
				resultTotal = commentService.add(comment);
				Blog blog = blogService.findById(comment.getBlog().getId());
				blog.setReplyHit(blog.getReplyHit()+1);
				blogService.update(blog);
			}else{
				
			}	
		}
		if(resultTotal>0){
			result.put("success",true);
		}else{
			result.put("success", false);
		}
		ResponseUtil.write(response,result);
		return null;
	}
}
