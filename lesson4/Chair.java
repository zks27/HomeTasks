package lesson4;

import java.util.Objects;

public class Chair {
    public String name;
    public String model;
    public static String producer;
    public double price;

    public Chair(String name, String model, String producer, double price) {
        this.name = name;
        this.model = model;
        this.producer = producer;
        this.price = price;

    }

    public Chair() {

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
        Chair.producer = producer;
    }

    public double priceChair() {
        return getPrice();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chair chair = (Chair) o;
        return Double.compare(chair.price, price) == 0 &&
                Objects.equals(name, chair.name) &&
                Objects.equals(model, chair.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price);
    }

    @Override
    public String toString() {
        return "Chair(" +
                "Producer = " + producer  +
                ", model = " + model +
                ')';
    }
}
