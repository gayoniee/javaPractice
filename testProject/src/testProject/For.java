package testProject;
import java.util.*;

public class For {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//초기식 : 반복문을 시작할 때 한번 세팅을 위한 값
		//조건식 : 매번 반복하기 전에 조건에 부합하는 지 확인 후 부합하면 반복진행
		//증감식 : 반복이 끝날 때마다 반복문 탈출을 위해 한번 연산을 진행
		
//		int dan = 2;
//		
//		for(int i = 1; i <= 9; i++) { //i는 지역변수
//			
//			System.out.println(dan + " * " + i + " = " + (i * dan));
//			
//		}
		
//		int i = 0;
//		while(i < 10){
//			System.out.println(i + " 출력");
//			i++;
//			
//		}
		
//		System.out.print("1 이상의 숫자를 입력하세요 : ");
//		int i = sc.nextInt();
//		
//		if (num >= 1) {
//			for (int i = 1; i <= num; i++) {
//				System.out.print(i + " ");
//			}
//			int i = 1;
//			while (i <= num) {
//				System.out.print(i + " ");
//				i++;
//			}
//		}else {
//			System.out.print("1 이상의 숫자를 입력해주세요.");
//		}
		
		
		
		
//		int num = 0;
//		while(num < 1) {
//			System.out.print("1 이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}else {
//				int i = 1;
//				while (i <= num) {
//					System.out.print(i + " ");
//					i++;				
//				}	
//			}
//		}
		
//		int num;
//		do {
//			System.out.print("1 이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			if (num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}else {
//				int i = 1;
//				while (i <= num) {
//					System.out.print(i + " ");
//					i++;				
//				}	
//			}
//	    } while(num < 1);
	
		
//		System.out.print("1 이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if (num >= 1) {
//			for(int i = num; i > 0; i--) {
//			System.out.print(i + " ");
//			}
//		}else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		
//		int num = 0;
//		while(num < 1) { //num이 1이상의 숫자가 나올 때까지 반복
//			System.out.print("1 이상의 숫자를 입력하세요 : ");
//			num = sc.nextInt();
//			
//			if (num < 1) {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//			}else {
//				int i = num;
//				while (i >= 1) {
//					System.out.print(i + " ");
//					i--;				
//				}	
//			}
//		}
		
		
//		System.out.print("정수를 하나 입력하세요 : ");
//		int num = sc.nextInt();
//		int sum = 0;
//		
//		for(int i = 1; i <= num; i++) {
//			sum = sum + i;
//			if (i == num) {
//				System.out.print(i + " = " + sum);
//			} else {
//				System.out.print(i + " + ");
//			}	
//		}
		
		
//		System.out.print("첫 번째 숫자 : ");
//		int a = sc.nextInt();
//		System.out.print("두 번째 숫자 : ");
//		int b = sc.nextInt();
		
//		if (a >= 1 && b >= 1) {
//			if(a >= b) {
//				for(int i = b; i <= a; i++) {
//				System.out.print(i + " ");
//				}
//			}else {
//				for(int i = a; i <= b; i++) {
//				System.out.print(i + " ");
//				}
//			}
//		}else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		
//		if (a >= 1 && b >= 1) {
//			
//			for (int i = (a > b ? b : a); i <= (a > b ? a : b); i++) {
//				System.out.print(i + " ");
//			}
//		}else {
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}
		
		
		
		int num1, num2;
		num1 = 0;
		num2 = 0;
		
		while(num1 < 1 || num2 < 1) { 
    		System.out.print("첫 번째 숫자 : ");
			num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			num2 = sc.nextInt();
			
			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else if(num1 >= num2) {
					for(int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
					}
			}else {
					for(int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
					}
			}			
		}
		
		
	
		
		
		
		
	}
}
