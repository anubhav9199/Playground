n = int(input())
print(n)
count = 0
while n != 1:
  if n%2 == 0:
    n = int(n/2)
    count += 1
    print(n)
  else:
    n = int(3*n + 1)
    count += 1
    print(n)
print(count)