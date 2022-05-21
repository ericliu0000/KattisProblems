t = int(input())

for i in range(t):
    n = int(input())
    inventory = {}

    # Accumulate item counts in dictionary
    for i in range(n):
        item, count = input().split()
        
        if item in inventory:
            inventory[item] += int(count)
        else:
            inventory[item] = int(count)

    # Sort keys
    inventory = dict(sorted(inventory.items(), key=lambda item: item[0]))
    inventory = dict(sorted(inventory.items(), key=lambda item: item[1], reverse=True))

    # Print format
    print(len(inventory))
    for i in inventory:
        print(f"{i} {inventory[i]}")
        