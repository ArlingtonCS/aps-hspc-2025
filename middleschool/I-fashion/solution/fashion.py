def generate_outfits(shirts, pants, shoes):
    for shirt in shirts:
        for pant in pants:
            for shoe in shoes:
                print(f"{shirt} - {pant} - {shoe}")

# Parse input
num_shirts = int(input())
shirts = input().split()

num_pants = int(input())
pants = input().split()

num_shoes = int(input())
shoes = input().split()

# Call the function
generate_outfits(shirts, pants, shoes)
