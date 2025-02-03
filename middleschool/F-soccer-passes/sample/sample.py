import math

# Return a decimal number. `x1`, `y1`, `x2`, and `y2` are all decimal numbers.
def calculate_distance(x1, y1, x2, y2):
    # WRITE CODE HERE
    
    return None # Modify this line
    

# DO NOT MODIFY BELOW HERE
# Parse the input
x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())

# Calculate the distance
distance = calculate_distance(x1, y1, x2, y2)

# Print the result rounded to two decimal places
print(f"{distance:.2f}")
