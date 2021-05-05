n, x, y = input().split()

hypotenuse = (float(x) ** 2 + float(y) ** 2) ** 0.5

for i in range(int(n)):
    if int(input()) > hypotenuse:
        print("NE")
    else:
        print("DA")
