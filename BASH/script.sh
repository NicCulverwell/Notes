#!/bin/bash
# -------------------------------------------------------
# Bash Script (Linux Scripting)
# Purpose: Automates tasks in Linux by executing commands
# in sequence. Bash scripts are used in web/server design
# to manage files, run programs, deploy applications, and
# handle repetitive system tasks.
# -------------------------------------------------------

# Print a greeting
echo "Hello, welcome to my Linux script!"

# Variables
NAME="Nich"
echo "Your name is $NAME"

# Read user input
read -p "Enter a number: " NUM
echo "You entered: $NUM"

# Conditional (if/else)
if [ $NUM -gt 10 ]; then
    echo "That's a big number!"
else
    echo "That's a small number."
fi

# Loop example
echo "Counting from 1 to 5:"
for i in {1..5}
do
    echo "Number: $i"
done

# Working with files
echo "Creating a test directory and file..."
mkdir -p test_dir
echo "This is some content" > test_dir/example.txt

echo "Contents of example.txt:"
cat test_dir/example.txt

# Clean up
rm -r test_dir
echo "Temporary files removed."
