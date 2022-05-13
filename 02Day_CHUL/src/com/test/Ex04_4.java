package com.test;

public class Ex04_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 90;
		char grade;
		
		switch (score/10) {	// else if 쓰는 거 추천
		case 10:grade = 'A';break;
		case 9:grade = 'B';break;
		case 8:grade = 'C';break;
		case 7:grade = 'D';break;
		case 6:grade = 'E';break; //break;막으면 맨 마지막까지 실행하다 마지막 코드 실행하여 grade = F가 됨
		default: grade = 'F';
		}
		System.out.println("학점은"+grade);
	}

}
