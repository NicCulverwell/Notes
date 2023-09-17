package JCF;

import java.util.*;

class TestForLoop {
    
    public static void main(String [] args) {

        Set<String> set1 = new LinkedHashSet<>();

        set1.add("PRETORIA");
        set1.add("CAPE TOWN");
        set1.add("JOHANNESBURG");
        set1.add("DURBAN");

        System.out.println(set1);

        for(String element1: set1) { // element and set1 are both variables being called
            System.out.print(element1.toLowerCase() + " | ");
        }

    }

}
