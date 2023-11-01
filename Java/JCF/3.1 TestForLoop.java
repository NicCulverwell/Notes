package JCF;

import java.util.*;

class TestForLoop {
    
    public static void main(String [] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("PRETORIA");
        set.add("CAPE TOWN");
        set.add("JOHANNESBURG");
        set.add("DURBAN");

        System.out.println(set);

        for(String element: set) { // element and set are both variables being called
            System.out.print(element.toLowerCase() + " | ");
        }

    }

}
