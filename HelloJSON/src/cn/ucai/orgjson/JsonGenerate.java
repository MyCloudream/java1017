package cn.ucai.orgjson;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import cn.ucai.bean.Address;
import cn.ucai.bean.Person;

public class JsonGenerate {
	public static void main(String[] args) {
		Person p = new Person();
		p.setName("����");
		p.setAge(20);
		
		Address address1 = new Address("����","������");
		Address address2 = new Address("�人","������");
		Address address3 = new Address("�ɶ�","������");
		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address2);
		list.add(address3);
		
		p.setList(list);
		
		JSONObject json = new JSONObject(p);
		System.out.println(json.toString());
	}
}
