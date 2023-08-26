package com.kh.java.Inheritance;

public class PersonController {
	private Student[] s;
	private int sCount = 0;
	private Employee[] e;
	private int eCount = 0;
	
	public PersonController() {
		s = new Student[3];
		e = new Employee[10];
	}
	
	public int[] PersonCount() {
		return new int[] {sCount, eCount};
	}    
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				break;
			}
		}
		sCount++;
	}
	
	public Student[] printStudent() {
		return s;
	}
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				break;
			}
		}
		eCount++;
	}
	
	public Employee[] printEmployee() {
		return e;
	}
}
