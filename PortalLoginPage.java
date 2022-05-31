package com.vstl.abstractionExample;

public class PortalLoginPage extends BaseStudentPage{

	@Override
	public void studentInfo(String StrStudentName, int intRegNo) {
		

		System.out.println("set studentName in Desktop : "+StrStudentName);
		System.out.println("set Reg No in Desktop : "+intRegNo);
		
	}

	@Override
	public void studentDetail(int intStudentId, int intStudentMarks) {
		
		 System.out.println("student id in Desktop : "+intStudentId);
		System.out.println("Student marks in desktop : "+intStudentMarks);
		
	}
}
