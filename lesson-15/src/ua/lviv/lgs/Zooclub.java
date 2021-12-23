package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Zooclub {
	Map<Person, List<Animal>> map = new TreeMap<>(new NameComparator());
	Scanner sc = new Scanner(System.in);
	Person p = new Person(null, 0);
	Animal a = new Animal(null, null);

	public void addMember() {
		System.out.println("������ ��'�");
		String personName = sc.next();
		System.out.println("������ ��");
		int personAge = sc.nextInt();
		map.put(new Person(personName, personAge), new ArrayList<>());
		System.out.println(personName + " - ������");
	}

	public void addAnimal() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		System.out.println("������ ��'� ��������");
		String name = sc.next();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();

			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Animal> value = next.getValue();
				System.out.println("������ ��'� ��������");
				String animalName = sc.next();
				System.out.println("������ ��� ��������");
				String animalType = sc.next();
				value.add(new Animal(animalName, animalType));
				next.setValue(value);
				System.out.println(value);
			}
		}

	}

	public void removeAnimal() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		System.out.println("������ ��'� ��������");
		String name = sc.next();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();

			if (next.getKey().getName().equalsIgnoreCase(name)) {
				List<Animal> value = next.getValue();
				System.out.println("������ ��'� �������� ��� ���������");

				Iterator<Animal> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					String consoleAnimalName = sc.next();
					Animal next2 = iterator2.next();
					if (next2.getAnimalName().equalsIgnoreCase(consoleAnimalName)) {
						iterator2.remove();
						System.out.println(consoleAnimalName + " - �������� ��: " + name);
					}
				}
			}
		}
	}

	public void removeMember() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		System.out.println("������ ��'� �������� ��� ���������");
		String name = sc.next();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(name)) {
				iterator.remove();
				System.out.println(name + " - ���������");
			}
		}
	}

	public void removeFromEveryone() {
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		System.out.println("������ ��� �������� ��� ���������");
		String consoleAnimalType = sc.next();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while (iterator2.hasNext()) {

				Animal next2 = iterator2.next();
				if (next2.getAnimalType().equalsIgnoreCase(consoleAnimalType)) {
					iterator2.remove();
					System.out.println(consoleAnimalType + " - �������� �� ��� ��������");
				}
			}
		}
	}

	public void showZooclub() {
		if (map.isEmpty() == true) {
			System.out.println("������� ������. ������� ��������");
		} else {
			for (Map.Entry<Person, List<Animal>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "" + entry.getValue());

			}
		}
	}

	public void exit() {
		System.out.println("�������� �������");
		System.exit(0);
	}
}
