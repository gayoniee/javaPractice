package testProject;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		float width, height;
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("가로 : ");
		width = sc.nextFloat();
		System.out.print("세로 : ");
		height = sc.nextFloat();
		
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + ((width + height) * 2));
	}
}
