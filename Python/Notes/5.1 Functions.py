""" Functions
a sequence of statements which belong together, and accomplish some task
    functions accept 0 or more inputs, and normally return a value
    accomplishes a task and returns 0 or 1 values
"""

""" Input Function
string input from the programmer
    displays the string input upon invokation
    returns the input from the user in the form of a string
"""

""" Print Function
takes an input from the programmer, literal value or variable
    displays the input that it was given
    contains no return value
"""

""" Defining a Function
must be provided with a name, which is not a python keyword
    it must be given a paramter
    code must be provided

Important Considerations
    What do we want the function to achieve?
    What are the inputs required to accomplish the task?
    Do we want our function to return a value?
    How do we process these inputs to achieve the required task?

Code Structure
    def structure_name(optional input 1 , ... , optional input n):
        structure_name is a non-python keyword name given by the programmer
        statements (make up the body of the function)
        return value (optional, and always the last line of the function)

"""
# Example 1 : No Inputs - No Return Value

def greeting():
    print("Hello World!")

greeting()  # input values would be placed within the brackets, and a return value would be provided if necessary
# Running the function like this would result in whatever is within the function to run, in this case being the print statement

# Example 2 : One Input - No Return Value

def square(num):
    answer = num**2
    print(answer)

square(5)   # The Input value given here, determines the value of num, used in the equation above
#this allows for the same equation to be used multiple times, without having to recreate the equation

# Example 3 : One Input - Return Value

def sum(num):
    answer = num**2
    return answer   # Return functions are used if you wish to obtain the variable without having to instantly use it
    # say in a print statement for instance

num = sum(10)
print(num)

# Example 4 : Multiple Inputs - Return Value

def equation(x, y):
    answer = x + y
    return answer

num = equation(5,10)
print(num)

""" Benefits of Functions
    simplify code
    promote reusability
    shorten code
"""
"""
Use of a 'Main' Function
    we use the ability to call functions from other functions to better organise our code
    the main function should have no inputs
    the main functions should have no return value
"""

def square(n):
    return n**2

def cube(n):
    return n**3

def main():
    num = input("please input an integer:\n")
    num = int(num)
    print("the square is", square(num))
    print("the cube is", cube(num))

main()  #   the function must be invoked, not simply defined


""" Boolean Function
        Function with a Boolean Return
"""

def zero(x):
    if (x == 0):
        result = True
    else:
        result = False
    return result


