""" Local Variables
only exist within the function in which they are created
    cannot be utilized outside of the function
    they are arguments/parameters within a function
"""

# Example 1:

def square(x):
    y = x**2
    return y

z = square(10)
print(10)

# x and y are both local variables, as they were both defined within the function, and cannot be used outside of that function
# z however is not a local function, as it was defined outside of the function

