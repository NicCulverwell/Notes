""" Strings
usages of strings:
    communication with the user
    dispaly outputs

strings are formatted using single('), double(") or triple("') quotations

String Data Types
    Strings may be broken down into characters

List Data Types
    can be broked down into items

Empty Strings
    empty strings are possible
    often used to initialize string variables for later use
"""

word = ""   # the formatting for a placeholder variable called word that holds an empty string
print(word)

""" Concatenation
concatenation is the combining of two or more separate strings into one string
    uses the + operator
"""
first = "Nicholas"
last = "Culverwell"
name = first + " " + last
print(name)

""" Repetition
repetition repeats a string a number of times
    creating a single string
"""

laugh = "ha"
joke = laugh*5
print(joke)

""" Illegal Operations
the following operations are not possible:

    strings cannot be added/subtracted to/from other variables
        x = "hello" + 5
        x = "hello" - 5

    repetition doesnt work on two strings, nor across different data types
        x = "hello" * "friend"
        x = "hello"*2.5         only works on integers

"""

""" Characters in a String

retrieving specific characters from a string:
    phrase = "COMPUTER SCIENCE"
    character = phrase[6]

    phrase[6] will attempt to locate the index 6 placeholder of the array formed by the string of phrase
        in this case it will find the 7th letter of the string (as index 0 exists) which is 'E'

    negative indexing can be used optimise the process if necessary
        phrase[-1], will attempt to locate the last character in the string
        phrase[-2], will attempt to locate the second to last character etc.
        phrase[-10], will also locate 'E', as it is the same as phrase[6] in this case


"""