# Define conversion factors
CONVERSION_FACTORS = {
    "cup": 8.0,
    "tablespoon": 0.5,
    "teaspoon": 0.1667
}

# Function to convert units to ounces
def convert_to_ounces(quantity, unit):
    return quantity * CONVERSION_FACTORS[unit]

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
