/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.vista;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import proyecto1.control.ControlAplicacion;
import proyecto1.modelo.Producto;

/**
 *
 * @author USER
 */
public class VentanaAplicacion extends javax.swing.JFrame implements PropertyChangeListener
{
    public VentanaAplicacion(ControlAplicacion gestor)
    {
        this.gestor = gestor;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {
        java.awt.GridBagConstraints gridBagConstraints;

        panelEstado = new javax.swing.JPanel();
        etqEstado = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JTabbedPane();
        panelEmpresa = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        etqNomComercial = new javax.swing.JLabel();
        etqTipoId = new javax.swing.JLabel();
        etqNumId = new javax.swing.JLabel();
        etqUbicacion = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        etqFax = new javax.swing.JLabel();
        etqCorreoElec = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnEditar = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(3, 2), new java.awt.Dimension(3, 2), new java.awt.Dimension(3, 2));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        campoNombre = new javax.swing.JTextField();
        campoNomComercial = new javax.swing.JTextField();
        campoTipoId = new javax.swing.JTextField();
        campoNumId = new javax.swing.JTextField();
        campoUbicacion = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoFax = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        btnListo = new javax.swing.JButton();
        panelProducto = new javax.swing.JPanel();
        btnAñadirProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        barraMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelEstado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        etqEstado.setText("Por definir");
        panelEstado.add(etqEstado);

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelEmpresa.setToolTipText("");
        panelEmpresa.setLayout(new java.awt.GridBagLayout());

        etqNombre.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        panelEmpresa.add(etqNombre, gridBagConstraints);

        etqNomComercial.setText("Nombre comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqNomComercial, gridBagConstraints);

        etqTipoId.setText("Tipo ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqTipoId, gridBagConstraints);

        etqNumId.setText("Numero ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqNumId, gridBagConstraints);

        etqUbicacion.setText("Ubicación:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqUbicacion, gridBagConstraints);

        etqTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqTelefono, gridBagConstraints);

        etqFax.setText("Fax:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqFax, gridBagConstraints);

        etqCorreoElec.setText("Correo Electronico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(etqCorreoElec, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        panelEmpresa.add(filler1, gridBagConstraints);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                permitirModificarEmpresa(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(btnEditar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        panelEmpresa.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        panelEmpresa.add(filler3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        panelEmpresa.add(filler4, gridBagConstraints);

        campoNombre.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNombre, gridBagConstraints);

        campoNomComercial.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNomComercial, gridBagConstraints);

        campoTipoId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoTipoId, gridBagConstraints);

        campoNumId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoNumId, gridBagConstraints);

        campoUbicacion.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoUbicacion, gridBagConstraints);

        campoTelefono.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoTelefono, gridBagConstraints);

        campoFax.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoFax, gridBagConstraints);

        campoCorreo.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        panelEmpresa.add(campoCorreo, gridBagConstraints);

        btnListo.setText("Listo");
        btnListo.setEnabled(false);
        btnListo.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aplicaModificaEmpresa(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(3, 3, 3, 3);
        panelEmpresa.add(btnListo, gridBagConstraints);

        panelPrincipal.addTab("Empresa", panelEmpresa);

        panelProducto.setToolTipText("");

        btnAñadirProducto.setText("Añadir");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                añadirProducto(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Descripción", "Precio", "Unidades"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnAñadirProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirProducto)
                .addContainerGap())
        );

        panelPrincipal.addTab("Producto", panelProducto);
        panelProducto.getAccessibleContext().setAccessibleName("");

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        jMenu3.setText("File");
        barraMenu.add(jMenu3);

        jMenu4.setText("Edit");
        barraMenu.add(jMenu4);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aplicaModificaEmpresa(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aplicaModificaEmpresa
    {//GEN-HEADEREND:event_aplicaModificaEmpresa
        if (modificarEmpresa())
        {
            editarCampos(false);
            btnEditar.setEnabled(true);
            btnListo.setEnabled(false);

            panelPrincipal.setEnabledAt(1, true);
        }
    }//GEN-LAST:event_aplicaModificaEmpresa

    private void permitirModificarEmpresa(java.awt.event.ActionEvent evt)//GEN-FIRST:event_permitirModificarEmpresa
    {//GEN-HEADEREND:event_permitirModificarEmpresa
        editarCampos(true);
        btnEditar.setEnabled(false);
        btnListo.setEnabled(true);

        panelPrincipal.setEnabledAt(1, false);
    }//GEN-LAST:event_permitirModificarEmpresa

    private boolean modificarEmpresa()//agregar para cada atributo
    {
        String nombre = campoNombre.getText();

        if (compruebaStringEmpresa(nombre, "nombre"))
        {
            gestor.setNombreEmpresa(nombre);
            return true;
        }

        return false;
    }

    private boolean compruebaStringEmpresa(String atributo, String campo)
    {
        if (atributo.isEmpty())
        {
            mostrarError(String.format("El campo %s no debe de estar vacio", campo));
            return false;
        } else
        {
            return true;
        }
    }

    private void añadirProducto(java.awt.event.ActionEvent evt)//GEN-FIRST:event_añadirProducto
    {//GEN-HEADEREND:event_añadirProducto
        new VentanaProducto(gestor).init();
    }//GEN-LAST:event_añadirProducto

    public void editarCampos(boolean estado)
    {
        campoCorreo.setEditable(estado);
        campoFax.setEditable(estado);
        campoNomComercial.setEditable(estado);
        campoNombre.setEditable(estado);
        campoNumId.setEditable(estado);
        campoTelefono.setEditable(estado);
        campoTipoId.setEditable(estado);
        campoUbicacion.setEditable(estado);
    }

    public void init()
    {
        gestor.registarObs(this);
        mostarMensaje("¡Bienvenido!");
        setVisible(true);
    }

    private void mostarMensaje(String msj)
    {
        etqEstado.setForeground(Color.BLACK);
        etqEstado.setText(msj);
    }

    private void mostrarError(String error)
    {
        etqEstado.setForeground(Color.RED);
        etqEstado.setText(String.format("\u26A0 %s", error));
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt)
    {
        String cambio = evt.getPropertyName();

        if ("nombre".equals(cambio))
        {
            campoNombre.setText((String) evt.getNewValue());
        }

        if ("productos".equals(cambio))
        {
            mostrarProducto((Producto) evt.getNewValue());
        }
    }

    public void mostrarProducto(Producto p)
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaProductos.getModel();
        String[] fila =
        {
            p.getDescripcion(), Double.toString(p.getPrecio()), Integer.toString(p.getUnidades())
        };
        tabla.addRow(fila);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListo;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoFax;
    private javax.swing.JTextField campoNomComercial;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumId;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JTextField campoTipoId;
    private javax.swing.JTextField campoUbicacion;
    private javax.swing.JLabel etqCorreoElec;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFax;
    private javax.swing.JLabel etqNomComercial;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNumId;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTipoId;
    private javax.swing.JLabel etqUbicacion;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelEmpresa;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables

    private final ControlAplicacion gestor;
}
