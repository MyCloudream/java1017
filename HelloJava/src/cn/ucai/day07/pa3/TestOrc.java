package cn.ucai.day07.pa3;

import java.util.Random;

/**
 * 当一个对象为null时，如果使用对象.来调用该对象的属性
 * 或方法，则会报NullPointerException（空指针异常）
 * 
 * {"寒冰射手","潮汐海灵","刀锋意志","雷霆之怒"}
 * 1-5级
 * 100 - 500
 */
public class TestOrc {
	public static void main(String[] args) {
		Orc[] orcArr = new Orc[20];
		Random ran = new Random();
		String[] strNames = {"寒冰射手","潮汐海灵","刀锋意志","雷霆之怒"};
		for(int i=0;i<orcArr.length;i++){
			orcArr[i] = new Orc();
			int nameIndex = ran.nextInt(4);
			orcArr[i].name = strNames[nameIndex];
			int ranLv = ran.nextInt(5)+1;
			orcArr[i].lv = ranLv;
			orcArr[i].hp = ranLv*100;
			
			orcArr[i].desc();
		}
		
//		String s = null;
//		System.out.println(s.charAt(0));
	}
}
