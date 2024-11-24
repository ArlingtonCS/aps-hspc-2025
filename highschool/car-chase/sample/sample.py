def car_chase(test_case):
    x_agent, y_agent = test_case["agent"]
    x_you, y_you = test_case["you"]
    
    # WRITE CODE HERE
    
    return None # modify this line
















# DO NOT MODIFY BELOW HERE
T = int(input())
test_cases = []

for _ in range(T):
    x_agent, y_agent = map(int, input().strip().split(","))
    x_you, y_you = map(int, input().strip().split(","))
    test_cases.append({
        "agent": (x_agent, y_agent),
        "you": (x_you, y_you)
    })
    
results = []

for test_case in test_cases:
    # Process the test cases
    results.append(car_chase(test_case))

# Output results
for result in results:
    print(result)
