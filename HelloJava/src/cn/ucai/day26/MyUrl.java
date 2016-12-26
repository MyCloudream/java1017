package cn.ucai.day26;

import java.util.List;

/**
 * ＵＲＬ：统一资源定位符，其实就是一个网址。
 * http://localhost:8080/SuperWeChatServer/Server?request=server_status
 * http://localhost:8080/SuperWeChatServer/Server?request=register&m_user_name=&m_user_nick=&m_user_password=
 */
public class MyUrl {
	private String ip;
	private String port;
	private String projectName;
	private String action;
	private List<String> paramKey;
	private List<String> paramValue;
	public MyUrl() {
		super();
	}
	public MyUrl(String ip, String port, String projectName, String action, List<String> paramKey,
			List<String> paramValue) {
		super();
		this.ip = ip;
		this.port = port;
		this.projectName = projectName;
		this.action = action;
		this.paramKey = paramKey;
		this.paramValue = paramValue;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public List<String> getParamKey() {
		return paramKey;
	}
	public void setParamKey(List<String> paramKey) {
		this.paramKey = paramKey;
	}
	public List<String> getParamValue() {
		return paramValue;
	}
	public void setParamValue(List<String> paramValue) {
		this.paramValue = paramValue;
	}
	@Override
	public String toString() {
		// name = zhangsan 
		// url?name=zhangsan
		String str = "http://"+ip+":"+port+"/"+projectName+"/"+action;
		for(int i=0;i<paramKey.size();i++){
			if(i==0){
				str += "?"+paramKey.get(i)+"="+paramValue.get(i);
			}else{
				str += "&"+paramKey.get(i)+"="+paramValue.get(i);
			}
		}
		return str;
	}
	
}
