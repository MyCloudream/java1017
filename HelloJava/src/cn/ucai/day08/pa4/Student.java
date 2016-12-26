package cn.ucai.day08.pa4;

public class Student extends Person{
	private String sno;

	public Student() {
		super();
	}

	public Student(String name, int age,String sno) {
		super(name, age);
		this.sno = sno;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + getName() + ", age=" + getAge() + "]";
	}
	
}
