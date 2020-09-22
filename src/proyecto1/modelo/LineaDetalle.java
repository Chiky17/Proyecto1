package proyecto1.modelo;

/**
 *
 * @author USER
 */
public class LineaDetalle
{
    public LineaDetalle(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    
    public Producto getProducto()
    {
        return producto;
    }

    public int getCantidad()
    {
        return cantidad;
    }
   
    
    
    private final Producto producto;
    private final int cantidad;
}
