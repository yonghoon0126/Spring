package test10;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		
		// @환경파일 읽어와 객체 생성하기
		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext();
		
		
		// 환경 설정 정보를 getEnviroment()가져오는 메소드
		// 가져온 정보에 config값을 세팅해줌
		ann.getEnvironment().setActiveProfiles(config);
		
		// 등록해줌
		ann.register(AppConfigRun.class,AppConfigTest.class);
		ann.refresh(); // 설정 끝
		SerInfo info = ann.getBean("serverinfo",SerInfo.class);
		
		System.out.println("Ip주소 : " + info.getIpNum());
		System.out.println("Port번호 : " + info.getPortNum());
		
		ann.close();
		
	}
}
