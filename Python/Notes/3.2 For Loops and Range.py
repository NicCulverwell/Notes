""" Iteration
The repeated execution of a sequence of statements


For-Loops:
    Used to repeat some code for a particular number of times
        no. of times is specified by the programmer
"""
for name in [1, 2, 3, 4, 5]:
    print("Hi", name,"Please come to my party")

# For-Loops increment by 1 by default

""" Range Function:
    Takes a single integer input
        creates a list that starts at 0. and increments until the integer provided
        Often used in for loops to simply the data
        All inputs can be negative on the Range
"""

for z in range(5):
    print(z)

print("\n Range with Initiator\n")
    # the First Input Determines where the range starts
    # The Second Input, determines where the range ends
    # The Second Input is 1 larger than the last repetition in the loop 
for z in range(5, 10):
    print(z)

print("\n Range with Incremental Values\n")
    # And The Third Input determines how much each value increases by

for z in range(2, 9, 2):
    print(z)
    # Example: 2 is where the Range begins | 9 is where the range ends | 2 is how much the range incrementally increases by

""" Accumulators
        Commonly used for loops used to calculate the total output of a specific range
"""

sum = 0
for z in range(100):
    sum += z

print("\n", sum) 