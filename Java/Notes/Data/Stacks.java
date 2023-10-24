package Data;

import java.util.Stack;

public class Stacks {
    
    public static void main(String [] args) {

        Stack<Integer> test = new Stack<>();

        test.add(5);
        test.add(10);
        test.add(15);
        test.remove(2);


        System.out.println(test);
    }

}
