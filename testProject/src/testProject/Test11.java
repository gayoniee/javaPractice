package testProject;
import java.util.*;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("주민번호를 입력하세요(- 포함) : ");
//		String str = sc.nextLine();
//		
//		if(str.charAt(7) == '2' || str.charAt(7) == '4') {
//			System.out.println("여자");
//		} else {
//			System.out.println("남자");
//		}
		
		char number;
		
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		number = sc.next().charAt(7);
		
		if(number == '2' || number == '4') {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
//		System.out.println((str.charAt(7) == '2' || str.charAt(7) == '4')
//		? "남자" : "여자");
		
//		System.out.println(number == '2' || number == '4')
//				? "남자" : "여자");
	}

}
