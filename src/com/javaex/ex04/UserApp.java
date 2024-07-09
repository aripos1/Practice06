package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {

		User[] userArr = new User[3];

		User u01 = new Customer("jws", "j1234", "정우성", 1000);
		User u02 = new Customer("yjs", "y2345", "이효리", 2000);
		User u03 = new Employee("master", "m7788", "운영자", 500000);

		userArr[0] = u01;
		userArr[1] = u02;
		userArr[2] = u03;

		for (int i = 0; i < userArr.length; i++) {
			userArr[i].showInfo();
		}

		System.out.println("운영자의 월급은 " + (((Employee)u03).getSalary())+ " 입니다.");
	}

}
