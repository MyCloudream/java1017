package cn.ucai.day11.exam;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] stuArr = new Student[1];
		for(int i=0;i<stuArr.length;i++){
			System.out.println("请录入学生信息，以,分割");
			String msg = scan.next();
			String[] strArr = msg.split(",");
			/*stuArr[i] = new Student();
			stuArr[i].setSno(strArr[0]);
			stuArr[i].setName(strArr[1]);
			stuArr[i].setGender(strArr[2]);*/
			stuArr[i] = new Student(strArr[0],strArr[1],strArr[2]);
		}
		
		// 找到所有包含“张”的学生，并打印学生信息
		for(int i=0;i<stuArr.length;i++){
			String stuName = stuArr[i].getName();
			if(stuName.contains("张") || stuName.indexOf("张")!=-1){
				System.out.println(stuArr[i]);
			}
		}
		scan.close();
	}
}
