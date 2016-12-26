package cn.ucai.day28;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class TestBAOS {
	public static void main(String[] args) {
		File fileZip = new File("E:/copy/Test.zip");
		ZipInputStream zis = null;
		ByteArrayOutputStream baos = null;
		try {
			zis = new ZipInputStream(new FileInputStream(fileZip));
			ZipEntry zn = zis.getNextEntry();
			// ��ѹ���ļ��ж������ڴ���д
			baos = new ByteArrayOutputStream();
			int b = 0;
			byte[] byArr = new byte[1024*4];
			while((b=zis.read(byArr))!=-1){
				// ���ڴ���д
				baos.write(byArr, 0, b);
			}
			// �����õ�ȫ�����ֽ�
			byte[] arr = baos.toByteArray();
			String str = new String(arr);
			System.out.println("�ڴ��е�����Ϊ��"+str);
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(zis!=null){
					zis.close();
				}
				if(baos!=null){
					baos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}