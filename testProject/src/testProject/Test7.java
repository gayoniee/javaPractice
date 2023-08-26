package testProject;
import java.util.*;

public class Test7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수다.");
		} else {
			System.out.println("홀수다");
		}
	}
}
