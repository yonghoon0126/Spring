package test5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		AbstractApplicationContext abs = 
				new GenericXmlApplicationContext("test5/applicationContext5.xml");
		
		StudentInfo stuInfo = abs.getBean("studentInfo",StudentInfo.class);
		
		stuInfo.getStudentInfo();
		
		Student stu = abs.getBean("student2",Student.class);
		stuInfo.setStudent(stu);
		stuInfo.getStudentInfo();
		
		abs.close();
		
	}

}
