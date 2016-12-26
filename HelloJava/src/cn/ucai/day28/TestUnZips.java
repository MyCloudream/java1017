package cn.ucai.day28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 多文件的解压缩
 */
public class TestUnZips {
	public static void main(String[] args) {
		File fileZip = new File("E:/copy/Test.zip");
		ZipInputStream zis = null;
		FileOutputStream fos = null;
		try {
			zis = new ZipInputStream(new FileInputStream(fileZip));
			ZipEntry zn = zis.getNextEntry();
			// 当压缩文件中有条目时
			while(zn!=null){
				// 指定拷贝之后的文件名称和压缩文件中的名称一致
				String name = zn.getName();
				File file = new File("E:/abc/",name);
				fos = new FileOutputStream(file);
				// 拷贝的过程
				int b = 0;
				byte[] byArr = new byte[1024*4];
				while((b=zis.read(byArr))!=-1){
					fos.write(byArr, 0, b);
				}
				// 一个文件的拷贝完成之后，获取压缩文件中的下一个文件（条目）
				zn = zis.getNextEntry();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(zis!=null){
					zis.close();
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
