package multipleinheritance;

public class TestMultipleInheritance {

	public static void main(String[] args) {

		USBank objUSBank = new USBank();
		
		objUSBank.strCreditAmount();
		
		objUSBank.strBusinessLoan();
		
		objUSBank.strHomeLoan();
		
		objUSBank.strCarLoan();
	}

}
