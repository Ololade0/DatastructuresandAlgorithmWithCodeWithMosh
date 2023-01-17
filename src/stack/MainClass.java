package stack;


import java.beans.Expression;

//STACK IS NOT USE TO STORE OBJECT
//CAN REVERSE A STRING
public class MainClass {
    public static void main(String[] args) {
//        STRINGREVERSER TEST

        String str = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);
        System.out.println(result);


//    ISBALANCED EXPRESSION TEST
        String string = "(1 + 2)";
        BalancedExpression expression = new BalancedExpression();
        var outcome = expression.isBalanced(string);
        System.out.println(outcome);


        //    STACKARRAY TEST


        StackArray stackArray = new StackArray();

//        ISEMPTY TEST
        System.out.println(stackArray.isEmpty());

        stackArray.push(50);
        stackArray.push(55);
        stackArray.push(15);
        stackArray.push(65);
        stackArray.push(500);
        System.out.println(stackArray);

        stackArray.pop();
        stackArray.pop();
        System.out.println(stackArray);


        System.out.println(stackArray.peek());

        System.out.println(stackArray.isEmpty());




    }
}