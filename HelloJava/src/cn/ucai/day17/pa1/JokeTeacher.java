package cn.ucai.day17.pa1;

public class JokeTeacher extends Teacher{

	private Teacher teacher;
	
	public JokeTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	@Override
	public void teach() {
		teacher.teach();
		joke();
	}
	
	public void joke() {
		System.out.println("»á½²Ð¦»°");
	}

}
