n = int(input())
solutions = []

for i in range(n):
    ln = input().split()
    b, p = float(ln[0]), float(ln[1])
    solutions.append(f"{(b - 1) * 60 / p} {b * 60 / p} {(b + 1) * 60 / p}")

for i in solutions: 
    print(i)