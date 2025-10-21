import pandas
from pandas import ExcelWriter

#Activity 19
data = {
    "firstName": ["Satvik", "Avinash", "Lahri"],
    "lastName": ["Shah", "Kati", "Rath"],
    "email": ["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
    "phoneNumber": ["4537829158", "4892184058", "4528727830"]
}

df=pandas.DataFrame(data)
print(df)
writer= ExcelWriter("./sample.xlsx")
df.to_excel(writer,"Sheet1",index=False)
writer.close()

#Activity 20
inputfile=pandas.read_excel("./sample.xlsx","Sheet1")

#print number of rows and columns
print("Rows: ", inputfile.shape[0], "Coulums: ", inputfile.shape[1])
print(inputfile["email"])
print(inputfile.sort_values("firstName"))