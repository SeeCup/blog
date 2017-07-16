/**
 * 
 */
package win.bigdream.dao;

import java.util.List;
import java.util.Map;

import win.bigdream.entity.Link;

/**
 * 友情链接Dao
 * @author hh
 *
 */
public interface LinkDao {
	
	public List<Link> list(Map<String,Object> map);
}
