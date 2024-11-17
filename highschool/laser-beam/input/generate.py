import random

length = 10_000

def generate():
    print(length)
    for _ in range(length):
        first_x = random.randint(-20, 20)
        first_y = random.randint(-20, 20)
        second_x = random.randint(-20, 20)
        second_y = random.randint(-20, 20)
        angle = random.randint(0, 360-1)

        if first_x == second_x and first_x != -20:
            first_x -= 1
        elif first_x == second_x:
            first_x += 1

        if angle == 270 or angle == 90:
            angle += 1

        print(f"{first_x} {first_y} {second_x} {second_y} {angle}")

generate()
