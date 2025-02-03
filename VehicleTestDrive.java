
class Vehicle {
    public void startEngine() {
        System.out.println("Starting the vehicle engine...");
    }
}


class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the car engine with a key...");
    }
}


class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Starting the motorcycle engine with a button...");
    }
}


public class VehicleTestDrive {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Test driving the car:");
        vehicleTestDrive(car);

        System.out.println("\nTest driving the motorcycle:");
        vehicleTestDrive(motorcycle);
    }
}
