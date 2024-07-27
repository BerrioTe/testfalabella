package com.falabella.InicioUI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioFalabellaUI {
    public static Target TXT_BUSCAR=Target.the("Campo Buscar")
            .located(By.id("testId-SearchBar-Input"));
}
