/*package cn.ucai.orgjson;

import org.json.JSONException;
import org.json.JSONObject;

import cn.ucai.bean.Address;
import cn.ucai.bean.Person;
import cn.ucai.util.IOUtil;

public class JsonParse {
	public static void main(String[] args) {
		String jsonStr = IOUtil.getText("E:/abc/person.json");
		Person p = jsonParse(jsonStr);
		System.out.println(p);
	}
	
	*//**
	 * 解析json数据，并将解析出的数据封装为一个Person对象
	 * @param json : 要解析的json数据
	 *//*
	public static Person jsonParse(String json){
		JSONObject jsonObjct = null;
		try {
			// 获取指定json数据的JSONObject对象
			jsonObjct = new JSONObject(json);
			// 从json数据中解析出name和age
			String name = jsonObjct.getString("name");
			int age = jsonObjct.getInt("age");
			// 获取address对应的value，也即{"city":"北京","street":"长安街"}
			JSONObject jsonAddress = jsonObjct.getJSONObject("address");
			// 从jsonAddress中获取city和street所对应的value
			String city  = jsonAddress.getString("city");
			String street = jsonAddress.getString("street");
			// 将获取的value，封装为一个Address对象
			Address address = new Address(city,street);
			// 封装为一个Person对象
			Person p = new Person(name,age,address);
			return p;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
*/