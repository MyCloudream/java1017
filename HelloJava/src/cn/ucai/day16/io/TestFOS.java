package cn.ucai.day16.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream:将程序中的数据写入到文件中
 */
public class TestFOS {
	public static void main(String[] args) {
		File file = new File("E:/abc/a.txt");
		FileOutputStream fos = null;
		try {
			// append：true添加到原内容的后面，false的话是覆盖，默认是false。
			fos = new FileOutputStream(file,true);
			fos.write(97);
			fos.write(97);
			fos.write(97);
			fos.write(97);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
