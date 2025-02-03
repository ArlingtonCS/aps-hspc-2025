# Set the `answer` variable equal to the proper second word.
# The variable `word` is a string representing the first word.
def brainrot_translator(word):
    answer = ""
    
    # WRITE CODE HERE
    
    return answer


# DO NOT MODIFY BELOW HERE
# Parse the input
n = int(input())  # Number of words
words = [input().strip() for _ in range(n)]  # List of input words
results = [brainrot_translator(word) for word in words]
print("\n".join(results))  # Print the results line by line
