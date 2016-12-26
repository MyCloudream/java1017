package cn.ucai.day04;

public class TestWhile2 {
	public static void main(String[] args) {
		/*int i=1;
		while(i<=5)
			System.out.print(i);
			i++;*/

		for(int i=0;i<10;i++){
			System.out.println("Hello");
			System.out.println("World");
		}
		
		int i=1;
		while(i<=5)
			System.out.print(i++);
			i++;

	}
}
