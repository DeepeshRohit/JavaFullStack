public class Candy extends DessertItem {
  private double weight;
  private int pricePerPound;

  public int getCost(){
    return (int) (weight*pricePerPound+0.5);
  }
  
  Candy(){} // you can remove these constructors as we don't want to create items without its attributes
  Candy(String name, double weight, int price){
    super(name);
    this.pricePerPound=price;
    this.weight=weight;
  }
  
  @Override
  public String toString(){
    StringBuilder builder=new StringBuilder();
    builder.append(weight+" lbs. @ "+pricePerPound+ " /lb.\n");
    builder.append(super.toString());
    
    return builder.toString();
  }
}