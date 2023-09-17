package NOTES;

class DefaultConstructor {
    
    public static void main(String [] args) {


        // The default constructor is a built in feature, that compromises the default value of an object when invalid information is given


        Square example = new Square(-4);

        System.out.println(example.getArea());
        System.out.println(example.getVolume());
        
    }

}

class Square {

    private int length;

    public Square(int initLength) {
        if(initLength <= 0){
            System.out.println("That is not a valid entry");
            length = 1; // this is a default constructor, stating that if you put in the wrong entry, the dimensions will default to 1
        }
        else {
            length = initLength;
        }
    }

    public int getArea(){
        return length*length;
    }


    public int getVolume(){
        return length*length*length;
    }



}