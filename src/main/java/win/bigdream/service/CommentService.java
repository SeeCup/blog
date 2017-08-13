package win.bigdream.service;

import java.util.List;
import java.util.Map;

import win.bigdream.entity.Comment;

/**
 * 博客评论Service
 * @author hh
 *
 */
public interface CommentService {
	
	/**
	 * 根据博客id和状态查询评论
	 * @param map
	 * @return
	 */
	public List<Comment> list(Map<String,Object> map);
	
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment);
}
