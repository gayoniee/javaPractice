package com.java.practiceSnack;

import java.util.Scanner;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	
	private SnackController scr;
	
	public SnackMenu() {
		sc = new Scanner(System.in);
		scr = new SnackController();
	}
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.println("종류 : ");
		String ki = sc.next();
		System.out.println("이름 : ");
		String na = sc.next();
		System.out.println("맛 : ");
		String fl =sc.next();
		System.out.println("개수 : ");
		int num = sc.nextInt();
		System.out.println("가격 : ");
		int pri = sc.nextInt();
		
		System.out.println(scr.saveData(ki, na, fl, num, pri));
		System.out.println("저장한 정보를 확인하시겠습니까?(y/n)");
		if(sc.next().charAt(0) == 'y') {
			System.out.println(scr.comfirmData());
		}
	}
}
