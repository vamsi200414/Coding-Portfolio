a = int(input("Enter a number : "))
count = 0
if(a == 1):
    print(a,"not a prime")
elif(a>1):
    for i in range(2,a-1):
        if(a%i == 0):
            count += 1 
            break
    if(count == 0):
        print(a,"is prime number")
    else:
        print(a,"is not a prime number")
