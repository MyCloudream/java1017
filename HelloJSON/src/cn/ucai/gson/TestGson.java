package cn.ucai.gson;

import com.google.gson.Gson;

import cn.ucai.bean.Person;
import cn.ucai.util.IOUtil;

public class TestGson {
	public static void main(String[] args) {
		Gson gson = new Gson();
		// 1、将json数据解析并封装为对象
		String str = IOUtil.getText("E:/abc/person.json");
		Person p = gson.fromJson(str, Person.class);
		System.out.println(p);
		
		// 2、将对象转为json数据
		String strJson = gson.toJson(p);
		System.out.println(strJson);
	}
}
