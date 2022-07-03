abstract class MyAbstractClass {
   public void display() { //non abstarct method with abstract clas//
      System.out.println("This is a method of abstract class");
   }
}
public class AbstractSix extends MyAbstractClass{
   public static void main(String args[]) {
      new AbstractSix().display();
   }
}

//output
//This is a method of abstract class