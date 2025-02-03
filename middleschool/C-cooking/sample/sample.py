# This function should return a number. `quantity` is a decimal number, `unit` is a string.
def convert_to_ounces(quantity, unit):
    # WRITE CODE HERE
    return None # MODIFY THIS LINE


# DO NOT MODIFY BELOW HERE
# Read the number of ingredients
n = int(input())

# Parse and process each ingredient
results = []
for _ in range(n):
    data = input().split()
    quantity = float(data[0])
    unit = data[1]
    ounces = convert_to_ounces(quantity, unit)
    results.append(f"{ounces:.2f}")

# Print the results
print("\n".join(results))
