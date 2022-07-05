import java.util.Scanner;

public class Withdraw{
   
	public static void main(String args[]) {
		 double balance = 2000, withdrawAmount;

	        Scanner sc=new Scanner(System.in);
	       
	        System.out.println("Enter Withdraw an amount ");
	        withdrawAmount=sc.nextDouble();
	        balance -= withdrawAmount;
		
	      try {
	    	  if (withdrawAmount<=0) {
	         throw new IllegalBankTransactionException("you can not witdraw negative or zero amount ");
	         }
	    	  else if(withdrawAmount>balance)
	    	  {
	    		  throw new InsufficientBalanceException("you can not Withdraw an amount more than your Balance");
	    	  }
	    	  else { System.out.println("Transaction Successful ");
	    	  System.out.println("Your Balance is : "+balance);}
	    	  
	      } catch(IllegalBankTransactionException e) {
	         System.out.println(e);
	         }
	        catch(InsufficientBalanceException e) {
	 	         System.out.println(e);
	      }
	   }
}                 