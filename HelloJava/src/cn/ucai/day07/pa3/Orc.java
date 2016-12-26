package cn.ucai.day07.pa3;

public class Orc {
	String name;
	int hp;
	int lv;
	
	public Orc(){
		
	}
	
	public Orc(String name,int hp,int lv){
		this.name = name;
		this.hp = hp;
		this.lv = lv;
	}
	
	public void desc(){
		System.out.println(name+":"+hp+":"+lv);
	}
}
