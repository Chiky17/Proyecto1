package proyecto1.modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
 */
@XmlType(name = "linea", propOrder =
{
    "producto", "cantidad"
})
public class LineaDetalle implements Serializable
{

    public LineaDetalle(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    private LineaDetalle()
    {
        
    }


    //Get's
    public Producto getProducto()
    {
        return producto;
    }

    public int getCantidad()
    {
        return cantidad;
    }

    //Set's
    @XmlElement(name = "producto")
    public void setProducto(Producto producto)
    {
        this.producto = producto;
    }

    @XmlElement(name = "cantidad_detalle")
    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    private Producto producto;
    private int cantidad;
}
