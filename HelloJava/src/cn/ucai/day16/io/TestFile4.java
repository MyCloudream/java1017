package cn.ucai.day16.io;

import java.io.File;

/**
 * createNewFile:当文件存在时，不新建，文件不存在才新建。
 * delete:文件夹的删除：当文件夹里面有内容时，删除失败。
 */
public class TestFile4 {
	public static void main(String[] args) {
		/*File file = new File("E:/abc/a.txt");
		if(file.exists()){
			file.delete();
		}else{
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		File fileDir = new File("E:/abc/");
		fileDir.delete();
		
	}
}
