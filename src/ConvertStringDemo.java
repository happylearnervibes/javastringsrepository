public class ConvertStringDemo {
    // valueOf method is used to convert to string
    public static void main(String[] args) {
        int num = 20;
        boolean stmt = true;
        String str = String.valueOf(num);
        String str2 = String.valueOf(stmt);
        System.out.println(str+" "+str2);
        int age = 30;
        String msg = "my age is "+age+'M';
        System.out.println(msg);
    }
}
