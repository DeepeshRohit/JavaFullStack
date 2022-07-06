public class GenericSwap {

     public static <T> void swap(T[] arr, int i , int j){
         T temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }

    public static void main(String[] args) {
        Integer [] a = {5,6,5,4,7,4,3,};
        swap(a,5,4);    
        // swap Integer array
        System.out.println("After swap");
        for(Integer e : a){
            System.out.print(e +" ");
        }
        System.out.println("After swap");
        String [] b = {"hello","how","are","you","?"};
        
        swap(b,2,4);                                // swap String array
        for (String s: b) {
            System.out.print(s +" ");
        }
    }
}