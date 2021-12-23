package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Zooclub zc = new Zooclub();

		while (true) {
//			zc.fillMembers();
			menu();
			switch (sc.next()) {
			case "1":
				zc.addMember();
				break;
			case "2":
				zc.addAnimal();
				break;
			case "3":
				zc.removeAnimal();
				break;
			case "4":
				zc.removeMember();
				break;
			case "5":
				zc.removeFromEveryone();
				break;
			case "6":
				zc.showZooclub();
				break;
			case "7":
				zc.exit();
				break;
			default:
				break;
			}
		}

	}

	public static void menu() {
		System.out.println("1 - ������ �������� �����");
		System.out.println("2 - ������ �������� �� �������� �����");
		System.out.println("3 - �������� �������� � �������� �����");
		System.out.println("4 - �������� �������� � �����");
		System.out.println("5 - �������� ��������� �������� � ��� ��������");
		System.out.println("6 - ������� �� ����� �������");
		System.out.println("7 - ����� � ��������");
	}
}
