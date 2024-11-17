import math

# all parameters are float values, and angle is in degrees
def does_intersect(first_x, first_y, second_x, second_y, angle):
    mirror_slope = (first_y - second_y) / (first_x - second_x)
    laser_slope = math.tan(math.radians(angle))

    if mirror_slope == laser_slope:
        return mirror_slope * first_x == first_y

    intersection_x = (mirror_slope * first_x - first_y) / (mirror_slope - laser_slope)

    laser_is_valid = ((angle > 270 or angle < 90) and intersection_x >= 0) or intersection_x <= 0
    mirror_is_valid = intersection_x >= min(first_x, second_x) and intersection_x <= max(first_x, second_x)

    return laser_is_valid and mirror_is_valid

count = int(input())
for _ in range(count):
    line = input()
    parts = line.strip().split(' ')

    if (does_intersect(float(parts[0]), float(parts[1]), float(parts[2]), float(parts[3]), float(parts[4]))):
        print("true")
    else:
        print("false")

