# returns the compressed string
def compress(input):
    output = ""
    current_char = list(input)[0]
    current_count = 1

    for character in list(input)[1:]:
        if character == current_char:
            current_count += 1
            continue

        if current_count != 1:
            output += f"({current_char}){current_count}"
        else:
            output += current_char
        current_count = 1
        current_char = character

    if current_count != 1:
        output += f"({current_char}){current_count}"
    else:
        output += current_char

    return output
    
num_cases = int(input())
for _ in range(num_cases):
    print(compress(input()))
