package cn.ucai.day09.pa8;

public class Animal {
	static int a = 1;
	static{
		System.out.println(a);
	}
	
	{
		a = 2;
		System.out.println(a);
	}
	
	public Animal(){
		a = 3;
		System.out.println(a);
	}
	
}
