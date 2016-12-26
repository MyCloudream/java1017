package cn.ucai.day04;

public class Test09 {
	public static void main(String[] args) {
		int n = 100;
		int count = 0;
		for(int i=1;i<=n;i++){
			count += i;// count +=1 / count = count + 1; count = 1
			// count += 2; count = count + 2;count = 3;
			// count += 3; count = count + 3;count = 6;
		}
		System.out.println(count);
		
		
		
		
		
		
		double sum = 0.0;
		for(int i=1;i<=n;i++){
			sum  += 1.0/i;// sum += 1.0/1; sum = sum + 1.0/1;sum = 1.0;
			// sum += 1.0/2 ;sum = sum + 1.0/2;sum = 1.5;
		}
		System.out.println(sum);
	}
}
