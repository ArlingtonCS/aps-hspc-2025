# Output each combination using the print() function
# n is the number of wheels
# d is the highest digit on the wheel
def combination_lock(n, d):
    # There are two ways to solve this problem:
    # 1. Generate the permutations using a traditional approach
    # 2. Notice that the output is the same as counting in base (d+1) up to (d+1)^n
    # We will use the second approach!
    for i in range((d+1)**n):
        print(to_base(i, d+1).zfill(n))



base_string = "0123456789"
def to_base(number, base):
    result = ""
    while number:
        result += base_string[number % base]
        number //= base
    return result[::-1] or "0"














# parsing code, DO NOT MODIFY
testcases = int(input())
for _ in range(testcases):
    inputs = input().split()
    n = int(inputs[0])
    d = int(inputs[1])
    combination_lock(n, d)
