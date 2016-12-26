package cn.ucai.day08.emp;

public class Tech extends Emp {
	private String team;
	private double comm;

	public Tech() {
		super();
	}

	public Tech(String name, int id, double sal, String team, double comm) {
		super(name, id, sal);
		this.team = team;
		this.comm = comm;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "Tech [team=" + team + ", comm=" + comm + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double getTotalSal(){
		return this.getSal()*12+this.getComm();
	}
}
