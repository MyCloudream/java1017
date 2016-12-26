package cn.ucai.day11.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throwable : 是个类，表示可以抛出的（意味着，所有的子类都可以抛出）
 * RuntimeException：运行时异常
 * 	1、程序运行的时候才会报的异常
 * 	2、可以使用try-catch-finally来处理，也可以不处理。
 * 	3、开发当中，如果针对运行时异常使用try-catch，则 
 * 		1）、可读性变差
 * 		2）、程序执行效率变差
 * 	所以一般，运行时异常不处理，而是使用分支结构使其更健壮。
 * 
 *  检测时异常、非运行时异常、编译时异常：
 *  1、程序编写之后，就报异常 如果不处理，测试编译不通过。
 * 想编译通过：
 *  1、try-catch-fianlly处理编译时异常
 *  2、通过throws关键字向上抛:throws并没有处理异常，只是骗过了编译器，让编译不再报错。
 *  一般情况下，编译时异常就要处理，main方法中再抛出没有意义。
 */
public class TestCheckedException {
	public static void main(String[] args) throws FileNotFoundException{
		m1();
	}
	
	public static void m1() throws FileNotFoundException{
		m2();
	}
	
	public static void m2() throws FileNotFoundException{
		m3();
	}
	
	public static void m3() throws FileNotFoundException{
		FileInputStream fis = new FileInputStream(new File("E:/abc.txt"));
	}
}
