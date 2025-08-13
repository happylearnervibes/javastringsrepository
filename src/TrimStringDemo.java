public class TrimStringDemo {
    // trim method removes extra spaces or control characters
    // it removes unicode values lessthan 32
    // outside the string data not in between the string data
    public static void main(String[] args) {
        String stmt = " java stri ng 2";
        System.out.println(stmt.trim());
        String stmt2 = "\n\t java \n \r".trim();// control characters
        System.out.println(stmt2);
        System.out.println("ja \n va".trim());
    }
}
