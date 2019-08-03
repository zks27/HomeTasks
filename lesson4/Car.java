package lesson4;

//Класс машина
//5 деталей
//цена для каждой детали
//название фирмы производителя через статическую переменную
//название + марка
//1. Вывести стоимость автобиля
//2. Вывести название фирмы + название модели
//3. Провести замену деталей(изменить цену)
//4. Пересчитать сумму автомобиля

public class Car {
    private Chair Chair;
    private Door Door;
    private Engine Engine;
    private Wheel Wheel;
    private Window Window;

    Car(Chair Chair, Door Door, Engine Engine, Wheel Wheel, Window Window) {
        this.Chair = Chair;
        this.Door = Door;
        this.Engine = Engine;
        this.Wheel = Wheel;
        this.Window = Window;
    }

    Car() {

    }

    public lesson4.Chair getChair() {
        return Chair;
    }

    public void setChair(lesson4.Chair chair) {
        Chair = chair;
    }

    public lesson4.Door getDoor() {
        return Door;
    }

    public void setDoor(lesson4.Door door) {
        Door = door;
    }

    public lesson4.Engine getEngine() {
        return Engine;
    }

    public void setEngine(lesson4.Engine engine) {
        Engine = engine;
    }

    public lesson4.Wheel getWheel() {
        return Wheel;
    }

    public void setWheel(lesson4.Wheel wheel) {
        Wheel = wheel;
    }

    public lesson4.Window getWindow() {
        return Window;
    }

    public void setWindow(lesson4.Window window) {
        Window = window;
    }

    public double finalPrice() {
        return Chair.getPrice() + Door.getPrice() + Engine.getPrice() + Window.getPrice() + Wheel.getPrice();
    }

    @Override
    public String toString() {
        return "Car:" + "\n" + Chair +
                ", " + "\n" + Door +
                ", " + "\n" + Engine +
                ", " + "\n" + Wheel +
                ", " + "\n" + Window;
    }
}

class Demo {
    public static void main(String[] args) {
        Chair chair = new Chair("Nice", "A50", "Rhino", 10000);
        Door door = new Door("Super", "B1212", "DoorMaster", 20000);
        Engine engine = new Engine("Top", "C1", "Ligo", 35000);
        Wheel wheel = new Wheel("Ultra", "Soft", "Pirelli", 10000);
        Window window = new Window("Professional", "7", "Microwindow", 5000);
        Car toyota = new Car(chair, door, engine, wheel, window);
        System.out.println("1. Цена машины - " + toyota.finalPrice() + " USD");
        System.out.println();
        System.out.print("2. ");
        System.out.println(toyota.toString());
        System.out.println();
        engine.setPrice(123000);
        System.out.println("3. Цена нового двигателя - " + toyota.getEngine().getPrice());
        System.out.println();
        System.out.println("4. Цена машины после замены двигателя - " + toyota.finalPrice() + " USD");

    }
}
