/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.BlogDao;
import win.bigdream.entity.Blog;
import win.bigdream.service.BlogService;

/**
 * 博客文章Service
 * @author hh
 *
 */
@Service("blogService")
public class BlogServiceImpl implements BlogService {
	
	@Resource
	private BlogDao blogDao;

	/**
	 * 按日期查询博客数量
	 */
	@Override
	public List<Blog> countList() {
		return blogDao.countList();
	}
	
	/**
	 * 分页查出博客数量
	 * @param
	 * @return
	 */
	public List<Blog> list(Map<String,Object> map){
		return blogDao.list(map);
	};
	
	/**
	 * 获得博客总记录数
	 * @return
	 */
	public Long getTotal(Map<String,Object> map){
		return blogDao.getTotal(map);
	};
	
	/**
	 * 根据id查出博客文章
	 * @param id
	 * @return
	 */
	public Blog findById(Integer id){
		return blogDao.findById(id);
	};
	
	/**
	 * 根据id更新博客内容
	 * @param blog
	 */
	public void update(Blog blog){
		blogDao.update(blog);
	};
}
