package testProject;

import java.util.*;

public class Test4 {
	public static void main(String[] args) {
		int year, month, day, hour, min;
		String sec;  //00초를 나타내기 위해 문자형으로
		Scanner sc =  new Scanner(System.in);

		System.out.print("년 : ");
		year = sc.nextInt();
		System.out.print("월 : ");
		month = sc.nextInt();
		System.out.print("일 : ");
		day = sc.nextInt();
		System.out.print("시 : ");
		hour = sc.nextInt();
		System.out.print("분 : ");
		min = sc.nextInt();
		System.out.print("초 : ");
		sec = sc.next();
		System.out.print("지금은 " + year + "년 " + month + "월 " 
		+ day +"일 " + hour + "시 " + min + "분 " + sec + "초입니다.");
	}
}