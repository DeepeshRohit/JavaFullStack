import java.util.*;

class Product{
String name;
Double price;

public Product(String name,Double price){
super();
this.name=name;
this.price=price;

	}
}
public class LambdaTwo{
public static void main(String[] args){
List<Product>list=new ArrayList<Product>();

//adding products 
list.add(new Product("Oppo",9000.0));
list.add(new Product("Nokia",20000.0));
System.out.println("");

//implementing lambda expression:

for(Product p:list){ 
	if(p.price > 10000)
	System.out.println("products greater than 10k are Accepted "+p.name);
	else	{
		System.out.println("products lesser than 10k are not Accepted  add more item worth of rupees "+ (10000.0- p.price) );
	}
		}
	} 
}