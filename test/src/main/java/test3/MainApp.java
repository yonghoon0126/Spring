package test3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		
		// 파일형식에 무관하게 읽어와서 객체를 만든다
		Resource resource = new FileSystemResource("src/main/java/test3/applicationContext3.xml");
		
		// 빈 생성
		BeanFactory factory = new XmlBeanFactory(resource);
		
		
		//HelloBean hellobean2 = (HelloBean)factory.getBean("helloBean");
		HelloBean helloBean = factory.getBean("helloBean",HelloBean.class);
		HelloBean hello3 = factory.getBean("hello3",HelloBean.class);
		

		System.out.println("helloBean--->" + helloBean.hashCode());
		System.out.println("helloBean--->" + hello3.hashCode());
		
		// 사용
		helloBean.printHello("안녕안녕!");
		hello3.printHello("하이루!!! ㅎㅎㅎㅋㅋ");
		
		/*Girl*/
		HelloBean helloBeanGirl = factory.getBean("helloBeanGirl",HelloBean.class);
		helloBeanGirl.printHello("나 소녀야...");
		

	}
}
