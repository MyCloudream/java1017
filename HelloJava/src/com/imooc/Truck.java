package com.imooc;

public class Truck extends Car {   //货车类
    public String name;
    public int price;
    public int capThings;
     
    //构造方法
    public Truck(String name,int price,int capThings){
        this.name = name;
        this.price = price;
        this.capThings = capThings;   //载货量
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
 
 
    public int getCapThings() {
        return capThings;
    }
 
 
    public void setCapThings(int capThings) {
        this.capThings = capThings;
    }
 
     
    @Override
    public void showInfo() {
        // TODO 自动生成的方法存根
        System.out.println(getName() + '\t' +getPrice() +"元/天" + '\t' + "载货："+getCapThings() +"吨");
    }
 
}