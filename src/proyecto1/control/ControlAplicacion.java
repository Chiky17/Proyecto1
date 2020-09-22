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
    public ControlAplicacion()
    {
        modelo = new Empresa();
    }

    // que se cree y lo envie a empresa?
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

    private final Empresa modelo;
}
