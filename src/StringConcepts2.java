import java.util.Locale;

public class StringConcepts2 {

    public static void main(String[] args) {
    // to uppercase and lowercase with special characters and about locale to other languages
    String a = "Java";
    String b = a.toLowerCase();
    String c = a.toUpperCase();
    System.out.println(a+"  "+b+"  "+c);
        String a1 = "Javs@123";
        String b1= a1.toLowerCase();
        String c1= a1.toUpperCase();
        System.out.println(a1+"  "+b1+"  "+c1);
    String localeDemo= a1.toLowerCase(Locale.CHINESE);
        System.out.println(localeDemo);

}}
