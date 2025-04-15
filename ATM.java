package Project;

import java.util.Scanner;

public class ATM {
	
	static double balance = 50000.00;	 
	 double amount;
	 static Scanner sc = new Scanner(System.in);
	static double checkbalance() {
		 return ATM.balance; 
	   }
	
	void withdraw(double amount) {
		if(amount <= balance) {
	 balance = balance - amount; 
	 System.out.println("Withdraw: "+amount);
	 System.out.println("Updated Amount: "+balance);
	 	 }
		else {
			 System.out.println("Insufficient Balance..");
	}
	}
	void deposit(double amount) {
	   balance = balance + amount;
	   System.out.println("Depoisted: "+amount);
	   System.out.println("Updated Amount: "+balance);
   }
   void exit() {
	   System.out.println("Exit....");
   }
	
   public static void main(String[] args) {
		while(true) {
     
     System.out.println("Select Your Options (1,2,3): ");
     System.out.println("1.CheckBalance");
     System.out.println("2.Withdraw");
     System.out.println("3.Deposit");
     
     
     int d=sc.nextInt();
     
     ATM am = new ATM();
         
     switch(d) {
     case 1:    	 
    	 System.out.println("Your Current balance: " +ATM.checkbalance());
         break;
         
     case 2: 
    	 System.out.println("Withdraw Amount: " );
    	double withdrawAmt = sc.nextDouble();
    	am.withdraw(withdrawAmt);
    	 break;
    	 
     case 3:
    	 System.out.println("Deposited Amount: ");
    	 double depositAmt = sc.nextDouble();
    	 am.deposit(depositAmt);
    	 break;
    	 
     default:
    	 am.exit();
     }
      
     
	}
	}
}
