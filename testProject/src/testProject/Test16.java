package testProject;
import java.util.*;

public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("키(m)를 입력해 주세요 : ");
//		double height = sc.nextDouble();
//		System.out.print("몸무게(kg)를 입력해 주세요 : ");
//		double weight = sc.nextDouble();
//		
//		double bmi = weight / (height * height);
//		System.out.println("BMI 지수 : " + bmi);
//		
//		if (bmi < 18.5) {
//			System.out.print("저체중");
//		} else if (bmi >= 18.5 && bmi < 23) {
//			System.out.print("정상체중");
//		} else if (bmi >= 23 && bmi < 25) {
//			System.out.print("과체중");
//		} else if (bmi >= 25 && bmi < 30) {
//			System.out.print("비만");
//		} else {
//			System.out.print("고도 비만");
//		}
		
		
		System.out.print("피연산자1 입력 : ");
		int a = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int b = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String cal = sc.next();
		
		if (a > 0 && b > 0) {
			if (cal.equals("+")) {
				System.out.print(a + " + " + b + "=" + ((double)a + b));
			}else if (cal.equals("-")) {
				System.out.print(a + " - " + b + "=" + ((double)a - b));
			} else if (cal.equals("*")) {
				System.out.print(a + " * " + b + "=" + ((double)a * b));
			} else if (cal.equals("/")) {
//				System.out.printf("%d %c %d = %.6f \n", a, cal, b, ((double)a / b));
				System.out.print(a + " / " + b + "=" + ((double)a / b));
			} else if (cal.equals("%")) {
				System.out.print(a + " % " + b + "=" + ((double)a % b));
			}else {
				System.out.print("잘못 입력하셨습니다");
			}
		}
		
//		if(a > 0 && b > 0)
//		switch(cal) {
//			case "+":
//				System.out.print(a + cal + b + "=" + ((double)a + b));
//				break;
//			case "-":
//				System.out.print(a + cal + b + "=" + ((double)a - b));
//				break;
//			case "*":
//				System.out.print(a + cal + b + "=" + ((double)a * b));
//				break;
//			case "/":
//				System.out.print(a + cal + b + "=" + ((double)a / b));
//				break;
//			case "%":
//				System.out.print(a + cal + b + "=" + ((double)a % b));
//				break;
//			default:
//				System.out.print("잘못 입력하셨습니다");
//		}
	}
}
