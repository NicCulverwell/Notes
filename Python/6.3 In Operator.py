""" In Operator
test to see if one string can be located within another string:
    used to form boolean expressions
        returns true if the string is located within the larger string
"""

print("a" in "banana")

print("z" in "banana")


print("")

"""
can be used with variables
"""


fruit = "banana"

print(fruit in "he has many bananas")
print(fruit in "he has many apples")

print("")

""" Not In Operator
test to see if one string cannot be located within another string:
    used to form boolean expressions
        returns true if the string is not located within the larger string
"""

print("a" not in "banana")

print("z" not in "banana")

print("")

""" Strings are Immutable
existing string variables may not be modified
    however new strings with the modifications can me created

modification is not to be confused with re-assignment
letter = "a"
letter = "b"    this is permitted

word = "paper"
word[1] = "i" this is not permitted
"""

word = "paper"
newword = word[:1] + "i" + word[2:]
print(newword)

""" String Traversal:
Process of visiting each character within a string
    process of iteration
"""



animal = "monkey"

for character in animal:
    print(character)
