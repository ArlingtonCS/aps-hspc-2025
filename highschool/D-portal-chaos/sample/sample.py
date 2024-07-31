## write a function or class here

n = int(int(input()))
portals = []

for _ in range(n):
    line = list(map(int, input().split(",")))
    portals.append((line[0], line[1]))

print(portals)