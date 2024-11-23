import sys

def process_commands(message, commands):
    for command in commands:
        parts = command.split()

        # Process replace command
        if parts[0] == "replace":
            old_char = parts[1]
            new_char = parts[3]
            message = [new_char if char == old_char else char for char in message]

        # Process delete command
        elif parts[0] == "delete":
            char_to_delete = parts[1]
            message = [char for char in message if char != char_to_delete]

        # Process insert command
        elif parts[0] == "insert":
            char_to_insert = parts[1]
            position = int(parts[3]) - 1  # Convert 1-based index to 0-based
            message.insert(position, char_to_insert)

    return ''.join(message)  # Convert list back to string

# Reading input
input = sys.stdin.read().splitlines()
t = int(input[0])  # Number of test cases
index = 1

results = []
for _ in range(t):
    n = int(input[index])  # Number of commands
    encoded_message = input[index + 1]  # Original encoded message
    commands = input[index + 2: index + 2 + n]  # Commands for this test case
    index += 2 + n
    
    # Process commands for each test case and store the result
    decrypted_message = process_commands(list(encoded_message), commands)
    results.append(decrypted_message)

# Output all results
for result in results:
    print(result)
