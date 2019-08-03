package lesson5;

import otherTask.RandomGeneration;

import java.util.Objects;

public class Chair extends Detail implements Adaptable {
    private int quantity;
    private String model;
    private int price;

    Chair() {

    }

    Chair(String material, String producer, int quantity, String model, int price) {
        super(material, producer);
        this.quantity = quantity;
        this.model = model;
        this.price = price;
    }

    Chair(int quantity, String producer, String model, int price) {
        super.producer = producer;
        this.quantity = quantity;
        this.model = model;
        this.price = price;

    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        Chair chair = (Chair) o;
        return quantity == chair.quantity &&
                price == chair.price &&
                Objects.equals(model, chair.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, model, price);
    }

    @Override
    public String toString() {
        return "Chair{" + "producer = " + producer +
                ", quantity = " + quantity +
                ", model = " + model +
                ", price = " + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена кресла = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена кресла = " + (double) price * 0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена кресла = " + price * 63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation() {
        System.out.println("Цена кресла в долларах = " + price + " USD");
        System.out.println("Цена кресла в евро = " + (double) price * 0.9 + " EUR");
        System.out.println("Цена кресла в рублях = " + price * 63 + " RUB");
    }

    public void priceWQuantity() {
        System.out.println("Цена кресел для одной машины с учетом количества - " + price * quantity);
    }

    @Override
    public void increaseQuantity(int count) {
        quantity = quantity + count;
        if (quantity < 6 && quantity > 0) {
            System.out.println("Количество кресел увеличено на " + count);
        } else {
            System.out.println("Увеличение количества кресел на " + count + " невозможно");
            quantity = quantity - count;
        }
        System.out.print("Текущее количество кресел - ");

    }


    @Override
    public void decreaseQuantity(int count) {
        quantity = quantity - count;
        if (quantity < 6 && quantity > 0) {
            System.out.println("Количество кресел уменьшено на " + count);
        } else {
            System.out.println("Уменьшение количества кресел на " + count + " невозможно");
            quantity = quantity + count;
        }
        System.out.print("Текущее количество кресел - ");
    }
}
