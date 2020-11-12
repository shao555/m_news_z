package com.cs.test;
import com.cs.entity.NewsDetail;
import org.junit.Test;
import com.cs.service.NewsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.util.List;

public class NewsTest {
	
	
	
	@Test
	public void findAllNews() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		NewsService ns = (NewsService) act.getBean("service");
		List<NewsDetail> list = ns.findAllNews();
//		System.out.println(list);
		for (NewsDetail n : list) {
			System.out.println(
					n.getId() + "  " + n.getTitle() + "  " + n.getSummary()
					+ "  " + n.getAuthor() + "  " + n.getCreateDate() + "  " + n.getUpdateDate()
			);
		}
	}
	
	@Test
	public void findCount() throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("applicationContext.xml");
		NewsService ns = (NewsService) act.getBean("service");
		int count = ns.findCountByTitle("杰");
		System.out.println(count);
	}
	
	

}
