// -----------------------------------------------------
// SWITCH STATEMENTS in C#
// Purpose: Alternative to multiple if/else if checks.
// Used for matching a variable against different cases.
// -----------------------------------------------------

using System;

class SwitchStatements {
    static void Main() {
        int day = 3;

        switch (day) {
            case 1:
                Console.WriteLine("Monday");
                break;
            case 2:
                Console.WriteLine("Tuesday");
                break;
            case 3:
                Console.WriteLine("Wednesday");
                break;
            default:
                Console.WriteLine("Another day");
                break;
        }
    }
}
