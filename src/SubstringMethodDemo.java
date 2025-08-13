public class SubstringMethodDemo {
    public static void main(String[] args) {
       // substring method  fetch the substring)
        //length is endIndex - startindex
        //overloaded method
        String original = "Hello world";
        String substr1 = original.substring(7);
        System.out.println(substr1);

        String substr2 = original.substring(4,7);
        System.out.println(substr2);

    }
}
