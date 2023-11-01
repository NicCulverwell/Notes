import turtle

def composition(tim):
    # Main Border
    tim.fillcolor("#ebebeb")
    tim.begin_fill()
    tim.pensize(6)
    tim.forward(472)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.end_fill()


    # Left Half Red
    tim.fillcolor("#ca4c23")
    tim.begin_fill()
    tim.forward(208)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.forward(208)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.end_fill()


    # bottom two sections white
    tim.fillcolor("#ebebeb")
    tim.begin_fill()
    tim.forward(472)
    tim.left(90)
    tim.forward(265)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.forward(265)
    tim.left(90)
    tim.end_fill()


    # Bottom section white
    tim.fillcolor("#ebebeb")
    tim.begin_fill()
    tim.forward(472)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.forward(472)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.end_fill()


    # Bottom section blue
    tim.fillcolor("#24599b")
    tim.begin_fill()
    tim.forward(351)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.forward(351)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.end_fill()


    # Bottom left section white
    tim.fillcolor("#ebebeb")
    tim.begin_fill()
    tim.forward(208)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.forward(208)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.end_fill()


    # Yellow Block
    tim.fillcolor("#ffec90")
    tim.begin_fill()
    tim.forward(76)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.forward(76)
    tim.left(90)
    tim.forward(163)
    tim.left(90)
    tim.end_fill()

    # Moving
    tim.up()
    tim.forward(208)
    tim.down()

    # bottom middle white block
    tim.fillcolor("#ebebeb")
    tim.begin_fill()
    tim.forward(143)
    tim.left(90)
    tim.forward(26)
    tim.left(90)
    tim.forward(143)
    tim.left(90)
    tim.forward(26)
    tim.left(90)
    tim.end_fill()


    # Filling in Line
    tim.left(90)
    tim.forward(472)
    tim.left(180)
    tim.forward(472)
    tim.right(90)
    tim.forward(208)

turtle.screensize(canvwidth=244,canvheight=200)

window = turtle.Screen()
tim = turtle.Turtle()


for i in range(4):
    composition(tim)
    tim.left(90)

tim.hideturtle()

turtle.exitonclick()