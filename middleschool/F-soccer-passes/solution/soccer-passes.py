import math

def calculate_distance(x1, y1, x2, y2):
    """Calculate the distance between two points (x1, y1) and (x2, y2)."""
    return math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)

# Parse the input
x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())

# Calculate the distance
distance = calculate_distance(x1, y1, x2, y2)

# Print the result rounded to two decimal places
print(f"{distance:.2f}")