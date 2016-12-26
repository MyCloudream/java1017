package cn.ucai.day16.io;

import java.io.File;
import java.io.FileFilter;

public class TestFile9 {
	public static void main(String[] args) {
		File fileDir = new File("E:/abc/");
		File[] fileArr = fileDir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				if(file.getName().endsWith(".java")){
					return true;
				}
				return false;
			}
		});
		
		for(File f : fileArr){
			System.out.println(f);
		}
		/*File[] fileArr = fileDir.listFiles(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".java")){
					return true;
				}
				return false;
			}
		});
		
		for(File f : fileArr){
			System.out.println(f);
		}*/
	}
}