package cn.ucai.day26.gene;

import java.util.Arrays;
import java.util.List;

import cn.ucai.day26.reflex.Person;

/**
 * �����ֽв��������ͣ������Ͳ��������������ϵĶ��巺�;����βΣ���new + �๹���ʱ����ľ���ʵ�Ρ�
 */
interface Inter<E,K,W>{
	public abstract void m(E e1,K k1,W w1);
}

public class Generic<E> implements Inter<String,Integer,Person>{
	@Override
	public void m(String e1, Integer k1,Person p) {
		
	}
	
	private E e;
	
	public E getE(){
		return this.e;
	}
	
	public <T> List<T> array2List(T[] eArr){
		return Arrays.asList(eArr);
	}

	public static void main(String[] args) {
		Generic<String> g = new Generic<String>();
	}
}