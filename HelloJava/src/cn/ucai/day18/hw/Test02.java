package cn.ucai.day18.hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		File fileDir = new File("E:/abc/");
		// 1��ɸѡָ����׺�����ļ�
		File[] fileArr = fileteFilesBySuffix(fileDir,".txt");
		// 2���ļ��Ŀ���
		for(File f : fileArr){
			File dest = new File("E:/copy/",f.getName());
			copyFile(f, dest);
		}
	}
	
	/**
	 * ����ָ���ļ����е�ָ����׺���������ļ�
	 * @param fileDir ָ��Ҫ���ҵ��ļ���
	 * @param suffix ָ����׺��
	 * @return
	 */
	public static File[] fileteFilesBySuffix(File fileDir,String suffix){
		File[] fileArr = fileDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(suffix)){
					return true;
				}
				return false;
			}
		});
		return fileArr;
	}
	
	/**
	 * �����ļ�
	 * @param src Դ�ļ���·��
	 * @param dest Ŀ���ļ���·��
	 */
	public static void copyFile(String src,String dest){
		copyFile(new File(src), new File(dest));
	}
	
	/**
	 * �ļ�����
	 * @param src Դ�ļ�
	 * @param dest Ŀ���ļ�
	 */
	public static void copyFile(File src,File dest){
		if(!dest.getParentFile().exists()){
			dest.getParentFile().mkdirs();
		}
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dest);
			byte[] byArr = new byte[1024*8];
			int b = -1;
			while((b=fis.read(byArr))!=-1){
				fos.write(byArr, 0, b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
