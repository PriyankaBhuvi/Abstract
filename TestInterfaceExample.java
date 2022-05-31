package com.vstl.InterfaceExample;

public class TestInterfaceExample {

	public static void main(String[] args) {

		LoginAccount objLoginAccount = new MainPage();
		System.out.println(" creat account :"+objLoginAccount.strIFSCCode);
		objLoginAccount.creatAccout();
		
		System.out.println("*****************************");
		
		LoginAccount objLoginAccount_1 =new Homepage();
		System.out.println("Cash Info : "+objLoginAccount.intTotalCash);
	}

}
