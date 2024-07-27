package com.falabella.iterations;

import com.falabella.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.List;
import java.util.Random;

import static com.falabella.InicioUI.ListaProductosUI.LIST_NOMBREPRODUCTOS;
import static com.falabella.InicioUI.ListaProductosUI.LIST_PRODUCTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionAleatoriaIteration implements Interaction {
    private final int fila;

    public SeleccionAleatoriaIteration(int fila) {
        this.fila = fila;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LIST_PRODUCTOS.resolveAllFor(actor);
        List<WebElementFacade> listNombreProductos = LIST_NOMBREPRODUCTOS.resolveAllFor(actor);
        int index= (new Random()).nextInt(listProducts.size());
        WebElementFacade producto = listProducts.get(index);
        WebElementFacade nombreProducto = listNombreProductos.get(index);
        EscrituraExcel.escrituraExcel(
                "src/main/resources/Data/search.xlsx",
                nombreProducto.getText(),fila+1,2);
        producto.click();

           }
    
    public static SeleccionAleatoriaIteration random(int fila){
        return instrumented(SeleccionAleatoriaIteration.class, fila);
    }
}
