import java.util.*;
public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Anual Salary ");
		Scanner s=new Scanner(System.in);
		
        double ctc=s.nextDouble();
        if (ctc>=0&&ctc<=180000) {
            System.out.println("tax payable in % is : NILL ");
        }
        else if(ctc>180000&&ctc<=300000) {
            System.out.println(" tax payable in % is : 10 Amoout :" +((ctc*10)/100));
        }
        else if(ctc>300000&&ctc<=500000) {
            System.out.println(" tax payable in % is : 20 Amoout :"+((ctc*20)/100));
        }
        else if(ctc>500000&&ctc<=1000000) {
            System.out.println(" tax payable in % is : 30 Amoout : "+((ctc*30)/100));
        }
        else{

            System.out.println("tax payable in % is : 40 Amoout : "+((ctc*40)/100));
        }
	}

}
