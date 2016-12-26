package cn.ucai.day08.emp;

public class EmpUtil {
	/*public static void firedEmp(Admin admin){
		System.out.println(admin.getName()+"��������");
	}
	
	public static void firedEmp(Tech tech){
		System.out.println(tech.getName()+"��������");
	}
	
	public static void firedEmp(Manager mana){
		System.out.println(mana.getName()+"��������");
	}*/
	
	public static void firedEmp(Emp emp){
		System.out.println(emp.getName()+"��������");
	}
	
	public static double getTotalSal(Emp emp){
		/*double totalSal = 0.0;
		if(emp instanceof Admin){// ���� instanceof: �����ж���ߵĶ������Ƿ����ұߵ�����
			totalSal = emp.getSal()*12;
		}else if(emp instanceof Tech){// ����
			Tech tech = (Tech)emp;
			totalSal = tech.getSal()*12 + tech.getComm();
		}else if(emp instanceof Manager){// ������Ա
			Manager mana = (Manager) emp;
			totalSal = mana.getSal()*12*(1+mana.getBounds());
		}
		return totalSal;*/
		return emp.getTotalSal();
	}
	
	public static void main(String[] args) {
		Emp admin = new Admin();
		admin.setSal(1.0);
		System.out.println(getTotalSal(admin));
		
		Tech tech = new Tech();
		tech.setSal(1.0);
		tech.setComm(2.0);
		System.out.println(getTotalSal(tech));
		
		Manager mana = new Manager();
		mana.setSal(2);
		mana.setBounds(0.5);
		System.out.println(getTotalSal(mana));
		
		A a = new A();
		System.out.println(getTotalSal(a));
		
		B b = new B();
		System.out.println(getTotalSal(b));
	}
}
