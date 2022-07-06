
public class PairMain {

	public static void main(String[] args) {
	
	        Pair<String,String> myObj1 = new Pair<String,String>();
	        Pair<String,String> myObj = new Pair<String,String>();
	        myObj.setKey("13829");
	        myObj.setValue("only String value");

	        // set the date
	       
	        myObj1.setKey("Today is ");
	        myObj1.setValue(new java.util.Date().toString());     // convert to string

	        System.out.println(myObj);
	        System.out.println(myObj1);

	}

}
