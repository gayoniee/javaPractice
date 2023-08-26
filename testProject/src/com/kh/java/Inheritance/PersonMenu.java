package com.kh.java.Inheritance;

import java.util.Scanner;

public class PersonMenu {
	private Scanner sc;
	private PersonController pc;
	
	public PersonMenu() {
		sc = new Scanner(System.in);
		pc = new PersonController();		
	}
	
	public void mainMenu() {
		while(true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 학생은 " + pc.PersonCount()[0] + "명 입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + pc.PersonCount()[1] + "명 입니다.");
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			
			if(menuNum == 1) {
				studentMenu();
			}
			else if(menuNum == 2) {
				employeeMenu();
			}
			else if(menuNum == 9) {
				System.out.print("종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}	
	}
	
	public void studentMenu() {
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		
		if(pc.PersonCount()[0] == 3) {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			int menuNum = sc.nextInt();
			
			if(menuNum == 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		else {
			int menuNum = sc.nextInt();
			if(menuNum == 1) {
				insertStudent();
			}
			else if(menuNum == 2) {
				printStudent();
			}
			else if(menuNum == 9) {
				System.out.print("메인으로 돌아갑니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void employeeMenu() {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		
		if(pc.PersonCount()[1] == 10) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			int menuNum = sc.nextInt();
			
			if(menuNum == 1) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
		else {
			int menuNum = sc.nextInt();
			if(menuNum == 1) {
				insertEmployee();
			}
			else if(menuNum == 2) {
				printEmployee();
			}
			else if(menuNum == 9) {
				System.out.print("메인으로 돌아갑니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String major = sc.next();
			
			pc.insertStudent(name, age, height, weight, grade, major);
			
			if(pc.PersonCount()[0] == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
			else {
				System.out.println("그만 하시려면 N(또는 n), 이어하려면 아무키나 누르세요 : ");
				char ans = sc.next().charAt(0);
				
				if(ans == 'n' || ans == 'N') {
					break;
				}
				else {
					continue;
				}
			}
		}
	}
	
	public void printStudent() {
		Student[] s = pc.printStudent();
        if (s[0] == null) {
            System.out.println("현재 저장된 학생 데이터가 없습니다.");
            return;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].toString());
            if(s[i] == null) {
            	break;
            }
        }
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			System.out.print("사원 부서 : ");
			String dept = sc.next();
			
			pc.insertStudent(name, age, height, weight, salary, dept);
			
			if(pc.PersonCount()[1] == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			}
			else {
				System.out.println("그만 하시려면 N(또는 n), 이어하려면 아무키나 누르세요 : ");
				char ans = sc.next().charAt(0);
				
				if(ans == 'n' || ans == 'N') {
					break;
				}
				else {
					continue;
				}
			}
		}
	}
	
	public void printEmployee() {
		Employee[] e = pc.printEmployee();
        if (e[0] == null) {
            System.out.println("현재 저장된 사원 데이터가 없습니다.");
            return;
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
            if(e[i] == null) {
            	break;
            }
        }
	}
}
