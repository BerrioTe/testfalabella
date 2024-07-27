package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.InicioUI.DetallelProductoUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleProductoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int fila = 0;
        actor.attemptsTo(
                Click.on(BTN_AGREGARCARRITO),
                Click.on(BTN_CERRARRESUMEN)

        );

    }
    public static DetalleProductoTask detalleProductoTask(){
        return instrumented(DetalleProductoTask.class);}
}
