import java.util.*;


class Collections1{
    long phoneNumber;
    String contactName,email;
    char gender;
    public Collections1(long phoneNumber,String contactName,String email,char gender)
    {
        this.phoneNumber=phoneNumber;
        this.contactName=contactName;
        this.email=email;
        this.gender=gender;
    }

}
public class CollectionAssignment1
{
    public static void main(String[] args) {
        Map<Long,Collections1>map=new TreeMap<>(Collections.reverseOrder());
        Collections1 c1=new Collections1(125,"Arun","arun@gmail.com",'M');
        Collections1 c2=new Collections1(756L,"Vikram","vikram@capg.com",'M');
        Collections1 c3=new Collections1(963L,"Devi","devi@gmail.com",'F');
        Collections1 c4=new Collections1(328L,"Ravi","ravi@capgemini.com",'M');
        map.put(1L,c1);
        map.put(2L,c2);
        map.put(3L,c3);
        map.put(4L,c4);


        for(Map.Entry<Long, Collections1> entry:map.entrySet()){
            long key=entry.getKey();
            Collections1 c5=entry.getValue();
          System.out.println(key+" Details:");//prints all keys

            System.out.println("phone number: "+c5.phoneNumber+" contact name: "+c5.contactName+"email: "+c5.email+" gender: "+c5.gender);
        }
        System.out.print(" ");

    }
}