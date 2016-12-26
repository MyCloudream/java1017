package cn.ucai.day16.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestListMap {

	public void count(List<Student> listStu) {
		Map<String, List<Student>> map = new HashMap<String, List<Student>>();
		// 得到list中的学生的班级信息，按不同的班级添加到Map中
		for (int i = 0; i < listStu.size(); i++) {
			Student student = listStu.get(i);
			String className = student.getClassName();
			// 如果Map中已存在班级，则将学生添加到该班级对应的学生集合List中
			if (map.containsKey(className)) {
				List<Student> list = map.get(className);
				list.add(student);
			} else {
				// 不存在，则新建List，同时将List放到Map中
				List<Student> list = new ArrayList<Student>();
				list.add(student);
				map.put(className, list);
			}
		}
		// 遍历map集合 获得班级 和对应的学生集合
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String className = it.next();
			List<Student> list = map.get(className);
			int sum = 0;
			for(int i=0;i<list.size();i++){
				sum += list.get(i).getScore();
			}
			System.out.println(className + "班总分:"
			+ sum + ",平均分:" +  Math.round(sum*1.0 / list.size()) + ",人数为：" + list.size());
		}
	}

	public static void main(String[] args) {
		TestListMap tlm = new TestListMap();
		List<Student> listStu = new ArrayList<Student>();
		listStu.add(new Student("张1", "安卓一班", 100));
		listStu.add(new Student("张2", "安卓二班", 150));
		listStu.add(new Student("张3", "安卓二班", 142));
		listStu.add(new Student("张4", "安卓二班", 80));
		listStu.add(new Student("张5", "安卓一班", 91));
		listStu.add(new Student("张6", "安卓三班", 91));
		listStu.add(new Student("张7", "安卓三班", 91));
		listStu.add(new Student("张8", "安卓三班", 91));
		listStu.add(new Student("张9", "安卓三班", 91));
		listStu.add(new Student("张10", "安卓三班", 91));
		listStu.add(new Student("张11", "安卓一班", 91));
		listStu.add(new Student("张12", "安卓一班", 100));
		tlm.count(listStu);
	}
}
