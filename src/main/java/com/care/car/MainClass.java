package com.care.car;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Controller01();
		System.out.println("메인에서 속력을 냅니다");
		car.speed();
		
		SubClass sc = new SubClass();
		sc.subFunc();
	}
}
