package day32_Constructor;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Honda", "Accord");

        Car car3 = new Car("Lexus", "RX", 2021);

        Car car4 = new Car("Tesla", "Model 3", 2019,70000);

        Car car5 = new Car("BMW", "X5", 2020,70000,"Yellow");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


        }
    }

