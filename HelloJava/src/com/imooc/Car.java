package com.imooc;

public abstract class Car { //���г��ĸ���
    public  String name;     //����
    public int price;     //�۸�
     
    public abstract void showInfo(); //�շ���������̳�ʱ��д����ʾ�������۸��ؿͻ��ػ���
 
    public Car(){}
    
    public Car(String name,int price){
    	this.name = name;
    	this.price = price;
    }
    
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public int getPrice() {
        return price;
    }
 
    public void setPrice(int price) {
        this.price = price;
    }
 
}