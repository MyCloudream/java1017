package cn.ucai.day08.pa1;

/**
 * ��A extends B ʱ��
 * A��Ϊ���ࡢ��չ�ࡢ������
 * B��Ϊ���ࡢ���ࡢ���ࡣ
 * 
 * this:���൱ǰ����
 * 1��this.���ñ�������Ի򷽷�
 * 2��this()���ñ���������Ĺ��췽��
 * super : �������
 * 1��super.���ø�������Ի򷽷�
 * 2��super()���ø���Ĺ��췽��
 * 
 * 1���κι��췽���ĵ�һ�У�����this([]),����super([]),���߲���ͬʱ����
 * 2�����һ�������ĵ�һ�в���this([]),Ҳ����super([]),��Ĭ����super();
 */
public class Student extends Person{
	private String sno;
	
	public Student(){
		super();
	}
	
	public Student(String sno,String name,int age){
//		super(name,age);
		this();
		this.sno = sno;
		/*this.setName(name);
		this.setAge(age);*/
		/*super.setName(name);
		super.setAge(age);*/
	}
}
