package cn.ucai.day16.io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestFile8 {
	public static void main(String[] args) {
		File[] fileArr = getFiles(new MyFileFilter() {
			@Override
			public boolean accept(File file) {
				if(file.getName().startsWith("Test")){
					return true;
				}
				return false;
			}
		});
		
		for(File f : fileArr){
			System.out.println(f);
		}
	}
	
	public static File[] getFiles(MyFileFilter mff){
		File fileDir = new File("E:/abc/");
		File[] fileArr = fileDir.listFiles();
		List<File> list = new ArrayList<File>();
		for (int i = 0; i < fileArr.length; i++) {
			if(mff.accept(fileArr[i])){
				list.add(fileArr[i]);
			}
		}
		File[] fileArrResult = list.toArray(new File[list.size()]);
		return fileArrResult;
	}
}

interface MyFileFilter{
	public abstract boolean accept(File file);
}
