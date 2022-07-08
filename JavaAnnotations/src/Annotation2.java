

@interface Info{
	
	int authorId();
	String author()default"";
	String supervisor()default"";
	String date();
	String time();
	float version();
	String description()default"";
	
}
@Info(
	authorId=103,
	date ="12,june,2022,",
	time ="11:24",
	version =1.2f
)
class Test1{
	@Info(
			authorId=104,
			author="Deep",
			date ="12,june,2022,",
			time ="11:24",
			version =1.2f, 
			description="Deep created show method"
		)
	void show(){
		System.out.print("Annotion demo");
	}
}
public class Annotation2 {
	public static void main(String []args) {
		
		Test1 t1 = new Test1();
		t1.show();
	}
}
