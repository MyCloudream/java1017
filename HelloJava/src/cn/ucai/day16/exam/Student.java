package cn.ucai.day16.exam;

/**
 * —ß…˙¿‡
 */
public class Student/* implements Comparable<Student>*/{
	private String name;
	private String className;
	private int score;

	public Student() {
		super();
	}

	public Student(String name, String className, int score) {
		super();
		this.name = name;
		this.className = className;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", className=" + className + ", score=" + score + "]";
	}
/*
	@Override
	public int compareTo(Student o) {
		return o.getScore()-this.getScore();
	}
*/
}