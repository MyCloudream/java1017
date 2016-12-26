package cn.ucai.day08.pa2;

/**
 * 重写、覆写、覆盖
 * 使用@Override注解：检测重写语法
 * 1、发生在父子类中
 * 2、同名同参同返回
 * 3、子类的修饰符不能比父类的更封闭（要么一样，要么开放）
 * 4、子类抛出的异常不能比父类的异常更大
 * 
 * 重载：
 * 1、发生在同一个类中
 * 2、同名不同参，返回值类型没有要求
 * 3、不同参：类型、个数、顺序不同
 * 4、可变长参数和其他的也构成重载关系。
 */
public class Student extends Person{
	private String sno;
	
	public Student(){
		super();
	}
	
	public Student(String sno,String name,int age){
		super(name,age);
		this.sno = sno;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}
	
	@Override
	public void desc(){
		System.out.println(sno+":"+this.getName()+":"+this.getAge());
	}
}
