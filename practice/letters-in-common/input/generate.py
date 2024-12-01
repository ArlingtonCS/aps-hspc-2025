import random

def generate():
    nouns = []
    with open("nouns.txt", "r") as nouns_file:
        for line in nouns_file.readlines():
            nouns.append(line.strip())

    print(200)
    for _ in range(200):
        num_words = random.randint(1, 5)
        for i in range(num_words):
            print(nouns[random.randint(0, len(nouns)-1)], end = "\n" if i == num_words - 1 else " ")

generate()
