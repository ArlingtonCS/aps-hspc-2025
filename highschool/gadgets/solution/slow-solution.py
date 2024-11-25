# returns the number of combinations
# `sizes` is a list of gadget sized
def num_gadget_combos(pocket_size, sizes):
    if pocket_size == 0:
        return 1
    elif len(sizes) == 0:
        return 0

    sum = 0
    for size_used in range(0, pocket_size+1, sizes[0]):
        sum += num_gadget_combos(pocket_size - size_used, sizes[1:])

    return sum
    
num_cases = int(input())
for _ in range(num_cases):
    pocket_size = int(input())
    sizes = []
    length = int(input())
    for _ in range(length):
        sizes.append(int(input()))

    print(num_gadget_combos(pocket_size, sizes))
