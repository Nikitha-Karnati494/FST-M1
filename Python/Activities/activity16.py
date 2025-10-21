class Car:
    'This class represents a car'

    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    
    def accelerate(self):
        print(self.manufacturer+" "+self.model+" is moving!")
    
    def brake(self):
        print(self.manufacturer+" "+self.model+" has stopped moving!")

car1=Car("toyota", "corolla", "2010", "manual", "white")
car2=Car("maruti", "suzuki", "2011", "manual", "red")
car3=Car("suzuki", "swift", "2015", "automatic", "black")
        
car1.accelerate()
car1.brake()