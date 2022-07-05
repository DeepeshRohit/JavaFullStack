public class InsufficientBalanceException extends Exception {
   String message;
   InsufficientBalanceException(String str) {
      message = str;
   }
   public String toString() {
      return ("InsufficientBalanceException occured: " + message);
   }
}          