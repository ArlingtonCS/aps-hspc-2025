# `instructions` is a list of tuples of the type: (string, number)
def calculate_final_position(instructions):
    x = 0
    y = 0
    
    # WRITE CODE HERE
    
    return (x, y)


# DO NOT MODIFY BELOW HERE
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
