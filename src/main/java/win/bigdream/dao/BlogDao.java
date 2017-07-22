package win.bigdream.dao;

import java.util.List;

import win.bigdream.entity.Blog;
/**
 * 博客文章Dao
 * @author hh
 *
 */
public interface BlogDao {
		
	/**
	 * 按日期统计博客数量
	 * @param 
	 * @return
	 */
	public List<Blog> countList();
}
