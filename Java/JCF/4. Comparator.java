package JCF;

class ComparatorInterface {

    public static void main(String [] args) {

        // Sometimes you want to store instances which are not comparable in data structures, such as TreeSet, that only takes comparable instances
        // You can define a comparator to compare these elements

        // the Comparator interface has 2 methods; [compare] and [equals]

        // public int compare(Object element1, Object element2) {
        //      - Returns:
        //      a negative value if element1 < element2
        //      a positive value if element1 > element2
        //      0 if element1 = element2        
        // }

        // public boolean equals(Object element1) {
        //      - Returns:
        //      true if the specified element1 is also a comparator and imposes the same ordering as this comparator
        // }
    }

}