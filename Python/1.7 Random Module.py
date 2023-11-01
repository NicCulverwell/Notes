""" Random Module
A module that is a collection of functions
    used to generate a random output

import random
    similarly to the math function
        random function must be imported to be used

The random function generates a float between 0 and 1 (not including)
    in order to obtain other random numbers, simply multiply it to the required size

x = random.random()     -   this will generate a random float between 0 and 1
x = random.random()*100 -   this will generate a random number between 0 and 100   

"""
import random

x = random.random()
print(x)

x = random.random()*100
print(x)

""" randrange() Function
generates a random integer between a specific range
    first input is the minimum range
        second input is 1 higher than the maximum range
    
x = ranrange(1, 10) -   This could generate any number from 1 to 9
    will always generate an integer
"""

x = random.randrange(1, 10)
print(x)

x = random.choice([True,False])
print(x)