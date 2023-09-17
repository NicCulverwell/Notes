""" Functions invoking other Functions
Functions can be defined and used within another function
"""

def square(x):
    y = x**2
    return y

def sum_square(a,b,c):
    a = square(a)
    b = square(b)
    c = square(c)
    z = a + b + c
    return z

sum = sum_square(10, 5, 5)
print(sum)
