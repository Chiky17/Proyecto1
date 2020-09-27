package proyecto1.modelo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
 */

@XmlRootElement(name = "Empresa")
public class Empresa implements Serializable
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

        soporte.firePropertyChange("Actualizar", null, null);
    }

    public void eliminarObs(PropertyChangeListener pcl)
    {
        soporte.removePropertyChangeListener(pcl);
    }

    public void agregarCliente(Cliente c)
    {
        soporte.firePropertyChange("clientes", null, c);
        getClientes().add(c);
    }

    public void agregarProducto(Producto p)
    {
        soporte.firePropertyChange("productos", null, p);
        getProductos().add(p);
    }

    public void agregarFactura(Factura f)
    {
        soporte.firePropertyChange("facturas", null, f);
        getFacturas().add(f);
        
        Pdf.crearPdfFactura(f, this);
        // crear facutura?
    }

    public Cliente buscaCliente(String id)
    {
        if (getClientes().isEmpty())
        {
            return null;
        }
        for (Cliente c : getClientes())
        {
            if (c.getId().equals(id))
            {
                return c;
            }
        }
        return null;
    }

    public Producto buscaProducto(String codigo)
    {
        if (getProductos().isEmpty())
        {
            return null;
        }
        for (Producto p : getProductos())
        {
            if (p.getCodigo().equals(codigo))
            {
                return p;
            }
        }
        return null;
    }

    public Factura buscaFacura(int codigo)
    {
        if (getFacturas().isEmpty())
        {
            return null;
        }
        for (Factura f : getFacturas())
        {
            if (f.getCodigo() == codigo)
            {
                return f;
            }
        }
        return null;
    }

    public List<Producto> getProductos()
    {
        return productos;
    }

    //recuperar
    public static Empresa cargarEmpresa(String entrada) throws FileNotFoundException
    {
        Empresa e;
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(Empresa.class);
            Unmarshaller mrs = ctx.createUnmarshaller();
            e = (Empresa) mrs.unmarshal(new FileInputStream(entrada));

        } catch (JAXBException ex)
        {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
            e = new Empresa();
        }

        return e;

    }

    //guardar
    public void guardarEmpresa(String salida)
    {
        try
        {
            JAXBContext ctx = JAXBContext.newInstance(Empresa.class);
            Marshaller mrs = ctx.createMarshaller();
            mrs.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            mrs.marshal(this, new FileOutputStream(salida));
            //mrs.marshal(this, System.out);

            //System.out.println();
        } catch (FileNotFoundException | JAXBException ex)
        {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    public List<Cliente> getClientes()
    {
        return clientes;
    }

    public List<Factura> getFacturas()
    {
        return facturas;
    }

    public String getNombreComercial()
    {
        return nombreComercial;
    }

    public int getTipoId()
    {
        return tipoId;
    }

    public int getNumeroId()
    {
        return numeroId;
    }

    public String getUbicacion()
    {
        return ubicacion;
    }

    public int getTelefono()
    {
        return telefono;
    }

    public String getFax()
    {
        return fax;
    }

    public String getCorreo()
    {
        return correo;
    }

    public String getNombre()
    {
        return nombre;
    }

    @XmlElement(name = "nombre")
    public void setNombre(String nombre)
    {
        soporte.firePropertyChange("nombre", this.nombre, nombre);
        this.nombre = nombre;
    }

    @XmlElement(name = "nombre_comercial")
    public void setNombreComercial(String nombreComercial)
    {
        soporte.firePropertyChange("nombreComercial", this.nombreComercial, nombreComercial);
        this.nombreComercial = nombreComercial;
    }

    @XmlElement(name = "tipo_id")
    public void setTipoId(int tipoId)
    {
        soporte.firePropertyChange("tipoId", this.tipoId, tipoId);
        this.tipoId = tipoId;
    }

    @XmlElement(name = "número_id")
    public void setNumeroId(int numeroId)
    {
        soporte.firePropertyChange("numeroId", this.numeroId, numeroId);
        this.numeroId = numeroId;
    }

    @XmlElement(name = "ubicación")
    public void setUbicacion(String ubicacion)
    {
        soporte.firePropertyChange("ubicacion", this.ubicacion, ubicacion);
        this.ubicacion = ubicacion;
    }

    @XmlElement(name = "teléfono")
    public void setTelefono(int telefono)
    {
        soporte.firePropertyChange("telefono", this.telefono, telefono);
        this.telefono = telefono;
    }

    @XmlElement(name = "fax")
    public void setFax(String fax)
    {
        soporte.firePropertyChange("fax", this.fax, fax);
        this.fax = fax;
    }

    @XmlElement(name = "correo_electronico")
    public void setCorreo(String correo)
    {
        soporte.firePropertyChange("correo", this.correo, correo);
        this.correo = correo;
    }


    @XmlElement(name = "productos")
    private List<Producto> productos;

    @XmlElement(name = "clientes")
    private List<Cliente> clientes;

    @XmlElement(name = "facturas")
    private List<Factura> facturas;

    @XmlTransient
    private final PropertyChangeSupport soporte;

    private String nombre;
    private String nombreComercial;
    private int tipoId;
    private int numeroId;
    private String ubicacion;
    private int telefono;
    private String fax;
    private String correo;
}
