package testProject;
import java.util.*;

public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("A사원의 연봉 : ");
//		int a = sc.nextInt();
//		System.out.print("B사원의 연봉 : ");
//		int b = sc.nextInt();
//		System.out.print("C사원의 연봉 : ");
//		int c = sc.nextInt();
//		
//		double ain = (0.4 * a);
//		double bin = 0;
//		double cin = (0.15 * c);
//		
//		if((a + ain) >= 3000) {
//			System.out.println("A사원 연봉/연봉+a : " + a + "/" + (a + ain) + "\n3000이상");
//		}else {
//			System.out.println("A사원 연봉/연봉+a : " + a + "/" + (a + ain) + "\n3000미만");
//		}
//		
//		if((b + bin) >= 3000) {
//			System.out.println("B사원 연봉/연봉+a : " + b + "/" + (b + bin) + "\n3000이상");
//		}else {
//			System.out.println("B사원 연봉/연봉+a : " + b + "/" + (b + bin) + "\n3000미만");
//		}
//		
//		if((c + cin) >= 3000) {
//			System.out.println("C사원 연봉/연봉+a : " + c + "/" + (c + cin) + "\n3000이상");
//		}else {
//			System.out.println("C사원 연봉/연봉+a : " + c + "/" + (c + cin) + "\n3000미만");
//		}
		
		
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();
		
		System.out.println("A사원 연봉/연봉+a : " + a + "/" + (a * 1.4) + "\n3000이상");
		System.out.println((a + (a * 0.4)) >= 3000 ? "3000이상" : "3000미만");
		
		System.out.println("B사원 연봉/연봉+a : " + b + "/" + (float)b + "\n3000이상");
		System.out.println(b >= 3000 ? "3000이상" : "3000미만");
		
		System.out.println("C사원 연봉/연봉+a : " + c + "/" + (c * 1.15) + "\n3000이상");
		System.out.println((c + (c * 0.15)) >= 3000 ? "3000이상" : "3000미만");
	}
}
