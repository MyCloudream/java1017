package cn.ucai.day17.pa1;

public class SingTeacher extends Teacher{

	private Teacher teacher;
	
	public SingTeacher(Teacher teacher){
		this.teacher = teacher;
	}
		
	@Override
	public void teach() {
		teacher.teach();
		sing();
	}
	
	public void sing(){
		System.out.println("»á³ª¸è");
	}

}
