def sum(numbers):    
    if len(numbers)==0:
        return 0
    else:
        return numbers[0]+sum(numbers[1:])
    
numbers = [1,2,3,4,5]
result=sum(numbers)
print("sum of numbers is: ",result)