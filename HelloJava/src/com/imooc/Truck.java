package com.imooc;

public class Truck extends Car {   //������
    public String name;
    public int price;
    public int capThings;
     
    //���췽��
    public Truck(String name,int price,int capThings){
        this.name = name;
        this.price = price;
        this.capThings = capThings;   //�ػ���
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
        // TODO �Զ����ɵķ������
        System.out.println(getName() + '\t' +getPrice() +"Ԫ/��" + '\t' + "�ػ���"+getCapThings() +"��");
    }
 
}