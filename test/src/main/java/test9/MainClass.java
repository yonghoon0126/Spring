package test9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		AdminCnn admin = ann.getBean("adminconfig",AdminCnn.class);
		
		System.out.println("admin.id = " + admin.getAdminId());
		System.out.println("admin.pw = " + admin.getAdminPw());
		System.out.println("sub_admin.id = " + admin.getSub_adminId());
		System.out.println("sub_admin.pw = " + admin.getSub_adminPw());
		ann.close();

	}
}
