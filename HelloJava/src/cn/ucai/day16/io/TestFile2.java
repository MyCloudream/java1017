package cn.ucai.day16.io;

import java.io.File;
import java.io.IOException;

/**
 * File：
 * 
 */
public class TestFile2 {
	public static void main(String[] args) {
		// File类是硬盘上文件或文件夹的抽象表示，跟具体文件存在不存在没有关系。
		File file = new File("E:/abc/a.txt");
		try {
			file.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			System.out.println("文件创建失败:"+e.getMessage());
		}
	}
}
