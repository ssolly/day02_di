package com.care.car;

public class SubClass {

	public void subFunc() {
		Car car = new Controller01();
		System.out.println("서브에서 속력을 냅니다");
		car.speed();
	}
}
