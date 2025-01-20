import math

# all parameters are float values, and angle is in degrees
def does_intersect(first_x, first_y, second_x, second_y, angle):
    mirror_slope = (first_y - second_y) / (first_x - second_x)
    laser_slope = math.tan(math.radians(angle))

    intersection_x = (mirror_slope * first_x - first_y) / (mirror_slope - laser_slope)

    laser_is_valid = ((angle > 270 or angle < 90) and intersection_x >= 0) or intersection_x <= 0
    mirror_is_valid = intersection_x >= min(first_x, second_x) and intersection_x <= max(first_x, second_x)

    if (laser_is_valid and mirror_is_valid):
        print("true")
    else:
        print("false")

count = int(input())
for _ in range(count):
    line = input()
    parts = line.strip().split(' ')

    does_intersect(float(parts[0]), float(parts[1]), float(parts[2]), float(parts[3]), float(parts[4]))

