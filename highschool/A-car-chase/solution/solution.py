def car_chase(x_agent, y_agent, x_you, y_you):
    results = []

    minutes = 0

    while True:
        # If you catch the spy
        if x_agent == x_you and y_agent == y_you:
            results = minutes
            break

        # Spy moves 1 block per minute away from you
        if abs(x_you - x_agent) >= abs(y_you - y_agent):
            # Spy moves horizontally
            x_agent += 1 if x_you < x_agent else -1
        else:
            # Spy moves vertically
            y_agent += 1 if y_you < y_agent else -1

        # You move up to 2 Manhattan blocks per minute
        delta_x = abs(x_agent - x_you)
        delta_y = abs(y_agent - y_you)

        move_x = min(delta_x, 2)  # How far you can move in x
        move_y = min(2 - move_x, delta_y)  # Remaining movement for y

        # Adjust your position
        if x_you < x_agent:
            x_you += move_x
        else:
            x_you -= move_x

        if y_you < y_agent:
            y_you += move_y
        else:
            y_you -= move_y

        # Increment time
        minutes += 1
    
    
    return results


# Input reading
T = int(input())
results = []

for _ in range(T):
    x_agent, y_agent = map(int, input().strip().split(","))
    x_you, y_you = map(int, input().strip().split(","))
    results.append(car_chase(x_agent, y_agent, x_you, y_you))

# Output results
for result in results:
    print(result)
