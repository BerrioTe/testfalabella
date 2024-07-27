package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.Map;

import static com.falabella.InicioUI.InicioFalabellaUI.TXT_BUSCAR;
import static com.falabella.iterations.SeleccionAleatoriaIteration.random;
import static com.falabella.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarTask implements Task {
    ArrayList<Map<String, String>> datos = extractTo();

    @Override
    public <T extends Actor> void performAs(T actor) {
        int fila = 0;
        do {
            actor.attemptsTo(
                    WaitUntil.the(TXT_BUSCAR, WebElementStateMatchers.isVisible())
                            .forNoMoreThan(20).seconds(),
                    Enter.theValue(datos.get(fila).get("producto")).into(TXT_BUSCAR).thenHit(Keys.ENTER),
                    random(fila),
                    AdicionarCantidadTask.adicionarCantidadTask(fila),
                    DetalleProductoTask.detalleProductoTask()
            );
            fila++;
        } while (fila < 2);
    }

    public static BuscarTask buscarTask() {
        return instrumented(BuscarTask.class);
    }
}
