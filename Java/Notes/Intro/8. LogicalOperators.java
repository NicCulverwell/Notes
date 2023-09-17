package Intro;

class LogicalOperators {

    public static void main(String [] args) {

        // Logical Operators refer to and/or/not etc.

        int x = 5;

        if(x > 2 && x < 10){
            System.out.println("The And Operator (&&) allows you to create more than one criteria for things like the if statement");
        }

        if(x > 2 || x < 10){
            System.out.println("The OR statement (||) allows you to create options within your statements");
        }

        if(!(x > 10)){
            System.out.println("The Not Operator (!) allows you to create contradictions, for instances where multiple statements need to be negated");
        }
    }
}
