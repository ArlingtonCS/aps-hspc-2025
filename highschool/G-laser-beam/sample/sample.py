# HINT: the trigonometric functions in Python use radians instead of degrees,
# use the function `math.radians` to convert from degrees to radians

# returns whether the laser intersects the mirror
# all parameters are float values, and angle is in degrees
def does_intersect(first_x, first_y, second_x, second_y, angle):
    #### WRITE CODE HERE ####
    pass

count = int(input())
for _ in range(count):
    line = input()
    parts = line.strip().split(' ')

    if (does_intersect(float(parts[0]), float(parts[1]), float(parts[2]), float(parts[3]), float(parts[4]))):
        print("true")
    else:
        print("false")

