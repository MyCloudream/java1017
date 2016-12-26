package cn.ucai.day17.pa1;

/**
 * 包装设计模式（装饰设计模式）：对原功能进行了扩展。
 * 使用场景：
 * 1、子类多
 * 2、子类中有相同或相似的功能
 */
public class Test {
	public static void main(String[] args) {
		// 1、要一个会唱歌的java 老师
		/*JavaTeacher jt = new JavaTeacher();
		SingTeacher st = new SingTeacher(jt);
		st.teach();*/
		
		// 2、会唱歌 会讲笑话的JAVA老师
		JavaTeacher jt = new JavaTeacher();// 基本类、被包装类
		JokeTeacher jokeTeacher = new JokeTeacher(jt);// 包装类、扩展类
		SingTeacher st = new SingTeacher(jokeTeacher);
		
		st.teach();
	}
}
