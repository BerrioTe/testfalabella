package com.falabella.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import java.util.ArrayList;
import java.util.Map;
import static com.falabella.InicioUI.DetallelProductoUI.*;
import static com.falabella.utils.CallData.extractTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AdicionarCantidadTask implements Task {

    private final int fila;
    ArrayList<Map<String, String>> datos = extractTo();
    public AdicionarCantidadTask(int fila) {
        this.fila = fila;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int  i= 1;
        int cantidadFinal = Integer.parseInt(datos.get(fila).get("cantidad"))-1;
        do {
        actor.attemptsTo(
                Click.on(BTN_ADICIONARUNIDAD)
        );
            i++;
        } while (i <= cantidadFinal);
    }
    public static AdicionarCantidadTask adicionarCantidadTask(int fila){
        return instrumented(AdicionarCantidadTask.class,fila);
    }
}
