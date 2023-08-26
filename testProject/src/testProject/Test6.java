package testProject;
import java.util.*;

public class Test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다.");
		} else if(num == 0){
			System.out.println("0이다");
	    } else {
	    	System.out.println("양수가 아니다.");
	    }
		
		
	}
}
