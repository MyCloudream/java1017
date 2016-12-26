package cn.ucai.day06;

/**
 * 编写银行卡类TestCard.java，模拟存取钱操作如下：
	原本有1000块钱，取了100，又取了500，又存入1000，又取了300，有存入了200。
	输出最后你的银行卡里的剩余钱数。
 */
public class TestMethod2 {
	public static void main(String[] args) {
		int t = 1000;
		t = getMoney(100,1000);
		t = getMoney(500,t);
		t = saveMoney(1000,t);
		t = getMoney(300,t);
		t = saveMoney(200,t);
		System.out.println("剩余钱数："+t);
	}
	
	public static int getMoney(int n,int t){
		t -= n;
		return t;
	}
	
	public static int saveMoney(int n,int t){
		t += n;
		return t;
	}
}
