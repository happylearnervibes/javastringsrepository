public class SubstringDemo {
    public static void main(String[] args) {
        // to find the substring is present in the string or not
        // it gives index of the first occurence of specified substring
        // indexof method returns number
        //contains method returns boolean value
        // startsWith() and endsWith()
        //matches method for complex pattern matching using regualr expression
        // .* in matches means it contain any kind of data at the place
        // all above methods are case sensitive methods
        String a = "Hello, World!";
        int index = a.indexOf("Wor");
        int index1 = a.indexOf("wor"); // no match found
        System.out.println(index);
        boolean stmt = a.contains("World");
        System.out.println(stmt);
        String b = "i am I am who are you";
        boolean stmt1 = b.startsWith("i");
        System.out.println(stmt1);
        boolean stmt2 = b.endsWith("you");
        System.out.println(stmt2);
        // regular expression .*hduhjfj.*
        boolean stmt3 = b.matches(".*am who.*");
        System.out.println(stmt3);



    }
}
