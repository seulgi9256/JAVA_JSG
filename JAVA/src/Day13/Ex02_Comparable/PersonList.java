package Day13.Ex02_Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class PersonList {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("김조은", 20);
		Person p2 = new Person("이조은", 24);
		Person p3 = new Person("황조은", 15);
		Person p4 = new Person("권조은", 30);
		Person p5 = new Person("최조은", 38);
		
		LinkedList<Person> personList = new LinkedList<Person>();
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		// Person 객체에 구현된 compareTo() 메소드의 비교기준으로 정렬
		Collections.sort(personList);
		
		for(Person person : personList){
			System.out.println(person.name + " : " + person.age);
		}
	}

}
