# This function should return a string with one uppercase letter. `position` is a number.
def get_note_in_scale(position):
    # WRITE CODE HERE
    
    return None # MODIFY THIS LINE


# DO NOT MODIFY BELOW HERE
# Parse the input
position = int(input())

# Validate input
if 1 <= position <= 8:
    # Call the function and print the result
    note = get_note_in_scale(position)
    print(note)
