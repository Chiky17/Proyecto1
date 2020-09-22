package proyecto1.modelo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author USER
 */
@XmlType(name = "cliente", propOrder = {"descripcion", "precio", "unidades", "codigo","disponible"})
public class Producto implements Serializable
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
    
    private Producto(){  
    }
    
    //Gets's
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
    
    //Set's
    @XmlElement(name = "unidades")
    public void setUnidades(int unidades)
    {
        this.unidades = unidades;
    }
    
    @XmlElement(name = "descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlElement(name = "precio")
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @XmlElement(name = "codigo")
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @XmlElement(name = "disponible")
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    
    private String descripcion;
    private double precio;
    private int unidades;
    private String codigo;
    private boolean disponible;
    
}
