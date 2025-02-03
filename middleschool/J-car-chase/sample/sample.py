def car_chase(x_criminal, y_criminal, x_you, y_you):
    
    # WRITE CODE HERE
    
    return None # modify this line
















# DO NOT MODIFY BELOW HERE
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
