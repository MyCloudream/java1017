package cn.ucai.day08.pa2;

/**
 * ��д����д������
 * ʹ��@Overrideע�⣺�����д�﷨
 * 1�������ڸ�������
 * 2��ͬ��ͬ��ͬ����
 * 3����������η����ܱȸ���ĸ���գ�Ҫôһ����Ҫô���ţ�
 * 4�������׳����쳣���ܱȸ�����쳣����
 * 
 * ���أ�
 * 1��������ͬһ������
 * 2��ͬ����ͬ�Σ�����ֵ����û��Ҫ��
 * 3����ͬ�Σ����͡�������˳��ͬ
 * 4���ɱ䳤������������Ҳ�������ع�ϵ��
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
