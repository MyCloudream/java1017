package cn.ucai.day18.hw;

import java.io.File;

/**
 * 列出指定文件夹下的所有（包含子文件夹以及子文件夹的子文件夹等等）的以.java结尾的文件。
 */
public class Test01 {
	public static void main(String[] args) {
		filterFilesBySuffix(new File("E:/abc/"), ".java");
	}
	
	
	/**
	 * 查找指定文件夹中的所有指定后缀名的所有文件。
	 * @param fileDir 需要查找的文件夹
	 * @param suffix 指定后缀名
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
