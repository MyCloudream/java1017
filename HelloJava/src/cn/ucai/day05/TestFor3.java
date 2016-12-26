package cn.ucai.day05;

public class TestFor3 {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			// i 0 1 2 3 4 
			// j 1 2 3 4 5
			for(int j=0;j<(i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		for(int i=0;i<5;i++){
			// k 4 3 2 1 0
			// i 0 1 2 3 4
			for(int k=0;k<(4-i);k++){
				System.out.print(" ");
			}
			for(int j=0;j<(i+1);j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
