import random

def generate_hidden_input(test_cases=10, grid_size=100):
    """
    Generates hidden input for the Car Chase problem ensuring the agent starts ahead.
    
    Args:
        test_cases (int): Number of test cases to generate.
        grid_size (int): The maximum grid size for coordinates (1 to grid_size).
    
    Returns:
        str: The generated test case input.
    """
    output = []
    output.append(str(test_cases))  # Number of test cases
    
    for _ in range(test_cases):
        # Generate random starting coordinates for the player
        x_you = random.randint(1, grid_size)
        y_you = random.randint(1, grid_size)
        
        # Ensure the agent starts ahead of the player
        x_agent = random.randint(x_you, grid_size)
        y_agent = random.randint(y_you, grid_size)
        
        # Format the test case
        output.append(f"{x_agent},{y_agent}")
        output.append(f"{x_you},{y_you}")
    
    return "\n".join(output)

# Example usage
if __name__ == "__main__":
    test_cases = 5  # Adjust the number of test cases as needed
    grid_size = 50  # Adjust the grid size for variation
    hidden_input = generate_hidden_input(test_cases, grid_size)
    print(hidden_input)
