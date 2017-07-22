package win.bigdream.service;

import java.util.List;

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
	

}
