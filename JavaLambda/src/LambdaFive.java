public class LambdaFive{

    private static StringBuilder charBuffer = new StringBuilder();

        public static String processWords(String input) {
		
            String s[] = input.split("(\\s)+");
            for(String values : s)
            {
		// charAt(0) will pick only the first character
			
                charBuffer.append(values.charAt(0));
            }
            return charBuffer.toString();
        }
        public static void main (String[] args) {
            String input = "I am proud to be an indian";
            System.out.println(processWords(input));//printing string which consist of first letter of each word in a string
        }
    }