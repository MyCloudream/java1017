package cn.ucai.day11.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Throwable : �Ǹ��࣬��ʾ�����׳��ģ���ζ�ţ����е����඼�����׳���
 * RuntimeException������ʱ�쳣
 * 	1���������е�ʱ��Żᱨ���쳣
 * 	2������ʹ��try-catch-finally������Ҳ���Բ�����
 * 	3���������У�����������ʱ�쳣ʹ��try-catch���� 
 * 		1�����ɶ��Ա��
 * 		2��������ִ��Ч�ʱ��
 * 	����һ�㣬����ʱ�쳣����������ʹ�÷�֧�ṹʹ�����׳��
 * 
 *  ���ʱ�쳣��������ʱ�쳣������ʱ�쳣��
 *  1�������д֮�󣬾ͱ��쳣 ������������Ա��벻ͨ����
 * �����ͨ����
 *  1��try-catch-fianlly�������ʱ�쳣
 *  2��ͨ��throws�ؼ���������:throws��û�д����쳣��ֻ��ƭ���˱��������ñ��벻�ٱ���
 *  һ������£�����ʱ�쳣��Ҫ����main���������׳�û�����塣
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
