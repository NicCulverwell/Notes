// -----------------------------------------------------
// FOREACH LOOPS in C#
// Purpose: Iterate over collections (arrays, lists, etc).
// Cleaner and safer than for-loops when working with data.
// -----------------------------------------------------

using System;

class ForeachLoops {
    static void Main() {
        string[] fruits = { "Apple", "Banana", "Cherry" };

        foreach (string fruit in fruits) {
            Console.WriteLine("Fruit: " + fruit);
        }
    }
}
