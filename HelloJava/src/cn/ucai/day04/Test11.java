package cn.ucai.day04;

public class Test11 {
	public static void main(String[] args) {
		String fileName = "Helle.World.java";
		int index = fileName.lastIndexOf(".");
		String suffix = fileName.substring(index+1);
		System.out.println(suffix);
		/*String s1="��288";
		String s2="��Ǯ��38";
		String s3 = s1.substring(1);
		String s4 = s2.substring(1);
		System.out.println(s3+":"+s4);
		int n1 = Integer.parseInt(s3);
		int n2 = Integer.parseInt(s4);
		System.out.println(n1+n2);*/
		
		String s1="�۸�288";
		String s2="��Ǯ��38";
		// ��ȡĳ���ַ����״γ��ֵ��±�
		int index1 = s1.indexOf("��");
		String p1 = s1.substring(index1+1);
		int index2 = s2.indexOf("��");
		String p2 = s2.substring(index2+1);
		
		// String����תΪint����
		int niP1 = Integer.parseInt(p1);
		int niP2 = Integer.parseInt(p2);
		System.out.println("�ܼ۸�Ϊ��"+(niP1+niP2));
	}
}
