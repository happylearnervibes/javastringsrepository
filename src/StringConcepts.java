public class StringConcepts {

    public static void main(String[] args) {
        //charAt method is to fetch char at the index
        String java = "JAVA";
        char j = java.charAt(2);
        System.out.println(j);
//     // gives out of bound exception for below scenario
//        char exception = java.charAt(4);
//        System.out.println(exception);
      // isEmpty method
      String myString = "";
        System.out.println(myString.isEmpty());
        System.out.println(myString.length()==0);
        System.out.println("".equals(myString));
        // go with 3rd ,it is going to handle the null values.
        //it doesnot throw nullpointer exception
        System.out.println("".isEmpty());
        System.out.println("".length()==0);
        //empty string is not eual to null string
        System.out.println("".equals(null));
        System.out.println("".equals(""));
        String nullstring = null;
        // we cannot try isEmpty method and also lenght method
        // they give exception when you compare to check string is empty or not
       // System.out.println(nullstring.isEmpty());
       // System.out.println(nullstring.length()==0);
        System.out.println("".equals(nullstring));
        // isbalnk method
        String blankstring = "  ";
        System.out.println(blankstring.isBlank());
    }
}
