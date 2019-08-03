package lesson5;

/*
Создать иерархию наследования на 3 уровня с абстрактным классом и 2-мя абстрактными методами, переопределить
методы equals hashCode, toString, перегрузить и переопределить 2 метода в классах и конструкторах, продемонстрировать работу с
массивами объектов из иерархии классов (сортировать по критериям, суммарный подсчет параметров и т.д.). Добавить имплементацию 2 своих интерфейсов
 */

import java.util.Objects;

public class Car {
    private Chair chair;
    private Door door;
    private Engine engine;
    private Transmission transmission;
    private Window window;

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    Car() {

    }

    Car(Chair chair, Door door, Engine engine, Transmission transmission, Window window) {
        this.chair = chair;
        this.door = door;
        this.engine = engine;
        this.transmission = transmission;
        this.window = window;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(chair, car.chair) &&
                Objects.equals(door, car.door) &&
                Objects.equals(engine, car.engine) &&
                Objects.equals(transmission, car.transmission) &&
                Objects.equals(window, car.window);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chair, door, engine, transmission, window);
    }

    @Override
    public String toString() {
        return "Car{" + chair +
                ", " + door +
                ", " + engine +
                ", " + transmission +
                ", " + window +
                '}';

    }

    public static void main(String[] args) {
        Car[] cars = Methods.carsGeneration(10);

        int carNumber = 1;
        System.out.println("Общая цена машины номер " + carNumber + " составляет " + Methods.finalPrice(cars[carNumber - 1]));
        System.out.println("-------------------------------------------");
        System.out.println("Общая цена всех машин составляет " + Methods.totalPrice(cars));
        System.out.println("-------------------------------------------");
        cars[1].getChair().currencyConvertation();
        System.out.println("-------------------------------------------");
        cars[1].getChair().currencyConvertation("TYe");
        System.out.println("-------------------------------------------");
        cars[1].getDoor().currencyConvertation();
        System.out.println("-------------------------------------------");
        cars[1].getDoor().currencyConvertation("EUR");
        System.out.println("-------------------------------------------");
        System.out.println("Машины с дизельным двигателем:");
        Car[] carsDiezel = Methods.typeDiezel(cars);
        Methods.print(carsDiezel);
        System.out.println("-------------------------------------------");
        carsDiezel[0].getChair().priceWQuantity();
        System.out.println("-------------------------------------------");
        carsDiezel[0].getChair().increaseQuantity(2);
        System.out.println(carsDiezel[0].getChair().getQuantity());
        System.out.println("-------------------------------------------");
        carsDiezel[0].getChair().decreaseQuantity(1);
        System.out.println(carsDiezel[0].getChair().getQuantity());
        System.out.println("-------------------------------------------");
        System.out.println("Тип двигателя до улучшения - " + cars[0].getEngine().getType());
        cars[0].getEngine().upgrade(cars[0], "Twinturbo Diesel");
        System.out.println("Текущий тип двигателя - " + cars[0].getEngine().getType());
        System.out.println("-------------------------------------------");
        System.out.println("Тип КПП до улучшения - " + cars[0].getTransmission().getType());
        cars[0].getTransmission().upgrade(cars[0], "Manual");
        System.out.println("Текущий тип КПП - " + cars[0].getTransmission().getType());
        System.out.println("-------------------------------------------");


    }


}
