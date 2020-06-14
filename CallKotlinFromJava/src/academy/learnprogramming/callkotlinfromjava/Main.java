package academy.learnprogramming.callkotlinfromjava;

import academy.learnprogramming.kotlincode.Car;
import academy.learnprogramming.kotlincode.StaticCar;

public class Main {

    public static void main(String[] args) {
        StaticCar.topLevel();
        StaticCar.print("Print this as well");

        Car car = new Car("blue", "bmw", 2011, true);
        System.out.println(car.model);
        car.setColor("white");
        System.out.println(car.getColor());
        System.out.println(car.getAutomatic());

        System.out.println(car.model);

    }
}
