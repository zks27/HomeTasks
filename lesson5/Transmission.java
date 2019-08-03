package lesson5;

import java.util.Objects;

public class Transmission extends Detail implements Upgradable {
    private String type;
    private String model;
    private int price;

    Transmission() {

    }

    Transmission(String material, String producer, String type, String model, int price) {
        super(material, producer);
        this.type = type;
        this.model = model;
        this.price = price;
    }

    Transmission(String type, String producer, String model, int price) {
        super.producer = producer;
        this.type = type;
        this.model = model;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getProducer() {
        return super.getProducer();
    }

    @Override
    public void setProducer(String producer) {
        super.setProducer(producer);
    }

    @Override
    public String getMaterial() {
        return super.getMaterial();
    }

    @Override
    public void setMaterial(String material) {
        super.setMaterial(material);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Transmission transmission = (Transmission) o;
        return price == transmission.price &&
                Objects.equals(type, transmission.type) &&
                Objects.equals(model, transmission.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, model, price);
    }

    @Override
    public String toString() {
        return "Transmission{" + "producer = " + producer +
                ", type = " + type +
                ", model = " + model +
                ", price = " + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена коробки передач = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена коробки передач = " + (double) price * 0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена коробки передач = " + price * 63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation() {
        System.out.println("Цена коробки передач в долларах = " + price + " USD");
        System.out.println("Цена коробки передач в евро = " + (double) price * 0.9 + " EUR");
        System.out.println("Цена коробки передач в рублях = " + price * 63 + " RUB");
    }

    @Override
    public void upgrade(Car car, String upgrade) {

        switch (car.getTransmission().getType()) {
            case "Manual":
                switch (upgrade) {
                    case "Automatic":
                        car.getTransmission().setType(upgrade);
                        break;
                    case "Robot":
                        car.getTransmission().setType(upgrade);
                        break;
                    default:
                        System.out.println("Данная машина уже оснащена ручной коробкой передач. Возможны варианты: Robot, Automatic");
                        break;
                }
                break;
            case "Automatic":
                switch (upgrade) {
                    case "Manual":
                        car.getTransmission().setType(upgrade);
                        break;
                    case "Robot":
                        car.getTransmission().setType(upgrade);
                        break;
                    default:
                        System.out.println("Данная машина уже оснащена автоматической коробкой передач. Возможны варианты: Robot, Manual");
                        break;
                }
                break;
        }

    }

    public void priceWQuantity(){

    }
}
