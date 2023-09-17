package NOTES;

class InnerClasses {
    
    public static void main(String [] args) {

    // Anonymous Inner Classes, are essentially subclasses that have no name, and will only ever be called once
    // Essentially an exeption to the 'rules' determined by the pre-existing class


        Sweets candy = new Sweets();

        candy.defineSweet(); // this like normal shall print out the candy class below and return with "Candy"


        Sweets chocolate = new Sweets(){
            @Override
            public void defineSweet() {
                System.out.println("Chocolate"); // This acts as a once of temporary override to the original, where for the object only, it will print out "Chocolate"
            }
        };
    
    
        chocolate.defineSweet();


    }


}

class Sweets {
    public void defineSweet() {
        System.out.println("Candy");
    }
}