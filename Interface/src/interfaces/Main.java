package interfaces;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.brake();
        car.stop();
        car.acc();

        NiceCar nicecar = new NiceCar();
        nicecar.start();
        nicecar.startMusic();
        nicecar.upgradeEngine();
        nicecar.start();
    }
}