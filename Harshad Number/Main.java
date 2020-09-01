num = input()
num_len = len(num)
sum = 0
for i in range(0,num_len):
  sum += int(num[i])
if int(num)%sum == 0:
  print("Harshad Number")
else:
  print("Not Harshad Number")