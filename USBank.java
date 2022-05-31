package multipleinheritance;

public class USBank implements HSBCBank ,SBIBank {

	public void  intMinBalence() {
		System.out.println("Min balnce" );
	}
	
	
	public void strCarLoan() {
		System.out.println("Car Loan");
	}
	 
	public void strHomeLoan() {
		System.out.println("Home Loan");
	}
	
   public void strCreditAmount() {
		System.out.println("Credit Amount");
		
	}
    public void strBusinessLoan() {
		System.out.println("Business Loan");
		
	  }
	
}	

	

