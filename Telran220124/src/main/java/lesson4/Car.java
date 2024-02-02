package lesson4;

public class Car {
    String colour;
    double price;
    String model;

    public Car(){}
    public Car (String model, String colour, double price){
        this.model = model;
        this.colour = colour;
        this.price = price;
    }
    public Car(String colour) {
        this.colour = colour;
    }
    public Car(double price, String model) {
        this.price = price;
        this.model = model;
    }
    public void printCar() {
        System.out.println("Model: " + model + ", colour: "
                + colour + ", price: " + price);
    }

    public static void main(String[] args) {
        Car myCar = new Car(); // конструктор по-умолчанию
        myCar.colour = "red";
        myCar.price = 23_430;
        myCar.model = "Mazda-b";
        myCar.printCar();

        Car tuareg = new Car("Tuareg", "green", 24123.5);
        tuareg.printCar();
    }
}
