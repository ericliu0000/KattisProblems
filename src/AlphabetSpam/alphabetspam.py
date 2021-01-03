# variable setup: set all counters to zero
space, lower, upper, symbol = 0, 0, 0, 0
text = input()

for i in text:
    num = ord(i)
    # using ascii values to split apart four types
    if num == 95:
        space += 1
    elif 97 <= num <= 122:
        lower += 1
    elif 65 <= num <= 90:
        upper += 1
    else:
        # known: input will be between ascii 33-126
        symbol += 1

# iterate through four values and print out ratios
for count in (space, lower, upper, symbol):
    print(count / len(text))