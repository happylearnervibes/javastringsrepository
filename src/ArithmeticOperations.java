import javax.swing.event.ListDataEvent;

public class ArithmeticOperations {

      //based on no of operands unary operators invloves one operand
        // num++, 5++, num--,
      // binary operators involves two operands
      // num1+num2 , 10-5
      // ternary operators involves three operands
      // isEven? even:odd ,
      public static void main(String[] args) {
          int a = 10;
          a++; // unary operator
          int b = 10;
          int c = a+b; // binary operator
          boolean d = (20==c)?true:false;
          // based on the operator, arthimetic operator do mathematical operations
          System.out.println(a+b); // arithmetic
          System.out.println((a+b)==30);// relational operators ==,!=,>,>=
          System.out.println((a==10)&&(b==10));// logical operators &&,||,!
          System.out.println("");//bitwise operators & ,|, ^,-,<<,>>
      }

}
