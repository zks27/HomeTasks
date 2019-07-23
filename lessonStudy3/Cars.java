package lessonStudy3;

/*
Create a class with 3 fields of different types, 2 constructors (one of them should be with parameters)
Create two methods inside the class (static and non-static). One of these methods should define the type of cars due to
it's weight (by using Switch). Second - generates a random car
*/

public class Cars {
    int weight;
    String engType;
    double maxSpeed;

    Cars() {
        weight = 1234;
        engType = "Дизель";
        maxSpeed = 200;
    }

    Cars(int a, String b, double c) {
        weight = a;
        engType = b;
        maxSpeed = c;
    }

    static int weightCheck(int i) {
        switch (i / 1000) {
            case 1:
            case 2:
            case 3:
                System.out.print("Тип машины - легковая, при весе ");
                break;
            case 4:
            case 5:
            case 6:
                System.out.print("Тип машины - джип, при весе ");
                break;
            case 7:
            case 8:
            case 9:
                System.out.print("Тип машины - грузовая, при весе ");
                break;
            default:
                System.out.print("Не является автомобилем, при весе ");
                break;
        }
        return i;
    }

    void randomCars() {
        weight = (int) (Math.random() * (10000 - 1000) + 1000);
        maxSpeed = (int)(Math.random() * (400 - 100) + 100);
        double i;
        i = (Math.random() * (3 - 1) + 1) / 1;
        if (i == 1) engType = "Дизель";
        else engType = "Бензин";
    }
}

class CarsDemo {
    public static void main(String[] args) {
        Cars toyota = new Cars();
        Cars mazda = new Cars();
        Cars jeep = new Cars(7000, "Дизель", 250);
        mazda.randomCars();


        System.out.println("Данные сгенерированной Мазды:");
        System.out.println("Вес: " + mazda.weight);
        System.out.println("Тип двигателя: " + mazda.engType);
        System.out.println("Максимальная скорость: " + mazda.maxSpeed);
        System.out.println();
        System.out.println(Cars.weightCheck(toyota.weight));
        System.out.println(Cars.weightCheck(jeep.weight));
        System.out.println(Cars.weightCheck(mazda.weight));
    }
}


