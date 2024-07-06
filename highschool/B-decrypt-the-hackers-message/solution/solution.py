# returns the decrypted message
def decrypt(message):
    result = ""

    # 1. The letters in the message will be rotated by 13 places in the alphabet.
    # 2. The numbers in the message will be rotated by 5 places in the number line. (Include 0)
    # 3. After performing the previous two steps, any consecutive repeated characters will be "compressed" by replacing the repeated characters with the number of repetitions followed by the character itself.
    i = 0
    while i < len(message):
        ch = message[i]
        if ch.isalpha():
            count = 1
            while i + count < len(message):
                if message[i + count] == ch:
                    count += 1
                else:
                    break
            if count > 1:
                result += str(count)
                i += count - 2
            else:
                result += rotate(ch)

        elif ch.isdigit():
            result += str((int(ch) + 5) % 10)
        else:
            result += ch

        i += 1

    return result

def rotate(ch):
    return chr(((ord(ch) + 13) - ord('A')) % 26 + ord('A'))



















# parsing code, DO NOT MODIFY
testcases = int(input())
for _ in range(testcases):
    line = input()
    print(decrypt(line))
