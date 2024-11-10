import random

edge_chance = 0.05

def traverse(seen_rooms, current_room, portals):
    for (first_room, second_room) in portals:
        if (first_room != current_room and second_room != current_room):
            continue

        if (first_room == current_room and not second_room in seen_rooms):
            seen_rooms.append(second_room)
            traverse(seen_rooms, second_room, portals)
        elif (second_room == current_room and not first_room in seen_rooms):
            seen_rooms.append(first_room)
            traverse(seen_rooms, first_room, portals)

def generate():
    num_rooms = random.randint(60, 100)
    portals = []

    for room in range(0, num_rooms):
        for connecting_room in range(0, num_rooms):
            if room == connecting_room or (room, connecting_room) in portals or (connecting_room, room) in portals:
                continue

            if random.random() < edge_chance:
                portals.append((room, connecting_room))
    
    seen_rooms = [0]
    traverse(seen_rooms, 0, portals)

    portals.append((max(seen_rooms), 100))

    print(len(portals))
    for connection in portals:
        print(f"{connection[0]},{connection[1]}")

generate()
