package testProject;
import java.util.*;

public class Switch {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        String day = sc.next();
		
//		switch(day) {
//		case "월":
//		case "화":
//		case "수":
//		case "목":
//		case "금":
//		    System.out.print("금일은 정상 영업합니다.");
//		    break;
//		case "토":
//		case "일":
//		    System.out.print("금일은 휴일입니다.");
//		    break;
//		default:
//			System.out.print("잘못 입력하셨습니다.");
//		}
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("7. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();
        
//        if(num == 1) {
//        	System.out.print("입력 메뉴입니다.");
//        } else if(num == 2) {
//        	System.out.print("수정 메뉴입니다.");
//        } else if(num == 3) {
//        	System.out.print("조회 메뉴입니다.");
//        } else if(num == 4) {
//        	System.out.print("삭제 메뉴입니다.");
//        } else if(num == 7) {
//        	System.out.print("프로그램이 종료됩니다.");
//        }
        
        switch(num) {
        case 1: System.out.print("입력 메뉴입니다.");
            break;
        case 2: System.out.print("수정 메뉴입니다.");
            break;
        case 3: System.out.print("조회 메뉴입니다.");
            break;
        case 4: System.out.print("삭제 메뉴입니다.");
            break;
        case 7: System.out.print("프로그램이 종료됩니다.");
        }
        
        
	}
}
