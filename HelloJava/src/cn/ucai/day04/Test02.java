package cn.ucai.day04;

public class Test02 {
	public static void main(String[] args) {
		for(int i=-100;i<=100;i++){
			if(i%2!=0){
				System.out.print(i+",");
			}
		}
		System.out.println();
		for(int i=-50;i<50;i++){
			System.out.print((2*i+1)+",");
		}
		System.out.println();
		for(int i=-99;i<100;i+=2){
			System.out.print(i+",");
		}
	}
}
