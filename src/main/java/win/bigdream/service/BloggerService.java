package win.bigdream.service;

import win.bigdream.entity.Blogger;

public interface BloggerService {
	
	/**
	 * 通过用户名查用户
	 * @param userName
	 * @return
	 */
	public Blogger getByUserName(String userName);

}
