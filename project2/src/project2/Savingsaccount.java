package project2;

class Savingsaccount extends Bankaccount {
	
	double intrestrate;
	
	Savingsaccount(){
		
	}
	Savingsaccount(String accountnumber,double intrestrate){
		
		this.intrestrate=intrestrate;
		this.accountnumber=accountnumber;
	}
	
	public void accountdetails() {
		
		System.out.println("intrestrate :"+" "+intrestrate);
		System.out.println("accountnumber :"+" "+accountnumber);
		
	}

}
