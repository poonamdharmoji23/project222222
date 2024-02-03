package project2;

class Checkingaccount extends Savingsaccount {
	
	double overdraftlimit;
	
	Checkingaccount(String accountnumber,double intrestrate,double overdraftlimit){
		super(accountnumber,intrestrate);
		this.overdraftlimit=overdraftlimit;
		System.out.println("overdraftlimit:"+overdraftlimit);
		}
			
	}


