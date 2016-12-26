package cn.ucai.day11.exception;

/**
 * �Զ����쳣��
 * 1������һ���쳣�ࣺ�̳���Exception��������,Ҳ���Լ̳���RuntimeException
 * 2���ṩһ��String�������Ĺ��췽��
 * 
 * �Զ����쳣��ʹ�ã�
 * ͨ��throw + �Զ����쳣�Ķ��������׳���
 */
public class TestMyException {
	public static void main(String[] args) {
		try {
			String str = getUser("����");
			System.out.println("�ҵ���");
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	// ��������в���������ͬѧ������ҵĵ����򷵻ظ�ͬѧ����Ϣ������Ҳ������򷵻�null��
	public static String getUser(String name) throws MyException{
		String[] strArr = {"�ŷ�","����","����"};
		for(int i=0;i<strArr.length;i++){
			if(strArr[i].equals(name)){
				return strArr[i];
			}
		}
		throw new MyException("�Ҳ���");// ����������
//		return null;
	}
}

class MyException extends Exception{
	public MyException(){}
	
	public MyException(String msg){
		super(msg);
	}
}
