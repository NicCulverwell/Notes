package CA;

 class SelectionSort {
    
    public static void main(String [] args) {

        // The Selection Sort Algorithm

        // Goes through the list, finding the smalles possible number, and placing it at index 0
        // then goes through the list again, finding the 2nd smalles number, and placing it at index 1
        // the number of comparisons is (n-1) for the first iteration, (n-2) for the 2nd iteration etc.
        // d is denoted as the constant time for each comparison, and c is denoted as the total number of other operations in each iteration:

        // T(n) = d(n-1) + c + d(n-2) + c .... O(n²)



        // Quadratic Time

        // an algorithm with the O(n²) time complexity is called a quadratic algorithm
        //  - the quadratic algorithm grow quickly as the problem size grows
        //  - algorithms with nested loops (loop within a loop) are often quadratic


        // Insertion Sort Algorithm
        
        // sorts a list of values by repeatedly inserting a new element into a sorted partial array until the whole array is sorted
        // at the kᵗʰ iteration, to insert an element to an array of size k, it may take k comparisons to find the insertion position, and k moves to insert the element
        // Let T(n) denote the complexity for insertion sort, d denote the constant time for each comparison and c to be the total number of other assignments per iteration
        // T(n) = 2d + c + 2.2dc+ c + ... O(n²)


        // Dynamic programming is a computer programming technique where an algorithmic problem is first broken down into sub-problems
        // the results are saved, and then the sub-problems are optimized to find the overall solution
        // which usually has to do with finding the maximum and minimum range of the algorithmic query

        // Common Growth Functions
        //      In increasing Time Complexity:
        
        // O(1) Constant Time
        // O(log(n)) Logarithmic Time
        // O(n) Linear Time
        // O(n log(n)) Log-Linear Time
        // O(n²) Quadratic Time
        // O(n³) Cubic Time
        // O(2ⁿ) Exponential Time
    
    }   

}
