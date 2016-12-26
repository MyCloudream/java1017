package com.imooc;

import java.util.Scanner;

public class DadaRent {
	public static void main(String[] args) {
		// ����������Ϣ
		Car[] allRent = { new Auto("�µ�A4", 500, 4), new Auto("���Դ�6", 400, 4), new Pickup("Ƥ��ѩ6", 450, 4, 2),
				new Auto("����  ", 800, 20), new Truck("�ɻ���", 400, 4), new Truck("��ά��", 1000, 20) };
		System.out.println("��ӭʹ�����⳵ϵͳ��");
		System.out.println("���Ƿ���Ҫ�⳵��1��  0��");

		// ��ʾ�⳵��Ϣ
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		while (choice != 0 || choice != 1) { // ������벻Ϊ0��1������������
			if (choice == 0) {
				System.out.println("��л��ʹ�����⳵ϵͳ���´��ټ���");
//				System.exit(0);// ��������
				return;
			} else if (choice == 1) {
				System.out.println("�����⳵�����ͼ����Ŀ��");
				System.out.println("���" + '\t' + "��������" + '\t' + "���" + '\t' + "����");
				for (int i = 0; i < allRent.length; i++) {
					System.out.print((i + 1) + ".\t");
					allRent[i].showInfo();
				}
				System.out.println("��������Ҫ�⳵��������");
				break;
			} else {
				System.out.println("��������ȷ�����֣�1��  0��");
				choice = input.nextInt();
			}
		}

		int carNum = input.nextInt(); // �⳵����
		Car[] choiceCar = new Car[carNum]; // ���ͻ�ѡ��ĳ����������choiceCar����
		for (int i = 0; i < carNum; i++) {
			System.out.println("�������" + (i + 1) + "���������:");
			int num = input.nextInt();// ÿ���������
			choiceCar[i] = allRent[num - 1];
		}

		System.out.println("��������Ҫ�⳵��������");
		int rentDay = input.nextInt(); // �⳵����

		// ���㲢��ʾ�˵�
		System.out.println("********************�����˵���Ϣ���£�********************");
		int dayPrice = 0; // ÿ���⳵�ܼ�

		System.out.println(">>>>>>>��Ҫ��ĳ��ǣ�   ");
		for (int i = 0; i < choiceCar.length; i++) {
			dayPrice = choiceCar[i].getPrice() + dayPrice;

			choiceCar[i].showInfo();
		}
		// System.out.println("ÿ���ܼۣ�"+dayPrice);
		System.out.println(">>>>>>>���ܹ�Ҫ��裺  " + rentDay + "  ��");

		// �������ؿ��ػ���
		int totalCapPerson = 0; // ���ؿ���
		int totalCapThings = 0; // ���ػ���
		for (int i = 0; i < choiceCar.length; i++) {
			// �ж���ѡ����Auto��Truck����Pickup
			if (choiceCar[i] instanceof Auto) { // �����ؿ���
				totalCapPerson += ((Auto) choiceCar[i]).getCapPerson();
			}

			if (choiceCar[i] instanceof Truck) { // �����ػ���
				totalCapThings += ((Truck) choiceCar[i]).getCapThings();
			}

			if (choiceCar[i] instanceof Pickup) { // Ƥ���ؿͺ��ػ���
				totalCapPerson += ((Pickup) choiceCar[i]).getCapPerson();
				totalCapThings += ((Pickup) choiceCar[i]).getCapThings();
			}
		}

		// ������ػ��������ؿ���
		System.out.println(">>>>>>>����Ҫ�������ؿ���Ϊ�� " + totalCapPerson + "��\t" + "���ػ���Ϊ��" + totalCapThings + "��");
		int totalPrice = dayPrice * rentDay; // �ܼ�
		System.out.println(">>>>>>>���ܹ���Ҫ֧����  " + totalPrice + "  Ԫ");
		System.out.println("��л��ʹ�����⳵ϵͳ���´��ټ���");
		input.close();
	}

}
