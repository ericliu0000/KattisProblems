input = input()
input = '{0:32b}'.format(int(input))
input = input.replace(" ", "")
input = input[::-1]
output = int(str(input), 2)
print(output)
