def check(m,n,req):
  bact = m**n
  if bact >= req:
    print("Doctor, you can proceed with your experiment.")
  else:
    print("Sorry Doctor! You need more bacteria.")
m = int(input())
n = int(input())
req = int(input())
check(m,n,req)