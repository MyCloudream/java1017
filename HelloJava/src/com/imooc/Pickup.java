package com.imooc;

public class Pickup extends Car {  //Ƥ����
//    public String name;
//    public int price;
    public int capPerson; //�ؿ���
    public int capThings; //�ػ���
     
    //���췽��
    public Pickup(String name,int price,int capPerson,int capThings){
        super(name,price);
        this.capPerson = capPerson;
        this.capThings = capThings;
    }
     
     public static void main(String[] args) {
		Pickup pk = new Pickup("Ƥ��",10,5,2);
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
        // TODO �Զ����ɵķ������
        System.out.println(getName() + '\t' +getPrice() +"Ԫ/��" + '\t' + "���ˣ�"+getCapPerson() +"��"+ "  �ػ���"+getCapThings() +"��");
    }
 
}