package test7;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import test7.Student;

// xml 환경파일을 자바에 환경파일에 import 시킴
@Configuration
@ImportResource("test7/applicationContext7.xml") // xml파일을 여기에 포함 시킴

public class ApplicationConfig {
   
	@Bean
	public Student student1() {

		ArrayList<String> hobbys = new ArrayList<String>();

		hobbys.add("공상 영화보기");
		hobbys.add("잠자기");

		Student student = new Student("장길산", 20, hobbys);
		student.setHeight(190);
		student.setWeight(90);

		return student;

	}

}
