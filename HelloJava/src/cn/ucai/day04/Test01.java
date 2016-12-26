package cn.ucai.day04;

public class Test01 {
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println((int)ch);
		
		for(int i=65;i<65+26;i++){
			System.out.print((char)i+"-"+i+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<26;i++){
			System.out.print((char)(i+65)+"-"+(i+65)+" ");
		}
		
		System.out.println();
		
		for(char i='A';i<='Z';i++){
			System.out.print(i+"-"+(int)i+" ");
		}
		
	}
}
