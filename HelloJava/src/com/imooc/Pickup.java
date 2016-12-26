package com.imooc;

public class Pickup extends Car {  //皮卡类
//    public String name;
//    public int price;
    public int capPerson; //载客量
    public int capThings; //载货量
     
    //构造方法
    public Pickup(String name,int price,int capPerson,int capThings){
        super(name,price);
        this.capPerson = capPerson;
        this.capThings = capThings;
    }
     
     public static void main(String[] args) {
		Pickup pk = new Pickup("皮卡",10,5,2);
		pk.showInfo();
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
 
    public int getCapPerson() {
        return capPerson;
    }
 
    public void setCapPerson(int capPerson) {
        this.capPerson = capPerson;
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
        System.out.println(getName() + '\t' +getPrice() +"元/天" + '\t' + "载人："+getCapPerson() +"人"+ "  载货："+getCapThings() +"吨");
    }
 
}