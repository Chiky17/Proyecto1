package proyecto1.modelo;

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
    }

    public void agregarCliente(Cliente c)
    {
        clientes.add(c);
    }

    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }

    public void agregarFactura(Factura f)
    {
        facturas.add(f);
    }

    private final List<Producto> productos;
    private final List<Cliente> clientes;
    private final List<Factura> facturas;
}
