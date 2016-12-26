package cn.ucai.day16.io;

import java.io.File;

public class TestFile5 {
	public static void main(String[] args) {
		File fileSrc = new File("E:/abc/a.txt");
		File fileDest = new File("E:/abc/b.txt");
		fileSrc.renameTo(fileDest);
		
		
	}
}
