package win.bigdream.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.BloggerDao;
import win.bigdream.entity.Blogger;
import win.bigdream.service.BloggerService;
@Service("bloggerService")
public class BloggerServiceImpl implements BloggerService {
	
	@Resource
	private BloggerDao bloggerDao;

	@Override
	public Blogger getByUserName(String userName) {
		return bloggerDao.getByUserName(userName);
	}
	
	/**
	 * 查找博主信息
	 * @param userName
	 * @return
	 */
	@Override
	public Blogger find() {
		// TODO Auto-generated method stub
		return bloggerDao.find();
	}

}
