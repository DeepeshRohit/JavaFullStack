import java.util.ArrayList;
import java.util.Arrays;

public class Java11Three {

	   public static void main(String[] args)
	    {

	        String str = "A quick brown fox jumps over the lazy dog ";

	        // split string by no space
	        String[] strSplit = str.split(" ");

	        // Now convert string into ArrayList
	        ArrayList<String> strList = new ArrayList<String>(
	            Arrays.asList(strSplit));
	        String[] strar= strList.toArray(size ->new String[size]);
	        
	        // Now print the ArrayList
	        System.out.println(Arrays.toString(strar));

	    }
	}