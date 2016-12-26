package cn.ucai.day11.exam;

public class Student {
	private String sno;
	private String name;
	private String gender;

	public Student() {
		super();
	}

	public Student(String sno, String name, String gender) {
		this.sno = sno;
		this.name = name;
		this.gender = gender;
	}

	public String getSno(){
		return this.sno;
	}
	
	public void setSno(String sno){
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		String result = "ѧ�ţ�"+sno+" ������"+name;
		if(this.gender.equals("m")){
			result += " �Ա���";
		}else{
			result += " �Ա�Ů";
		}
		return result;
//		return "[sno=" + sno + ", name=" + name + ", gender=" + gender + "]";
	}
}
