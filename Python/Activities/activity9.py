list1=[2,4,5,7,10,9]
list2=[9,8,1,2,6]
newlist=[]

for num in list1:
    if(num%2!=0):
        newlist.append(num)

for num in list2:
    if(num%2==0):
        newlist.append(num)

print(newlist)