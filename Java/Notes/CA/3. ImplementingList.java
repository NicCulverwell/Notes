package CA;

class ImplementingList {

    public static void main(String [] args) {

        // Defining our Own Library

        // to design common features of lists in an inreface an dprovide skeleton implementation in an abstract class
        // to design and implement a dynamic list using an [array]
        // to design and implement a dynamic list using a [linked data structure]

        // Lists
            // common operations:
            // retrieve an element of this list
            // insert an element of this list
            // delete an element of this list
            // find out how many elements are on this list
            // find if an element is on this list
            // find out if the list is empty

        // Implenting a List

            // using arrays
                // an array is used as the underlying container
                    // the array is dynamically created
                    // if the capacity of the array is exceed, create a larger array and move all the elements across

            // using Linked Lists
                // a linked data structure is used as the underlying container
                // a linked data structure consists of nodes
                // each node is dynamically created to hold an element
                // all the nodes are linked together to form a list
        
        // Design of ArrayList and LinkedList
            // these 2 classes have common operations
            // but different data fields

            // good strategy is to combine the virtues of interfaces and abstract classes by providing both interface and abstract class in the design so the user can 
            // use either the interfface or the abstract class, whichever is convenient. Such an abstract class is also known as a convenience class

        
        // Common methods found in ArrayList and LinkedList:
            // add(index, element)          - adds a new element to the specified index
            // clear()                      - removes all elements from the list
            // contain(element)             - retursn true if this list contains the specified element
            // get(index)                   - returns the element in this list at the specified index
            // indexOf(element)             - returns the index of the first matching element
            // remove(index, element)       - removes the element at the specified index
            // set(index, element)          - sets the element at the specified index
            // subList(fromIndex, toIndex)  - returns a sublist from fromIndex to toIndex
            // size()                       - returns the number of elements in the list

        // Array Lists
            // arrays are fixed sized data structure. Once an array is created its size cannot be changed
            // nevertheless you can still use arrays to implement dynamic data structures
            // the trick is to create another array that is larger, and then add the elements from the previous array
            
            // Insertion
                // ensure the list has at least 1 open space available
                // before inserting a new element at a specified index, shift all the elements after the index 1 to the right
                // increase the list size by 1 
                // T(n) = n-i [ n-i elements will be moved] -> [n = total elements in the array | i = index of insertion]
                    // Linear Time

            // Deletion
                // after deleting an element at a specified index, shift all the elements after the index 1 to the left
                // decrease the list size by 1
            }

}
