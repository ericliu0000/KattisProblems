die = input().split()

# seperate n and m from input str 
n = int(die[0])
m = int(die[1])

# pattern: most common die are between lowest die + 1 to highest die + 1
for i in range(min(n, m), max(n, m) + 1):
    print(i + 1)
