/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.control;

import java.beans.PropertyChangeListener;
import java.util.List;
import proyecto1.modelo.Cliente;
import proyecto1.modelo.Empresa;
import proyecto1.modelo.Factura;
import proyecto1.modelo.LineaDetalle;
import proyecto1.modelo.Producto;

/**
 *
 * @author USER
 */
public class ControlAplicacion
{
    public ControlAplicacion(Empresa modelo)
    {
        this.modelo = modelo;
    }


    public ControlAplicacion()
    {
        modelo = new Empresa();
    }

    public void crearCliente(String nombre, String id, String correo)
    {
        Cliente c = new Cliente(nombre, id, correo);
        modelo.agregarCliente(c);
    }

    public void crearProducto(String descripcion, double precio, int unidades, String codigo)
    {
        Producto p = new Producto(descripcion, precio, unidades, codigo);
        modelo.agregarProducto(p);
    }

    public void crearFactura(List<LineaDetalle> productos, Cliente c)
    {
        Factura f = new Factura(productos, c);
        modelo.agregarFactura(f);
    }

    public Empresa getModelo()
    {
        return modelo;
    }

    public void setNombreEmpresa(String nombre)
    {
        modelo.setNombre(nombre);
    }


    public void setNombreComercial(String nombreComercial)
    {
        modelo.setNombreComercial(nombreComercial);
    }


    public void setTipoId(int tipoId)
    {
        modelo.setTipoId(tipoId);
    }


    public void setNumeroId(int numeroId)
    {
        modelo.setNumeroId(numeroId);
    }


    public void setUbicacion(String ubicacion)
    {
        modelo.setUbicacion(ubicacion);
    }


    public void setTelefono(int telefono)
    {
        modelo.setTelefono(telefono);
    }


    public void setFax(String fax)
    {
        modelo.setFax(fax);
    }

    public void setCorreo(String correo)
    {
        modelo.setCorreo(correo);
    }

    public void eliminarObs(PropertyChangeListener obs)
    {
        modelo.eliminarObs(obs);
    }

    public void registarObs(PropertyChangeListener obs)
    {
        modelo.añadirObs(obs);
    }

    public Cliente buscaCliente(String id)
    {
        return modelo.buscaCliente(id);
    }

    public Producto buscaProducto(String codigo)
    {
        return modelo.buscaProducto(codigo);
    }

    public Factura buscaFactura(int codigo)
    {
        return modelo.buscaFacura(codigo);
    }

    //XML
    public void guardarModelo(String salida)
    {
        modelo.guardarEmpresa(salida);
    }

    public List<Cliente> getClientes()
    {
        return modelo.getClientes();
    }

    public List<Producto> getProductos()
    {
        return modelo.getProductos();
    }

    public List<Factura> getFacturas()
    {
        return modelo.getFacturas();
    }

    public String getNombreComercial()
    {
        return modelo.getNombreComercial();
    }

    public int getTipoId()
    {
        return modelo.getTipoId();
    }

    public int getNumeroId()
    {
        return modelo.getNumeroId();
    }

    public String getUbicacion()
    {
        return modelo.getUbicacion();
    }

    public int getTelefono()
    {
        return modelo.getTelefono();
    }

    public String getFax()
    {
        return modelo.getFax();
    }

    public String getCorreo()
    {
        return modelo.getCorreo();
    }

    public String getNombre()
    {
        return modelo.getNombre();
    }

    private final Empresa modelo;
}
