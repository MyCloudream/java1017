package cn.ucai.day16.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 如果需要将数据存储在本地文件中、或者想从本地文件中读取一些数据到程序中，就需要IO流方面的知识。
 * 文件输入流：将文件中的数据，读取到程序中。
 * 
 * 流：都是顺序读取的。
 */
public class TestIO {
	public static void main(String[] args) {
		File file = new File("E:/abc/a.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			for(;;){
				int b = fis.read();
				if(b==-1){
					break;
				}
				System.out.println((char)b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally {// 用于关闭资源或处理临时文件
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
