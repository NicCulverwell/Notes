""" Break Statement (break)
    Used to immediately leave the body of the loop
    First statement outside the loop is executed next
"""

x = 0

while x < 10:
    print(x)
    x+= 1

    if (x == 7):        # Traditionally this code would have run until x == 10, however, it will break early as requested, and instantly end the loop
        break

print("We have broken!")