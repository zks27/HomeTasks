package lesson5;

import java.util.Objects;

public class Detail extends Blank {
    public String producer;

    Detail(){

    };

    Detail (String material, String producer){
        super (material);
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
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
        Detail detail = (Detail) o;
        return Objects.equals(producer, detail.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), producer);
    }

    @Override
    public String toString() {
        return "Detail{" +
                "producer='" + producer + '\'' +
                '}';
    }

    void currencyConvertation (){

    }

    public void priceWQuantity(){

    }
}
