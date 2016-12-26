package cn.ucai.day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 * PrintWriter和BufferedReader配对使用
 */
public class TestPW {
	public static void main(String[] args) {
		// InputStreamReader OutputStreamWriter
		File file = new File("E:/abc/b.txt");
		PrintWriter pw = null;
		try {
			FileOutputStream fos = new FileOutputStream(file,true);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
			pw = new PrintWriter(osw);
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
			pw.println("优才学院优才学院优才学院优才学院优才学院优才学院");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} finally{
			if(pw!=null){
				pw.close();
			}
		}
	}
}
