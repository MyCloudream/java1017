package com.imooc;

public abstract class Car { //所有车的父类
    public  String name;     //车名
    public int price;     //价格
     
    public abstract void showInfo(); //空方法，子类继承时重写，显示车名、价格、载客或载货量
 
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