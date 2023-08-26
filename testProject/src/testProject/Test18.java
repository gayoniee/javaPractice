package testProject;
import java.util.*;

public class Test18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num < 1) {
//			System.out.println("1이상의 숫자를 입력해주세요.");
//		} else {
//			for(int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//		}
		
		
//		int num;
//		num = 0;
//		
//		while(num < 1) {
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if(num < 1) {
//				System.out.println("1이상의 숫자를 입력해주세요.");
//			} else {
//				for(int i = 1; i <= num; i++) {
//					System.out.print(i + " ");
//				}
//			}
//		}
		
//		int num;
//		
//		System.out.print("정수를 하나 입력하세요 : ");
//		num = sc.nextInt();
//		int sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//			if(i == num) {
//				System.out.print(i + " = " + sum);
//			}else {
//				System.out.print(i + " + ");
//			}
//		}
//		
//		int dan;
//		
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//		
//		System.out.println("===== " + dan + "단" + " =====");
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + dan * i);
//		}
		
		
		
//        int dan;
//		
//		System.out.print("숫자 : ");
//		dan = sc.nextInt();
//		
//		
//		if (dan > 9) {
//			System.out.println("9 이하의 숫자만 입력해 주세요");
//		}else {
//			for(int j = dan; j <= 9; j++) {
//				System.out.println("===== " + j + "단" + " =====");
//		
//				for(int i = 1; i <= 9; i++) {
//					System.out.println(j + " * " + i + " = " + j * i);
//				}
//			}
//		}
		
		
//		int dan;
//		dan = 10;
//		
//		while (dan > 9) {
//			System.out.print("숫자 : ");
//			dan = sc.nextInt();
//			
//			if(dan > 9) {
//				System.out.println("9 이하의 숫자만 입력해 주세요");
//			}else {
//				for(int j = dan; j <= 9; j++) {
//					System.out.println("===== " + j + "단" + " =====");
//					for(int i = 1; i <= 9; i++) {
//						System.out.println(j + " * " + i + " = " + j * i);
//					}
//				}
//			}
//		}
		
		
		
		
//		int num, d;
//		
//		System.out.print("시작 숫자 : ");
//		num = sc.nextInt();
//		System.out.print("공차 : ");
//		d = sc.nextInt();
//		
//		for(int i = num; i <= num + (d * 9); i += d) {
//			System.out.print(i + " ");
//		}
	
		
		
		
//		String cal;
//		int num1, num2;
//		
//		num1 = 0;
//		num2 = 0;
//		
//		while(num1 > 0 || num2 < 1) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			cal = sc.next();
//		if(cal.equals("exit")) {
//			System.out.println("프로그램을 종료합니다.");
//			break;
//		}
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num2 = sc.nextInt();
//			
//			 if(cal.equals("/") && num2 == 0) {
//				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//			}else {
//				if (cal.equals("+")) {
//					System.out.print(num1 + " + " + num2 + " = " + (num1+ num2));
//				}else if (cal.equals("-")) {
//					System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
//				} else if (cal.equals("*")) {
//					System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
//				} else if (cal.equals("/")) {
//					System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
//				} else if (cal.equals("%")) {
//					System.out.print(num1 + " % " + num2 + " = " + (num1 % num2));
//				} else {
//					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//				}
//				
//			}
//				
//		}
		
		
		
		
//		String cal;
//		int num1, num2;
//		
//		while(true) {
//			System.out.print("연산자(+, -, *, /, %) : ");
//			cal = sc.next();
//			
//			if(cal.equals("exit")) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//				
//			System.out.print("정수1 : ");
//			num1 = sc.nextInt();
//			System.out.print("정수2 : ");
//			num2 = sc.nextInt();
//		
//		
//			switch(cal) {
//				case "+":
//					System.out.print(num1 + " + " + num2 + " = " + (num1+ num2));
//					break;
//				case "-":
//					System.out.print(num1 + " - " + num2 + " = " + (num1 - num2));
//					break;
//				case "*":
//					System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
//					break;
//				case "/":
//					if(num2 == 0) {
//						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
//					}else {
//					System.out.print(num1 + " / " + num2 + " = " + (num1 / num2));
//					}break;
//				case "%":			
//					System.out.print(num1 + " % " + num2 + " = " + (num1 % num2));
//					break;
//				default:
//					System.out.println("없는 연산자입니다. 다시 입력해주세요.");
//			}
//		
//		}
		
		
		
//		int num;
//		
//		System.out.print("정수 입력 : ");
//		num = sc.nextInt();
//		
//		// 몇 줄 실행 할 것인가? (세로)
//		for(int i = 1; i <= num; i++) {
//			//몇 번 실행하고 싶은가? (가로)
//			for(int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		int num;
//		
//		System.out.print("정수 : ");
//		num = sc.nextInt();
//		
//		if(num > 0) {
//			for(int i = 1; i <= num; i++)
//				if(i % 2 == 0) {
//					System.out.print("수");
//				}else{
//					System.out.print("박");
//				}
//		}else {
//			System.out.print("양수가 아닙니다.");
//		}
		
		
//		int num;
//		
//		do{System.out.print("정수 : ");
//			num = sc.nextInt();
//			
//			if(num > 0) {
//				for(int i = 1; i <= num; i++)
//					if(i % 2 == 0) {
//						System.out.print("수");
//					}else{
//						System.out.print("박");
//					}
//			}else {
//				System.out.print("양수가 아닙니다.\n");
//			}
//		} while(num <1);
		
		
		
		
		
		int nan, in, count = 0;
		
		do {
			System.out.print("난수를 입력하세요 : ");
			nan = sc.nextInt();
			System.out.println("1~100 사이의 숫자를 입력해주세요.");				
		}while(nan > 100 || nan < 1);	
			
		// 반복 : 1. 정답을 입력받는 것 2. 정답을 확인하는 것
		do {	
			System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			in = sc.nextInt();
			count++;
			
			if(in > 100 || in < 1) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				count--;
			}else {
				if(nan == in) {
					System.out.println("정답입니다 !!");
					System.out.print(count + "회만에 맞추셨습니다.");
				}else if(nan > in) {
					System.out.println("UP !");
				}else if(nan < in) {
					System.out.println("DOWN !");
				}
			}
		} while(nan != in);
		
		
		
		
		
		
	}
}
