# Take name and age as inputs
name=input("enter your name")
age=input("enter your age")

#Calculate the year when they turn 100
year_100 = (100-int(age)) + 2025

# input function in python treats everything as string
# Type casting can be done
# concatenation in python can be done only between 2 sets, 2 lists, 2 strings and not between string and int

# print the year they turn to 100
print(f"you will turn 100 in {year_100}")

# type() -> Gives the data type of that particular variable