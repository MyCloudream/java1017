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
	 * ����json���ݣ����������������ݷ�װΪһ��Person����
	 * @param json : Ҫ������json����
	 */
	public static Person jsonParse(String json){
		JSONObject jsonObjct = null;
		try {
			// ��ȡָ��json���ݵ�JSONObject����
			jsonObjct = new JSONObject(json);
			// ��json�����н�����name��age
			String name = jsonObjct.getString("name");
			int age = jsonObjct.getInt("age");
			// ȡ��address��Ӧ��json array
			JSONArray jsonArray = jsonObjct.getJSONArray("address");
			// ��json array�л�ȡÿһ��Ԫ�أ�һ��Ԫ������һ��json object
			List<Address> list = new ArrayList<Address>();
			for(int i=0;i<jsonArray.length();i++){
				JSONObject addressJSONObject = jsonArray.getJSONObject(i);
				// ��address�л�ȡcity��street
				String city = addressJSONObject.getString("city");
				String street = addressJSONObject.getString("street");
				Address address = new Address(city,street);
				list.add(address);
			}
			// ��װΪһ��Person����
			Person p = new Person(name,age,list);
			return p;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
