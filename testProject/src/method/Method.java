package method;
import java.util.*;

public class Method {
	Scanner sc = new Scanner(System.in);
	
//	메서드 설정값 리턴형식 메서드 이름(매개변수){
//		실행할 코드
//		return값
//	}
	
//	public static void main(String[] args) {
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//	}
//	public static void hiEveryone(int age) {
//		System.out.println("좋은 아침입니다");
//		System.out.println("제 나이는" + age + "세 입니다.");
//	}
		
	
//	public static void main(String[] args) {
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//	}
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 " + age + "세 입니다.");
//		System.out.println("저의 키는 " + height + "cm 입니다.");
//	}
//	public static void byEveryone(){
//		System.out.println("다음에 뵙겠습니다.");
//	}
	
	
//	public static void main(String[] args) {
//		int result;
//		result = adder(4, 5);  //adder가 반환하는 값을 result에 저장
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 = " + square(3.5));
//	}
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;  // addResult의 값 반환
//	}
//	public static double square(double num) {
//		return num * num;  //num * num 결과 반환
//	}
	
//	//재귀 호출(자기 자신 가져옴)
//	public static void main(String[] args) {
//		System.out.print(factorial(3));
//	}
//		public static int factorial(int n) {
//			if(n == 1) {
//				return 1;
//			}else {
//				return n * factorial(n -1);
//			}
//		}
	
	
	public static void main(String[] args) {
		
//		BankAccount yoon = new BankAccount();
//		BankAccount park = new BankAccount();
////		BankAccount tmp; //yoon이랑 park 바꾸기
//		
//		System.out.println(yoon.balance);
//		System.out.println(park.balance);
//		
//		yoon.deposit(1000);
//		park.deposit(2000);
//		
////		tmp = yoon;
////		yoon = park;
////		park = tmp;
////		tmp = null;
//		
//		yoon.checkMyBalance();
//		park.checkMyBalance();
		
		//기본생성자로 객체생성해서 이름, 잔액 출력
		BankAccount kim = new BankAccount();
		System.out.println("이름 : " + kim.name);
		kim.checkMyBalance();
		
		//매개변수가 2인 생성자로 객체 생성하고 이름, 잔액 출력
		BankAccount hong = new BankAccount(1000, "gayeon");
		System.out.println("이름 : " + hong.name);
		hong.checkMyBalance();
		
		
	}	
}

class BankAccount{
//	String accNumber;  //계좌 번호
//	String ssNumber;   //주민 번호
	int balance;
	String name;
	public BankAccount() {
		balance = 0;
		name = "이름없음";
	}
	public BankAccount(int b, String n) {
		balance = b;
		name = n;
	}
	
	//생성자: 클래스와 이름이 같은 메서드
//	public BankAccount(String acc, String ss, int bal) {
//		accNumber = acc;
//		ssNumber = ss;
//		balance = bal;
//	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액 : " + balance);
		return balance;
	}		
}


