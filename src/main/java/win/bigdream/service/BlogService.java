package win.bigdream.service;

import java.util.List;
import java.util.Map;

import win.bigdream.entity.Blog;
import win.bigdream.entity.BlogType;
import win.bigdream.entity.Blogger;
/**
 * 博客文章Service层
 * @author hh
 *
 */
public interface BlogService {
	
	/**
	 * 按日期统计博客数量
	 * @param userName
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
