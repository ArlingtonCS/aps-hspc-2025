import sys

def process_commands(message, commands):
    # WRITE CODE HERE
    
    
    return None # modify this line








# INPUT CODE DO NO MODIFY
input = sys.stdin.read().splitlines()
t = int(input[0])
index = 1

results = []
for _ in range(t):
    n = int(input[index])
    encoded_message = input[index + 1]
    commands = input[index + 2: index + 2 + n]
    index += 2 + n
    
    decrypted_message = process_commands(list(encoded_message), commands)
    results.append(decrypted_message)


for result in results:
    print(result)
