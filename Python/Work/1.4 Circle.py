"""
Question:
Write a Python program which accepts the radius of a circle from the user and compute the area.
"""

import math

radius = input("Please input the radius of the circle:\n")
radius = int(radius)
area = math.pi * radius**2

print(area)