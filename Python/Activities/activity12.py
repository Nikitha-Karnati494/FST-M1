def recursive_sum(num):
    if num==0:
        return 0
    else:
        #Recursive case
        return num+recursive_sum(num-1)

#calling the function
result=recursive_sum(10)
print("sum from 0 to 10 is: ",result)