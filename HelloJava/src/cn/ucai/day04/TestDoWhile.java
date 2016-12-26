package cn.ucai.day04;

public class TestDoWhile {
	public static void main(String[] args) {
		/*for(int i=0;i<10;i++){
			System.out.println("Hello");
		}*/
		
		int i = 0;
		while(i<0){
			System.out.println("Hello");
			i++;
		}
		
		int j = 0;
		do{
			System.out.println("World");
			j++;
		}while(j<0);
	}
}
