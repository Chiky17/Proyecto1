package proyecto1.modelo;

import java.util.List;

/**
 *
 * @author USER
 */
public class Factura
{
    
    public void agregarProducto(Producto p)
    {
        throw new UnsupportedOperationException();
    }
    
    public double total()
    {
        double suma = 0.0;
        
        for(Producto p : productos)
        {
            suma += p.obtenerPrecio();
        }
        
        return suma;
    }
    
    private List<Producto> productos;
    private Cliente cliente;
    
}
