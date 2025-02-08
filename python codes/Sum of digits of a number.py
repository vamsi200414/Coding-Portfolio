a = int(input("Enter a number : "))
sum = 0
if(a<10):
    print("sum is : ", a)
elif(a>10):
    while(a!=0):
        sum = sum+a%10
        a = a//10
    print(sum)
