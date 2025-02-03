def get_note_in_scale(position):
    c_major_scale = ["C", "D", "E", "F", "G", "A", "B", "C"]
    # Adjust for zero-based indexing
    return c_major_scale[position - 1]

# Parse the input
position = int(input())

# Validate input
if 1 <= position <= 8:
    # Call the function and print the result
    note = get_note_in_scale(position)
    print(note)
