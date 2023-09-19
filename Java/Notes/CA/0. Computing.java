package CA;

class Computing {

    public static void main(String [] args) {

    // Computing 
    //         a computational problem can be defined as a specification of the output as a function of a specified input
    //         So given a problem, computer scientists come up with some abstraction as a solution to the problem
    //         this abstraction is known as an algorithm

    // Algorithm
    //     An algorithm is a sequence of steps designed to give a particular output for a given input.
    //     Quite a number of algorithms can be designed for a particular problem
    //     Given unlimited resources any of these algorithms can be used to solve the problem.
    //     However, resources are limited, hence the need for efficient use of resources. 

    // Efficient Algorithms
    //     an efficient algorithm is economical on:
    //     its use of space
    //     running time
    //     The efficiency of an algorithm depends on how the data is organised in memory.
    //     We call such organisations of data “data structures”.
    //     Examples of data structures include arrays, lists, stacks, queues, maps, heaps, trees, and graphs

    // The Search Problem
    //     Searching for an item x in a set of items.
    //     Inputs: A set of items: A -  item x
    //     Output: item found or not

    // Which data structure can we use to hold the set A, whilst efficiently searching for x?
    //     We are going to consider two data structures; a linked list and a binary search tree.


    // What is a Data Structure?
    //     The way in which data should be organised such that it can be effectively used (accessed and manipulated) by a program to efficiently solve computational problems.







    // Linked List
    //     It is often used to store items that are to be processed sequentially
    //     Each spot on a Linked list is called a node
    //     Each node holds an item of data and a reference to the next node

    // Searching in a Linked List:
    //     best case the 1st node is what you are looking for, 1 node is observed
    //     worst case the item isn’t in the list, all nodes are observed

    // Binary Search Tree
    //     It is organised like an upside down tree.
    //     Each spot on the tree, called a node, holds an item of data along with a left pointer and a right pointer.
    //     node at the top is called the root node








    // Searching in a Binary Search Tree:
    //     best case the root node is what you are looking for, 1 node is observed
    //     worst case the item isn’t in the list, all levels are observed 
    //     (4 level tree, 4 nodes are observed)










    // Determining the Efficiency of an Algorithm
    //     Determination of which data structure/algorithm is more efficient can be done experimentally
    //     i.e. Implement the algorithm, run it and observe the time it takes as the input size increases
    //     This has some limitations
    //     The algorithm has to be implemented
    //     You are limited on the  input size
    //     you have to use the same platform for experimentation with the algorithms/data structures being compared.
    //     Hence, the need for a way, independent of the above limitations, of determining the efficiency of an algorithm.


    // What is the study of Data Structures About?
    //     The choice of a data structure and an algorithm makes a difference on the amount of resources  the program  uses.
    //     We need a systematic way, independent of the environment the algorithm is implemented, for determining the efficiency of algorithms. 
    //     On the backdrop of the fore-going a study of data structures covers:
    //     Different types of commonly used data structures and the corresponding operation for efficiently working with its data items.
    //     Systematic methodologies for determining the efficiency of algorithms on data structure.



    }

}
