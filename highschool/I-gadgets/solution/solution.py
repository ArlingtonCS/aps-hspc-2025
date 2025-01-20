# returns the number of combinations
# `sizes` is a list of gadget sized
def num_gadget_combos(pocket_size, sizes):
    counts = [0 for _ in range(pocket_size + 1)] 
    counts[0] = 1
    for size in sizes:
        for count_idx in range(size, pocket_size + 1):
            counts[count_idx] += counts[count_idx - size]

    print(counts[-1])
    
num_cases = int(input())
for _ in range(num_cases):
    pocket_size = int(input())
    sizes = []
    length = int(input())
    for _ in range(length):
        sizes.append(int(input()))

    num_gadget_combos(pocket_size, sizes)
