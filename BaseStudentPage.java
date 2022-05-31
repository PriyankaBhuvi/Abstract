package com.vstl.abstractionExample;

public abstract class BaseStudentPage {
	
	public abstract void  studentInfo(String StrStudentName,int  intRegNo);
	
	 
	public void verifyStudentportalPageIsOpen() {
		System.out.println("Student portal is open ");
	}	

		public  abstract void studentDetail(int intStudentId ,int intStudentMarks);
		    
		public void verifyStudentData() {
			System.out.println("Student Data is Correct");
		}
	
	

}
