package model;

public class Car {

    private int yearOfProduction;
    private String model;
    private double velocity;

    public Car(int yearOfProduction, String model) {
        this.yearOfProduction = yearOfProduction;
        this.model = model;
        this.velocity = 0;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public double getVelocity() {
        return velocity;
    }
}
class P {
    int accelerate(int liczba) {
        liczba = liczba + 5;
        return liczba;
    }

    class D {
        int decrease(int liczba) {
            liczba = liczba - 5;
            return liczba;
        }
    }
}