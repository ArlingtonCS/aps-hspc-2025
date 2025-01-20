# returns the number of portals taken
# `portals` is a list of tuples with two elements, the two integer room numbers
# the portal connects
def navigate(portals):
    queue = [(0, 0)]
    seen = {0}

    processed_portals = {}

    for (first_room, second_room) in portals:
        if first_room in processed_portals:
            processed_portals[first_room].append(second_room)
        else:
            processed_portals[first_room] = [second_room]

        if second_room in processed_portals:
            processed_portals[second_room].append(first_room)
        else:
            processed_portals[second_room] = [first_room]


    while (True):
        current, cost = queue.pop(0)

        if (current == 1000):
            print(cost)
            return 

        for room in processed_portals[current]:
            if not room in seen:
                queue.append((room, cost + 1))
                seen.add(room)
    
portals = []
length = int(input())
for _ in range(length):
    line = input()
    parts = line.strip().split(',')

    portals.append((int(parts[0]), int(parts[1])))

navigate(portals)
