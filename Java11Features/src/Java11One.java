
interface FunctionInterfaceOne{
	
	int SimpleInterest( int p, int r,int t );
	
}
public class Java11One {
	public static void main(String[] args) {
		FunctionInterfaceOne obj=( var p , var r, var t)-> (p*r*t)/100;
		int res = obj.SimpleInterest(8000, 6, 2);
		 System.out.println(res);
		
	}
}
