package lesson5;

import java.util.Objects;

public class Engine extends Detail implements Upgradable {
    private String type;
    private String model;
    private int price;

    Engine() {

    }

    Engine(String material, String producer, String type, String model, int price) {
        super(material, producer);
        this.type = type;
        this.model = model;
        this.price = price;
    }

    Engine(String type, String producer, String model, int price) {
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

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(int price) {
        this.price = price;
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
        Engine engine = (Engine) o;
        return price == engine.price &&
                Objects.equals(type, engine.type) &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, model, price);
    }

    @Override
    public String toString() {
        return "Engine{" + "producer = " + producer +
                ", type = " + type +
                ", model = " + model +
                ", price = " + price +
                '}';
    }


    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена двигателя = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена двигателя = " + (double) price * 0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена двигателя = " + price * 63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation() {
        System.out.println("Цена двигателя в долларах = " + price + " USD");
        System.out.println("Цена двигателя в евро = " + (double) price * 0.9 + " EUR");
        System.out.println("Цена двигателя в рублях = " + price * 63 + " RUB");
    }

    @Override
    public void upgrade(Car car, String upgrade) {

        switch (car.getEngine().getType()) {
            case "Diesel":
                switch (upgrade) {
                    case "Turbo Diesel":
                        car.getEngine().setType(upgrade);
                        break;
                    case "Twinturbo Diesel":
                        car.getEngine().setType(upgrade);
                        break;
                    default:
                        System.out.println("Данный тип улучшения недоступен. Возможно варианты: Turbo Diesel, Twinturbo Diesel");
                        break;
                }
                break;
            case "Gasoline":
                switch (upgrade) {
                    case "Turbo Gasoline":
                        car.getEngine().setType(upgrade);
                        break;
                    case "Rotor Gasoline":
                        car.getEngine().setType(upgrade);
                        break;
                    default:
                        System.out.println("Данный тип улучшения недоступен. Возможны варианты: Turbo Gasoline, Rotor Gasoline");
                        break;
                }
                break;
            case "Electric":
                switch (upgrade) {
                    case "Hybrid":
                        car.getEngine().setType(upgrade);
                        break;
                    case "Сhipped":
                        car.getEngine().setType(upgrade);
                        break;
                    default:
                        System.out.println("Данный тип улучшения недоступен. Возможны варианты: Hybrid, Сhipped");
                        break;
                }
                break;
        }
    }
    public void priceWQuantity(){

    }
}


