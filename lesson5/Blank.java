package lesson5;

public abstract class Blank {
    public String material;

    Blank (){

    }

    Blank (String material){
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    abstract void currencyConvertation ();
    abstract void priceWQuantity();





}
