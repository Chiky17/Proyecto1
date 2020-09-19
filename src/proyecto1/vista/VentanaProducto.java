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
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        etqCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Añadir Producto");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(450, 350));
        setResizable(false);
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

        panelPricipal.setPreferredSize(new java.awt.Dimension(615, 350));
        panelPricipal.setLayout(new java.awt.GridBagLayout());

        etqDescripcion.setText("Descripción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
        panelPricipal.add(etqDescripcion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
        panelPricipal.add(campoDescripcion, gridBagConstraints);

        etqPrecio.setText("Precio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
        panelPricipal.add(etqPrecio, gridBagConstraints);

        etqUnidadesProducto.setText("Unidades");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
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
        gridBagConstraints.gridy = 8;
        gridBagConstraints.insets = new java.awt.Insets(4, 4, 4, 4);
        panelPricipal.add(btnCrearCliente, gridBagConstraints);

        spinnerPrecio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 1.0E41d, 0.5d));
        spinnerPrecio.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(22, 12, 22, 12);
        panelPricipal.add(spinnerPrecio, gridBagConstraints);

        spinnerUnidadesProducto.setModel(new javax.swing.SpinnerNumberModel(0, 0, 2147483647, 1));
        spinnerUnidadesProducto.setToolTipText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(22, 12, 22, 12);
        panelPricipal.add(spinnerUnidadesProducto, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 46;
        panelPricipal.add(jSeparator1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 44;
        gridBagConstraints.weighty = 0.1;
        panelPricipal.add(jSeparator2, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("Ingrese lo solicitado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelPricipal.add(jLabel1, gridBagConstraints);

        etqCodigo.setText("Código");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
        panelPricipal.add(etqCodigo, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 23, 12);
        panelPricipal.add(campoCodigo, gridBagConstraints);

        getContentPane().add(panelPricipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearProducto(java.awt.event.ActionEvent evt)//GEN-FIRST:event_crearProducto
    {//GEN-HEADEREND:event_crearProducto
        String descripcion = campoDescripcion.getText();
        String codigo = campoCodigo.getText();
        int unidades = (int) spinnerUnidadesProducto.getValue();
        double precio = (Double) spinnerPrecio.getValue();

        if (compruebaDescripcion(descripcion) && compruebaPrecio(precio) && compruebaUnidades(unidades) && compruebaCodigo(codigo))
        {
            gestor.crearProducto(descripcion, precio, unidades, codigo);
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

    private boolean compruebaCodigo(String codigo)
    {
        if (codigo.isEmpty())
        {
            mostrarError("\u26A0 Debe rellenar el codigo");
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
        etqEstado.setText(String.format("\u26A0 %s", error));
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
    private javax.swing.JTextField campoCodigo;
    private javax.swing.JTextField campoDescripcion;
    private javax.swing.JLabel etqCodigo;
    private javax.swing.JLabel etqDescripcion;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqPrecio;
    private javax.swing.JLabel etqUnidadesProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelPricipal;
    private javax.swing.JSpinner spinnerPrecio;
    private javax.swing.JSpinner spinnerUnidadesProducto;
    // End of variables declaration//GEN-END:variables

    private final ControlAplicacion gestor;
}
