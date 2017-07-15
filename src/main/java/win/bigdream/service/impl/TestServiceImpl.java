package win.bigdream.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import win.bigdream.dao.TestDao;
import win.bigdream.service.TestService;

/**
 * 测试ServiceImpl
 * @author hh
 *
 */
@Service("testService")
public class TestServiceImpl implements TestService {
	//@autowired
	@Resource
	private  TestDao testDao;
	
	@Override
	public List<Map<String, Object>> getTest() {
		return testDao.getTest();
	}

}
