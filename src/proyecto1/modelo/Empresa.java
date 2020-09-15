package proyecto1.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author USER
 */
public class Empresa extends Observable
{
    public Empresa()
    {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        facturas = new ArrayList<>();
    }

    public void agregarCliente(Cliente c)
    {
        clientes.add(c);
        
        setChanged();
        notifyObservers();
    }

    public void agregarProducto(Producto p)
    {
        productos.add(p);
        
        setChanged();
        notifyObservers();
    }

    public void agregarFactura(Factura f)
    {
        facturas.add(f);
        
        setChanged();
        notifyObservers();
    }

    private final List<Producto> productos;
    private final List<Cliente> clientes;
    private final List<Factura> facturas;
}
