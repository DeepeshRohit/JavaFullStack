import java.util.*;
public class TotalAndAvg {

	public static void main(String[] args) {
		int s1a,s1b,s1c,s1d,s2a, s2b,s2c,s2d,s3a,s3b,s3c,s3d;
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter the marks scored by Student 1:"); 
		
		System.out.println("Marks obtained in English:"); 
		s1a=sc.nextInt();
		System.out.println("Marks obtained in Maths:"); 
		s1b=sc.nextInt();
		System.out.println("Marks obtained in Science:");
		s1c=sc.nextInt();
		System.out.println("Marks obtained in Hindi:");
		s1d=sc.nextInt();
		
		int s1total=s1a+s1b+s1c+s1d;
		int s1avg =s1total/4;

		System.out.println("Enter the marks scored by Student 2:"); 
		System.out.println("Marks obtained in English:"); 
		s2a=sc.nextInt();
		System.out.println("Marks obtained in Maths:"); 
		s2b=sc.nextInt();
		System.out.println("Marks obtained in Science:");
		s2c=sc.nextInt();
		System.out.println("Marks obtained in Hindi:");
		s2d =sc.nextInt();
		
		int s2total=s2a+s2b+s2c+s2d;
		int s2avg =s2total/4;
		
		System.out.println("Enter the marks scored by Student 3:"); 
		System.out.println("Marks obtained in English:");
		s3a=sc.nextInt();
		System.out.println("Marks obtained in Maths:"); 
		s3b=sc.nextInt();
		System.out.println("Marks obtained in Science:");
		s3c=sc.nextInt();
		System.out.println("Marks obtained in Hindi:");
		s3d=sc.nextInt();
		
		int s3total=s3a+s3b+s3c+s3d;
		int s3avg =s3total/4;
		
		System.out.println("Total marks scored by Student 1:"+s1total +"and Avg"+s1avg); 
		System.out.println("Total marks scored by Student 2:"+s2total +"and Avg"+s2avg); 
		System.out.println("Total marks scored by Student 3:"+s3total +"and Avg"+s3avg); 
	}

}
