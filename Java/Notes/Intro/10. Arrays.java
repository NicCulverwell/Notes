package Intro;

class Arrays {
    
    public static void main(String [] args){

        // Arrays

        // Variables store a single value
        // we often need to store a collection of values

        // Option 1:

        int[] list = new int[5];     // 5 indicates how many values will be stored within the array

        // Option 2
        int[] list2;
        list2 = new int[5];     // This option whilst inefficient, allows you to declare the array and then later assign the size of said array

        int[] list3 = {1, 2, 3, 4, 5}; // Declaring and initialising, whilst the most commonly used option, provides slightly less functionality and adaptability

        list[0] = 1; // After declaring an array, individual values can be applied after the declaration
        
        list2[0] = 89;
        list2[1] = 99;
        list2[2] = 109;
        list2[3] = 119;
        list2[4] = 129;

        System.out.println(list[0]); // Indicating a value within an array, will print out the x index of that array (recall the first value of an array is index 0, not 1)

       int x = 0;

        while(x < list2.length){  // list2.length is the number of values within the array list2
            System.out.println(list2[x]);
            x += 1;
        }

        System.out.println(list3[list3.length-1]); // used to print out the last value of an array, very useful when you do not know the length of an array
    }

}
