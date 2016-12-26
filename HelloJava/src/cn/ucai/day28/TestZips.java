package cn.ucai.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * 压缩一个文件夹中的所有的文件
 */
public class TestZips {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ZipOutputStream zos = null;
		File fileDir = new File("E:/abc/test/");
		File[] fileArr = fileDir.listFiles();
		try {
			File fileDest = new File("E:/copy/test.zip");
			zos = new ZipOutputStream(new FileOutputStream(fileDest));
			for(int i=0;i<fileArr.length;i++){
				fis = new FileInputStream(fileArr[i]);
				// 设置压缩文件中的下一个条目
				zos.putNextEntry(new ZipEntry(fileArr[i].getName()));
				int b = 0;
				byte[] byArr = new byte[1024*4];
				while((b=fis.read(byArr))!=-1){
					zos.write(byArr, 0, b);
				}
			}
			System.out.println("文件夹压缩完毕");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			try {
				if(fis!=null){
					fis.close();
				}
				if(zos!=null){
					zos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
