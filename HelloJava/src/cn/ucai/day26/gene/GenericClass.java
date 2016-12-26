package cn.ucai.day26.gene;

import java.util.Arrays;
import java.util.List;

public class GenericClass<E> {
	private E e;

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
	public E m(E e1,E e2){
		return null;
	}
	
	public List<E> array2List(E[] eArr){
		return Arrays.asList(eArr);
	}
	
	public static void main(String[] args) {
		/*GenericClass<String> gc = new GenericClass<String>();
		String[] strArr = {"one","two","three","four","five"};
		List<String> list = gc.array2List(strArr);
		System.out.println(list);*/
		
		
		Integer[] niArr = {1,2,3,4,5,6};
		GenericClass<Integer> gc = new GenericClass<Integer>();
		List<Integer> list = gc.array2List(niArr);
		System.out.println(list);
	}
}
