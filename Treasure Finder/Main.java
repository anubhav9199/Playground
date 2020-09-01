a = int(input())
b = int(input())
c = int(input())
if (a > b and a < c) or (a > c and a < b):
  print("The treasure is in box which has number",a)
elif (b > a and b < c) or (b < a and b > c):
  print("The treasure is in box which has number",b)
elif (c > a and c < b) or (c < a and c > b):
  print("The treasure is in box which has number",c)

if (b%a == 0) and (c%a == 0):
  print("The code to open the box is",a)
elif (a%b == 0) and (c%b == 0):
  print("The code to open the box is",b)
elif (a%c == 0) and (b%c == 0):
  print("The code to open the box is",c)
else:
  print("The code to open the box is 1")