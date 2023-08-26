package testProject;
import java.util.*;  //1. import 선언

public class Input {
	public static void main(String[] args) {
		String str1, str2, str3;
		Scanner sc =  new Scanner(System.in);  //2. sc 객체
		 //int를 입력 받겠다.
		str1 = sc.next();
		str2 = sc.nextLine();
		str3 = sc.next();        //nextLine은 \n 만날때까지, next는 공백 만날때까지
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
