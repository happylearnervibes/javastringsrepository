public class SplitStringDemo {
    // split method, to split string into array of substrings based on delimiter
    // delimiter- charcater or regualr exp used to determine where to split the string
    public static void main(String[] args) {
        String fruits = "apple,orange,grape";
        String[] fruitarray = fruits.split(",");
        System.out.println(fruitarray);
    }
}
