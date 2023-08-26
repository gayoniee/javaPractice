package com.java.practiceStudent;

// int[] arr = {1,2,3,4,5,6,7,8,9,10};
// for(int i = 0; i < aarr.length; i++){
//		System.out.print(arr[i]);
//	}
//for(int num : arr){
//	System.out.print(num);
//}



public class StudentMenu {
	private StudentController ssm;
	
	public StudentMenu() {
		ssm = new StudentController();
		
		printStudentList();
		printStudentScore();
		printResult();
	}
	
	public void printStudentList() {
		System.out.println("========== 학생 정보 출력 ===========");
		
		Student [] sArr = ssm.printStudent();
		for(int i = 0; i < sArr.length; i++) {
			Student student = sArr[i];
			System.out.println("이름 : " + student.getName() + " / 과목 : " +
			student.getSubject() + " / 점수 : " + student.getScore());
		}
	}
	public void printStudentScore() {
		System.out.println("========== 학생 성적 출력 ===========");
		
		double[] avg = ssm.avgScore();
		System.out.println("학생 점수 합계 : " + (int)avg[0]);
		System.out.println("학생 점수 평균 : " + avg[1]);
	}
	public void printResult() {
		System.out.println("========== 성적 결과 출력 ===========");
		
		Student [] sArr = ssm.printStudent();
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].getScore() >= 60) {
				System.out.println(sArr[i].getName() + "학생은 통과입니다.");
			}else {
				System.out.println(sArr[i].getName() + "학생은 재시험 대상입니다.");
			}
		}
	}
	
	
	
}
