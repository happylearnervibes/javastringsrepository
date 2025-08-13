public class ReplaceStringDemo {
    public static void main(String[] args) {
        // oldchar will be replaced with new char
        String original = "Hello World";
        String str1 = original.replace('o','g');
        System.out.println(str1);
        //string with new string
        String str2 = original.replace("world","universe");
        System.out.println(str2);
        //replace all to change more chars to replace at once
        String str3 = original.replaceAll("a|e|i","*");
        System.out.println(str3);
        String str4 = "an an ar ar";
        String str5 = str4.replaceFirst("an","at");
        System.out.println(str5);
    }
}
