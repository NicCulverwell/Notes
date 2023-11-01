package JCF;

class MapInterface {
    
    public static void main(String [] args) {

        // An instance of Map represents a group of Objects, each of which is associated with a key
        // you can get the object from the map using a key, and you have to use a key to get an object into a map

        // The map interface maps keys to elements
        //  - the keys are like indices

        // in a list, the indices are like integers, in a map the indices can be objects of any type


        // clear() - removes all entries from the map
        // containsKey(key) - returns true if this map contains an entry for the specified key
        // containsValue(value) - returns true if this map maps one or more keys to the specified value
        // entrySet() - returns a set of all entries into this map
        // get(key) - returns a value for the specified key in this map
        // isEmpty() - returns true if the map contains no entries
        // keySet() - returns a set consisting of all keys in this map
        // put(key, value) - puts an entry into this map
        // putAll(map) - puts all entries from one map to another
        // remove(key) - removes the entries for the specified key
        // size() - returns the number of entries in this map
        // values() - returns a collection consisting of all values in this map


        // Concrete Implementations of Maps:

        // HashMap:
        // - efficient for locating a value, inserting a mapping and deleting a mapping

        // LinkedHashMap:
        // - extends the HashMap with a linked list implementation that supports the ordering of the entries

        // TreeMap:
        // - implements the SortedMap, very efficient for traversing the keys in a sorted order (defaulted to ascending key order)


        // LinkedHashMap:

        // the entries of a LinkedHashMap can be retrieved in:
        // - the order they were inserted into the map (insertion order)
        // - the order they were most recently accessed in (access order)

        // no-argument constructor constructs a LinkedHashMap with [insertion order]
        // LinkedHashMap(initialCapacity, LoadFactor, true) - this will create a LHM with [access order]

    }

}
