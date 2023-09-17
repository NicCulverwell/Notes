package JCF;

import java.util.*;

class TestHashSet {
    
    public static void main(String [] args) {

        Set<String> set = new HashSet<>();

        set.add("Pretoria");
        set.add("Cape Town");
        set.add("Johannesburg");
        set.add("Durban");

        System.out.println(set);

        for(String s: set) {
            System.out.println(s.toUpperCase() + " ");
        }

    }

}
