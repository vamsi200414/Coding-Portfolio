a=0
b=1
c=a+b
tot = int(input("Enter a number : "))
print("0", end = " ")
print("1", end = " ")
while(c<tot):
    print(c, end = " ")
    a=b
    b=c
    c=a+b
