public class Main {

    public static void main(String[] args) {

        System.out.println("przyspiesz");


        
        for (int i = 0; i == 5; i++) {
            car.accelerate();
            System.out.println("The current speed is" + " " + i);
        }

        System.out.println("hamuj");

        for (int y = 5; y >= 0; y--) {
            car.decrease();
            System.out.println("The current speed is" + " " + y);

        }


    }
}
