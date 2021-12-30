package test5;

public class Student {

	private String name;
	private int age;
	private String gradeNum;
	private String classNum;

	public Student(String name, int age, String gradeNum, String classNum) {
		this.name = name;
		this.age = age;
		this.gradeNum = gradeNum;
		this.classNum = classNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGradeNum() {
		return gradeNum;
	}

	public void setGradeNum(String gradeNum) {
		this.gradeNum = gradeNum;
	}

	public String getClassNum() {
		return classNum;
	}

	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", " + "gradeNum=" + gradeNum + ", classNum=" + classNum
				+ "]";
	}

}
