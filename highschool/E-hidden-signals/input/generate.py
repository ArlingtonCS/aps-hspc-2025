import random
import string

def generate_encoded_message(length=8):
    """Generate a random string of lowercase letters of a specified length."""
    return ''.join(random.choice(string.ascii_lowercase) for _ in range(length))

def generate_commands(encoded_message, max_commands=30):
    """Generate a list of commands to modify the encoded message."""
    commands = []
    possible_chars = string.ascii_lowercase
    message_length = len(encoded_message)

    for _ in range(random.randint(1, max_commands)):
        command_type = random.choice(["replace", "delete", "insert"])

        if command_type == "replace" and encoded_message:
            old_char = random.choice(encoded_message)
            new_char = random.choice(possible_chars.replace(old_char, ""))
            commands.append(f"replace {old_char} with {new_char}")
            encoded_message = encoded_message.replace(old_char, new_char)

        elif command_type == "delete" and encoded_message:
            char_to_delete = random.choice(encoded_message)
            commands.append(f"delete {char_to_delete}")
            encoded_message = encoded_message.replace(char_to_delete, "")

        elif command_type == "insert":
            char_to_insert = random.choice(possible_chars)
            position = random.randint(1, max(1, message_length))  # Ensure position is valid
            commands.append(f"insert {char_to_insert} before {position}")
            encoded_message = (
                encoded_message[:position - 1] + char_to_insert + encoded_message[position - 1:]
            )
            message_length += 1

    return commands, encoded_message

def generate_test_cases(num_cases=30):
    """Generate 30 test cases with random encoded messages and commands."""
    test_cases = []
    for _ in range(num_cases):
        encoded_message = generate_encoded_message(random.randint(5, 15))
        commands, final_message = generate_commands(encoded_message)
        test_cases.append({
            "encoded_message": encoded_message,
            "commands": commands,
            "expected_output": final_message
        })
    return test_cases

# Generate 30 test cases
test_cases = generate_test_cases(num_cases=30)
outputs = []

# Output all test cases in a single format
print(len(test_cases))  # Number of test cases
for case in test_cases:
    print(len(case["commands"]))  # Number of commands for this test case
    print(case["encoded_message"])  # Initial encoded message
    for command in case["commands"]:
        print(command)  # Commands
    outputs.append(case["expected_output"])  # Expected final output

#print(outputs)