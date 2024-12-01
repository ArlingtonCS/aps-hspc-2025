import random

chars = list("abcdefghijklmnopqrstuvwxyz" * 7)

def generate():
    print(1000)
    for _ in range(1000):
        random.shuffle(chars)
        print("".join(chars))

generate()

