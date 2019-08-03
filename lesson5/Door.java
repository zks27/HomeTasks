package lesson5;

import java.util.Objects;

public class Door extends Detail implements Adaptable {
    private int quantity;
    private String model;
    private int price;

    Door() {

    }

    Door(String material, String producer, int quantity, String model, int price) {
        super(material, producer);
        this.quantity = quantity;
        this.model = model;
        this.price = price;
    }

    Door(int quantity, String producer, String model, int price) {
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
        Door door = (Door) o;
        return quantity == door.quantity &&
                price == door.price &&
                Objects.equals(model, door.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, model, price);
    }

    @Override
    public String toString() {
        return "Door{" + "producer = " + producer +
                ", quantity = " + quantity +
                ", model = " + model +
                ", price = " + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена двери = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена двери = " + (double) price * 0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена двери = " + price * 63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation() {
        System.out.println("Цена двери в долларах = " + price + " USD");
        System.out.println("Цена двери в евро = " + (double) price * 0.9 + " EUR");
        System.out.println("Цена двери в рублях = " + price * 63 + " RUB");
    }

    public void priceWQuantity() {
        System.out.println("Цена дверей для одной машины с учетом количества - " + price * quantity);
    }

    @Override
    public void increaseQuantity(int count) {
        quantity = quantity + count;
        if (quantity < 5 && quantity > 0) {
            System.out.println("Количество дверей увеличено на " + count);
        } else {
            System.out.println("Увеличение количества дверей на " + count + " невозможно");
            quantity = quantity - count;
        }
        System.out.print("Текущее количество дверей - ");

    }


    @Override
    public void decreaseQuantity(int count) {
        quantity = quantity - count;
        if (quantity < 5 && quantity > 0) {
            System.out.println("Количество дверй уменьшено на " + count);
        } else {
            System.out.println("Уменьшение количества дверей на " + count + " невозможно");
            quantity = quantity + count;
        }
        System.out.print("Текущее количество дверей - ");
    }


}
