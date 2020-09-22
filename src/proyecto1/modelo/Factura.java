package proyecto1.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author USER
 */
public class Factura
{
    public Factura(List<LineaDetalle> lineas, Cliente cliente)
    {
        this.lineas = lineas;
        this.cliente = cliente;
        this.codigo = k++;
    }

    public double total()
    {
        double suma = 0.0;

        for (LineaDetalle ln : lineas)
        {
            suma += ln.getProducto().getPrecio() * ln.getCantidad();
        }

        return suma;
    }

     @Override
    public String toString()
    {
        return String.format("%d%n", codigo);
    }
    
    private final List<LineaDetalle> lineas;
    private final Cliente cliente;
    private static int k = 1;
    private final int codigo;
}
