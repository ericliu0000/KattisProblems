set = 1

while 1:
    # Check set length or exit condition
    n = int(input())
    if n == 0: break

    # Get all names (given in sorted order)
    names = []
    for i in range(n):
        names.append(input())

    # Put names in this order: index 0, 2, 4... n - 1, n, n - 2, n - 4... 1
    forwards, reverse = [], []
    for i in range(0, len(names), 2):
        forwards.append(names[i])
    for i in range(1, len(names), 2):
        reverse.append(names[i])
    reverse.reverse()

    # Print set number and format output
    print(f"SET {set}")
    for i in (forwards + reverse):
        print(i)
    set += 1
