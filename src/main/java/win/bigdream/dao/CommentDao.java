package win.bigdream.dao;

import java.util.List;
import java.util.Map;

import win.bigdream.entity.Comment;

/**
 * 博客评论Dao
 * @author hh
 *
 */
public interface CommentDao {

	/**
	 * 根据博客id和状态查询评论
	 * @param map
	 * @return
	 */
	public List<Comment> list(Map<String,Object> map);
}
