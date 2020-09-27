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

@XmlType(name = "cliente", propOrder =
{
    "nombre", "id", "correo"
})
public class Cliente implements Serializable
{


    public Cliente(String nombre, String id, String correo)
    {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    private Cliente()
    {
    }

    //Set's
    @XmlElement(name = "nombre")
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    @XmlElement(name = "id")
    public void setId(String id)
    {
        this.id = id;
    }

    @XmlElement(name = "correo")
    public void setCorreo(String correo)
    {
        this.correo = correo;
    }

    //Get's
    public String getNombre()
    {
        return nombre;
    }

    public String getId()
    {
        return id;
    }

    public String getCorreo()
    {
        return correo;
    }

    @Override
    public String toString()
    {
        return String.format("-> %s , %s , %s ", getNombre(), getId(), getCorreo());
    }

    private String nombre;
    private String id;
    private String correo;
}
