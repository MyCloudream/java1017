package cn.ucai.day17;

import java.io.File;

/**
 * �ݹ飺��һ�ַ����ڲ����÷�������ı�̼��ɡ� 
 */
public class TestFile2 {
	public static void main(String[] args) {
		File fileDir = new File("E:/abc/");
		m(fileDir);
	}
	
	/**
	 * m:��ӡfileDir���ļ�����
	 */
	public static void m(File fileDir){
		File[] fileArr = fileDir.listFiles();
		for(File f : fileArr){
			if(f.isDirectory()){
				m(f);
			}else{
				System.out.println(f);
				f.delete();
			}
		}
		fileDir.delete();
	}
}
