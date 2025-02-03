def count_ocean_zones(depths):
    zone_counts = {
        "Sunlight Zone": 0,
        "Twilight Zone": 0,
        "Midnight Zone": 0,
        "Abyssal Zone": 0,
        "Trenches": 0
    }
    
    for depth in depths:
        # zone = classify_ocean_zone(depth)
        if depth >= 0 and depth <= 200:
            zone_counts["Sunlight Zone"] += 1
        elif depth >= 201 and depth <= 1000:
            zone_counts["Twilight Zone"] += 1
        elif depth >= 1001 and depth <= 4000:
            zone_counts["Midnight Zone"] += 1
        elif depth >= 4001 and depth <= 6000:
            zone_counts["Abyssal Zone"] += 1
        elif depth >= 6001:
            zone_counts["Trenches"] += 1
    
    return zone_counts


num_cases = int(input())
depths = []

for _ in range(num_cases):
    depths.append(int(input()))

zone_counts = count_ocean_zones(depths)

for zone, count in zone_counts.items():
    print(f"{zone}: {count}")