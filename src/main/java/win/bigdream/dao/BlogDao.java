package win.bigdream.dao;

import java.util.List;
import java.util.Map;

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
		
	/**
	 * 分页查出博客数量
	 * @param
	 * @return
	 */
	public List<Blog> list(Map<String,Object> map);
	
	/**
	 * 获得博客总记录数
	 * @return
	 */
	public Long getTotal(Map<String,Object> map);
}
