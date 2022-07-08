
@interface Test
{
	String custom() default"test annoataion";
	}



@Test(custom="test Annoaton on class")

class TestAnnotation{
	@Test(custom="test Annoaton on method")
	
	void show() {
			
			System.out.print("Annotation Demo");
		}
	
	
}
public class Annotation1 extends TestAnnotation{
	
	public static void main(String []args) {
		TestAnnotation t= new TestAnnotation();
		t.show();
	}
	
	

}
