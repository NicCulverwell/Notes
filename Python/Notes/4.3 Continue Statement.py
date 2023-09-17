""" Break Statement (break)
    Used to skip the current iteration of a loop
    remaining iterations are executed

The position of the continue statement is vital to how the code functions
    if incorrectly positioned, can easily result in indefinite loops

"""

x = 0

while x < 10:
    x += 1
    
    if x == 7: # In this instance, if the continue statement was positioned after the print function, it would have no effect, as it only skips what follows it in the loop
        continue    # In another example, if the additive assignment of 1 to x, had been positioned after the continue statement, it would never proceed further, as x would never be increased, and would be stuck on 7 indefinitely

    print(x)

print("7 was skipped!")