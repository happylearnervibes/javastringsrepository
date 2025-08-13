

public class Stringdemo {

    public static void main(String[] args) {
        String a = "I am a girl";
        String b = "I am a girl";
        String c = "Iam a boy";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(c.hashCode());
        System.out.println(a==b);
        System.out.println(a==c);
        String obj = new String("hi");
        String obj1 = new String("hi");
        System.out.println(obj.equals(obj1));
        //escape sequence character
        //helps in writing the charcaters which cant be typed easily or special characters
        String d = "\"backslash\"";
        System.out.println(d);
        String e ="\u0021";//unicode
        System.out.println(e);



    }
}
