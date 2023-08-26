package com.kh.javai.pracPoint;

import java.util.Scanner;

public class PointMenu {
	private Scanner sc;
	private CircleController cc;
	private RectangleController rc;
	
	public PointMenu() {
		sc = new Scanner(System.in);
		cc =  new CircleController();
		rc = new RectangleController();
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.println("메뉴 번호 : ");
			int menuNum = sc.nextInt();	
			
			if (menuNum == 9) {
				System.out.println("종료합니다.");
				break;
			} else if (menuNum == 1) {
				circleMenu();
			} else if (menuNum == 2) {
				rectangleMenu();
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void  circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum == 1) {
			calcCircum();
		}
		else if(menuNum == 2) {
			calcCircleArea();
		}
		else if(menuNum == 9) {
			System.out.println("메인으로 돌아갑니다.");
        }
		else {
            System.out.println("잘못된 번호입니다. 메인으로 돌아갑니다.");
        }
	}
	
	public void rectangleMenu() {
		System.out.println("===== 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("3. 메인으로");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		
		if(menuNum == 1) {
			calcPerimeter();
		}
		else if(menuNum == 2) {
			calcRectArea();
		}
		else if(menuNum == 3) {
			System.out.println("메인으로 돌아갑니다.");
        } 
		else {
            System.out.println("잘못된 번호입니다. 메인으로 돌아갑니다.");
        }
	}
	
	public void calcCircum() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	public void calcCircleArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("반지름 : ");
		int radius = sc.nextInt();
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	public void calcPerimeter() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcPerimeter(x, y, height, width));
	}
	
	public void calcRectArea() {
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		
		System.out.print("높이 : ");
		int height = sc.nextInt();
		
		System.out.print("너비 : ");
		int width = sc.nextInt();
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
