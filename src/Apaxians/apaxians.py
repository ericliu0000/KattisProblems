from itertools import groupby
input = input()
input = list(input)
output = [x[0] for x in groupby(input)]
output = "".join(output)
print(output)
