package test12Aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQuickStart {

	public static void main(String[] args) {
		String[] configLocations = new String[] {"test12Aop/acQuickStart.xml"};
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(configLocations);

		WriteArticleService articleService = 
				(WriteArticleService) context.getBean("writeArticleService");
		
		articleService.write(new Article());
	}
}	
