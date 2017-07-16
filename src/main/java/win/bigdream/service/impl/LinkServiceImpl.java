/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.LinkDao;
import win.bigdream.entity.Blogger;
import win.bigdream.entity.Link;
import win.bigdream.service.LinkService;

/**
* 友情链接Service
* @author hh
*
*/
@Service("linkService")
public class LinkServiceImpl implements LinkService {
	
	@Resource
	private LinkDao LinkDao;
	
	/**
	 * 查找友情链接信息
	 * @param map
	 * @return
	 */
	@Override
	public List<Link> list(Map<String, Object> map) {	
		return LinkDao.list(map);
	}

}
