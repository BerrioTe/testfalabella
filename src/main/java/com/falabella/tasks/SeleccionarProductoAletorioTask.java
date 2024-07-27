package com.falabella.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import static com.falabella.iterations.SeleccionAleatoriaIteration.random;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProductoAletorioTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                random()
        );
        WebElementFacade producto = actor.recall("producto");
    }

    public static SeleccionarProductoAletorioTask seleccionarProductoAletorioTaskProduct(){
        return instrumented(SeleccionarProductoAletorioTask.class);
    }
}
