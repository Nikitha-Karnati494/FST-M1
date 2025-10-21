import pandas   # import pandas as pd - pd is alias name

#Activity 17
#create the dataset - dictionary
data = {
    "usernames":["admin","Charles","Deku"],
    "passwords":["password","Charl13","AllMight"]
}
# convert the data into dataframe or constructing dataframe from dictionary
df = pandas.DataFrame(data)
print(df)
#write the dataframe to file
df.to_csv("./sample.csv")

#Activity 18
inputfile = pandas.read_csv("./sample.csv")
#print only usernames
print(inputfile["usernames"])
#print username and pw of second row
print("Second row values: ", inputfile["usernames"][1],inputfile["passwords"][1])
#sort the username columns data and print it
print(inputfile.sort_values("usernames"))
# to sort in descending order -> print(inputfile.sort_values("usernames", ascending=False))

#sprt the passwords column data in descending order and print data
print(inputfile.sort_values("passwords", ascending=False))

#data frames are immutable