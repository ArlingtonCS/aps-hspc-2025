def brainrot_translator(word):
    
    if word == 'skibidi':
        return "toilet"
    if word == 'fanum':
        return "tax"
    if word == 'sigma':
        return "male"

# Parse the input
n = int(input())  # Number of words
words = [input().strip() for _ in range(n)]  # List of input words
results = [brainrot_translator(word) for word in words]
print("\n".join(results))  # Print the results line by line
