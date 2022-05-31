package com.vstl.encapsulation;

public class StudentInfo {
	/*The JavaScript Encapsulation is a process of wrapping code and data ,
	  together into a single unit is known as Encapsulation.*/
	 //Using setter and getter method.
	
	private String strUrl="";
	private String strStudentName="";
	private String strStudentPassword="";
	private int intStudentId=234;
	private int intRegNo=202212345;
	
	public String getStrUrl() {
		return strUrl;
	}
	public void setStrUrl(String strUrl) {
		this.strUrl = strUrl;
	}
	public String getStrStudentName() {
		return strStudentName;
	}
	public void setStrStudentName(String strStudentName) {
		this.strStudentName = strStudentName;
	}
	public String getStrStudentPassword() {
		return strStudentPassword;
	}
	public void setStrStudentPassword(String strStudentPassword) {
		this.strStudentPassword = strStudentPassword;
	}
	public int getIntStudentId() {
		return intStudentId;
	}
	public void setIntStudentId(int intStudentId) {
		this.intStudentId = intStudentId;
	}
	public int getIntRegNo() {
		return intRegNo;
	}
	public void setIntRegNo(int intRegNo) {
		this.intRegNo = intRegNo;
	}
	
			

}
