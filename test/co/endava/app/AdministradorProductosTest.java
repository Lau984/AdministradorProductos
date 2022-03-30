package co.endava.app;

import co.endava.datos.Comida;
import co.endava.datos.Producto;//ctrl+add+o
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class AdministradorProductosTest {

    @Test
    public void main() {
        Double Descuento;
        Comida p3 = new Comida(101,"Café",1500, LocalDate.now().plusDays(0));
        Descuento = p3.getPrecio()*0.1;
        assertEquals(Descuento,p3.getDescuento());


    }
}