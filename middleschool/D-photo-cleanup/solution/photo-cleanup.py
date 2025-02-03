def minimum_photos_to_delete(number_of_photos, total_memory, sizes):
    # Calculate the total size of all photos
    total_size = sum(sizes)
    
    # If the total size is already within the limit, no photos need to be deleted
    if total_size <= total_memory:
        return 0
    
    # Sort the photo sizes in descending order (largest to smallest)
    sizes.sort(reverse=True)
    
    # Initialize variables to track the size freed and number of photos deleted
    size_freed = 0
    photos_deleted = 0
    
    # Delete photos until the total size is within the limit
    for size in sizes:
        size_freed += size
        photos_deleted += 1
        if total_size - size_freed <= total_memory:
            break
    
    return photos_deleted


number_of_photos, total_memory = map(int, input().split())
sizes = list(map(int, input().split()))

# Output the result
print(minimum_photos_to_delete(number_of_photos, total_memory, sizes))
