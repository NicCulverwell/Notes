""" Global Variables
initialized in the main part of the program and not within a function
    can be utilized anywhere within a code
"""

# Example:

def badsquare(x):
    y = x**power
    return y

power = 2

result = badsquare(10)
print(result)

# power and result are global variables, as they are defined outside of any function, and can be used anywhere in the code
# however, it is considered bad practice to use a global variable within a function