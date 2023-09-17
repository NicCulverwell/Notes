package NOTES;

class Strings {

    public static void main(String[] args){

        String name;        // String Declaration
        name = "Nicholas";

        String surname = "Culverwell";  // Compact Declaration and Initialisation

        System.out.println(name.length()); // Prints out a number informing you how many characters are within your string

        System.out.println(surname.charAt(1)); // Prints out the character at index 1 of your string

        System.out.println(name.charAt(name.length()-1)); // prints out the last letter of your string, regardles of how long it is
        

        // Comparing Strings
        // x.equals(y) compares string x to string y and returns a boolean value accordingly

        if(name.equals(surname)){ 
            System.out.println("These two words are the same");
        } else {
            System.out.println("These two words are not the same");
        }

        // x.equalsIgnoreCase(y) compares string x to string y and returns a boolean value if the two words are the same ignoring upper/lower case 
 
        // x.startsWith(String y) compares to strings and sees if x starts with y

        // x.endsWith(String y) compares to strings and sees if x ends with y

        // x.compareTo(y) returns an integer, which is negative if the dictionary order of x is less than y, a posiitve if it is greater and 0 if they are equal

        System.out.println(name.compareTo(surname));

        // x.substring(a,b) returns a unique string comprise of the letters of x, starting at index a and ending at 1 less than index b
        System.out.println(name.substring(2,6));

        // x.replace(a,b) searches for any characters within x that are 'a' and replaces them with b | can be used to replace parts of the string as well

        System.out.println(name.replace('s', 'z'));
        System.out.println(name.replace("holas", "ky"));

        // x.trim() removes any excess spaces before or after the string


        // x.indexOf(a,b) returns the index integer of the character a, and will start searching from index b
        System.out.println(surname.indexOf('l',4));




    }
}
