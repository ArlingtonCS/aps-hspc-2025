def car_chase(test_case):
    results = []

    # Extract agent's and your starting positions
    x_agent, y_agent = test_case["agent"]
    x_you, y_you = test_case["you"]

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
test_cases = []

for _ in range(T):
    x_agent, y_agent = map(int, input().strip().split(","))
    x_you, y_you = map(int, input().strip().split(","))
    test_cases.append({
        "agent": (x_agent, y_agent),
        "you": (x_you, y_you)
    })
    
results = []

for test_case in test_cases:
    # Process the test cases
    results.append(car_chase(test_case))

# Output results
for result in results:
    print(result)
