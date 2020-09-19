package proyecto1.modelo;

/**
 *
 * @author USER
 */
public class Producto
{
    public Producto(String descripcion, double precio, int unidades, boolean disponible)
    {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
        this.disponible = disponible;
    }

    public Producto(String descripcion, double precio, int unidades)
    {
        this(descripcion, precio, unidades, true);
    }
    
    public double getPrecio()
    {
        return precio;
    }
    
    public String getDescripcion()
    {
        return descripcion;
    }
    
    public int getUnidades()
    {
        return unidades;
    }
    
    private String descripcion;
    private double precio;
    private int unidades;
    private boolean disponible;
    
}
