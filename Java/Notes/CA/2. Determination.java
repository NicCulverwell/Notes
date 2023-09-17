package CA;

import java.util.*;
import java.util.List;
class Determination {
    
    public static void main(String [] args) {

        // Repetition:

        int k = 0;
        int n = 10;

        for (int i = 1; i <= n; i++) {
            k += 5;
        }

        // Time complexity:
        // T(n) = (a constant c)*n = cn = O(n) [ignore multiplicative constants]

        // c is a constant of time, that will be present in all formulas



        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                k += i + j;
            }
        }

        System.out.println(k);

        // Time Complexity:
        // T(n) = c*n² = O(n²) [ignore multiplicative constants]

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { // inner loop executed i times
                k += i + j;
            }
        }

        // Time Complexity:
        // T(n) = c + 2c + 3c + ... + nc = cn(n+1)/2) = O(n²) [ignore non-dominant terms] (n squared is the most dominant term)


        // Sequence(Separate for loops, which are added together):

        for(int j = 1; j <= 10; j++) {
            k += 4;
        }

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 20; j++) {
                k += i + j;
            }
        }

        // Complexity Time:
        // T(n) = 10c + 20cn = O(n) [10c comes from the initial for loop, 20cn comes from the 2nd for loop] 


        // Selection:

        List<Integer> arrayList = new ArrayList<>();

        int e = 0;

        if(arrayList.contains(e)) {
            System.out.println(e);
        } else {
            for (Object t: arrayList) {
                System.out.println(t);
            }
        }

        // Time Complexity:
        // T(n) = test time + worst case(if,else)
        // T(n) = 0(n) + 0(n)
        // T(n) = 0(n)



        // Constant Time
        // if Big O notation estimates the execution time of an algorithm in relation to the input size
        // if the time is not related to the input size, the algorithm is said to take constant time with the notation O(1)
        // a method that finds an element at a specific index, takes a constant time because it doesnt matter how big the array is

        // Analysing Binary Search
        // the binary search searched a key in a sorted order
        // each iteration in the algorithm contains a fixed number of operations, denoted by c
        // Let T(n) denote the time complexity for a binary search on a list of n elements
        // since binary search eliminates half of the input after two comparisons

        // Logarithmic Time
        //  Ignoring constants and smaller terms, the complexity of the binary search algorithm is O(log(n)). 
        //  An algorithm with the  O(log(n)) time complexity is called a logarithmic algorithm. 
        //  The base of the log is 2, but the base does not affect a logarithmic growth rate, so it can be omitted. 
        //  The logarithmic algorithm grows slowly as the problem size increases. 
        //  If you square the input size, you only double the time for the algorithm.

        // ¹²³⁴⁵⁶⁷⁸⁹⁰ ₀₁₂₃₄₅₆₇₈₉ (REFERENCE)
        // ᵃᵇᶜᵈᵉᶠᵍʰⁱʲᵏˡᵐⁿᵒᵖʳˢᵗᵘᵛʷˣʸᶻ







    }

}
