@FunctionalInterface
interface ArithematicOperations
{
    void display(int a, int b);
}
class LambdaOne
{
    public static void main(String[] args) {
        ArithematicOperations l1=(a,b)->{
            System.out.println("addition is: "+(a+b));
            System.out.println("subtraction is: "+(a-b));
            System.out.println("multiplication is:"+(a*b));
            System.out.println("division is :" +(a/b)+" and remainder"+(a%b));
        };
            l1.display(2, 4);
        System.out.println(" ");
        l1.display(5,2);


    }
}