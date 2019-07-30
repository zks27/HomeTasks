package lesson5;

import java.util.Objects;

public class Chair extends External implements CurrencyConvertion, PriceWQuantity {
    public String producer;
    public String model;
    public int price;

    Chair() {

    }

    Chair(String materials, int quantity, String producer, String model, int price) {
        super(materials, quantity);
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    Chair(int quantity, String producer, String model, int price) {
        this.quantity = quantity;
        this.producer = producer;
        this.model = model;
        this.price = price;
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
    public String getMaterials() {
        return super.getMaterials();
    }

    @Override
    public void setMaterials(String materials) {
        super.setMaterials(materials);
    }

    @Override
    public int getQuantity() {
        return super.getQuantity();
    }

    @Override
    public void setQuantity(int quantity) {
        super.setQuantity(quantity);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Chair chair = (Chair) o;
        return price == chair.price &&
                Objects.equals(producer, chair.producer) &&
                Objects.equals(model, chair.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer, model, price);
    }

    @Override
    public String toString() {
        return "Chair{" + "quantity='" + quantity + '\'' +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена кресла = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена кресла = " + (double)price*0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена кресла = " + price*63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation (){
        System.out.println("Цена кресла в долларах = " + price + " USD");
        System.out.println("Цена кресла в евро = " + (double)price*0.9 + " EUR");
        System.out.println("Цена кресла в рублях = " + price*63 + " RUB");
    }

    @Override
    public void priceWQuantity() {
        System.out.println("Цена кресел для одной машины с учетом количества - " + price*quantity);
    }
}
