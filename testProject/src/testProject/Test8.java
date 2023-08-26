package testProject;
import java.util.*;

public class Test8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("\n1인당 사탕 개수 : " + (candy / people));
		System.out.print("남는 사탕 개수 : " + (candy % people));
	}

}
