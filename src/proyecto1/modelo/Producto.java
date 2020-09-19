package proyecto1.modelo;

/**
 *
 * @author USER
 */
public class Producto
{
    public Producto(String descripcion, double precio, int unidades, String codigo, boolean disponible)
    {
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidades = unidades;
        this.codigo = codigo;
        this.disponible = disponible;
    }

    public Producto(String descripcion, double precio, int unidades, String codigo)
    {
        this(descripcion, precio, unidades, codigo,true);
    }
    
    public String getCodigo()
    {
        return codigo;
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
    
    public void setUnidades(int unidades)
    {
        this.unidades = unidades;
    }
    private String descripcion;
    private double precio;
    private int unidades;
    private String codigo;
    private boolean disponible;
    
}
