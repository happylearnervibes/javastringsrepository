public class StringformatPlaceholder {
    public static void main(String[] args) {
        // to format strings, helps us in creating strings with placeholders
        String str = String.format("Hi %s, your age is %d", "akhila", 80);
        System.out.println(str);
        String str1 = String.format("Hi %s, your age is %4d", "akhila", 80); // padding
        System.out.println(str1);
        //sending the arguments in sequential format in sorting manner
        String str2 = String.format("Hi %3$s, %2$d, %1$s, %4$s","akhila",10,"how are","you");
        System.out.println(str2);
        //special thing for float
        String str3 = String.format("pi value is %f",3.14);
        System.out.println(str3);
        //precision to two decimals, if you want to print only 2 decimals
        String str5 = String.format("pi value is %.2f",3.14567);
        System.out.println(str5);


    }
}
