
abstract class Display {
   private abstract void display();
   //abstract method display in type Display can only set a visibility modifier, one of public or protected
}
 
public class AbstractFour extends Display {
    void display() {
         System.out.println("Inside display method");
    }
   public static void main(String args[]) {
     System.out.println("Inside main class");
   }
}