package cn.ucai.day06;

import java.util.Scanner;

/**
 * 不规则二维数组的动态初始化：
 * 1、定义二维数组，一维长度不指定
 * 2、分别指定每一个一维数组的长度
 * 3、完成初始化
 */
public class TestArray5 {
	public static void main(String[] args) {
		String[] strArrNames = {"寒冰射手","潮汐海灵","刀锋意志","雷霆之怒"};

		// 角色属性：血量 普通攻击 魔法攻击 防御
		int[][] niArrRoleAttr = {
			{100,7,2,3},
			{120,6,7,4},
			{90,7,5,4},
			{150,7,4,7}
		};

		// 角色技能列表
		String[][] strArrSkills = {
			{"冰霜射击","全神贯注","万箭齐发","鹰击长空","魔法水晶箭"},
			{"伶俐斗士","淘气打击","海石三叉戟","古灵精怪","巨鲨强袭"},
			{"艾欧尼亚热诚","利刃冲击","飞天姿态","均衡打击","至尊锋刃"},
			{"风暴的抉择","滚滚雷霆","狂野怒意","至尊咆哮","雷霆怒爪"}
		};
		
		String[] strArrSkillOrder = {"一","二","三","四","五"};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个角色姓名：");
		String name = scan.next();
		for(int i = 0;i<strArrNames.length;i++){
			if(strArrNames[i].equals(name)){
				System.out.println(name+"的血量为："+niArrRoleAttr[i][0]);
				System.out.println(name+"的普攻为："+niArrRoleAttr[i][1]);
				System.out.println(name+"的魔攻为："+niArrRoleAttr[i][2]);
				System.out.println(name+"的防御为："+niArrRoleAttr[i][3]);
				
				for(int j=0;j<strArrSkills[i].length;j++){
					System.out.println(name+"的第"+strArrSkillOrder[j]+"个技能为："+strArrSkills[i][j]);
				}
//				System.out.println(name+"的第二个技能为："+strArrSkills[i][1]);
//				System.out.println(name+"的第三个技能为："+strArrSkills[i][2]);
//				System.out.println(name+"的第四个技能为："+strArrSkills[i][3]);
//				System.out.println(name+"的第五个技能为："+strArrSkills[i][4]);
			}
		}
	}
}
