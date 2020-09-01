d1 = int(input())
c1 = int(input())
d2 = int(input())
c2 = int(input())

total = str((((d1 * 100) + c1) + ((d2 * 100) + c2))/100)
total_list = list(total.split("."))
print(int(total_list[0]))
print(int(total_list[1]))