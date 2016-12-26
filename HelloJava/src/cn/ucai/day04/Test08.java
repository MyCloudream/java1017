package cn.ucai.day04;

/**
 * 打印1—100的所有数，除了7的倍数和带7的
 */
public class Test08 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++){
			if(i%7==0 || i%10==7 || i/10==7){
				continue;
			}
			System.out.print(i+",");
		}
	}
}
