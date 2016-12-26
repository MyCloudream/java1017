package cn.ucai.day04;

public class Test03 {
	public static void main(String[] args) {
		for(int i=1;i<=35;i++){// i表示鸡的数量
			if(i*2+(35-i)*4==94){
				System.out.println(i);// 鸡的数量
				System.out.println(35-i);// 兔子的数量
				break;
			}
		}
	}
}
