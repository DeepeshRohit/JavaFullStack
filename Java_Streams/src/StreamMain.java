import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.*;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashSet<Fruits> f = new HashSet<>();

		 f.add(new Fruits("Lichi",200,"red",300));
		 f.add(new Fruits("Mango",80,"yellow",200));
		 f.add(new Fruits("Pineapple",130,"green",90));
		 f.add(new Fruits("Orange",180,"orange",60));
		 f.add(new Fruits("Apple",180,"red",90));
		 
		 HashSet<News> n = new HashSet<>();
		 n.add(new News(123,"This Budget, brought by the Modi government,is a visionary budget,"
			 		+ " which will prove to be a budget to change the scale of India's economy,","Nothing to say","worry not",5670));
		 n.add(new News(112,"You're not alone! To avoid seeming too slender, many women seek to tone their shoulders and arms."
				 ,"Sensless Arguments","shut up",3270));
		 n.add(new News(120,"Minority Affairs Minister Mukhtar Abbas Naqvi said amidst the global economic crisis, "
		 		+ "the Budget binds together trust and development with the thread of \"self-reliant India","Budget is not so great",
		 		"Comments some what true",8970));
		 
		 
		 List<Fruits> list = (List<Fruits>)f.stream().filter(c -> c.getCallories()<100).collect(Collectors.toList()); //collector
			        
			        for(Fruits f1 : list){
			            System.out.println(f1);
			        }
			        
        System.out.println("endof Assighnment 1 \n");
			        
        List<Fruits> color = f.stream()
                .sorted(Comparator.comparing(
                        Fruits::getColor)) //comparator
                .collect(Collectors.toList()); //collector
    	        
    	        for(Fruits e : color){
    	            System.out.println(e);
    	        }
        System.out.println("endof Assighnment 2 \n");
    	        
        List<Fruits> list2 = (List<Fruits>)f.stream().filter(c1 -> c1.getColor()=="red").sorted(Comparator.comparing(
                Fruits::getPrice)).collect(Collectors.toList()); //collector
        
        for(Fruits f2 : list2){
            System.out.println(f2);
        }
        System.out.println("endof Assighnment 3 \n");
        
        List<News> list3 = (List<News>) n.stream().sorted(Comparator.comparingInt(
                News::getCommentsCount)).collect(Collectors.toList()); 
      
            System.out.println("News id is : "+list3.get(list3.size()-1).getNewsId());
            System.out.println(list3.get(list3.size()-1));
            
            System.out.println("endof Assighnment 4 \n");
            
            for(News n2 : list3){
                System.out.println(n2.getUserPost());
            }
            System.out.println("endof Assighnment 5 \n");
            for(News n2 : list3){
                System.out.println(n2.getUserComment());
            }
            System.out.println("endof Assighnment 6 \n");
            
            HashSet<Traders> trader = new HashSet<>();
            trader.add(new Traders("Vijay","Hyd"));
            trader.add(new Traders("Ravi","Pune"));
            trader.add(new Traders("Ajay","Mumbai"));
            trader.add(new Traders("Khali","Indore"));
            trader.add(new Traders("Bali","Banglore"));
            
            HashSet<Transactions> trans = new HashSet<>();
            trans.add(new Transactions(new Traders("Ayush","Delhi"),2011,1545));
            trans.add(new Transactions(new Traders("Ajay","Indore"),2010,4834));
            trans.add(new Transactions(new Traders("Abhi","Pune"),2012,12093));
            trans.add(new Transactions(new Traders("Akhnd","Mumbai"),2013,12903));
            trans.add(new Transactions(new Traders("Awara","Banglore"),2014,12123));
            trans.add(new Transactions(new Traders("Akido","Pune"),2016,12873));
            trans.add(new Transactions(new Traders("Ali","Indore"),2021,17623));
            
            List<Transactions> transd =(List <Transactions>) trans.stream().filter(c -> c.getYear()==2011).collect(Collectors.toList()); //collector
	        
	        for(Transactions t1 : transd){
	            System.out.println(t1.getValue());
	        }
            
	        System.out.println("endof Assighnment 7 \n");
            
            
	        for(Transactions t1 : transd){
	            System.out.println(t1);
	        }
	        System.out.println("endof Assighnment 8 \n");
	                   
	        List<Traders> traderss =(List <Traders>) trader.stream().distinct().collect(Collectors.toList());
	        for(Traders trd : traderss){
	            System.out.println(trd.getCity());
	        }
	            System.out.println("endof Assighnment 9 \n");
	            
	            
	            List<Traders> tradeind =(List <Traders>) trader.stream().filter(c1 -> c1.getCity()=="Indore").collect(Collectors.toList()); 
	            for(Traders trd1 : tradeind){
		            System.out.println(trd1);
		            }
	            System.out.println("endof Assighnment 10 \n");

	            List<Traders> tradep =(List <Traders>) trader.stream().filter(c1 -> c1.getCity()=="Pune").collect(Collectors.toList()); 
	            for(Traders trdp : tradep){
		            System.out.println(trdp);
		            }
	            System.out.println("endof Assighnment 11 \n");
	            List<Traders> tradersort =(List <Traders>) trader.stream().sorted(Comparator.comparing(
	                    Traders::getName)).collect(Collectors.toList()); 
	            for(Traders trdp : tradersort){
		            System.out.println(trdp);
		            }
	            System.out.println("endof Assighnment 12 \n");
	            
	            List<Transactions> transort = trans.stream().sorted(Comparator.comparing(
	                    Transactions::getValue)).collect(Collectors.toList()); 
	            for(Transactions trs : transort){
		            System.out.println(trs);
		            }
	            System.out.println(transort.get(transort.size()-1).getValue());
	            System.out.println("endof Assighnment 13 \n");
	            System.out.println(transort.get(0));
	            System.out.println(transort.get(0).getValue());
	            
	            System.out.println("endof Assighnment 14 \n");

	}
}
