package Efficiency;

class Fibonacci {
    
    public static void main(String [] args) {
        
        
        // Recursive Fibonacci Numbers are the combination of the previous 2 numbers
        
        System.out.println(fib(8));

        // Recursive Fibbonaci Number = O(2ⁿ) 


        // Non-Recursive Fibonacci Numbers = O(n)

    }


    public static long fib(long index) { 
        if (index == 0) { // base case 1
            return 0;
        } else if(index == 1) { // base case 2
            return 1;
        } else {
            return fib(index - 1) + fib(index - 2);
        }
    }

}
