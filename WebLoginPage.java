package com.vstl.abstractionExample;

public class WebLoginPage {
	
	public static BaseStudentPage objBaseStudentPage=null;
	
	public static String strPoratalPage="Desktop";
	
	public static BaseStudentPage getobjBaseStudentPage() {
		if(strPoratalPage.equals("Desktop")) {
			objBaseStudentPage = new DesktopPage();
		}
		else if (strPoratalPage.equals("Portal")) {
			objBaseStudentPage =  new PortalLoginPage();
			
		}
			return objBaseStudentPage;
			
		}
		
	}


