package cn.ucai.day04;

public class Test07 {
	public static void main(String[] args) {
		int i = 1;
		do{
			if (i <= 20) {
				System.out.println("×ö¸©ÎÔ³Å" + i + "´Î");
			} else if (i < 100) {
				System.out.println("ºôßêºôßê£¬×ö¸©ÎÔ³Å" + i + "´Î");
			} else {
				System.out.println("ÒÑÀÛËÀ");
			}
			i++;
		}while(i <= 100);
		
		int j = 1;
		do{
			if (j <= 20) {
				System.out.println("×ö¸©ÎÔ³Å" + j + "´Î");
			} else if (j < 100) {
				System.out.println("ºôßêºôßê£¬×ö¸©ÎÔ³Å" + j + "´Î");
			} else if (j == 100) {
				System.out.println("ÒÑÀÛËÀ");
				break;
			}
			j++;
		}while(true);
	}
}
