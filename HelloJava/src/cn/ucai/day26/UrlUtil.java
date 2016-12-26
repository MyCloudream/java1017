package cn.ucai.day26;

public class UrlUtil {
	private String result = "http://";
	public UrlUtil append(String str){
		result += str;
		return this;
	}
	
	public UrlUtil appendParam(String key,String value){
		if(result.indexOf("?")!=-1){
			result += "&"+key+"="+value;
		}else{
			result += "?"+key+"="+value;
		}
		return this;
	}
	
	public String builder(){
		return result;
	}
}
