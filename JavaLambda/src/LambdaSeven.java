import java.util.*;
  
public class LambdaSeven {
    public static void main(String[] args)
    {
        // Creating an empty Map
        Map<Integer, String> map = new HashMap<Integer, String>();
  
        // Mapping string values to int keys
        map.put(10, "Deepesh");
        map.put(15, "Riya");
        map.put(20, "Naman");
        map.put(25, "Welcomes");
        map.put(30, "You");
  
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
  
        // Using entrySet() to get the set view
        System.out.println("The set is: " + map.entrySet());
        
        
        StringBuilder str= new StringBuilder(map.entrySet().toString());    
        System.out.println("The string is: " + str);
    }
}