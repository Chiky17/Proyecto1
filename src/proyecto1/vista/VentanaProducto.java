/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.vista;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import proyecto1.control.ControlAplicacion;

/**
 *
 * @author USER
 */
public class VentanaProducto extends javax.swing.JFrame implements PropertyChangeListener
{
    public VentanaProducto(ControlAplicacion gestor)
    {
        super("Añadir Cliente");
        this.gestor = gestor;
        initComponents();
    }
    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEstado = new javax.swing.JPanel();
        etqEstado = new javax.swing.JLabel();
        panelPricipal = new javax.swing.JPanel();
        etqDescripcion = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        etqPrecio = new javax.swing.JLabel();
        etqUnidadesProducto = new javax.swing.JLabel();
        btnCrearCliente = new javax.swing.JButton();
        spinnerPrecio = new javax.swing.JSpinner();
        spinnerUnidadesProducto = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Producto");
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                cerrar(evt);
            }
        });

        panelEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));
        panelEstado.add(etqEstado);

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelPricipal.setLayout(new java.awt.GridBagLayout());

        etqDescripcion.setText("Descripcion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(etqDescripcion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(campoDescripcion, gridBagConstraints);

        etqPrecio.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(etqPrecio, gridBagConstraints);

        etqUnidadesProducto.setText("Unidades");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(etqUnidadesProducto, gridBagConstraints);

        btnCrearCliente.setText("Listo");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                crearProducto(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(btnCrearCliente, gridBagConstraints);

        spinnerPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1.0E41d, 0.5d));
        spinnerPrecio.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 4, 3, 4);
        panelPricipal.add(spinnerPrecio, gridBagConstraints);

        spinnerUnidadesProducto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2147483647, 1));
        spinnerUnidadesProducto.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(3, 4, 3, 4);
        panelPricipal.add(spinnerUnidadesProducto, gridBagConstraints);

        getContentPane().add(panelPricipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearProducto(java.awt.event.ActionEvent evt)//GEN-FIRST:event_crearProducto
    {//GEN-HEADEREND:event_crearProducto
        String descripcion = campoDescripcion.getText();
        int unidades = (int) spinnerUnidadesProducto.getValue();
        double precio = (Double) spinnerPrecio.getValue();

       if (compruebaDescripcion(descripcion) && compruebaPrecio(precio) && compruebaUnidades(unidades))
       {
            gestor.crearProducto(descripcion, precio, unidades);
            dispose();
        }
    }//GEN-LAST:event_crearProducto

    private void cerrar(java.awt.event.WindowEvent evt)//GEN-FIRST:event_cerrar
    {//GEN-HEADEREND:event_cerrar
       // gestor.relevar(this);
        dispose();
    }//GEN-LAST:event_cerrar

    private boolean compruebaDescripcion(String descripcion)
    {
        if (descripcion.isEmpty())
        {
            mostrarError("\u26A0 Debe rellenar la descripción");
            return false;
        }
        return true;
    }

    private boolean compruebaPrecio(double precio)
    {
        if (precio <= 0)
        {
            mostrarError("El precio debe ser mayor que 0");
            return false;
        }
        return true;
    }

    private boolean compruebaUnidades(int unidades)
    {
        if (unidades <= 0)
        {
            mostrarError("Las unidades deben ser mayorores que 0");
            return false;
        }
        return true;
    }

    private void mostrarError(String error)
    {
        etqEstado.setForeground(Color.RED);
        etqEstado.setText(String.format("\u26A0 %s",error));
    }

    private void mostrarMensaje(String msj)
    {
        etqEstado.setForeground(Color.BLACK);
        etqEstado.setText(msj);
    }
    
   public void init()
   {
       mostrarMensaje("¡Bienvenido!");
       setVisible(true);
   }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqUnidadesProducto;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelPricipal;
    private javax.swing.JSpinner spinnerPrecio;
    private javax.swing.JSpinner spinnerUnidadesProducto;
    // End of variables declaration//GEN-END:variables

    private ControlAplicacion gestor;
}
