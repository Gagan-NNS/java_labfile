class Vehicle {

    private String brand;
    protected int speed;
    String fuelType;

    Vehicle() {
        brand = "Unknown";
        speed = 0;
        fuelType = "Petrol";
    }

    Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void setDetails(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed);
        System.out.println("Fuel Type : " + fuelType);
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle v1 = new Vehicle();

        Vehicle v2 = new Vehicle(
                "Toyota",
                120,
                "Diesel"
        );

        System.out.println("Default Constructor");
        v1.displayDetails();

        System.out.println("\nParameterized Constructor");
        v2.displayDetails();

        v1.setDetails("Honda", 100, "Petrol");

        System.out.println("\nAfter setDetails()");
        v1.displayDetails();
    }
}
