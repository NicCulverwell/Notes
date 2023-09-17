package JCF;

import java.util.*;

class TestListInterface {

    public static void main(String [] args) {

        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(0,10); // adds the 2nd number to the index of the 1st number
        arrayList.add(3,30);

        System.out.println("a list of integers in the array list:");
        System.out.println(arrayList);


        LinkedList<Object> linkedList = new LinkedList<>(arrayList); // as it is set as an object, it can use any variable

        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println(linkedList);

    }

}