package proyecto1.modelo;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
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

    private Factura()
    {
        this(null, null);
    }

    public double subTotal()
    {
        double suma = 0.0;

        if (!lineas.isEmpty())
        {
            for (LineaDetalle ln : getLineas())
            {
                suma += ln.getProducto().getPrecio() * ln.getCantidad();
            }
        }
        return suma;
    }

    public double totalIva()
    {
        return subTotal() * 0.13;
    }

    public double total()
    {
        return subTotal() + totalIva();
    }

    @Override
    public String toString()
    {
        return String.format("Código: %d", codigo);
    }

    public Cliente getCliente()
    {
        return cliente;
    }

    @XmlElement(name = "cliente")
    public void setCliente(Cliente cliente)
    {
        this.cliente = cliente;
    }

    @XmlElement(name = "linea")
    public void setLineas(List<LineaDetalle> lineas)
    {
        this.lineas = lineas;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public List<LineaDetalle> getLineas()
    {
        return lineas;
    }

    private List<LineaDetalle> lineas;
    private Cliente cliente;

    @XmlTransient
    private static int k = 1;
    private final int codigo;

}
