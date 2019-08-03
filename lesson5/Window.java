package lesson5;

import java.util.Objects;

public class Window extends Detail implements Adaptable{
    private int quantity;
    private String model;
    private int price;

    Window() {

    }

    Window(String material, String producer, int quantity, String model, int price) {
        super(material, producer);
        this.quantity = quantity;
        this.model = model;
        this.price = price;
    }

    Window(int quantity, String producer, String model, int price) {
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
        Window wheel = (Window) o;
        return quantity == wheel.quantity &&
                price == wheel.price &&
                Objects.equals(model, wheel.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity, model, price);
    }

    @Override
    public String toString() {
        return "Wheel{" + "producer = " + producer +
                ", quantity = " + quantity +
                ", model = " + model +
                ", price = " + price +
                '}';
    }

    public void currencyConvertation(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("Цена окна = " + price + " USD");
                break;
            case "EUR":
                System.out.println("Цена окна = " + (double) price * 0.9 + " EUR");
                break;
            case "RUB":
                System.out.println("Цена окна = " + price * 63 + " RUB");
                break;
            default:
                System.out.println("Данная валюта не поддерживается");
                break;
        }
    }

    public void currencyConvertation (){
        System.out.println("Цена окна = " + price + " USD");
        System.out.println("Цена окна = " + (double)price*0.9 + " EUR");
        System.out.println("Цена окна = " + price*63 + " RUB");
    }

    public void priceWQuantity() {
        System.out.println("Цена окон для одной машины с учетом количества - " + price*quantity);
    }

    @Override
    public void increaseQuantity(int count) {
        quantity = quantity + count;
        if (quantity < 7 && quantity > 2) {
            System.out.println("Количество окон увеличено на " + count);
        } else {
            System.out.println("Увеличение количества окон на " + count + " невозможно");
            quantity = quantity - count;
        }
        System.out.print("Текущее количество окон - ");

    }


    @Override
    public void decreaseQuantity(int count) {
        quantity = quantity - count;
        if (quantity < 7 && quantity > 2) {
            System.out.println("Количество окон уменьшено на " + count);
        } else {
            System.out.println("Уменьшение количества окон на " + count + " невозможно");
            quantity = quantity + count;
        }
        System.out.print("Текущее количество окон - ");
    }
}
