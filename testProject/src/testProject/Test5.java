package testProject;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
//		char st;
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("문자 : ");
//		st = sc.next().charAt(0);
//		System.out.print("a unicode : " + (st + 0));
		
		
//		float ko, en, ma;
//		Scanner sc =  new Scanner(System.in);
//		
//		System.out.print("국어 : ");
//		ko = sc.nextFloat();
//		System.out.print("영어 : ");
//		en = sc.nextFloat();
//		System.out.print("수학 : ");
//		ma = sc.nextFloat();
//		
//		System.out.println("총점 : " + (int)(ko + en + ma));
//		System.out.println("평균 : " + (int)((ko + en + ma)/3));
		
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2);
		System.out.println((int)(dNum));
		
		System.out.println((float)(iNum1));
		System.out.println(iNum2 * dNum);
		
		System.out.println((float)iNum1 / iNum2);
		System.out.println(dNum);
		
		System.out.println((int)fNum);
		System.out.println((int)(iNum1 / fNum));
		
		System.out.println(iNum1 / fNum);
		System.out.println((double)iNum1 / fNum); //오차 발생
		
		System.out.println(ch);
		System.out.println(ch + 0);
		System.out.println(ch + iNum1);
		System.out.println((char)(ch + iNum1));
	}
}
