# get n and set up solutions list
n = int(input())
solutions = []

# iterate through inputs
for i in range(n):
    num = int(input())
    # add to list whether number is even or odd
    if (num % 2) == 0: 
        solutions.append(f"{num} is even")
        # solutions.append(str(num) + " is even")
    else: 
        solutions.append(f"{num} is odd")

# print out cached solutions
for i in solutions: print(i)
