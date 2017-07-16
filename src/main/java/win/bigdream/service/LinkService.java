package win.bigdream.service;

import java.util.List;
import java.util.Map;

import win.bigdream.entity.Blogger;
import win.bigdream.entity.Link;
/**
 * 友情链接Service
 * @author hh
 *
 */
public interface LinkService {
	
	/**
	 * 查找友情链接信息
	 * @param map
	 * @return
	 */
	public List<Link> list(Map<String,Object> map);

}
