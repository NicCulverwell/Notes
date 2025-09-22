// -----------------------------------------------------
// IF STATEMENTS in C#
// Purpose: Control flow structure that executes code
// only if a given condition is true.
// -----------------------------------------------------

using System;

class IfStatements {
    static void Main() {
        int number = 10;

        if (number > 5) {
            Console.WriteLine("The number is greater than 5");
        } else if (number == 5) {
            Console.WriteLine("The number is exactly 5");
        } else {
            Console.WriteLine("The number is less than 5");
        }
    }
}
