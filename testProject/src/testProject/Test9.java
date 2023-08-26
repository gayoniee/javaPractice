package testProject;
import java.util.*;

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		
		gender = gender.equals("M") ? "남학생" : "여학생";
//		gender = (gender == "M") ? "남학생" : "여학생";
		
	    if(gender.equals("M")) {
			gender = "남학생";
		} else {
			gender = "여학생";
		}
		
				
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		float test = sc.nextFloat();
		
		
		System.out.print(grade + "학년 " + ban + "반 " + number + 
				"번 " + name + " " + gender + "의 성적은 " + test + "이다.");
		
	}
}
