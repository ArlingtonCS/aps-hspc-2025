def car_chase(x_criminal, y_criminal, x_you, y_you):
    return x_criminal - x_you + y_criminal - y_you

# Input reading
T = int(input())
results = []

for _ in range(T):
    x_criminal, y_criminal = map(int, input().strip().split(","))
    x_you, y_you = map(int, input().strip().split(","))
    results.append(car_chase(x_criminal, y_criminal, x_you, y_you))

# Output results
for result in results:
    print(result)
