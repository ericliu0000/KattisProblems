count = 0

while 1:
    # Gather iterations and setup variables
    n = int(input())
    count += 1
    animals = {}

    if n == 0: break

    # Store animals and respective counts to dictionary
    for i in range(n):
        # Collect only the lower case version of the last word in the line
        animal = input().split()[-1].lower()
        if animal in animals:
            animals[animal] += 1
        else:
            animals[animal] = 1
    
    # Output the list number
    print(f"List {count}:")

    # Sort the dictionary by the key value (default) and output number of animals
    for i in sorted(animals):
        print(f"{i} | {animals[i]}")