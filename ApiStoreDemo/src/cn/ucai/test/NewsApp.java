package cn.ucai.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import cn.ucai.bean.Newslist;
import cn.ucai.bean.Root;

/**
 * Fiddler:�÷���
 * 1�����ڲ鿴�������Ӧ�����ݣ�ѧϰHTTPЭ�顣
 * 2������ģ��HTTP����
 * 3����������ץ��
 * 
 * �������󷽷���get post
 * 
 * ����request������ɲ��֣�
 * 1�������У�request line�� ������������ɣ����磺GET http://www.ucai.cn/newhome HTTP/1.1
 * 2������ͷ��request header�����ɶ����ֵ����ɡ�
 * 		User-Agent��ָ��������ͺż��汾������Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36 ��ʾChrome�������
 * 		Accept�����յ����ݵ�����MIME��text/json,application/xml��
 * 		Accept-Encoding�����յ����ݵ�ѹ����ʽ
 * 		Accept-Language����������
 * 3������
 * 4�������壨request body����get����û��������
 * 
 * ��Ӧ��response������ɲ��֣�
 * 1����Ӧ�� ״̬�У�status line�� ��3������ɣ�
 * 2����Ӧͷ��response header����Ҳ���ɶ����ֵ�����
 * 3������
 * 4����Ӧ�壨response body��
 * 
 * get�����post���������
 * 1��get���󽫲�����ӵ��ӿڵ�ַ?�ĺ��棬��Բ���ʹ��&����ƴ�ӡ�post����������request body���ύ����������
 * 	postҲ���Խ�����ƴ�ӵ���ַ�ĺ��档get����û�������塣
 * 2�������˵��post�ϰ�ȫ������һ��ע�ᡢ��¼�ȶ���ʹ��post����
 * 3��get����Ĳ����г������ƣ�post����Ĳ���û�г������ơ�
 * 4���ļ��ϴ�һ�����post�ķ�ʽ��
 * 5���ڵ�ַ����������ַ�����ȷ�������õ���get����
 * 
 * 
 */
public class NewsApp {
	public static void main(String[] args) {
		int page = 1;
		showNesList(page);
		Scanner scan = new Scanner(System.in);
		for(;;){
			System.out.println("��������1�������ţ������1�˳�App");
			int ni = scan.nextInt();
			if(ni==1){
				page++;
				showNesList(page);
			}else{
				System.out.println("�˳�app");
				break;
			}
		}
		scan.close();
	}
	
	public static void showNesList(int page){
		String httpUrl = "http://apis.baidu.com/txapi/world/world";
		String httpArg = "num=10&page="+page;
		String jsonResult = request(httpUrl, httpArg);
		Gson gson = new Gson();
		Root root = gson.fromJson(jsonResult, Root.class);
		List<Newslist> list = root.getNewslist();
		for(Newslist news : list){
			System.out.println(news);
		}
	}

	/**
	 * @param urlAll
	 *            :����ӿ�
	 * @param httpArg
	 *            :����
	 * @return ���ؽ��
	 */
	public static String request(String httpUrl, String httpArg) {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    httpUrl = httpUrl + "?" + httpArg;

	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        // ����apikey��HTTP request header
	        connection.setRequestProperty("apikey",  "4dcc8c80633d73174df1cead19a3d1ad");
	        connection.connect();
	        InputStream is = connection.getInputStream();
	        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        String strRead = null;
	        while ((strRead = reader.readLine()) != null) {
	            sbf.append(strRead);
	            sbf.append("\r\n");
	        }
	        reader.close();
	        result = sbf.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
}
