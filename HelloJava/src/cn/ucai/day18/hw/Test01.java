package cn.ucai.day18.hw;

import java.io.File;

/**
 * �г�ָ���ļ����µ����У��������ļ����Լ����ļ��е����ļ��еȵȣ�����.java��β���ļ���
 */
public class Test01 {
	public static void main(String[] args) {
		filterFilesBySuffix(new File("E:/abc/"), ".java");
	}
	
	
	/**
	 * ����ָ���ļ����е�����ָ����׺���������ļ���
	 * @param fileDir ��Ҫ���ҵ��ļ���
	 * @param suffix ָ����׺��
	 */
	public static void filterFilesBySuffix(File fileDir,String suffix){
		File[] fileArr = fileDir.listFiles();
		for(File f : fileArr){
			if(f.isDirectory()){
				filterFilesBySuffix(f,suffix);
			}else{
				if(f.getName().endsWith(suffix)){
					System.out.println(f);
				}
			}
		}
	}
}
