
public class Fruits {
	
     private String name;
     private int callories;
     private String color;
     private int price;
     
	public Fruits(String name, int callories, String color, int price) {
		super();
		this.name = name;
		this.callories = callories;
		this.color = color;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCallories() {
		return callories;
	}
	@Override
	public String toString() {
		return "Fruits [name=" + name + ", callories=" + callories + ", color=" + color + ", price=" + price + "]";
	}
	public void setCallories(int callories) {
		this.callories = callories;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
