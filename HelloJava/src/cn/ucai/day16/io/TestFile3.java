package cn.ucai.day16.io;

import java.io.File;
import java.io.IOException;

public class TestFile3 {
	public static void main(String[] args) {
		File file = new File("E:/abc/test/test/test/a.txt");
		File fileDir = file.getParentFile();
		fileDir.mkdirs();
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
