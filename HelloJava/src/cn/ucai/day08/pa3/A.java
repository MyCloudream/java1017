package cn.ucai.day08.pa3;

/**
 * 面向对象有6大原则
 * 1、里氏代换原则
 * 
 * A is a B 
 * 
 * Everything is a Object：什么都是东西
 * 
 * 1、如果说一个类没有继承自任何类，则它默认继承自Object
 */
public class A extends Object{
	public void m(){
		System.out.println("A的方法");
	}
}
