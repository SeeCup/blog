/**
 * 
 */
package win.bigdream.service.impl;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import win.bigdream.entity.Blog;
import win.bigdream.entity.BlogType;
import win.bigdream.entity.Blogger;
import win.bigdream.entity.Link;
import win.bigdream.service.BlogService;
import win.bigdream.service.BlogTypeService;
import win.bigdream.service.BloggerService;
import win.bigdream.service.LinkService;

/**
 * @author hh
 *
 */
@Component
public class InitComponent implements ServletContextListener,ApplicationContextAware {
	
	private static ApplicationContext applicationContext;
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext application = sce.getServletContext();
		BloggerService bloggerService = (BloggerService)applicationContext.getBean("bloggerService");
		Blogger blogger = bloggerService.find();
		blogger.setPassword(null);
		application.setAttribute("blogger", blogger);
		
		LinkService linkService = (LinkService) applicationContext.getBean("linkService");
		List<Link> linkList =linkService.list(null);
		application.setAttribute("linkList", linkList);
		
		BlogTypeService blogTypeService = (BlogTypeService) applicationContext.getBean("blogTypeService");
		List<BlogType> blogTypeCountList =blogTypeService.countList();//查询博客类型，博客类型总数
		application.setAttribute("blogTypeCountList", blogTypeCountList);
		
		BlogService blogService = (BlogService) applicationContext.getBean("blogService");
		List<Blog> blogCountList =blogService.countList();//按日期查询博客，博客总数
		application.setAttribute("blogCountList", blogCountList);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}

}
