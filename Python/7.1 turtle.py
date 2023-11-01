""" Overview of Turtle Graphics
a basic drawing function built into python

to begin with you must import turtle
define a window. turtle screen

provide directional functions

and then close the function

"""

import turtle

window = turtle.Screen()    # Function that creates a window for drawing purposes

window.bgcolor("light green")   # functions may be performed on both the linework and the actual screen itself

tim = turtle.Turtle()       # Creating a Variable linked to the turtle functions

x = 1
y = 1

tim.pensize(2)
tim.color("dark green")

while x < 200:

    tim.forward(x)      # moves the pencil x pixels forward
    tim.right(y)        # Makes the pencil turn y degress to the right
    x += 1
    y += 1

tim.hideturtle()        # makes the arrow go invisible
# Running this code will create a virus (as an image not as an actual computer virus)
# there are many other functions within the turtle operator

window.exitonclick()        # Function that closes the window when drawing is completed upon a left click

""" Experimental Options

forward(x)      move the turtle forwards x pixels
backward(x)     move the turtle backwards x pixels

right(x)        turn the turtle to the right x degrees
left(x)         turn the turtle to the left x degrees

up()            lift the pen off the page
down()          lower the pen onto the page

color(x)        changes the color of the turtle's tail to x
fillcolor(x)    changes the color the turtle will use to fill the polygon to x

heading()       returns the current heading
position()      returns the current position

goto(x,y)       move the turtle to the coordinates of x , y

begin_fill()    remember the starting point for a filled polygon
end_fill()      close the polygon and fill with the current fill color

dot()           leave a dot at the current position
stamp()         leave an impression of a turtle shape at the current position

shape(x)        changes the shape of the turtle to x

"""