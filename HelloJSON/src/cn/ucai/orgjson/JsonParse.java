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
	 * ����json���ݣ����������������ݷ�װΪһ��Person����
	 * @param json : Ҫ������json����
	 *//*
	public static Person jsonParse(String json){
		JSONObject jsonObjct = null;
		try {
			// ��ȡָ��json���ݵ�JSONObject����
			jsonObjct = new JSONObject(json);
			// ��json�����н�����name��age
			String name = jsonObjct.getString("name");
			int age = jsonObjct.getInt("age");
			// ��ȡaddress��Ӧ��value��Ҳ��{"city":"����","street":"������"}
			JSONObject jsonAddress = jsonObjct.getJSONObject("address");
			// ��jsonAddress�л�ȡcity��street����Ӧ��value
			String city  = jsonAddress.getString("city");
			String street = jsonAddress.getString("street");
			// ����ȡ��value����װΪһ��Address����
			Address address = new Address(city,street);
			// ��װΪһ��Person����
			Person p = new Person(name,age,address);
			return p;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
}
*/