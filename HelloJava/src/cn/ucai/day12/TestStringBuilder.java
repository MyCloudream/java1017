package cn.ucai.day12;

/**
 * ��Դ��ģ��String��ƴ�ӣ�ʹ��StringBuilder����StringBuffer
 * 
 * StringBuilder StringBuffer 
 * ����
 * 1��StringBuilder��1.5��ʼ��StringBuffer��1.0��ʼ
 * 2��StringBuilder��֧�ֶ��̣߳��̲߳���ȫ�� StringBuffer�̰߳�ȫ��֧�ֶ��̣߳�
 * 3��StringBuilderЧ�ʸߣ�StringBufferЧ�ʵ�
 * 
 * ArrayList Vector
 * Hashtable HashMap
 * 
 * ����ƽʱ���õģ�����Ч�ʸߵġ�
 * 
 * String��StringBuilder��StringBuffer����ϵ��
 * ����CharSequence�ӿڵ�ʵ����
 */
public class TestStringBuilder {
	public static void main(String[] args) {
		String s1 = "zhangsan";
		String s2 = "123456";
		String s3 = "18911011001";
		String s4 = "zhangsan@ucai.cn";
		String s5 = "87Fak8";
		String s6 = "#";
		// "zhangsan#" "zhangsan#123456" "zhangsan#123456#"
		String str = s1+s6+s2+s6+s3+s6+s4+s6+s5;
		
		System.out.println(str);
		
		// 1���ַ�������δ治�����ȵ����ݣ� ���������
		// 2��
		/*StringBuilder builder = new StringBuilder();
		builder.append(s1).append(s6).append(s2).append(s6)
		.append(s3).append(s6).append(s4).append(s6).append(s5);
		String strResult = builder.toString();
		System.out.println(builder);
		System.out.println(builder.toString());
		System.out.println(strResult);*/
		
		StringBuffer buffer = new StringBuffer();
		buffer.append(s1).append(s6).append(s2).append(s6)
		.append(s3).append(s6).append(s4).append(s6).append(s5);
		String strResult2 = buffer.toString();
		System.out.println(buffer);
		System.out.println(buffer.toString());
		System.out.println(strResult2);
	}
}
