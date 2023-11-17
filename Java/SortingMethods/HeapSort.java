package SortingMethods;


public class HeapSort {
    
    public static void main(String [] args) {

        // Heaps are useful data structures for designing efficient sorting algorithms and priority queues
        // - a heap is a binary tree with the following properties:
        //      -   it is a complete binary tree
        //      -   a binary tree is complete if:
        //          -   every level of the tree is full except that the last level may not be full
        //          -   all the leaves on the last level are placed left-most
        
        
        // Max Heaps
        //  -   each node is greater than or equal to any of its children
        //  -   as you travel down the tree, the nodes get smaller

        // Min Heaps:
        //  -   each node is less than or equal to any of its children
        //  -   as you travel down the tree, the nodes get larger

        int [] array = {1,2,3,4,5,6,7};
        System.out.println(array);


        // when shown in tree form, 1 is the root
        // 2 and 3 form the 2nd row, going from left -> right
        // 4,5,6,7 form the 3rd row, going left -> right


    }

}
