package cn.ucai.orgjson;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cn.ucai.bean.Address;
import cn.ucai.bean.Person;
import cn.ucai.util.IOUtil;

public class JsonParse2 {
	public static void main(String[] args) {
		String jsonStr = IOUtil.getText("E:/abc/person.json");
		List<Person> list = jsonArrayParse(jsonStr);
		for(Person p : list){
			System.out.println(p);
		}
	}
	
	public static List<Person> jsonArrayParse(String json){
		List<Person> list = new ArrayList<Person>();
		try {
			JSONArray array = new JSONArray(json);
			for(int i = 0;i<array.length();i++){
				JSONObject jsonObject = array.getJSONObject(i);
				Person p = jsonParse(jsonObject.toString());
				list.add(p);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * 解析json数据，并将解析出的数据封装为一个Person对象
	 * @param json : 要解析的json数据
	 */
	public static Person jsonParse(String json){
		JSONObject jsonObjct = null;
		try {
			// 获取指定json数据的JSONObject对象
			jsonObjct = new JSONObject(json);
			// 从json数据中解析出name和age
			String name = jsonObjct.getString("name");
			int age = jsonObjct.getInt("age");
			// 取得address对应的json array
			JSONArray jsonArray = jsonObjct.getJSONArray("address");
			// 从json array中获取每一个元素，一个元素又是一个json object
			List<Address> list = new ArrayList<Address>();
			for(int i=0;i<jsonArray.length();i++){
				JSONObject addressJSONObject = jsonArray.getJSONObject(i);
				// 从address中获取city和street
				String city = addressJSONObject.getString("city");
				String street = addressJSONObject.getString("street");
				Address address = new Address(city,street);
				list.add(address);
			}
			// 封装为一个Person对象
			Person p = new Person(name,age,list);
			return p;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
