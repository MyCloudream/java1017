package cn.ucai.day16.io;

import java.io.File;

/**
 * createNewFile:���ļ�����ʱ�����½����ļ������ڲ��½���
 * delete:�ļ��е�ɾ�������ļ�������������ʱ��ɾ��ʧ�ܡ�
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
