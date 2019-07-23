package lesson4;

import java.util.Objects;

public class Engine {
    public String name;
    public String model;
    public static String producer;
    public double price;

    public Engine(String name,String model, String producer, double price){
        this.name = name;
        this.model = model;
        this.producer = producer;
        this.price = price;

    }

    public Engine(){

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
        Engine.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine(" +
                "Producer = " + producer  +
                ", model = " + model +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Double.compare(engine.price, price) == 0 &&
                Objects.equals(name, engine.name) &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price);
    }
}
