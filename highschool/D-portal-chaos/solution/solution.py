# returns the number of portals taken
def navigate(portals, seen_rooms = [0], current_room = 0):
    for (first_room, second_room) in portals:
        if (first_room != current_room and second_room != current_room):
            continue
        elif ((first_room == current_room and second_room == 100) or (second_room == current_room and first_room == 100)):
            return 1
        elif (first_room == current_room and not second_room in seen_rooms):
            seen_rooms.append(second_room)
            count = navigate(portals, seen_rooms, second_room)
            if (count != -1):
                return count + 1

        elif (second_room == current_room and not first_room in seen_rooms):
            seen_rooms.append(first_room)
            count = navigate(portals, seen_rooms, first_room)
            if (count != -1):
                return count + 1

    return -1
    
portals = []
length = int(input())
for _ in range(length):
    line = input()
    parts = line.strip().split(',')

    portals.append((int(parts[0]), int(parts[1])))

print(navigate(portals))
