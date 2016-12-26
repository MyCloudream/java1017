package cn.ucai.day04;

public class TestFor3 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("¿ªÊ¼");
			if(i==3){
//				break;
				continue;
			}
			System.out.println(i);
			System.out.println("½áÊø");
		}
		
	}
}
