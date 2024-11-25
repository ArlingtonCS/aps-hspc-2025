# returns the number of combinations
# `sizes` is a list of gadget sized
def num_gadget_combos(pocket_size, sizes):
    #### WRITE CODE HERE ####
    pass
    
num_cases = int(input())
for _ in range(num_cases):
    pocket_size = int(input())
    sizes = []
    length = int(input())
    for _ in range(length):
        sizes.append(int(input()))

    print(num_gadget_combos(pocket_size, sizes))
