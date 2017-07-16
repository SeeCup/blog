package win.bigdream.service;

import win.bigdream.entity.Blogger;
/**
 * 博客Service层
 * @author hh
 *
 */
public interface BloggerService {
	
	/**
	 * 通过用户名查用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
	
	/**
	 * 查找博主信息
	 * @param userName
	 * @return
	 */
	public Blogger find();

}
