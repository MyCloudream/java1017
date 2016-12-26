package cn.ucai.day12.regex;

import java.util.Arrays;

/**
 * 正则表达式:一般做数据的校验
 * \\d 表示数字
 * +好表示规则出现1到多次
 */
public class TestRegex2 {
	public static void main(String[] args) {
		/*String str = "abc123def1223mon12233jkl11223qwe";
		String[] strArr = str.split("1{1,}2{1,}");
		System.out.println(Arrays.toString(strArr));*/
		
		/*// 用户名 ：只能是数字字母下滑线组成 并且长度为8-12位。数字不能做开头
		String name = "zhangsan1";
//		if(name.matches("[a-zA-Z_0-9]{8,12}")){
		if(name.matches("[a-zA-Z]{1}\\w{7,11}")){
			System.out.println("这是合法的用户名");
		}else{
			System.out.println("用户名不合法");
		}
		
		// 手机号码验证：要求必须数字组成，并且使用1开头，第二位是3578，其他全数字。
		String phone = "12911010011";
		if(phone.matches("1{1}[3578]{1}[0-9]{9}")){
			System.out.println("这是合法的手机号");
		}else{
			System.out.println("手机号码不合法");
		}*/
		
		// 邮箱  ：数字字母下滑线组成邮箱名，6-20位   @ 数字字母2位以上 . com或者cn
		String email = "chenjun@ucai.com";
		if(email.matches("\\w{6,20}@{1}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
			System.out.println("这是合法的email");
		}else{
			System.out.println("email不合法");
		}
	}
}
