import random

num_cases = 10

def generate():
    print(num_cases)
    for _ in range(num_cases): 
        pocket_size = random.randint(250, 400)
        print(pocket_size)
        num_gadgets = random.randint(8, 13)
        print(num_gadgets)
        for _ in range(num_gadgets):
            print(random.randint(10, 75))

generate()
