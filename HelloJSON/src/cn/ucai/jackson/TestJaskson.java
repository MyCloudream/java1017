package cn.ucai.jackson;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import cn.ucai.bean.Person;
import cn.ucai.util.IOUtil;

public class TestJaskson {
	public static void main(String[] args) {
		ObjectMapper om = new ObjectMapper();
		String strJson = IOUtil.getText("E:/abc/person.json");
		try {
			// 1����json���ݽ�������װΪ����
			Person p = om.readValue(strJson,Person.class);
			System.out.println(p);
			
			// 2��������תΪjson����
			String json = om.writeValueAsString(p);
			System.out.println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
