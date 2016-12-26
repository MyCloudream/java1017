package cn.ucai.day05;

public class TestBreak {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			boolean flag = false;
			for(int j=0;j<5;j++){
				// i = 2 j = 3
				if(i==2 && j==3){
					flag = true;
					break;// ½áÊøÄÚ²ãÑ­»·
				}
				System.out.println("j="+j);
			}
			if(flag){
				break;
			}
			System.out.println("i="+i);
		}
	}
}
