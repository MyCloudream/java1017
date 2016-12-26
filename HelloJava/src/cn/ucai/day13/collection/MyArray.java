package cn.ucai.day13.collection;

import java.util.Arrays;

/**
 * ��������з�װ�� 
 * 1��Ԫ������Ψһ  | �ܴ洢�������� 
 * 2�����鳤�ȹ̶� | ϣ����һֱ������� 
 * 3�����ܵ�һ | ��ɾ�޲�
 * 
 * ���ϣ�һϵ�еĽӿں�������壬��Щ�ӿڻ������ڲ�������ɾ�޲�ȣ����ݣ��Ǵ洢���ݵ�������
 * ArrayList
 */
public class MyArray {
	private Object[] data;
	// ��ʾ�����еĴ���������ݵĸ���
	private int size;

	public MyArray() {
		data = new Object[10];
	}

	public MyArray(int len) {
		data = new Object[len];
	}
	
	public boolean contains(Object o){
		return indexOf(o)==-1?false:true;
	}
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public Object[] toArray(){
		return Arrays.copyOf(data, size);
	}
	
	public int indexOf(Object o){
		for(int i=0;i<size;i++){
			if(data[i].equals(o)){
				return i;
			}
		}
		return -1;
	}
	
	public void clear(){
		for(int i=0;i<size;i++){
			data[i] = null;
		}
		size = 0;
	}
	
	public int size(){
		return size;
	}

	public void add(int index, Object obj) {
		// ����
		if (size >= data.length) {
			int len = data.length * 2;
			data = Arrays.copyOf(data, len);
		}
		// Ųλ��
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		// ��Ԫ�ط���Ų����λ����
		data[index] = obj;
		size++;
	}

	// ��ѯ
	public Object getObj(int index) {
		return data[index];
	}

	public Object updateObj(int index, Object objNew) {
		Object o = data[index];
		data[index] = objNew;
		return o;
	}

	public void add(Object obj) {
		add(size, obj);
	}

	@Override
	public String toString() {
		return Arrays.toString(data);
	}

	// �����±�ɾ��
	public void deleteObj(int index){
		for(int i=index;i<size;i++){
			data[i] = data[i+1];
		}
		size -- ;
	}
	
	// ����Ԫ����ɾ��
	public void deleteObj(Object obj){
		for(int i=0;i<data.length;i++){
			if(data[i].equals(obj)){
				deleteObj(i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		MyArray ma = new MyArray();
		ma.add("one");
		ma.add("two");
		ma.add("three");
		Object o = ma.updateObj(1, "123");
		System.out.println(o);
		System.out.println(ma);
	}
}
