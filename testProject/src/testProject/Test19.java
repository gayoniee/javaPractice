package testProject;
import java.util.*;

public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//number이라는 변수에 int형 값을 하나 입력받아
		//출력해라 
//		int number = sc.nextInt();
//		System.out.println(number);
		
		//입력받은 값 num이 100보다 작은 정수이면 "100이하" 출력
		//100이면 "100" 100이상이면 "100을 초과하였습니다. 다시 입력해주세요"를 출력한 후
		//100이하가 입력될때 까지 반복한다.
//		while(true) {
//			int num = sc.nextInt();
//			
//			if(num > 100) {
//				System.out.println("100을 초과하였습니다. 다시 입력해주세요.");
//			}else if(num == 100) {
//				System.out.println(num);
//				break;
//			}else {
//				System.out.println("100이하");
//				break;
//			}
//		}	
		//1부터 입력받은 num값까지의 전부를 더한 값을 구해라
		// ex) num = 5일 때 1+2+3+4+5인 15출력   
//		int num = sc.nextInt();
//		int sum = 0;
//		for(int i = 1; i <= num; i++) {
//			sum += i;
//		}
//		System.out.print(sum);

		//길이가 100인 int형 1차원배열 arr을 생성하고
		//1~num까지의 수를 순서대로 배열에 저장하고 출력해라
//		int[] arr = new int[100];
//		int num = sc.nextInt();
//		
//		for(int i = 0; i < num; i++) {
//			for(int j = 1; j <= num; j++) {
//				arr[i] = j;
//				
//				if(i + 1 == j) {
//					break;
//				}
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//			if(arr[i + 1] == 0) {
//				break;
//			}
//		}
		
		//Book클레스를 작성해라
		//code(숫자), title(문자열), author(문자열)
		//모든 필드데이터를 초기화하는 생성자를 만들어라
		// getter,setter를 작성해라
		//toString메서드를 장성해라

		//메인메서드에서 Book객체를 10개 담을 수 있는 Book형 배열 BookList를 만들고
		//10개의 Book을 생성해서 저장해라
		//BookList의 모든 Book의 toString 메서드를 호출하여 저장이 잘 되었는지 확인해보자
		
	}
}
