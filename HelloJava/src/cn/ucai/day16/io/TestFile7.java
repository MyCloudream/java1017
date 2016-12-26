package cn.ucai.day16.io;

import java.io.File;

/**
 * 相对路径和绝对路径
 * 绝对路径：
 * E:\abc\a.txt
 * 
 * test\a.txt
 */
public class TestFile7 {
	public static void main(String[] args) {
		File fileDir = new File("E:/abc/");
		File[] fileArr = fileDir.listFiles();
		for(int i=0;i<fileArr.length;i++){
			String name = fileArr[i].getName();
			String suffix = name.substring(name.lastIndexOf("."));
			fileArr[i].renameTo(new File("E:/abc/",(i+1)+suffix));
		}
	}
}
