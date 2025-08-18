import java.io.CharArrayWriter;
import java.io.IOException;

public class SpringMutable {
    public static void main(String[] args) throws IOException {
        String str = "String is immutable";
        System.out.println(str);
        //thread safe mutable string
        // use when you there is multithreading environment
        // it synchronizes mehtods to ensure that only one thread can modify string at a time

        StringBuffer str1 = new StringBuffer("buffer mutable");
        str1.append(" and thread safe");
        str1.insert(0,"HI");
        str1.deleteCharAt(0);
        str1.setLength(5);
        str1.reverse();
       // System.out.println(str1 instanceof String);
        System.out.println(str1.toString());
        // single thread handling envirnment
        // doesnot handle mutli thread
        StringBuilder str2 = new StringBuilder("mutable");
        str2.append(" single thread");
        str2.insert(0, "HI");
        str2.deleteCharAt(1);
        str2.setLength(4);
        str2.reverse();
        System.out.println(str2.toString());
        // charArray writer class allows to wirte characters to buffer
        // and convert them to a string
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("hi");
        cw.write("how are you");
        String s = cw.toString();
        System.out.println(s);

        CharArrayWriter cw1 = new CharArrayWriter();
        cw1.write('f');
        cw1.write('r');
        String s1 = cw1.toString();
        System.out.println(s1);


    }
}
