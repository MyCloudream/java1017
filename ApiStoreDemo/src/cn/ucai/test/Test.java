package cn.ucai.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * {
    "errNum": 0,
    "retMsg": "success",
    "retData": {
        "phone": "15210011578",
        "prefix": "1521001",
        "supplier": "移动",
        "province": "北京",
        "city": "北京",
        "suit": "152卡"
    }
}
 */
public class Test {
	public static void main(String[] args) {
		String httpUrl = "http://localhost:9999/HelloWeb/phone";
		String httpArg = "phone=15210011578";
		String jsonResult = request(httpUrl, httpArg);
		System.out.println(jsonResult);
		try {
			JSONObject object = new JSONObject(jsonResult);
			JSONObject retData = object.getJSONObject("retData");
			String province = retData.getString("province");
			String city = retData.getString("city");
			System.out.println("省份："+province);
			System.out.println("城市："+city);
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 向服务器发起请求，发请求的时候带着手机号码
	 * 接收服务器响应的内容，并转为String类型。
	 */
	public static String request(String httpUrl, String httpArg) {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    // http://apis.baidu.com/apistore/mobilenumber/mobilenumber?phone=15210011578
	    httpUrl = httpUrl + "?" + httpArg;

	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
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
