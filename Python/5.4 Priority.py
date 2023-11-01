""" Priority 
in a function, the local variables are accessed first, if none are found then global variables are accessed
    this can lead to slower processing power if global variables are often used within functions
"""

def square(x):
    power = 2
    y = x**power
    return y

power = 3

result = square(5)
print(result)

# Even though the value of power was changed, the code will still use the value of 2, as it prioritizes local variables over global variables