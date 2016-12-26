package cn.ucai.day20;

/**
 * A 会用到B里的功能（方法）
 * 
 * 依赖 
 * 耦合
 * 解耦合
 */
public class A {
//	private Inter inter = new B();
	private B b = new B();
	public void ma(){
		if(b.m()){
			
		}else{
			
		}
	}
}
