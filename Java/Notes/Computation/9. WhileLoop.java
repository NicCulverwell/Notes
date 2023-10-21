package Computation;

class WhileLoops {

    public static void main (String [] args) {

        int x = 1; // wjolst not necessary for for loops, while loops have to have a defined variable prior to its initialisation

        // While loops, similarly to for loops allow the user to repeat instances of code with different parameters
        // However, While loops allow the user to create more general loops statements, whilst for loops are more defined
        // Note that While loops could potentially run forever if they are't bound to an end point

        while(x < 10){
            System.out.println(x);
            x += 1; // This line ensures that the loops will end eventually
        }
    }
}