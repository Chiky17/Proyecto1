package proyecto1.modelo;

/**
 *
 * @author USER
 */
public class Producto
{
    public Producto(String descripcion, int precio, boolean disponible)
    {
        this.descripcion = descripcion;
        this.precio = precio;
        this.disponible = disponible;
    }
    
    
    public double obtenerPrecio()
    {
        return precio;
    }
    
    private String descripcion;
    private int precio;
    private boolean disponible;
}
