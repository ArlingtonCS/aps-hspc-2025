def calculate_final_position(instructions):
    x, y = 0, 0
    
    for direction, units in instructions:
        if direction == "UP":
            y += units
        elif direction == "DOWN":
            y -= units
        elif direction == "LEFT":
            x -= units
        elif direction == "RIGHT":
            x += units
    
    return x, y

# Input Parsing
n = int(input())
instructions = []

for _ in range(n):
    line = input().split()
    direction = line[0]
    units = int(line[1])
    instructions.append((direction, units))

# Calculate final position
final_position = calculate_final_position(instructions)

# Output the result
print(f"{final_position[0]} {final_position[1]}")
