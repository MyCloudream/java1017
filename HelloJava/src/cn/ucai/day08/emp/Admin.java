package cn.ucai.day08.emp;

public class Admin extends Emp {
	private String car;

	public Admin() {
		super();
	}

	public Admin(String name, int id, double sal, String car) {
		super(name, id, sal);
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Admin [car=" + car + ", toString()=" + super.toString() + "]";
	}

	@Override
	public double getTotalSal() {
		return this.getSal()*12;
	}
	
	

}
