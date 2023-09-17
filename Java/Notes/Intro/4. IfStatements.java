package NOTES;

class IfStatements {
    
    public static void main(String [] args) {

        int x = 5;
        int y = 10;

        if (x > y) { // If whatever is in the brackets is true
            System.out.println("YAY"); // Do this
        } else if (x == y) { // Else if whatever is in this bracket is true
            System.out.println("HUH!"); // Do this
        } else { // And if neither of those were successful
            System.out.println("NAY"); // Do this
        }

    }

}