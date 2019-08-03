package lesson4;

import java.util.Objects;

public class Wheel {
    public String name;
    public String model;
    public static String producer;
    public double price;

    public Wheel(String name, String model, String producer, double price) {
        this.name = name;
        this.model = model;
        this.producer = producer;
        this.price = price;

    }


    public Wheel() {

    }

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public static String getProducer() {
        return producer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setProducer(String producer) {
        Wheel.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.price, price) == 0 &&
                Objects.equals(name, wheel.name) &&
                Objects.equals(model, wheel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price);
    }

    @Override
    public String toString() {
        return "Wheel(" +
                "Producer = " + producer +
                ", model = " + model +
                ')';
    }
}
