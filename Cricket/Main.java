def r_fig(rr):
    rr = "{:.2f}".format(rr)

    r = (rr.split("."))

    i = 0
    while True:
        if int(r[1]) < (5*i):
            r[1] = str((i//2)*10)
            break
        i+=1

    rr = float(r[0] +"."+ r[1])
    return rr

nb = int(input())
tr = int(input())
rs = int(input())
nbb = int(input())

to = float(str(nb//6) + '.' + str(nb%6))
of = float(str(nbb//6) + '.' + str(nbb%6))

trr = float(float(tr) / to)

crr = float(float(rs) / of)

trr = r_fig(trr)
crr = r_fig(crr)

print(int(to))

print(of)

print(crr)

print(trr)

if crr >= trr:
    print("Eligible to Win")
else:
    print("Not Eligible to Win")