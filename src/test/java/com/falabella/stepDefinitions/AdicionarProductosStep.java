package com.falabella.stepDefinitions;

import com.falabella.tasks.BuscarTask;
import com.falabella.tasks.OpenFalabellaTask;
import io.cucumber.java.es.*;
import net.serenitybdd.screenplay.actions.Click;

import static com.falabella.InicioUI.DetallelProductoUI.BTN_IRCARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdicionarProductosStep {
    @Dado("que el usuario esta en la pagina de falabella")
    public void queElUsuarioEstaEnLaPaginaDeFalabella() {
        theActorCalled("User").wasAbleTo(
                OpenFalabellaTask.openBrowser());
    }

    @Cuando("agrega productos al carrito")
    public void agregaProductosAlCarrito() {
        theActorInTheSpotlight().attemptsTo(
                BuscarTask.buscarTask(),
                Click.on(BTN_IRCARRITO)

        );
    }

    @Entonces("valida que los productos sean los seleccionados")
    public void validaQueLosProductosSeanLosSeleccionados() {

    }

}
