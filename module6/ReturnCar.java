class Car {
    String model;

    Car(String model) {
        this.model = model;
    }
}

public class ReturnCar {
    static Car getCar() {
        return new Car("Toyota");
    }

    public static void main(String[] args) {
        Car c = getCar();
        System.out.println("Car Model: " + c.model);
    }
}
