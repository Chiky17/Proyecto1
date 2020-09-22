package proyecto1.modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USER
 */
@XmlType(name = "linea_detalle", propOrder = {"producto", "cantidad"})
public class LineaDetalle implements Serializable
{

    public LineaDetalle(Producto producto, int cantidad)
    {
        this.producto = producto;
        this.cantidad = cantidad;
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
    @XmlElement(name = "productos")
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

   @XmlElement(name = "cantidad")
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    private Producto producto;
    private int cantidad;
}
