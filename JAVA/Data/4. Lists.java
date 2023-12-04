package Data;

class Lists {
     // Lists:

        // to allow duplicate elements to be stored in a collection, you use a [List] 
        // Lists can also determine where you store the element
        // - user can access the element by index

        // add(index, element)          - adds a new element to the specified index
        // addAll(index, Collection)    - adds all elements in the Collection to this list at the specified index
        // get(index)                   - returns the element in this list at the specified index
        // indexOf(element)             - returns the index of the first matching element
        // lastIndexOf(element)         - returns the index of the last matching element
        // listIterator()               - returns the list iterator for the element in this list
        // listIterator(index)          - returns the iterator for elements from the startIndex
        // remove(index, element)       - removes the element at the specified index
        // set(index, element)          - sets the element at the specified index
        // subList(fromIndex, toIndex)  - returns a sublist from fromIndex to toIndex


        // List Iterator
        //
        // - add(object)                - adds the specified object to the list
        // - hasPrevious()              - returns true if the list iterator has more elements when traversing backwards
        // - nextIndex()                - returns the index of the next element
        // - previousIndex()            - returns the index of the previous element
        // - previous()                 - returns the previous element in the list iterator
        // - set(object)                - replaces the last element returned by the previous/next method with the specifed element


        // There are 2 Types of Lists:
            // ArrayList
            // LinkedList
            
        // If you require insertion or deletion of elements from any place in the list, LinkedList is the better option
        // A list can grow or shrink dynamically


}
