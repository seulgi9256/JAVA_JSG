package Day13.Ex03_Comparator;

import java.util.Collections;
import java.util.LinkedList;

public class UserList {
	public static void main(String[] args) {
		
		LinkedList<User> userList = new LinkedList<>();
		
		User u1 = new User("id1", "정이름1", 20);
		User u2 = new User("id2", "김이름2", 20);
		User u3 = new User("id5", "홍이름5", 50);
		User u4 = new User("id4", "김이름4", 20);
		User u5 = new User("id3", "박이름3", 24);
		User u6 = new User("id8", "최이름8", 50);
		User u7 = new User("id6", "권이름6", 20);
		User u8 = new User("id7", "박름이7", 32);
		
		userList.add(u1);
		userList.add(u2);
		userList.add(u3);
		userList.add(u4);
		userList.add(u5);
		userList.add(u6);
		userList.add(u7);
		userList.add(u8);
		
		Collections.sort(userList, new User());
		
		for(User user : userList) {
			System.out.print("id : " + user.id);
			System.out.print(", name : " + user.name);
			System.out.println(", age : " + user.age);
	}
		System.out.println();
}
}
