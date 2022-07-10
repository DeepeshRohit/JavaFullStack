import java.util.*;

public class LambdaEight{
    public static void main(String[] args) throws InterruptedException {

        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Runnable listOperations = () -> {
            syncCollection.addAll(Arrays.asList(10,20,30,50));

        };

        Thread thread1 = new Thread(listOperations);
        Thread thread2 = new Thread(listOperations);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncCollection);
        //in output we are getting numbers format two times because we created two threads
        //invoking 2 threads


    }
}   