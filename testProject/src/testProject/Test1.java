package testProject;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
//		String str1, str2, str3, str4;
//		Scanner sc =  new Scanner(System.in);
//		
//		str1 = sc.next();
//		str2 = sc.next();
//		str3 = sc.next();
//		str4 = sc.next();
//		
//		System.out.println("이름을 입력하세요 : " + str1);
//		System.out.println("성별을 입력하세요(남/여) : " + str2);
//		System.out.println("나이를 입력하세요 : " + str3);
//		System.out.println("키를 입력하세요(cm) : " + str4);
//		System.out.println("키 180.5cm인 20살 남자 아무개님 반갑습니다^^");
		
		
		//1.변수가 몇개 필요한지 체크
		//2. 내가 할 수 있는 출력해보고
		//3. 입력 받아야할 곳에 입력넣고
		//4. 입력받은 값을 활용해서 출력
		String name, gender;
		int age;
		float height;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		height = sc.nextFloat();
		System.out.print("키 " +height+ "cm인 "+age+"살 "
		+ gender +"자 "+name+"님" + " 반갑습니다^^");
	}

}
