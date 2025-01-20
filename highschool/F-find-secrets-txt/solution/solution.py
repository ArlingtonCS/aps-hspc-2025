# returns the path to secrets.txt
def find_secrets_txt(lines):
    stack = []
    for line in lines:
        name = line if line[0] != "-" else line[line.index(" ")+1:]
        depth = line.count("-")
        is_dir = line[-1] == "/"

        if is_dir:
            while len(stack) > depth:
                stack.pop()
            stack.append(name)
        else:
            if (name == "secrets.txt"):
                print("/" + "".join(stack) + "secrets.txt")

    


















# parsing code, DO NOT MODIFY
line_count = int(input())
lines = []
for _ in range(line_count):
    lines.append(input())
find_secrets_txt(lines)
