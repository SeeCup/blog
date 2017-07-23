package win.bigdream.service;

import java.util.List;

import win.bigdream.entity.BlogType;
import win.bigdream.entity.Blogger;
/**
 * 博客类型Service层
 * @author hh
 *
 */
public interface BlogTypeService {
	
	/**
	 * 按博客类型查询博客数量
	 * @param userName
	 * @return
	 */
	public List<BlogType> countList();
	
	/**
	 * 通过id查找博客类型
	 * @param id
	 * @return
	 */
	public BlogType findById(Integer id);
}
