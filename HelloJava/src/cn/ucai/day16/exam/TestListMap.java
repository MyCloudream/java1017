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
		// �õ�list�е�ѧ���İ༶��Ϣ������ͬ�İ༶��ӵ�Map��
		for (int i = 0; i < listStu.size(); i++) {
			Student student = listStu.get(i);
			String className = student.getClassName();
			// ���Map���Ѵ��ڰ༶����ѧ����ӵ��ð༶��Ӧ��ѧ������List��
			if (map.containsKey(className)) {
				List<Student> list = map.get(className);
				list.add(student);
			} else {
				// �����ڣ����½�List��ͬʱ��List�ŵ�Map��
				List<Student> list = new ArrayList<Student>();
				list.add(student);
				map.put(className, list);
			}
		}
		// ����map���� ��ð༶ �Ͷ�Ӧ��ѧ������
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String className = it.next();
			List<Student> list = map.get(className);
			int sum = 0;
			for(int i=0;i<list.size();i++){
				sum += list.get(i).getScore();
			}
			System.out.println(className + "���ܷ�:"
			+ sum + ",ƽ����:" +  Math.round(sum*1.0 / list.size()) + ",����Ϊ��" + list.size());
		}
	}

	public static void main(String[] args) {
		TestListMap tlm = new TestListMap();
		List<Student> listStu = new ArrayList<Student>();
		listStu.add(new Student("��1", "��׿һ��", 100));
		listStu.add(new Student("��2", "��׿����", 150));
		listStu.add(new Student("��3", "��׿����", 142));
		listStu.add(new Student("��4", "��׿����", 80));
		listStu.add(new Student("��5", "��׿һ��", 91));
		listStu.add(new Student("��6", "��׿����", 91));
		listStu.add(new Student("��7", "��׿����", 91));
		listStu.add(new Student("��8", "��׿����", 91));
		listStu.add(new Student("��9", "��׿����", 91));
		listStu.add(new Student("��10", "��׿����", 91));
		listStu.add(new Student("��11", "��׿һ��", 91));
		listStu.add(new Student("��12", "��׿һ��", 100));
		tlm.count(listStu);
	}
}
