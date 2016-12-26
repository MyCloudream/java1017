package cn.ucai.day17;

import java.io.File;

/**
 * 递归：是一种方法内部调用方法本身的编程技巧。 
 */
public class TestFile2 {
	public static void main(String[] args) {
		File fileDir = new File("E:/abc/");
		m(fileDir);
	}
	
	/**
	 * m:打印fileDir的文件内容
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
