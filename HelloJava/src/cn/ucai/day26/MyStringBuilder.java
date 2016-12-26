package cn.ucai.day26;

/**
 * 构建者模式
 */
public class MyStringBuilder {
	private String result = "";
	private String name;
	public MyStringBuilder append(String msg){
		result += msg;
		return this;
	}
	
	public String builder(){
		return this.result;
	}
}
