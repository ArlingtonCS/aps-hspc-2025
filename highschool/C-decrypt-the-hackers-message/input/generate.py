import string
import random

TEST_CASES = 100
LENGTH = 1000

characters = [c for c in string.ascii_uppercase] + [c for c in string.digits] + [" "]

def generate():
    result = str(TEST_CASES)+"\n"
    for _ in range(0, TEST_CASES):
        for _ in range(0, LENGTH):
            if random.random() < 0.02:
                ch = random.choice(characters)
                result += ch * random.randint(2, 6)
            else:
                ch = random.choice(characters)
                result += ch
        result += "\n"
    print(result, end="")

generate()
