package win.bigdream.dao;

import java.util.List;

import win.bigdream.entity.BlogType;
import win.bigdream.entity.Blogger;
/**
 * 博客类型Dao
 * @author hh
 *
 */
public interface BlogTypeDao {
		
	/**
	 * 按类型统计博客总数
	 * @param 
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
