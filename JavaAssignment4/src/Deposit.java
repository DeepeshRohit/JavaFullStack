import java.util.Scanner;

public class Deposit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double balance = 0, depositAmount;
				
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter Deposit an amount");
        depositAmount =sc.nextInt();
        balance += depositAmount;
        try {
	    	  if (depositAmount<=0) {
	         throw new IllegalBankTransactionException("you can not deposit negative or zero amount ");
	         }
	    	  
	      } catch(IllegalBankTransactionException e) {
	         System.out.println(e);
	      }

	}

}
