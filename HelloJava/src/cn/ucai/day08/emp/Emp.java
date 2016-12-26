package cn.ucai.day08.emp;

/**
 * 员工
 * abstract修饰的方法称为抽象方法
 * 抽象方法不能有方法体
 * 
 * 如果一个类中有抽象方法，则该类必须也定义为抽象的
 * 子类可以重写该抽象方法
 */
public abstract class Emp {
	private String name;
	private int id;
	private double sal;

	public Emp() {
		super();
	}

	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}

	public abstract double getTotalSal();
//	public double getTotalSal(){};
}
