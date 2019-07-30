package lesson5;

import java.util.Objects;

public class Internal extends Details {
    String type;

    Internal (){

    }

    Internal (String material, String type){
        super(material);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        Internal internal = (Internal) o;
        return Objects.equals(type, internal.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type);
    }

    @Override
    public String toString() {
        return "Internal{" +
                "type='" + type + '\'' +
                '}';
    }

    @Override
    void currencyConvertation() {

    }
}
