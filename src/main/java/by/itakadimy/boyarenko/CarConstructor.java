package by.itakadimy.boyarenko;

public class CarConstructor {
    public static void main(String[] arg) {
        Car car1 = new Car("Audi");
        Car car2 = new Car("BMW");
        Car car3 = new Car("Bentley");
        System.out.println(car1.getCarModel());
        System.out.println(car2.getCarModel());
        System.out.println(car3.getCarModel());
    }
}
