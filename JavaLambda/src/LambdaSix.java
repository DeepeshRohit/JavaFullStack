import java.util.ArrayList;

class LambdaSix{
    public static void main(String[] args) {
        ArrayList<String> replace = new ArrayList<>();
        replace.add("Computer");
        replace.add("system");
        replace.add("modal");
        replace.add("Kai");
        replace.add("masai");

      replace.replaceAll((String) ->
             String.equals(replace) ? String:String.toUpperCase()); //replacing replace elements to uppercase//

        System.out.println(replace); //printing words after changing to upper case
    }
}