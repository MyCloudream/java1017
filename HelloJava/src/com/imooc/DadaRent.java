package com.imooc;

import java.util.Scanner;

public class DadaRent {
	public static void main(String[] args) {
		// 创建车辆信息
		Car[] allRent = { new Auto("奥迪A4", 500, 4), new Auto("马自达6", 400, 4), new Pickup("皮卡雪6", 450, 4, 2),
				new Auto("金龙  ", 800, 20), new Truck("松花江", 400, 4), new Truck("依维河", 1000, 20) };
		System.out.println("欢迎使用嗒嗒租车系统：");
		System.out.println("您是否想要租车：1是  0否");

		// 显示租车信息
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		while (choice != 0 || choice != 1) { // 如果输入不为0或1，则重新输入
			if (choice == 0) {
				System.out.println("感谢您使用嗒嗒租车系统，下次再见！");
//				System.exit(0);// 结束程序
				return;
			} else if (choice == 1) {
				System.out.println("您可租车的类型及其价目表：");
				System.out.println("序号" + '\t' + "汽车名称" + '\t' + "租金" + '\t' + "容量");
				for (int i = 0; i < allRent.length; i++) {
					System.out.print((i + 1) + ".\t");
					allRent[i].showInfo();
				}
				System.out.println("请输入想要租车的数量：");
				break;
			} else {
				System.out.println("请输入正确的数字：1是  0否");
				choice = input.nextInt();
			}
		}

		int carNum = input.nextInt(); // 租车数量
		Car[] choiceCar = new Car[carNum]; // 将客户选择的车辆对象放入choiceCar数组
		for (int i = 0; i < carNum; i++) {
			System.out.println("请输入第" + (i + 1) + "辆车的序号:");
			int num = input.nextInt();// 每辆车的序号
			choiceCar[i] = allRent[num - 1];
		}

		System.out.println("请输入想要租车的天数：");
		int rentDay = input.nextInt(); // 租车天数

		// 计算并显示账单
		System.out.println("********************您的账单信息如下：********************");
		int dayPrice = 0; // 每天租车总价

		System.out.println(">>>>>>>您要租的车是：   ");
		for (int i = 0; i < choiceCar.length; i++) {
			dayPrice = choiceCar[i].getPrice() + dayPrice;

			choiceCar[i].showInfo();
		}
		// System.out.println("每天总价："+dayPrice);
		System.out.println(">>>>>>>您总共要租借：  " + rentDay + "  天");

		// 计算总载客载货量
		int totalCapPerson = 0; // 总载客量
		int totalCapThings = 0; // 总载货量
		for (int i = 0; i < choiceCar.length; i++) {
			// 判断所选车是Auto、Truck还是Pickup
			if (choiceCar[i] instanceof Auto) { // 汽车载客量
				totalCapPerson += ((Auto) choiceCar[i]).getCapPerson();
			}

			if (choiceCar[i] instanceof Truck) { // 货车载货量
				totalCapThings += ((Truck) choiceCar[i]).getCapThings();
			}

			if (choiceCar[i] instanceof Pickup) { // 皮卡载客和载货量
				totalCapPerson += ((Pickup) choiceCar[i]).getCapPerson();
				totalCapThings += ((Pickup) choiceCar[i]).getCapThings();
			}
		}

		// 输出总载货量和总载客量
		System.out.println(">>>>>>>您所要租借的总载客量为： " + totalCapPerson + "人\t" + "总载货量为：" + totalCapThings + "吨");
		int totalPrice = dayPrice * rentDay; // 总价
		System.out.println(">>>>>>>您总共需要支付：  " + totalPrice + "  元");
		System.out.println("感谢您使用嗒嗒租车系统，下次再见！");
		input.close();
	}

}
