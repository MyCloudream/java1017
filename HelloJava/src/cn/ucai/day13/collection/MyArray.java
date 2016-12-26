package cn.ucai.day13.collection;

import java.util.Arrays;

/**
 * 对数组进行封装： 
 * 1、元素类型唯一  | 能存储多种类型 
 * 2、数组长度固定 | 希望能一直往里添加 
 * 3、功能单一 | 增删修查
 * 
 * 集合：一系列的接口和类的整体，这些接口或类用于操作（增删修查等）数据，是存储数据的容器。
 * ArrayList
 */
public class MyArray {
	private Object[] data;
	// 表示数组中的存进来的数据的个数
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
		// 扩容
		if (size >= data.length) {
			int len = data.length * 2;
			data = Arrays.copyOf(data, len);
		}
		// 挪位置
		for (int i = size; i > index; i--) {
			data[i] = data[i - 1];
		}
		// 将元素放在挪出的位置上
		data[index] = obj;
		size++;
	}

	// 查询
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

	// 根据下标删除
	public void deleteObj(int index){
		for(int i=index;i<size;i++){
			data[i] = data[i+1];
		}
		size -- ;
	}
	
	// 根据元素来删除
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
