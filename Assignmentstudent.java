package Assignmentorg.student;

import Assignmentdepartment.*;

public class Assignmentstudent extends Assignmentdepartment

{
	public void studentName(){
		System.out.println("Prem");
	}
	public void studentDept(){
		System.out.println("Biology Department");
	}
	public void studentId(){
		System.out.println("Student id is 1111");
	}

	public static void main(String[] args) {
		
		Assignmentstudent obj =new Assignmentstudent();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();

	}

}