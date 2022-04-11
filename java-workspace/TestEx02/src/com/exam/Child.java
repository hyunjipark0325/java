package com.exam;

public class Child extends parent {

	//annotation = 주석 compiler 에게 설정을 알려줌
	@Override
	public void viewParent() {
		// TODO Auto-generated method stub
		System.out.println( "Child viewParent() 호출" );
	}
}
