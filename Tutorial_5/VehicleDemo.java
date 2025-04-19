package assignment5;
// Base class Vehicle
class Vehicle {
    protected double speed;  // in km/h
    protected double fuel;   // in liters

    public Vehicle(double speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    public void move() {
        System.out.println("Vehicle is moving at " + speed + " km/h.");
    }
}

// Derived class Car
class Car extends Vehicle {
    private boolean hasAirConditioner;

    public Car(double speed, double fuel, boolean hasAirConditioner) {
        super(speed, fuel);
        this.hasAirConditioner = hasAirConditioner;
    }

    public void turnOnAC() {
        if (hasAirConditioner) {
            System.out.println("Air conditioner is turned on.");
        } else {
            System.out.println("This car does not have an air conditioner.");
        }
    }
}

// Derived class Bike
class Bike extends Vehicle {
    private boolean hasKickStart;

    public Bike(double speed, double fuel, boolean hasKickStart) {
        super(speed, fuel);
        this.hasKickStart = hasKickStart;
    }

    public void startBike() {
        if (hasKickStart) {
            System.out.println("Bike started using kick-start.");
        } else {
            System.out.println("Bike started using self-start.");
        }
    }
}

// Derived class Truck
class Truck extends Vehicle {
    private double cargoCapacity;  // in kg

    public Truck(double speed, double fuel, double cargoCapacity) {
        super(speed, fuel);
        this.cargoCapacity = cargoCapacity;
    }

    public void loadCargo() {
        System.out.println("Loading cargo. Capacity: " + cargoCapacity + " kg.");
    }
}

// Main class to test
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(120, 50, true);
        Bike bike = new Bike(80, 10, false);
        Truck truck = new Truck(60, 200, 5000);

        car.move();
        car.turnOnAC();

        bike.move();
        bike.startBike();

        truck.move();
        truck.loadCargo();
    }
}