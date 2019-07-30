package lesson5;

import java.util.Objects;

abstract class Details {
    String materials;

    Details () {
    }

    Details (String materials){
        this.materials = materials;
    }

    abstract String getMaterials();

    abstract void setMaterials(String materials);

    abstract void currencyConvertation ();
}
