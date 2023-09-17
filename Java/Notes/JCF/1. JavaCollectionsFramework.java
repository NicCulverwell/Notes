package JCF;

class JavaColectionsFramework {

    public static void main(String [] args) {

        // Objective:
        // to describe the hierachy of the Java Collections Framework (JCF)
        // to use common factor methods defined in the collection interface for operations on sets and lists
        // to use the iterator interface to traverse collection 
        // to use the "for each" loop to simplify traversing a collection
        // to compare elements using the comparator interface
        // to learn how good object oriented programming practices can be used in implementing data structures

        // Collection:
        // a container item that represents a groupof objects, often referred to as elements
        
        // the JCF supports two types of named containers:
        // - Collection: stores a simple collection of elements
        // - Map: stores key/value pairs


        // Hierarchy:
        
        // JCF supports 3 major collections; Sets, Lists and Queues under the Collection Interface
        // the abstract classes are provided for convenience and hence they are referred to as Convenience Abstract Classes
        // the [AbstractCollection] class implements all methods of collection,  except for [add], [size] and [iterator]

        // An instance of Map represents a group of objects, each assosiated with a key
        // you can get the object from a map using a key, and you have to use a key to put the object into the map


        // Set:
        // - Stores a group of non-duplicate elements.
        // List:
        // - Stores an ordered collection of elements.
        // Queue:
        // - Stores objects that are processed in First In, First Out (FIFO) fashion.
        
        
        // Collection Interface:
        // - the root interface for manipulating a collection of objects
        
        //The program creates a concrete collection object using ArrayList .
        //  invokes the Collection interface’s methods:
        //   - contains()  
        //   - Remove()  
        //   - Size()
        //   - addAll()
        //   - retainAll() 
        //   - removeAll()


    }
}