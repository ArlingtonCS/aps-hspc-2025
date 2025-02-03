def count_ocean_zones(depths):
    zone_counts = {"Sunlight Zone": 0, "Twilight Zone": 0, "Midnight Zone": 0, "Abyssal Zone": 0, "Trenches": 0}
    
    # WRITE CODE HERE
    
    return zone_counts


# DO NOT MODIFY BELOW HERE
num_cases = int(input())
depths = []

for _ in range(num_cases):
    depths.append(int(input()))

zone_counts = count_ocean_zones(depths)

for zone, count in zone_counts.items():
    print(f"{zone}: {count}")
