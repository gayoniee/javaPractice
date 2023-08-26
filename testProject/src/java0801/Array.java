package java0801;
import java.util.*;
import java.math.*;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//타입이 같은 둘 이상의 데이터 저장
//	배열의 선언 => 자료형[] 배열이름;
//  배열이름 = new 자료형[길이]; 
		
		
//		int[] ar = new int[3];
//		
//		ar[0] = 7;
//		ar[1] = 8;
//		ar[2] = 9;
//		
//		int num = ar[0] + ar[1] + ar[2];
//		System.out.print(num);
		
//		배열 생성 및 초기화1
//		int[] ar = new int[3] {1, 2, 3};
		
//		배열 생성 및 초기화2
//		int[] ar ={1, 2, 3}
		
		
		
		
//		//길이가 5인 int형 1차원 배열 생성
//		int[] ar1 = new int[5];
//		
//		//길이가 7일 double형 1차원 배열 ar2 생성
//		double[] ar2 = new double[7];
//		
//		//배열의 변수 선언과 메모리 할당을 분리하여 길이가 9인 float형 배열 ar3 생성
//		float[] ar3;
//		ar3 = new float[9];
//		
//		System.out.println("ar1의 길이 : " + ar1.length);
//		System.out.println("ar2의 길이 : " + ar2.length);
//		System.out.println("ar3의 길이 : " + ar3.length);
//		
//		
//		String str = "gayeon";
//		System.out.println("str의 길이 : " + str.length());
		
		
//		String str[] = new String[5];
//		str[0] = "gayeon";
//		str[1] = new String("cafe");
//		str[4] = "hi";
//		str[2] = "tree";
//		str[3] = "hong";
//		
//		int sum = str[0].length() + str[1].length() + str[2].length() + str[3].length() + str[4].length();
//		System.out.println("총 문자의 수는 : " + sum);
//		
//		int count = 0;
//		
//		for(int i = 0; i < str.length; i++) {
//			count += str[i].length();
//		}
//		System.out.println("총 문자의 수는 : " + count);
		
//		//얕은 복사
//		int[] arr1 = {1, 2, 3, 4, 5};
//		int[] arr2 = arr1;
//		arr2[2] = 0;
//		System.out.println(arr1[2]);
		
//		//깊은 복사 (완전 복사)
//		int[] arr1 = {1, 2, 3, 4, 5};;
//		int[] arr2 = new int[5];
		
//		for(int i = 0; i < arr1.length; i++) {
//			arr2[i] = arr1[i];
//		}
//		//반복문을 통해서 arr1, arr2에 있는 모든 요소 출력
//		for(int i = 0; i < arr1.length; i++) {
//			System.out.println("arr1[" + i + "] : " + arr1[i]);
//		}
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.println("arr2[" + i + "] : " + arr2[i]);
//		}
		
//		//보편적인 배열 복사 방법
//		arr2 = arr1.clone();
//		
//		//배열 arr1을 전부 7로 초기화
//		Arrays.fill(arr1, 7);
		
	    
		
//		int[] arr1 = new int[10];
//		for(int i = 0; i < 10; i++) {
//			arr1[i] = i + 1;
//			System.out.print(arr1[i] + " ");
//		}
		
			
//		int[] arr2 = new int[10];
//		for(int i = 10; i > 0; i--) {
//			arr2[i - 1] = i;
//			System.out.print(arr2[i - 1] + " ");
//		}
		
		
//		System.out.print("양의 정수 : ");
//		int num = sc.nextInt();
//		
//		int[] arr = new int[num];
//		for(int i = 0; i < num; i++) {
//			arr[i] = i + 1;
//			System.out.print(arr[i] + " ");
//		}
		
		
//		String[] str = {"사과", "귤", "포도","복숭아", "참외"};
//		System.out.print(str[1]);
		
		
//		System.out.print("문자열 : ");
//		String sen = sc.next();
//		System.out.print("문자 : ");
//		char word = sc.next().charAt(0);
//		int count = 0;
//		
//		System.out.print(sen + "에 " + word +"가 존재하는 위치(인덱스) : ");
//		for(int i = 0; i < sen.length(); i++) {
//			if(sen.charAt(i) == word) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		System.out.println("\n" + word + " 개수 : " + count);
 
		
		
//		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
//		
//		System.out.print("0 ~ 6 사이 숫자 입력 : ");
//		int num = sc.nextInt();
//		
//		switch(num) {
//			case 0:				
//			case 1:				
//			case 2:				
//			case 3:				
//			case 4:				
//			case 5:				
//			case 6:
//				System.out.print(day[num] + "요일");
//				break;
//			default:
//				System.out.print("잘못 입력하셨습니다.");		
//		}
//		
//		
//		if(num <= 6 && num >= 0) {
//			System.out.print(day[num] + "요일");
//		}else {
//			System.out.print("잘못 입력하셨습니다.");	
//		}
		
		
		
//		System.out.print("정수 : ");
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
//			arr [i] = sc.nextInt();
//		}
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//			System.out.print(arr[i] + " ");		
//		}
//		System.out.print("\n총 합 : " + sum);
		
		
		
//		int num, count = 0;
//		int[] arr;
//		
//		do{
//			System.out.print("정수 : ");		
//			num = sc.nextInt();	
//			
//			if(num < 3 || num % 2 == 0) {
//				System.out.println("다시 입력하세요.");
//			}else {	
//				arr = new int[num]; //배열이 음수값으로 생성x -> 안쪽으로 넣어줌
//				for(int i = 0; i < arr.length; i++)	{
//					
//					if((arr.length / 2) < i) {
//							count--;
//					}else {
//							count++;
//					}
//					arr[i] = count;	
//				}
//				for(int i = 0; i < arr.length; i++)	{
//					System.out.print(arr[i] + " ");
//				}
//			}
//		}while(num < 3 || num % 2 == 0);
		
		
		
//		String  str, res = null;
//		System.out.print("치킨 이름을 입력하세요 : ");
//		str = sc.next();
//		
//		String[] arr = {"양념", "후라이드", "간장", "마늘"};
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(str.equals(arr[i])) {
//				res = str + "치킨 배달 가능";	
//				break;
//			}else {
//				res = str + "치킨은 없는 메뉴입니다.";
//			}
//		}
//		
//		System.out.print(res);
		
		
//		String str;
//		char[] st;
//		
//		System.out.print("주민등록번호(-포함) : ");
//		str = sc.next();
//		st = new char[str.length()];
//		
//		for(int i = 0; i < str.length(); i++) {
//			if(i >= 8) {
//				st[i] = '*';
//			}else {
//				st[i] = str.charAt(i);
//			}
//		}
//		for(int i = 0; i < str.length(); i++) {
//			System.out.print(st[i]);
//		}
		
		
		//Math,random() : 0보다 크고 1보다 작은 난수 발생
		// 값을 곱하고 int 형으로 변환해서 정수형 난수를 발생시킬 수 있다.
		
//		int[] arr = new int[10];
//		int nan;
//		
//		for(int i = 0; i < arr.length; i++) {
//			nan = (int)(Math.random() * 10 + 1);
//			arr[i] = nan;
//			System.out.print(arr[i] + " ");
//		}
		
		
		
//		int[] arr = new int[10];
//		int nan;
//		int max = 0, min = 10;
//		
//		for(int i = 0; i < arr.length; i++) {
//			nan = (int)(Math.random() * 10 + 1);
//			arr[i] = nan;
//		}
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] < min) {
//				min = arr[i];
//			}
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		System.out.println("\n최대값 : " + max);
//		System.out.println("최소값 : " + min);
		
		
		
//		int[] arr = new int[10];
//		int nan;
//		int i = 0;
//		
//		while(i < arr.length) {
//			nan = (int)(Math.random() * 10 + 1);
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}			
//			if(nan == 0) {
//				continue;
//			}else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		for(i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		
//		//int형 변수 num을 생성하고 값을 10으로 초기화
//		int num = 10;
//		//String형 변수 str을 생성하고 값을 "hi"로 초기화
//		String str = "hi";
//		//num과 str을 출력
//		System.out.print(num);
//		System.out.print(str);
//		//만약 num이 5보다 크다면 "num은 5보다 큰 수입니다" 출력
//		//더 작다면 "num은 5보다 작은 수 입니다" 출력
//		// 5라면 "num은 5입니다" 출력
//		if(num > 5) {
//			System.out.print("num은 5보다 큰 수입니다");
//		}else if(num < 5) {
//			System.out.print("num은 5보다 작은 수 입니다");
//		}else {
//			System.out.print("num은 5입니다");
//		}
//		
//		//반복문을 활용하여 1~num까지 숫자를 순차적으로 출력
//		//ex) num = 3일때 1 2 3 출력
//		//for while 각각 작성
//		for(int i = 1; i <= num; i++) {
//			System.out.print(i);
//		}
//		
//		int i = 0;
//		while(i <= num) {
//			System.out.print(i);
//			i++;
//		}
//		
//		//길이가 20인 int형 배열 arr 생성후 반복문을 이용하여 값을 1~20까지 순차적으로 초기화
//		int [] arr = new int[20];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 1;
//		}
//		//반복문을 이용하여 arr 요소 전체 출력
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		//String형 길이가 5인 arr2 배열을 생성하고 생성과 동시에 {"사과", "포도", "귤", "파인애플", "바나나"}로 초기화
//		String[] arr2 = {"사과", "포도", "귤", "파인애플", "바나나"};
//		//반복문을 이용하여 arr2 요소 전체 출력
//		for(int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]);
//		}
		
		
//		//오름차순 정렬 : Arrays.sort(배열);
//		//내림차순 정렬 : Arrays.sor(배열, Collections.reverseOrder());
//		
//		int[] arr = new int[6];
//		int nan;
//		int i = 0;
//		
//		while(i < arr.length) {
//			nan = (int)(Math.random() * 45 + 1);
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] == nan) {
//					nan = 0;
//					break;
//				}
//			}			
//			if(nan == 0) {
//				continue;
//			}else {
//				arr[i] = nan;
//				i++;
//			}
//		}
//		Arrays.sort(arr);
//		for(i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		
//		//for중첩 방법
//		
//		for(i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random() * 45 + 1);
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
//		Arrays.sort(arr);
//		for(i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}
		
		
		//*****
//		System.out.print("문자열 : ");
//		String word = sc.next();
//		char[] arr = new char[word.length()];
//		
//		int i = 0, j = 0;
//		while(i < word.length()) {
//			arr[j] = word.charAt(i);
//			//중복 검사
//			for(int k = 0; k < j; k++) {
//				if(arr[j] == arr[k]) {
//					j--;
//					break;
//				}
//			}
//			i++;
//			j++;
//		}
//		System.out.print("문자열에 있는 문자 : ");
//		for(int h = 0; 0 < word.length(); h++) {
//			if(h == (arr.length - 1) || arr[h + 1] == 0) {
//				System.out.println(arr[h]);
//				System.out.print("문자 개수 : " + (h + 1));
//				break;
//			}else {
//				System.out.print(arr[h] + ", ");
//			}
//		}
		
		
		//*****
//		int num, i = 0;
//		String [] arr1, arr2;
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		num = sc.nextInt();	
//		arr1 = new String[num];
//		sc.nextLine();
//		
//		while(true) {
//			for(; i < arr1.length; i++) {
//				System.out.print((i + 1) + "번째 문자열 : ");
//				arr1[i] = sc.nextLine();
//			}				
//			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");	
//			
//			if('y' == sc.next().charAt(0)) {
//				System.out.print("더 입력하고 싶은 개수 : ");
//				num = sc.nextInt();
//				sc.nextLine();
//				
//				arr2 = new String[arr1.length + num];
//				
//				for(i = 0; i < arr1.length; i++) {
//					arr2[i] = arr1[i];
//				}
//				arr1 = arr2;
//			}else {
//				System.out.print("[");
//				for(i = 0; i < arr1.length; i++) {
//					if(i == arr1.length - 1) {
//						System.out.print(arr1[i] +"]");
//					}else {
//						System.out.print(arr1[i] + ", ");
//					}	
//				}
//				break;
//			}
//		}
		
		
		
		//2차원 배열 : arr[배열 개수(행)][칸 개수(열)];
		//int arr[행][열] = new int [][];
		
		//크기가 4인 1차원 배열 3개를 답고있는 2차원 배열을 만들어라.(int)	
//		int [][] arr  = new int[3][4];
		

//		for(int i = 0; i < arr[1].length; i++) {
//			arr[1][i] = 5;
//			System.out.print(arr[1][i]);
//		}
		
//		arr[0][0] = 5;
//		arr[1][0] = 5;
//		arr[2][0] = 5;
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i][0] = 5;
//			System.out.print(arr[i][0]);
//		}
	
//		int i, j;
//		for(i = 0; i < arr.length; i++) {
//			for(j = 0; j < arr[i].length; j++) {
//				arr[i][j] = 5;
//				System.out.print(arr[i][j]);
//			}
//		}
		
//		int [][] arr = {
//						{5,5,5,5}, 
//						{5,5,5,5},  //각각 길이 다르게 만들기 가능!
//						{5,5,5,5}
//					   };
		
		//크기가 각각 4, 3, 5, 2인 1차원 배열들로 생성된 2차원 배열을 만들고 전부 10으로 초기화		
//		int [][] arr = {{10,10,10,10}, {10,10,10}, {10,10,10,10,10}, {10,10}};
		
		
//		String [][] str = {
//							{"(0, 0)", "(0, 1)", "(0, 2)"}, 
//							{"(1, 0)", "(1, 1)", "(1, 2)"},
//							{"(2, 0)", "(2, 1)", "(2, 2)"}
//						  };
//		
//		int i, j;
//		for(i = 0; i < str.length; i++) {
//			for(j = 0; j < str[i].length; j++) {
//				System.out.print(str[i][j]);
//			}System.out.println();
//		}
		
		
//		String [][] str = new String[3][3];
//		
//		for(int i = 0; i < str.length; i++) {
//			for(int j = 0; j < str[i].length; j++) {
//				str[i][j] = "(" + i + ", " + j + ")";
//				System.out.print(str[i][j]);
//			}System.out.println();
//		}
		
		
		
//		char [][] str = {
//							{'a','b','c'},
//							{'d','e','f'},
//							{'g','h','i'}
//						  };
//		
//		for(int i = 0; i < str.length; i++) {
//			for(int j = 0; j < str[i].length; j++) {
//				System.out.print(str[i][j] +" ");
//			}System.out.println();
//		}
		
		
//		char [][] str = new char[3][3];
//		char ch = 'a';
//		
//		for(int i = 0; i < str.length; i++) {
//			for(int j = 0; j < str[i].length; j++) {
//				str[i][j] = ch++;
//				System.out.print(str[i][j] +" ");
//			}System.out.println();
//		}
		
		
//		int [][] arr = new int[4][4];
//		int num = 1;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num++;
//				System.out.print(arr[i][j] +" ");
//			}System.out.println();
//		}
		
		
//		int [][] arr = new int[4][4];
//		int num = 16;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = num--;
//				System.out.print(arr[i][j] +" ");
//			}System.out.println();
//		}
		
		
		
//		int num = 1, j= 0;
//		int [][] arr = new int[4][4];
//		
//		for(int i = 0; i < 3; i++) {
//			for(j = 0; j < 3; j++) {
//     			arr[i][j] = num++;
//     			arr[i][3] += arr[i][j];
//     			arr[3][j] += arr[i][j];
//			}
//			arr[3][3] += arr[i][3] * 2;
////			System.out.print(arr[i][j] +" ");
////			System.out.println();
//		}
////		for(j = 0; j < 3; j++) {
////			System.out.print(arr[3][j] +" ");
////		}		
////		arr[3][3] = arr[0][3] + arr[1][3] + arr[2][3] +
////				    arr[3][0] + arr[3][1] + arr[3][2];
//
//		for(int i = 0; i < 4; i++) {
//			for(j = 0; j < 4; j++) {
//     			System.out.print(arr[i][j] +" ");
//			}System.out.println();
//		}
		
		
		
		
		
		
	}
}
