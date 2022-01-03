package test11;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String config = null;
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		
		if(str.equals("run")) {
			config = "run";
			
		}else if(str.equals("test")) {
			config = "test";
		}
		scanner.close();
		
		// 객체 생성
		GenericXmlApplicationContext ann = new GenericXmlApplicationContext();
		
		ann.getEnvironment().setActiveProfiles(config);
		ann.load("test11/application11_run.xml",
				 "test11/application11_test.xml");	
		
		SerInfo info = ann.getBean("serInfo",SerInfo.class);
		
		System.out.println("ip주소 : " + info.getIpNum());
		System.out.println("port번호 : " + info.getPortNum());
		
		ann.close();
		
	}

}
