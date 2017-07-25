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
	
	/**
	 * 根据id查出博客文章
	 * @param id
	 * @return
	 */
	public Blog findById(Integer id);
	
	/**
	 * 根据id更新博客内容
	 * @param blog
	 */
	public void update(Blog blog);
	
	/**
	 * 根据id查出上一页
	 * @param id
	 * @return
	 */
	public Blog getLastBlog(Integer id);
	
	/**
	 * 根据id查出下一页
	 * @param id
	 * @return
	 */
	public Blog getNextBlog(Integer id);
}
