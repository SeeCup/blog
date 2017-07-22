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
	

}
