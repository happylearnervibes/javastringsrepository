

public class StringtoPrimitive {

    public static void main(String[] args) {
        String str = "123";
        // deprecated
        //Integer a = new integer(str);
        Integer i = Integer.parseInt(str);
        System.out.println(i);
        str = "12.23";
        Float f = Float.parseFloat(str);
        System.out.println(f);
        str = "12.3445";
        Double d = Double.parseDouble(str);
        System.out.println(d);
        str = "123";
        Boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
        str = "TRue";
        Boolean b1 = Boolean.parseBoolean(str);
        System.out.println(b1);
        str = "characters";
        char[] ch = str.toCharArray();
        System.out.println(ch[3]);
    }
}
