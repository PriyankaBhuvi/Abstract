package com.vstl.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {

		StudentInfo objStudentInfo = new StudentInfo();
		objStudentInfo.setStrUrl("https://meet.google.com/");
		System.out.println("Url  : "+objStudentInfo.getStrUrl());
		
		objStudentInfo.setStrStudentName("Riya");
        System.out.println("StudentName : "+objStudentInfo.getStrStudentName());
		
        objStudentInfo.setIntRegNo(20223456);
        System.out.println("Reg No : "+objStudentInfo.getIntRegNo());
		
    	objStudentInfo.setStrStudentPassword("Admin@123");
    	System.out.println("Password : "+objStudentInfo.getStrStudentPassword());
		
		objStudentInfo.setIntStudentId(234);
		System.out.println("Student Id : "+objStudentInfo.getIntStudentId());
	}

}
