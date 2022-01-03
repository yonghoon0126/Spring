package test6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import test6.Student;

public class MainClass {

	public static void main(String[] args) {

		// 객체 생성
		AbstractApplicationContext abs = 
				new ClassPathXmlApplicationContext("classpath:test6/applicationContext6.xml");
		
		Student student1 = abs.getBean("student1",Student.class);
		System.out.println("이	름 : " + student1.getName());
		System.out.println("나	이 : " + student1.getAge());
		System.out.println("취	미 : " + student1.getHobby());
		System.out.println("키	: " + student1.getHeight());
		System.out.println("몸무게 : " + student1.getWeight());
		
		System.out.println("****************************************");
		
		Student student2 = abs.getBean("student2",Student.class);
		System.out.println("이	름 : " + student2.getName());
		System.out.println("나	이 : " + student2.getAge());
		System.out.println("취	미 : " + student2.getHobby());
		System.out.println("키	: " + student2.getHeight());
		System.out.println("몸무게 : " + student2.getWeight());
		
		
		
		
	}

}

