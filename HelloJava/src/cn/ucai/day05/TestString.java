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
		
		String name = "李鹏鹏";
		System.out.println(name.startsWith("李"));
		String fileName = "Hello.java";
		System.out.println(fileName.endsWith(".java"));*/
		
		String[] strArr = {"金磊","张雷","郭鸿琨","高金硕","赵红旗","张涛","郑全友",
				"任海东","张翔","葛强","杨俊","杨文强","何颖","曹娟","孙宇","吕昊臻","徐诺斯","张禹","张锋",
				"赵然","李鹏鹏","陶禹辰","徐阳","孙中一","陈林","刘冉","朱一亮","郝坤","何盈","魏婷婷","赵永春",
				"钟一鸣","卢利永","袁靖","颜贝","陈俊羽","白群","吴兆康","孔飞","张檀","赵春月","王晨晨","陶仔龙",
				"逄守政","刘星","孙汉敏","王钦","李壮","于智龙","石杨","覃晨","司桥","吕少军","李挺军","温凌丽",
				"张裕峰","李波","孟凡旭","周聪","王小岁"};
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
