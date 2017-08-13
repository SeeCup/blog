/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.CommentDao;
import win.bigdream.entity.Comment;
import win.bigdream.service.CommentService;

/**
 * 博客评论ServiceImpl
 * @author hh
 *
 */
@Service("commentService")
public class ComentServiceImpl implements CommentService {
	
	@Resource
	private CommentDao commentDao;
	
	/**
	 * 根据博客id和状态查询评论
	 * @param map
	 * @return
	 */
	@Override
	public List<Comment> list(Map<String, Object> map) {
		return commentDao.list(map);
	}
	
	/**
	 * 添加评论
	 * @param comment
	 * @return
	 */
	public int add(Comment comment){
		return commentDao.add(comment);
	};
}
