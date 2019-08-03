package lesson5;


public class Methods {

    public static Car[] carsGeneration(int length) {
        Car[] cars = new Car[length];
        Chair[] chairs = new Chair[length];
        Door[] doors = new Door[length];
        Engine[] engines = new Engine[length];
        Transmission[] transmissions = new Transmission[length];
        Window[] windows = new Window[length];

        for (int i = 0; i < cars.length; i++) {
            int[] quantityVar = {2, 4};
            String[] producerVar = {"Griw", "Jig", "FS"};
            String[] modelVar = {"Minimal", "Standard", "Luxury"};
            int[][] priceVar = {{1000, 2000, 3000},
                    {2000, 4000, 6000},
                    {1000, 4000, 5000}
            };
            int a = (int) (Math.random() * 3);
            int b = (int) (Math.random() * 3);

            chairs[i] = new Chair(quantityVar[(int) (Math.random() * 2)], producerVar[a], modelVar[b], priceVar[a][b]);
        }

        for (int i = 0; i < cars.length; i++) {
            int[] quantityVar = {2, 4};
            String[] producerVar = {"Loo", "Doo"};
            String[] modelVar = {"Minimal", "Standard", "Luxury"};
            int[][] priceVar = {{1000, 2000, 3000},
                    {2000, 4000, 6000}
            };
            int a = (int) (Math.random() * 2);
            int b = (int) (Math.random() * 3);

            doors[i] = new Door(quantityVar[(int) (Math.random() * 2)], producerVar[a], modelVar[b], priceVar[a][b]);
        }
        for (int i = 0; i < cars.length; i++) {
            String[] typeVar = {"Gasoline", "Diesel", "Electric"};
            String[] producerVar = {"BM", "TM", "GM"};
            String[] modelVar = {"40l", "60l", "100l"};
            int[][] priceVar = {{10000, 20000, 30000},
                    {20000, 40000, 60000},
                    {10000, 40000, 50000}
            };
            int a = (int) (Math.random() * 3);
            int b = (int) (Math.random() * 3);

            engines[i] = new Engine(typeVar[(int) (Math.random() * 3)], producerVar[a], modelVar[b], priceVar[a][b]);
        }

        for (int i = 0; i < cars.length; i++) {
            String[] typeVar = {"Manual", "Automatic"};
            String[] producerVar = {"Best", "Good"};
            String[] modelVar = {"4st", "5st"};
            int[][] priceVar = {{15000, 20000},
                    {23000, 43000}
            };
            int a = (int) (Math.random() * 2);
            int b = (int) (Math.random() * 2);

            transmissions[i] = new Transmission(typeVar[(int) (Math.random() * 2)], producerVar[a], modelVar[b], priceVar[a][b]);
        }

        for (int i = 0; i < cars.length; i++) {
            int[] quantityVar = {3, 4, 6};
            String[] producerVar = {"Micro", "Soft"};
            String[] modelVar = {"Minimal", "Standard", "Luxury"};
            int[][] priceVar = {{1000, 2000, 3000},
                    {2000, 4000, 6000}
            };
            int a = (int) (Math.random() * 2);
            int b = (int) (Math.random() * 3);

            windows[i] = new Window(quantityVar[(int) (Math.random() * 3)], producerVar[a], modelVar[b], priceVar[a][b]);
        }

        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car();
            cars[i].setChair(chairs[i]);
            cars[i].setDoor(doors[i]);
            cars[i].setEngine(engines[i]);
            cars[i].setTransmission(transmissions[i]);
            cars[i].setWindow(windows[i]);
        }

        return cars;
    }


    public static int finalPrice(Car car) {

        return car.getChair().getPrice() * car.getChair().getQuantity() + car.getDoor().getPrice() * car.getDoor().getQuantity() + car.getEngine().getPrice() + car.getTransmission().getPrice() + car.getWindow().getPrice() * car.getWindow().getQuantity();
    }

    public static int totalPrice(Car[] car) {
        int sum = 0;
        for (int i = 0; i < car.length; i++) {
            sum = sum + Methods.finalPrice(car[i]);
        }
        return sum;
    }

    public static Car[] typeDiezel(Car[] car) {

        int position = 0;
        int newLength = 0;
        for (int i = 0; i < car.length; i++) {
            if (car[i].getEngine().getType() == "Diesel") {
                newLength++;

            }
        }
        Car[] carNew = new Car[newLength];
        if (newLength > 0) {

            for (int i = 0; i < car.length; i++) {
                if (car[i].getEngine().getType() == "Diesel") {
                    carNew[position] = car[i];
                    position++;

                }
            }
        } else System.out.print("Машин с дизельным двигателем - ");

        return carNew;
    }

    public static void print(Car[] newCars) {
        for (int i = 0; i < newCars.length; i++) {
            System.out.println("- " + newCars[i].toString());
        }
    }

}
