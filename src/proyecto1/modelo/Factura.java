package proyecto1.modelo;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USER
 */

@XmlType(name = "factura", propOrder =
{
    "lineas", "cliente"
})
public class Factura implements Serializable
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
        return String.format("Código: %d", codigo);
    }

    @XmlElement(name = "cliente")
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public List<LineaDetalle> getLineas()
    {
        return lineas;
    }

    @XmlElement(name = "lineas")
    private final List<LineaDetalle> lineas;
    private Cliente cliente;
    private static int k = 1;
    private final int codigo;
}
