package cn.ucai.day08.emp;

public class Manager extends Emp {
	private String position;
	private double bounds;

	public Manager() {
	}

	public Manager(String name, int id, double sal, String position, double bounds) {
		super(name, id, sal);
		this.position = position;
		this.bounds = bounds;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getBounds() {
		return bounds;
	}

	public void setBounds(double bounds) {
		this.bounds = bounds;
	}

	@Override
	public String toString() {
		return "Manager [position=" + position + ", bounds=" + bounds + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double getTotalSal(){
		return this.getSal()*12*(1+this.getBounds());
	}
}
