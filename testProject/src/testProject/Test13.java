package testProject;
import java.util.*;

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num > 0 && num % 2 == 0) {
//			System.out.println("짝수다 ");
//		}else if(num > 0 && num % 2 != 0) {
//			System.out.println("홀수다");
//		}else{
//			System.out.println("양수만 입력해주세요.");
//		}
		
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int total = kor + eng + math;
		float avg = (float)(total / 3.0);
		
		if((kor >= 40) && (eng >= 40) && (math >= 40) && avg >= 60){
			        System.out.println("국어 : " + kor);
			        System.out.println("수학 : " + math);
			        System.out.println("영어 : " + eng);
			        System.out.println("합계 : " + total);
					System.out.println("평균 : " + avg);
			        System.out.println("축하합니다, 합격입니다!");
				} else {
					System.out.println("불합격입니다.");
				}
		
		
	}
}
