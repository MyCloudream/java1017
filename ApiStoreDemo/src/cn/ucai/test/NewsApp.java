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
 * Fiddler:用法：
 * 1、用于查看请求和响应的数据，学习HTTP协议。
 * 2、用于模拟HTTP请求
 * 3、可以用于抓包
 * 
 * 常用请求方法：get post
 * 
 * 请求（request）的组成部分：
 * 1、请求行（request line） ，有三部分组成，比如：GET http://www.ucai.cn/newhome HTTP/1.1
 * 2、请求头（request header），由多个键值对组成。
 * 		User-Agent：指浏览器的型号及版本，比如Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.71 Safari/537.36 表示Chrome浏览器。
 * 		Accept：接收的数据的类型MIME（text/json,application/xml）
 * 		Accept-Encoding：接收的数据的压缩格式
 * 		Accept-Language：接收语言
 * 3、空行
 * 4、请求体（request body）：get方法没有请求体
 * 
 * 响应（response）的组成部分：
 * 1、响应行 状态行（status line） 有3部分组成：
 * 2、响应头（response header），也是由多个键值对组成
 * 3、空行
 * 4、响应体（response body）
 * 
 * get请求和post请求的区别：
 * 1、get请求将参数添加到接口地址?的后面，多对参数使用&符号拼接。post将参数放在request body中提交给服务器。
 * 	post也可以将参数拼接到地址的后面。get方法没有请求体。
 * 2、相对来说，post较安全。所以一般注册、登录等都是使用post请求。
 * 3、get请求的参数有长度限制，post请求的参数没有长度限制。
 * 4、文件上传一般采用post的方式。
 * 5、在地址栏中输入网址，点击确定，采用的是get请求。
 * 
 * 
 */
public class NewsApp {
	public static void main(String[] args) {
		int page = 1;
		showNesList(page);
		Scanner scan = new Scanner(System.in);
		for(;;){
			System.out.println("输入数字1加载新闻，输入非1退出App");
			int ni = scan.nextInt();
			if(ni==1){
				page++;
				showNesList(page);
			}else{
				System.out.println("退出app");
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
	 *            :请求接口
	 * @param httpArg
	 *            :参数
	 * @return 返回结果
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
	        // 填入apikey到HTTP request header
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
