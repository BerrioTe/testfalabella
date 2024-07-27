package com.falabella.InicioUI;

import net.serenitybdd.screenplay.targets.Target;

public class ListaProductosUI {
    public static Target LIST_PRODUCTOS=Target.the("listado de productos")
            .locatedBy("//div[@class='jsx-1068418086 search-results-4-grid grid-pod']");
    public static Target LIST_NOMBREPRODUCTOS=Target.the("listado de nombre de productos")
            .locatedBy("//b[contains(@class,'jsx-1045750598 copy2 primary  jsx-3451706699 normal   l')]");

}
