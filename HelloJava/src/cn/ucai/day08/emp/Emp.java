package cn.ucai.day08.emp;

/**
 * Ա��
 * abstract���εķ�����Ϊ���󷽷�
 * ���󷽷������з�����
 * 
 * ���һ�������г��󷽷�����������Ҳ����Ϊ�����
 * ���������д�ó��󷽷�
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
