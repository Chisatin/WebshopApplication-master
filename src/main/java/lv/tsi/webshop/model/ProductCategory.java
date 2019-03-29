package lv.tsi.webshop.model;

import java.lang.String;

public enum ProductCategory {

    COMPUTERS("COMPUTERS"),
    SMARTPHONES("Smarthpones"),
    SMART_HOME_DEVICES("SMART_HOME_DEVICES");

    private  final String name;

    ProductCategory(String name)
    {
        this.name = name;
    }
}
