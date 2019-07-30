package lesson5;

import javafx.scene.paint.Material;

import java.util.Objects;

public class External extends Details {
    public int quantity;

    External (){

    }

    External (String materials, int quantity){
        super (materials);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String getMaterials() {
        return materials;
    }

    @Override
    public void setMaterials(String materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        External external = (External) o;
        return quantity == external.quantity;
    }

    @Override
    void currencyConvertation() {

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantity);
    }

    @Override
    public String toString() {
        return "External{" +
                "quantity=" + quantity +
                '}';
    }
}
