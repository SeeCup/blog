/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;

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

}
