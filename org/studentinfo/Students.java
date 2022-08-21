package org.studentinfo;

public class Students {

	public void getStudentInfo(int id, String name) {
		System.out.println("Student name is " + name + "and id is "+ id);
	}
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is"+ id);
	}
	
	public void getStudentInfo(long phonenumber, String email) {
		System.out.println("Student phonenumber is" + phonenumber + "and email is"+ email);
	}
	
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(151016);
		stud.getStudentInfo(151016, "Grace");
		stud.getStudentInfo(1234567890, "graceamir.c@gmail.com");
	}
	
	
	
}
