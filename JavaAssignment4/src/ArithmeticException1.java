import java.util.*;

public class ArithmeticException1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter X value: ");
        int x = sc.nextInt();

      
        
        try {
	        System.out.println("enter Y value: ");
	        int y = sc.nextInt();
	        if(y==0)
	        {
	        throw new ArithmeticException("Avoid dividing by zero");
	        }
	            int z = x / y;
	            System.out.println("Z value is:" + z);
	        } 

        catch (ArithmeticException e) {
            System.out.println(e);
        }
       
    }
}