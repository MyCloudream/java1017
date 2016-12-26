package cn.ucai.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class DownloadImage {
	public static void main(String[] args) {
		String httpUrl = "http://pic.qiantucdn.com/58pic/17/61/16/31V58PICj75_1024.jpg";
		downloadImage(httpUrl);
	}

	/**
	 * œ¬‘ÿÕº∆¨
	 * @param httpUrl Õº∆¨µÿ÷∑
	 */
	public static void downloadImage(String httpUrl) {
		InputStream is = null;
		FileOutputStream fos = null;
	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        connection.connect();
	        is = connection.getInputStream();
	        String fileName = httpUrl.substring(httpUrl.lastIndexOf("/")+1);
	        fos = new FileOutputStream(new File("E:/abc/",fileName));
	        byte[] byArr = new byte[1024*8];
	        int b = 0;
	        while((b=is.read(byArr))!=-1){
	        	fos.write(byArr, 0, b);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally{
	    	try {
	    		if(is!=null){
	    			is.close();
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
