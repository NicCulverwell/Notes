""" Functions for Strings

Length Function (len):
    takes a string input that is a string literal/variable
    returns the number of characters within the particular string as an integer
"""

fruit = "banana"
x = len(fruit)
print(x)

fruit2 = "kiwi fruit"
y = len(fruit2) # spaces are included into that length
print(y)

""" Substrings:
a piece/part of a string:
    also referred to as a slice of a string
    
    string_variable[start_index:stop_index + 1]
        referred to as positive indexing
"""

a = fruit2[0:4] # this will obtain the first 4 characters of the string, in this case being kiwi
print(a)

""" Omitting Indexes
the indexes of a string may be omitted
    by default omitting begins at the first index
"""

b = fruit[:3]
print(b) # this will print the first 3 characters of the string

b = fruit[3:] # this will print everything but the first 3 characters of the string
print(b)

b = fruit[:] # this will print the entire string
print(b)

""" String Comparisons
a test to see if strings are the same
    uses the equality operator (==)
"""

if fruit == "banana":
    print("the fruit is a banana")
else:
    print("the fruit is not a banana")


""" ASCII/Ordinal Values;
a table of values associated with every single character within a string:
    this includes lowercase, uppercase, numbers, symbols, space, etc.
"""

print("B">"a") # the terminal will state this is false, as the ASCII Value of 'B' is 66, whilst the ASCII value of 'a' is 96, making it false

""" Ordinal Function (ord function):
takes a character as an input
    returns the ordinal value as an integer of that character

    can only take a character as an input
        will have a runtime error otherwise
"""

y = ord("b") 
print(y) # this will print 98 as that is the ordinal value of 'y'

y = ord("%")
print(y)

y = ord(" ")
print(y)

""" Character Function (chr):
converse of the ordinal function:
    takes an integer as input
        returns the character based on its ordinal value
"""

y = chr(84)
print((y)) # this will return 'T', as 84 is the ordinal value for 'T'


