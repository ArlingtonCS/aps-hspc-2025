def find_mystery_guest(number_of_guests, guests, clues):
    matching_guests = []
    for guest in guests:
        name, traits = guest[0], set(guest[1:])
        if all(clue in traits for clue in clues):
            matching_guests.append(name)
    
    if len(matching_guests) != 0:
        return matching_guests
    else:
        return "No match found."

# Input parsing
test_cases = int(input().strip())
results = []

for _ in range(test_cases):
    number_of_guests = int(input().strip())
    guests = [input().strip().split() for _ in range(number_of_guests)]
    clues = input().strip().split()
    result = find_mystery_guest(number_of_guests, guests, clues)
    results.append(result)

# Output results
for result in results:
    if isinstance(result, list): # if theres multiple people
        print(*result)
    else:
        print(result)