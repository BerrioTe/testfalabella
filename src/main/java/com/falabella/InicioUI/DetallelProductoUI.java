package com.falabella.InicioUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallelProductoUI {

    public static Target BTN_ADICIONARUNIDAD=Target.the("listado de productos")
            .locatedBy(" //button[@class='jsx-152403661 increment btn-primary increment-desktop']");
    public static Target BTN_AGREGARCARRITO=Target.the("Campo Buscar")
            .located(By.id("add-to-cart-button"));

    public static Target BTN_IRCARRITO=Target.the("listado de productos")
            .locatedBy(" //li[@class='UserActions-module_utils-list__fSm9Q UserActions-module_basket-icon__3wDtw']");

    public static Target BTN_CERRARRESUMEN=Target.the("listado de productos")
            .locatedBy(" //button[@class='jsx-2454879041']");


}
