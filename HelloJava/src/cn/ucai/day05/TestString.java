package cn.ucai.day05;

import java.util.ArrayList;
import java.util.List;

public class TestString {
	public static void main(String[] args) {
		/*String s1 = "abc";
		String s2 = "def";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		
		String str = null;
//		if(str==null || str.trim().length()==0 || str.trim().isEmpty())
		
		String name = "������";
		System.out.println(name.startsWith("��"));
		String fileName = "Hello.java";
		System.out.println(fileName.endsWith(".java"));*/
		
		String[] strArr = {"����","����","������","�߽�˶","�Ժ���","����","֣ȫ��",
				"�κ���","����","��ǿ","�","����ǿ","��ӱ","�ܾ�","����","�����","��ŵ˹","����","�ŷ�",
				"��Ȼ","������","����","����","����һ","����","��Ƚ","��һ��","����","��ӯ","κ����","������",
				"��һ��","¬����","Ԭ��","�ձ�","�¿���","��Ⱥ","���׿�","�׷�","��̴","�Դ���","������","������",
				"������","����","�ﺺ��","����","��׳","������","ʯ��","����","˾��","���پ�","��ͦ��","������",
				"��ԣ��","�","�Ϸ���","�ܴ�","��С��"};
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		List<String> list3 = new ArrayList<String>();
		List<String> list4 = new ArrayList<String>();
		int count1 = 0,count2 = 0,count3 = 0,count4 = 0;
		for(int i=0;i<strArr.length;i++){
			String s = ((int)strArr[i].charAt(1)+"").substring(4);
			System.out.println(s);
			if(s.equals("1") || s.equals("9")){
				list1.add(strArr[i]);
				count1 ++ ;
			}else if(s.equals("2") || s.equals("8")){
				list2.add(strArr[i]);
				count2 ++ ;
			}else if(s.equals("3")  || s.equals("7") || s.equals("5") || s.equals("0")){
				list3.add(strArr[i]);
				count3 ++;
			}else if(s.equals("4") || s.equals("6")){
				list4.add(strArr[i]);
				count4 ++;
			}
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		System.out.println(count1 + ":" + count2 + ":" + count3 + ":" + count4);
	}
}
