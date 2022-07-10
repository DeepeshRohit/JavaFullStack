import java.util.ArrayList;

public class LambdaFour{
  
    public static void main(String[] args)
    {
       
        ArrayList<String> s = new ArrayList<String>();
  
        s.add("Rama");
        s.add("Mohan");
        s.add("Sohan");
        s.add("Rabi");
        s.add("Sheetala");
  
              
        System.out.println("Before removing\n");
        for (String str : s) {
            System.out.println(str);
        }
        // apply removeIf() method

        s.removeIf(n -> ((n.length()%2) != 0));
  
        System.out.println("After Removeing \n");
      
        for (String str : s) {
            System.out.println(str);
        }
    }
}