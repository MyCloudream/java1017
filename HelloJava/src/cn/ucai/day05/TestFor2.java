package cn.ucai.day05;

public class TestFor2 {
	public static void main(String[] args) {
		
		for(int i=0;i<5;i++){
			for(int j=0;j<(i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
			// i 0 1 2 3 4
			// j 5 4 3 2 1 
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
			// i 0 1 2 3 4
			// k 0 1 2 3 4
			for(int k=0;k<i;k++){
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0;i<5;i++){
			for(int k=0;k<5-i-1;k++){
				System.out.print(" ");
			}
			for(int j=0;j<(i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
