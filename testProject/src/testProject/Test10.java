package testProject;
import java.util.*;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//		
//		if(age <= 13) {
//			System.out.print("어린이");
//		} else if(19 < age) {
//			System.out.print("성인");
//		} else {
//			System.out.print("청소년");
//		}
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println("\n합계 : " + (kor + eng + math));
		System.out.println("평균 : " + ((kor + eng + math) / 3.0));
		
		if((kor >= 40) && (eng >= 40) && (math >= 40) && 
				((kor + eng + math) / 3) >= 60){
			        System.out.println("합격");
				} else {
					System.out.println("불합격");
				}
		
	}
}
