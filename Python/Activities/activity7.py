intlist = input("Enter a list of numbers in a sequence followed by ,").split(",")
sum=0
for num in intlist:
    sum=sum+int(num)
print(sum)