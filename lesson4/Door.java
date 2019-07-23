package lesson4;

import java.util.Objects;

public class Door {
    public String name;
    public String model;
    public static String producer;
    public double price;

    public Door(String name,String model, String producer, double price){
        this.name = name;
        this.model = model;
        this.producer = producer;
        this.price = price;

    }

    public Door(){

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
        Door.producer = producer;
    }

    @Override
    public String toString() {
        return "Door(" +
                "Producer = " + producer  +
                ", model = " + model +
                ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Double.compare(door.price, price) == 0 &&
                Objects.equals(name, door.name) &&
                Objects.equals(model, door.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price);
    }
}
