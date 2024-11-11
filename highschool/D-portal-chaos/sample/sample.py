# returns the number of portals taken
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
