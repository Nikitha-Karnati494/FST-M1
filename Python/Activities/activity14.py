def fibonacci_sum(number):
    if number<=0:
        return []
    elif number==1:
        return [0]
    elif number==2:
        return [0,1]
    else:
        seq=fibonacci_sum(number-1)
        seq.append(seq[-1]+seq[-2])
        return seq
    
#taking input from user
n=int(input("How many fibonacci sequence to generate "))
result=fibonacci_sum(n)
print("fibonacci sequence: ", result)