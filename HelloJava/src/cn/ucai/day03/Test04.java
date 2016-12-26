package cn.ucai.day03;

/**
 * 现在有语文和数学两科成绩，请根据以下评分标准给出成绩的等级。 
 * 1、语文：90(含)-100分并且数学：90(含)-100分 输出：优秀
 * 2、语文或数学中有一科90分以上，但是另一科60分以下 输出：偏科
 */
public class Test04 {
	public static void main(String[] args) {
		int a = 98;
		int b = 57;
		if (a >= 90 && b >= 90) {
			System.out.println("优秀");
		} else if ((a >= 90 && b < 60) || (b >= 90 && a < 60)) {
			System.out.println("偏科");
		}

		if (a >= 90) {
			if (b >= 90) {
				System.out.println("优秀");
			} else if (b < 60) {
				System.out.println("偏科");
			}
		} else if (a < 60) {
			if (b >= 90) {
				System.out.println("偏科");
			}
		}
	}
}
