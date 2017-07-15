/**
 * 
 */
package win.bigdream.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import win.bigdream.service.BloggerService;

/**
 * 管理博主Controller层
 * @author hh
 *
 */
@Controller
@RequestMapping("/admin/bloger")
public class BloggerAdminController {
	
	@Resource
	private BloggerService bloggerService;

}
