package cn.ucai.day04;

public class Test06 {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 100) {
			if (i <= 20) {
				System.out.println("×ö¸©ÎÔ³Å" + i + "´Î");
			} else if (i < 100) {
				System.out.println("ºôßêºôßê£¬×ö¸©ÎÔ³Å" + i + "´Î");
			} else if(i==100){
				System.out.println("ÒÑÀÛËÀ");
			}
			i++;
		}
		
		int j = 1;
		while (true) {
			if (j <= 20) {
				System.out.println("×ö¸©ÎÔ³Å" + j + "´Î");
			} else if (j < 100) {
				System.out.println("ºôßêºôßê£¬×ö¸©ÎÔ³Å" + j + "´Î");
			} else if (j == 100) {
				System.out.println("ÒÑÀÛËÀ");
				break;
			}
			j++;
		}
	}
}
