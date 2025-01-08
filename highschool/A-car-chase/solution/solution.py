def car_chase(x_agent, y_agent, x_you, y_you):
    return x_agent - x_you + y_agent - y_you

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
