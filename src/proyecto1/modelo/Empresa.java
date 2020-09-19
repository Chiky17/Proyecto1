package proyecto1.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class Empresa
{
    public Empresa()
    {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        facturas = new ArrayList<>();

        soporte = new PropertyChangeSupport(this);
    }

    public void añadirObs(PropertyChangeListener pcl)
    {
        soporte.addPropertyChangeListener(pcl);
    }

    public void eliminarObs(PropertyChangeListener pcl)
    {
        soporte.removePropertyChangeListener(pcl);
    }

    public void agregarCliente(Cliente c)
    {
        clientes.add(c);
        soporte.firePropertyChange("clientes", this.clientes, clientes);
    }

    public void agregarProducto(Producto p)
    {
        soporte.firePropertyChange("productos", null, p);
        productos.add(p);
        
        
    }

    public void agregarFactura(Factura f)
    {
        facturas.add(f);
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        soporte.firePropertyChange("nombre", this.nombre, "hola");
        this.nombre = "hola";
    }

    private final List<Producto> productos;
    private final List<Cliente> clientes;
    private final List<Factura> facturas;

    private final PropertyChangeSupport soporte;

    private String nombre;
}
