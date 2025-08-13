public class StringCompareDemo {

    public static void main(String[] args) {
        // object not created , reference is not pointing to any memory location
        String str1 = null;
        // empty string means ostring object with no content in it.
        String str2="";
        // comparision of reference of strings , == operator
        // comparison of memory location of reference objects
        String s1 = "stringpool string";
        String s2 = "stringpool string";
        System.out.println(s1 == s2);
        String obj1 = new String("heap object");
        String obj2 = new String("heap object");
        System.out.println(obj1==obj2);
        // comaprison of string by equals method
        // equal method compares the string by its content
        String a="akhila";
        String a1="sarada";
        String a2="akhila";
        System.out.println(a.equals(a1));
        System.out.println(a.equals(a2));//checking content of the string object
        String b=new String("rama");
        String b1=new String("krishna");
        String b2 = new String("rama");
        System.out.println(b.equals(b1));
        System.out.println(b.equals(b2));
        //compare to operator compares strings by unicode way
        //it helps in sorting the strings
        String c = "para";
        String c1="graph";
        System.out.println(c.compareTo(c1));
        System.out.println(c.length());

    }
}
