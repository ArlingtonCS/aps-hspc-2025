import random
import numpy as np

def connections(portals, current_room):
    connecting_rooms = []
    for (first_room, second_room) in portals:
        if (first_room == current_room):
            connecting_rooms.append(second_room)
        elif (second_room == current_room):
            connecting_rooms.append(first_room)

    return connecting_rooms

# returns the number of portals taken
# `portals` is a list of tuples with two elements, the two integer room numbers
# the portal connects
def navigate(portals):
    queue = [0]
    seen = {0}

    while (len(queue) != 0):
        current = queue.pop(0)

        for room in connections(portals, current):
            if not room in seen:
                queue.append(room)
                seen.add(room)

    return seen

def generate():
    num_rooms = random.randint(4500, 6000)
    portals = []

    for room in range(0, num_rooms):
        if room == 1000:
            continue
        for _ in range(0, random.randint(10, 15)):
            connecting_room = round(np.random.normal(loc = room, scale=25))
            if connecting_room < 0 or connecting_room >= num_rooms or room == connecting_room or (room, connecting_room) in portals or (connecting_room, room) in portals:
                continue

            portals.append((room, connecting_room))
    
    seen_rooms = navigate(portals)

    portals.append((max(seen_rooms), 1000))
    
    random.shuffle(portals)

    print(len(portals))
    for portal in portals:
        print(f"{portal[0]},{portal[1]}")

generate()
