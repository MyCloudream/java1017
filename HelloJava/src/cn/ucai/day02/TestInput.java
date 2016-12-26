package cn.ucai.day02;

import cn.ucai.tools.InputTools;

/**
 * java.lang : 核心包
 * 对于非本包非java.lang包中的其他类，如果想使用就必须先导包。
 * 
 * Scanner
 * 
 */
public class TestInput {
	public static void main(String[] args) {
		System.out.println("请输入您的姓名：");
		String name = InputTools.getInputString();
		System.out.println("name:"+name);
		System.out.println("请输入年龄:");
		int age = InputTools.getInputInt();
		System.out.println("age:"+age);
	}
}
