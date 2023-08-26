package testProject;
import java.util.*;

public class RestudySwitch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String season;
		int month = sc.nextInt();
		
//		if(month == 1 || month == 2 || month ==12) {
//			season = "겨울";
//		}else if(month >= 3 && month <= 5) {
//			season = "봄";
//		}else if(month >= 6 && month <= 8) {
//		    season = "여름";
//		}else if(month >= 9 && month <= 11) {
//			season = "가을";
//		}else {
//			season = "해당하는 계절이 없습니다.";
//		}
//		System.out.println(season);
		
		
		switch(month) {
			case 1: case 2: case 12:
				season = "겨울";
				break;
			case 3: case 4: case 5:
				season = "봄";
				break;
			case 6: case 7: case 8:
				season = "여름";
				break;
			case 9: case 10: case 11:
				season = "가을";
				break;
			default:
				season = "해당하는 계절이 없습니다.";
		}
		System.out.println(season);
		
		
		
	}
}
