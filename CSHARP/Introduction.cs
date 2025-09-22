// -----------------------------------------------------
// INTRODUCTION TO C#
// C# is a modern, object-oriented programming language
// developed by Microsoft. It is commonly used for
// Windows applications, game development (Unity),
// and web applications.
//
// This file demonstrates:
// - Basic program structure
// - Print statements
// - Comments
// - Variables
// - Simple input/output
// -----------------------------------------------------

using System;  // Needed for Console class

class INTRODUCTION {
    static void Main() {
        // ---------------------------
        // PRINTING TO THE CONSOLE
        // ---------------------------
        Console.WriteLine("Hello, World!");   // Prints with a newline
        Console.Write("This stays on the same line "); // No newline

        // ---------------------------
        // VARIABLES
        // ---------------------------
        int age = 25;          // Integer
        string name = "Alice"; // Text
        double pi = 3.14;      // Decimal number

        Console.WriteLine("\nName: " + name + ", Age: " + age);
        Console.WriteLine("Value of pi: " + pi);

        // ---------------------------
        // USER INPUT
        // ---------------------------
        Console.Write("Enter your favorite color: ");
        string color = Console.ReadLine();   // Reads input as a string
        Console.WriteLine("Your favorite color is " + color);

        // ---------------------------
        // COMMENTS
        // ---------------------------
        // Single-line comment
        /* 
         * Multi-line comment
         * This is ignored by the compiler
         */
    }
}
