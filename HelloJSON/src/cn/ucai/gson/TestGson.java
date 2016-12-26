package cn.ucai.gson;

import com.google.gson.Gson;

import cn.ucai.bean.Person;
import cn.ucai.util.IOUtil;

public class TestGson {
	public static void main(String[] args) {
		Gson gson = new Gson();
		// 1����json���ݽ�������װΪ����
		String str = IOUtil.getText("E:/abc/person.json");
		Person p = gson.fromJson(str, Person.class);
		System.out.println(p);
		
		// 2��������תΪjson����
		String strJson = gson.toJson(p);
		System.out.println(strJson);
	}
}
