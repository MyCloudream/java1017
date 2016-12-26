package cn.ucai.day13.homework;

import java.util.Scanner;
/**
 * 模拟用户注册过程
 */
public class UserRegist {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		User user = new User();
		for(;;){
			System.out.println("请输入用户姓名：");
			String name = scan.next();
			if(name.matches("[a-zA-Z0-9_]{5,8}")){
				user.setName(name);
				break;
			}else{
				System.out.println("用户名格式错误！");
			}
		}
		for(;;){// 如果重复密码输入错误，也即两次录入不等，密码也要重新输入。
			String password = "";
			for(;;){
				System.out.println("请输入用户密码：");
				password = scan.next();
				if(password.matches("[a-zA-Z0-9_]{6,8}")){
					// 密码和重复密码都确认后再存储
					break;
				}else{
					System.out.println("密码格式错误！");
				}
			}
			String repassword = "";
			for(;;){// 重复密码格式不对，重新录入重复密码
				System.out.println("请重复用户密码：");
				repassword = scan.next();
				if(repassword.matches("[a-zA-Z0-9_]{6,8}")){
					break;
				}else{
					System.out.println("重复密码格式错误！");
				}
			}
			if(password.equals(repassword)){
				// 密码和重复密码都确认后再存储
				user.setPassword(password);
				break;
			}else{
				System.out.println("两次录入不一致");
			}
		}
		
		for(;;){
			System.out.println("请输入用户邮箱：");
			String email = scan.next();
			if(email.matches("[a-zA-Z0-9_]{5,20}@{1}[a-zA-Z0-9]{2,}\\.{1}(com|cn)")){
				user.setEmail(email);
				break;
			}else{
				System.out.println("邮箱格式错误！");
			}
		}
		System.out.println(user);
		scan.close();
	}
}