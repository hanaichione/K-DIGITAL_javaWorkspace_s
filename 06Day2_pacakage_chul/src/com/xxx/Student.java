package com.xxx;

import java.util.Random;

public class Student {

	public String name = "홍길동";
	
	public void a() {
		Random r = new Random();	// ctrl + shift + o : random이 들어있는 이상한 유틸리티 들어올수도, 오류시 확인 필요
		System.out.println(r.nextInt(10));
	}
}
