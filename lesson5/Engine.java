package lesson5;

import java.util.Objects;

public class Engine extends Internal implements CurrencyConvertion {
    public String producer;
    public String model;
    public int price;

    Engine() {

    }

    Engine(String materials, String type, String producer, String model, int price) {
        super(materials, type);
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    Engine(String type, String producer, String model, int price) {
        this.type = type;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }


    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getMaterials() {
        return super.getMaterials();
    }

    @Override
    public void setMaterials(String materials) {
        super.setMaterials(materials);
    }


    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engine engine = (Engine) o;
        return price == engine.price &&
                Objects.equals(producer, engine.producer) &&
                Objects.equals(model, engine.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer, model, price);
    }

    @Override
    public String toString() {
        return "Engine{" + "type='" + type + '\'' +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена двигателя = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена двигателя = " + (double)price*0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена двигателя = " + price*63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation (){
        System.out.println("Цена двигателя в долларах = " + price + " USD");
        System.out.println("Цена двигателя в евро = " + (double)price*0.9 + " EUR");
        System.out.println("Цена двигателя в рублях = " + price*63 + " RUB");
    }
}
