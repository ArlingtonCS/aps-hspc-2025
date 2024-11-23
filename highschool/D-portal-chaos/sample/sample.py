# returns the number of portals taken
# `portals` is a list of tuples with two elements, the two integer room numbers
# the portal connects
def navigate(portals):
    #### WRITE CODE HERE ####
    pass
    
portals = []
length = int(input())
for _ in range(length):
    line = input()
    parts = line.strip().split(',')

    portals.append((parts[0], parts[1]))

print(navigate(portals))
