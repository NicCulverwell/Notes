package CA;

class ComplexityAnalysis {
    
    public static void main(String [] args) {
//         Algorithm Efficiency
//              suppose 2 algorithms perform the same task:
//              How do you determine which one is more efficient?
//              implement the algorithms and run the programs to get the execution time/memory usage
//              there are many tasks running concurrently on a computer
//              the execution time/memory usage is dependent on the system load
//              the execution time/memory usage is dependent on specific input

//          Growth Rate:
//              it is very difficult to compare algorithms by measuring execution time/memory usage
//              to overcome these problems, a theoretical approach was developed to analyze algorithms independent of computers and specific input
//              approach approximates the effect of a change on the size of an input on resource usage
//              you can see how fast an algorithm’s execution time/memory usage increases as the input size increases so you can compare algorithms by analyzing their growth rate

//          Big O Notation:
//              consider linear search:
//              the linear search algorithm compares the key with the elements in the array sequentially until the key is found or the array is exhausted
//              if the key is not in the array[n], it requires n comparisons
//              if the key is in the array[n], it requires n2 comparisons on average
//              the algorithms executional time is proportional to the size of the array
//              If you double the size of the array, expect the number of comparisons to double
//              the algorithm grows at a linear rate
//              the growth rate has a magnitude of n
//              computer scientists use Big O Notation to abbreviate “Order of Magnitude”
//              the complexity of linear search algorithm O(n) is pronounced “Order of n”

//          Ignoring Multiplicative Constants
//              the linear algorithm requires n comparisons in the worst-case and n2 in the average case
//              using Big O Notation, both cases require O(n) time
//              the multiplicative constant 12 can be omitted
//              algorithm analysis is focused on growth rate
//              multiplicative constants have no impact on the growth rate

//          Ignoring Non-Dominating Terms:
//              consider the algorithm for finding the maximum number in an array of n elements
//              if n is 2, it takes 1 comparison to find the number
//              if n is 3, it take 2 comparisons to find the number
//              in general it takes n-1 comparisons to find the maximum number in a list of n elements
//              as n grows larger, the n part in the expression, n-1 dominates the complexity function
//              this is known as asymptotic analysis

//          Asymptotic Analysis:
//              f(n) = n² + 100n + log10n + 1000
//              as the value of n increases, the percentage contribution of each individual term becomes less and less important, except for n2 as it exponentially grows

//          Best, Worst and Average Cases:
//              for the same input size an algorithms execution time may vary depending on the input:
//              an input that results in the shortest input time is best-case input
//              an input that results in the longest input time is worst-case input
//              best-case and worst-case are not representative, but worst-case analysis is very useful
//              it allows us to definitively that runtime will never be worse than that point
//              average-case, whilst useful is difficult to accurately calculate as there are various probabilities to take into consideration
//               worst-case is easy to obtain and thus analysis on the worst-case is often chosen
//              O(n²) means that n2 is the most dominant term

//          T(n) is not a set time. It is an indication of how the time will scale, as a list grows/shrinks in size [linear, means it will change by a flat interval] etc.

    }
}
