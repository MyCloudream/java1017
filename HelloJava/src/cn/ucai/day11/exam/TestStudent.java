package cn.ucai.day11.exam;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Student[] stuArr = new Student[1];
		for(int i=0;i<stuArr.length;i++){
			System.out.println("��¼��ѧ����Ϣ����,�ָ�");
			String msg = scan.next();
			String[] strArr = msg.split(",");
			/*stuArr[i] = new Student();
			stuArr[i].setSno(strArr[0]);
			stuArr[i].setName(strArr[1]);
			stuArr[i].setGender(strArr[2]);*/
			stuArr[i] = new Student(strArr[0],strArr[1],strArr[2]);
		}
		
		// �ҵ����а������š���ѧ��������ӡѧ����Ϣ
		for(int i=0;i<stuArr.length;i++){
			String stuName = stuArr[i].getName();
			if(stuName.contains("��") || stuName.indexOf("��")!=-1){
				System.out.println(stuArr[i]);
			}
		}
		scan.close();
	}
}
