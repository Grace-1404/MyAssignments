package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Grace");
	}

	public void studentDept() {
		System.out.println("Bcom B&I");
	}
	
	public void studentId() {
		System.out.println("BI151016");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}
	
}
