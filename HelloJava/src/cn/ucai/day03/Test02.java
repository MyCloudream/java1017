package cn.ucai.day03;

/**
 * 请使用switch完成以下练习： 现在满分成绩100分，请根据以下评分标准给出成绩的等级。 90(含)及以上：及格
 */
public class Test02 {
	public static void main(String[] args) {
		/*int a = 2;
		if(a==2){
			System.out.println("ok");
		}*/
		int score = 89;
		switch (score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}
}
