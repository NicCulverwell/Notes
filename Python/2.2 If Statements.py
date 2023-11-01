""" Selection Control Structures
Selection
    Selection allows us to created different paths throughout our code based on certain conditions


if Statement
    If a condition provided is true then certain statements are executed
        syntax is very important
"""
x = 10
if x == 10:
    print(x)

"""
If Else Statement
    if a condition provided is true then certain statements are executed
    else execute this statement
"""
x = 5

if x >= 10:
    print("YAY")
else:               # In this case else refers to anythin below 10
    print("NAY")

""" If Elif Else Statement
    If a condition provided is true then certain statements are executed
    else if (elif) this condition provided is true then execute these statements
    else executed this statement
"""

if x < 10:
    print(x, "< 10")
elif x == 10:       # You can generate more than one elif statemnt, if the if statement demands more than 3 parameters
    print(x, "= 10")
elif x > 10:
    print(x, "> 10")
else:
    print("x is not a number")

""" Nested Statements
Statements that occur within statements
    For more complex solutions, often things need to be more specific
    Syntax is Very Important
"""

if x > 10 and x < 20:
    if x < 15:
        print("x is between 10 and 15")
    else:
        print("x is between 15 and 20")
elif x >= 20:
    if x < 100:
        print("x is between 20 and 100")
    else:
        print("x > 100")
elif x < 10:
    if x >= 0:
        print("x is between 0 and 10")
    else:
        print("x is a negative number")
