
public class IllegalBankTransactionException extends Exception {

	 String message;
	   IllegalBankTransactionException(String str) {
	      message = str;
	   }
	   public String toString() {
	      return (" IllegalBankTransactionException Occurred : " + message);
	   }
	}