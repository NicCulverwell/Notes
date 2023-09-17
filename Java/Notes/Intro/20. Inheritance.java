package Intro;

class Inheritance {
    
    public static void main(String [] args) {

        // Inheritance:

        /* To allow classes toexpress the similarities among objects that share some,
         * but not all, of their structure and behaviour. Such similarites can
         * be expressed using inheritance
        */ 


        /* Sub Classes:
          *  
          * Adds to the structure and behaviour that it inherits
          * Replaces / Modifies inherited behaviour 
          * Modifies inherited Structure
          *
        */

        /* Substitution:
         * 
         * When creating Inheritance, you can substitute variables, by making a variable
         * that is the superclass, but defined as the subclass
        */

        Vehicle corola = new Car();

        corola.transferOwnership("Nicholas", "11 Impangele Road");

        // the FINAL keyword stops a class from being inherited

        /* Instance Of Operator
         * 
         * used as a parameter of determining where an Object is based
         * 
         *  if(Car InstanceOf Vehicle) {
         *     System.out.println(x);
         *  }
        */ 

        /* TypeCasting
         * 
         * Converting a variable from one type to another
         * 
         * int x = 5;
         * 
         * String y = Integer.toString(x); - converts the String x into an integer
         * 
        */

        int x = 5;        
        String y = Integer.toString(x);

            System.out.println(y);

        // This shall return "5" as a String


            /* Polymorphism:
             * 
             * a method is polymorphic if the ation performed by the method is dependent on the object it is performed on:
             * ie. If you have an overriding method in a subclass, that makes method: transferOwnership do something different
             * 
             * Apparent Type: Type that the object was declared as at the Compile Time (Superclass)
             * Actual Type: Type that the object was declared as at the run time (subclass)
             * 
             */

            /* Abstraction:
             * 
             * An abstract class, is one that contains nothing, and is used as a placeholder for future endeavours
             * 
             *  "Abstraction is the process of hiding the implementation details and showing only the functioanlity to the user"
             * shows only the essentials
             * abstraction lets you focus on what the object does instead of how it does it
             * 
             * 
             * Abstract methods are stored in the main superclass, and implemented in ALL of the subclasses
             * 
             * 
            */


    }

    abstract static class Vehicle {

        // Information, Structure and Behaviour is usable in class car and truck, as the classes are an extension of vehicle

        int registrationNumber;
        String owner;
        String ownerAdress;

        void transferOwnership(String newOwner, String newOwnerAdress) {

            owner = newOwner;
            ownerAdress = newOwnerAdress;

        }

        abstract int getNumberofDoors();
        
    }

    static class Car extends Vehicle {

        int numberOfDoors;  // Examples of variables that would only be applicable to a specific kind of vehicle

        int getNumberofDoors(){
            return numberOfDoors;
        }

    }


    abstract static class Truck extends Vehicle {

        int numberofAxels;

    }

    abstract static class Motorcycle extends Vehicle {

        boolean hasSideCard;

    }

}
