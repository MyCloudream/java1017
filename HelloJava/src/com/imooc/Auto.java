package com.imooc;

public class Auto extends Car {    //������
    public String name;
    public int price;
    public int capPerson; //�ؿ���
    public Auto(){}
    public Auto(String name,int price,int capPerson){
        this.name=name;
        this.price=price;
        this.capPerson=capPerson;
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
    @Override
    public void showInfo() {
        // TODO �Զ����ɵķ������
        System.out.println(getName() + '\t' +getPrice() +"Ԫ/��" + '\t' + "���ˣ�"+getCapPerson() +"��");
    }
 
}