package cn.ucai.bean;

public class Newslist {
	private String ctime;

	private String title;

	private String description;

	private String picUrl;

	private String url;

	public void setCtime(String ctime) {
		this.ctime = ctime;
	}

	public String getCtime() {
		return this.ctime;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return this.description;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPicUrl() {
		return this.picUrl;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUrl() {
		return this.url;
	}

	@Override
	public String toString() {
		return "ʱ�䣺"+ctime+"\n���⣺"+title+"\n������"+description+"\n";
		
	}

	
}