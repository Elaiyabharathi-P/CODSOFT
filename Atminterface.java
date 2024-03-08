package projects;

import java.util.Scanner;

class ATM1 {
	double Balance;
	public void account(double Balance1) {
		Balance=Balance1;
	}
	public void menu() {
		System.out.println();
		System.out.println("Enter the Option");
		 System.out.println("1. Withdraw");
	     System.out.println("2. Deposit");
	     System.out.println("3. Check Balance");
	     System.out.println("4. Exit");    
	}
	public void Withdrawl(double amt) {
		if(amt>Balance) {
			System.out.println("Inssufficient Balance");
		}
		else {
			System.out.println("Withdrawling!!");
			System.out.println("Collect the Cash");
			Balance=Balance-amt;
			System.out.println("Balance :"+Balance);
		}
	}
	public void deposit(double amt) {
		Balance=Balance+amt;
		System.out.println("Balance :"+Balance);
	}
	public void checkbalance() {
		System.out.println("Balance :"+Balance);
	}
	
}

public class Atminterface {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			ATM1 obj2=new ATM1();
			  obj2.account(1000);
			  while(true){
				  obj2.menu();
				  int input=sc.nextInt();
				  if(input==4) {
					  break;	  
				  }
				  else if(input<4&&input>0){
					  if(input==1) {
						  System.out.println("Enter the Amount to Withdrawl :");
			              int amt2=sc.nextInt();
						  obj2.Withdrawl(amt2);
						  
					  }
					  else if(input==2) {
						  System.out.println("Enter the Amount to Deposit :");
			              int amt2=sc.nextInt();
						  obj2.deposit(amt2);
						  
					  }
					  else if(input==3) {
						  obj2.checkbalance();
					  }	  
				  }
				  else {
					  System.out.println("Enter the valid input");
					  continue;
				  }
			
			  }
		}
      
	}

}

