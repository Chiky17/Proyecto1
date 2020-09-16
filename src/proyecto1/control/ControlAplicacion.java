/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.control;

import java.util.List;
import java.util.Observer;
import proyecto1.modelo.Cliente;
import proyecto1.modelo.Empresa;
import proyecto1.modelo.Factura;
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

    public void crearProducto()
    {
        throw new UnsupportedOperationException();
    }

    public void crearFactura(List<Producto> productos, Cliente c)
    {
        Factura f = new Factura(productos, c);
        modelo.agregarFactura(f);
    }

    public void registarObs(Observer obs)
    {
        modelo.addObserver(obs);
    }

    public Empresa getModelo()
    {
        return modelo;
    }
    
    public void setNombreModelo(String nombre)
    {
        modelo.setNombre(nombre);
    }
    private Empresa modelo;
}
