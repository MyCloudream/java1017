package cn.ucai.day03;

/**
 * 请使用if语句完成以下练习： 现在满分成绩100分，请根据以下评分标准给出成绩的等级。 
 * 90(含)-100分：优秀 80(含)-90分：良好
 * 60(含)-80分：及格 60分以下：不及格
 */
public class Test03 {
	public static void main(String[] args) {
		int score = 98;
		if (score >= 90) {// 1次
			System.out.println("优秀");
		} else if (score >= 80) {// 0-多次
			System.out.println("良好");
		} else if (score >= 60) {
			System.out.println("及格");
		} else {// 0-1次
			System.out.println("不及格");
		}
	}
}
