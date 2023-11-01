# Python Introduction
    # Python from a syntax point of view is far easier to understand than other languages
    # However as a result, loses out on processing power

""" Literals 
Form a fundamental component of programming
 - Numbers, Characters & Words that our program may manipulate
"""

"""Numerical Literals
A number consisting of digits from 0 - 9 with an optional sign character (+ / -)
Decimal points are created using a .
No Commas
No Spaces
"""
x = 20


"""String Literals
A sequence of Characters enclosed by quotes
 - "hello"
"""
y = "hello"

""" Variables
Similar to mathematics where we utilize names to store values
the assigned value (literal) is allowed to change
x = 20
x = 5   -   The 20 value no longer exists
variables can also be stored as strings
x = "Nicholas"
"""
x = 5


""" Assignment
creates a variable and also provides the variables with a literal value
number = 20.06  -   'number' is  variable '=' is the assignment of the variable to a value '20.06'
"""
number = 20.06

""" Updating a Variable
x = 6
x = x + 2   -   this increases the variable from 6 to 8
x += 2      -   incrementation results in x = x + 2
x -= 2      -   decrementation results in x = x - 2
x *= 2      -   multiplication results in x = x * 2
x /= 2      -   divisibility   results in x = x / 2
x **= 2     -   squaring       results in x = x **2
"""
x = 6
print(x)

x = x + 2   # x equates to 8
print(x)

x += 2      # x equates to 10
print(x)

x -= 2      # x equates to 8
print(x)

x *= 2      # x equates to 16
print(x)

x /= 2      # x equates to 8
print(x)

x **= 2     # x equates to 64
print(x)

""" Naming Rules
Variables must begin with a lowercase letter or underscore(_)
Variables must contain no spaces or illegal characters (eg. $)
May combine letters and digits
Case Sensitive (number & numbeR are 2 different variables)
may not use prescribed keywords
choose appropriate names for variables to help with understanding of complicated code
"""
_x = 10
x_ = 10
X = 10
x385 = 10

""" Keywords
and / as / assert / break / class / continue / def / del / elif / else / except / exec
finally / for / from / global / if / import / in / is / lambda / nonlocal / not 
or / pass / raise / return / try / while / with / yield / True / False / None
"""

""" Functions
a piece of code that takes in zero or more inputs, processes these inputs and produces an output
inputs are refered to as arguments / parameters
arguments are fed into a function to create an output
Format:
function_name(input 1, input 2, Input 3... Input N)
eg. print("Hello World")    -   Print function makes the terminal state whatever is within the brackets
"""

print(x - 2)
print("Hello World!")


""" Commentation
as programs become more complex, they become more difficult to read
comments are intended for human readers of our code
comments/blank lines are ignored by the complier and have no effect on our code
# are used for single line comments
"""