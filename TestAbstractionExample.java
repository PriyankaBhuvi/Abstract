package com.vstl.abstractionExample;

public class TestAbstractionExample {

	public static void main(String[] args) {

		WebLoginPage.getobjBaseStudentPage().studentInfo("ronu", 2022123);
		
		WebLoginPage.getobjBaseStudentPage().verifyStudentportalPageIsOpen();
		
		WebLoginPage.getobjBaseStudentPage().studentDetail(234, 300);
	}

}
