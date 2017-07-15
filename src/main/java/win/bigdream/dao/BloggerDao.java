package win.bigdream.dao;

import win.bigdream.entity.Blogger;

public interface BloggerDao {
	
	/**
	 * 通过用户名查用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);
}
