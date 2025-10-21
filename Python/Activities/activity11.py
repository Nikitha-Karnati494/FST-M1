fruitshop= {
    "apple":50,
    "orange":40,
    "banana":10,
    "cherry":20
}

fruitneeded = input("which fruit you want").lower()

if(fruitneeded in fruitshop):
    print("yes available")
else:
    print("not available")