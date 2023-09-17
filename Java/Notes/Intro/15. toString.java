package Intro;

class toString {
    
    public static void main(String [] args) {

        example hello = new example(5,10);

        System.out.println(hello.toString());

    }
}

class example {

    private int radius;
    private int height;

    public example(int h, int r){
        radius = r;
        height = h;
    }


    public String toString(){                   
        String output = "Radius: " + radius + " | Height: " + height;
        return output;
    }

    // The toString() method, allows for conversions from other variables into a string


}