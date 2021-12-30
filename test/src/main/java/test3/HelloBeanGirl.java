package test3;

public class HelloBeanGirl implements HelloBean{

	String msg;
	int age;
	Girl helloGirl;
	
	// 스프링을 통해 주입받기 위해 선언(생성자, setter()를 통해 주입)
	public HelloBeanGirl(String msg, int age, Girl helloGirl) {
		this.msg = msg;
		this.age = age;
		this.helloGirl = helloGirl;
	}

	
	
	public void setMsg(String msg) {
		this.msg = msg;
	}



	@Override
	public void printHello(String name) {
		System.out.println(name + "소녀 " + msg + "몇살? " + age);
		System.out.println("당신의 이름은 " + helloGirl.name);
		
	}
}
