import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class ConsumerInterfaceExample {  
    static void printMessage(String name){  
        System.out.println("Hello "+name);  
    }    
}

class PredicateInterfaceExample {  
    static Boolean checkAge(int age){  
        if(age>17)  
            return true;  
        else return false;  
    }  
}

class FunctionInterfaceExample {  
    static Integer addList(List<Integer> list){  
        return list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
    }  
}
public class LambdaThree {

	public static void main(String[] args) {
		 // Referring method to Consumer interface   
		 System.out.println("Consumer=>");
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;  
        consumer1.accept("John");
        System.out.println("Predicate=>");
        Predicate<Integer> predicate =  PredicateInterfaceExample::checkAge;  
        // Calling Predicate method  
        boolean result = predicate.test(25);  
        System.out.println(result);  
        
        System.out.println("Function=>");
        List<Integer> list = new ArrayList<Integer>();  
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);  
     
        Function<List<Integer>, Integer> fun = FunctionInterfaceExample::addList;  
        // Calling Function interface method  
        int result1 = fun.apply(list);  
        System.out.println("Sum of list values: "+result1); 
        
        System.out.println("Suplier=>");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();
        System.out.println(time);
        // Calling Supplier method
        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        String time2 = s1.get();

        System.out.println(time2);
	}

}
