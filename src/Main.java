public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Car 1");
        cars[1] = new Car("Car 2");
        cars[2] = new Car("Car 3");
        cars[3] = new Car("Car 4");
        cars[4] = new Car("Car 5");

        boolean raceFinished = false;
        while (!raceFinished) {
            for (Car car : cars) {
                car.move();
                System.out.println(car.getName() + ": " + car.getPosition());
            }
            System.out.println("-----");

            for (Car car : cars) {
                if (car.getPosition() >= 100) {
                    raceFinished = true;
                    System.out.println(car.getName() + " won the race!");
                    break;
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
