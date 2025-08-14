import java.util.Collections;

public class StringJoinEtcDemo {
    public static void main(String[] args) {
        // join method - concatenate list of strings with specified delimiter
        // static method like valueOf
        String result= String.join("","hi","how","are","you");
        System.out.println(result);
        result= String.join("*","hi","how","are","you");
        System.out.println(result);
        // when you give empty list, it gives empty string
        // it doesnot give error or exception
        // join method  uses StringBuilder for concatenation, making it effect for joining multiple strings
        // what is charsequence - it is another way of representation of string you can see it in join method
        //... after the charsequence  indicates method can accept any number of input parameters of data type that we mentioned here
        //so this concept is called variable arguments because with the help of three dots
        // the number of arguments that we can pass to the method can be based on how many arugments we going to send during runtime by the JVM.
        //String s = String.join("#","10",20); //wont work


    }
}
