# returns the number of letters in common
# input is a list of strings
def num_letters_in_common(input):
    letters = set(input[0])
    for word in input[1:]:
        letters.intersection_update(set(word))
    return len(letters)
    
num_cases = int(input())
for _ in range(num_cases):
    print(num_letters_in_common(input().split(" ")))
