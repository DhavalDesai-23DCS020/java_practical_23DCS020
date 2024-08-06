// Supplementary Experiment:
// 1.Write a Java program to create a vehicle class hierarchy.
// The base class should be Vehicle, with subclasses Truck,
// Car and Motorcycle. Each subclass should have
// properties such as make, model, year, and fuel type.
// Implement methods for calculating fuel efficiency,
// distance traveled, and maximum speed. [L:A]

class Vehicle {
    String make;
    String model;
    int year;
    String fuelType;

    Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel Efficiency of " + make + " " + model + " is 20 km/l");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled by " + make + " " + model + " is 100 km");
    }

    void maxSpeed() {
        System.out.println("Maximum speed of " + make + " " + model + " is 250 km/h");
    }
}
class Truck extends Vehicle {
    Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
class Car extends Vehicle {
    Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
class Motorcycle extends Vehicle {
    Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
}
public class jsupply {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Toyota", "Fortuner", 2021, "Petrol");
        Truck t = new Truck("Tata", "407", 2020, "Diesel");
        Car c = new Car("Maruti", "Swift", 2019, "Petrol");
        Motorcycle m = new Motorcycle("Royal Enfield", "Classic 350", 2018, "Petrol");

        v.fuelEfficiency();
        v.distanceTravelled();
        v.maxSpeed();

        t.fuelEfficiency();
        t.distanceTravelled();
        t.maxSpeed();

        c.fuelEfficiency();
        c.distanceTravelled();
        c.maxSpeed();

        m.fuelEfficiency();
        m.distanceTravelled();
        m.maxSpeed();
    }
}