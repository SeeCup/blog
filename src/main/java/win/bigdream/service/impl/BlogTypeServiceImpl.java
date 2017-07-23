/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.BlogTypeDao;
import win.bigdream.entity.BlogType;
import win.bigdream.service.BlogTypeService;

/**
 * 博客类型
 * @author hh
 *
 */
@Service("blogTypeService")
public class BlogTypeServiceImpl implements BlogTypeService {
	
	@Resource
	private BlogTypeDao blogTypeDao;
	/**
	 * 按类型查询博客数量
	 */
	@Override
	public List<BlogType> countList() {
		return blogTypeDao.countList();
	}
	
	/**
	 * 通过id查找博客类型
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id){
		return blogTypeDao.findById(id);
	};
}
