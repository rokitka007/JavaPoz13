import model.Car;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi! Please enter year of production and model of the car");
        Scanner scan = new Scanner(System.in);
        Car car = new Car(scan.nextInt(), scan.nextLine());
        System.out.println("New car created! " + car.getYearOfProduction() + car.getModel());
        car.accelerate();
        System.out.println("The current speed is " + car.getVelocity());
    }
}
