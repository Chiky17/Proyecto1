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
import javax.swing.table.TableModel;
import proyecto1.control.ControlAplicacion;
import proyecto1.modelo.Cliente;
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
    private void initComponents() {
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
        panelCliente = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnSeleClien = new javax.swing.JButton();
        btnSeleProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textFactCanPro = new javax.swing.JSpinner();
        textFactClient = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaFactProd = new javax.swing.JTable();
        btnCrearFactura = new javax.swing.JButton();
        textFactProd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        etqFactClien = new javax.swing.JLabel();
        etqFactProd = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

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
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(etqNombre, gridBagConstraints);

        etqNomComercial.setText("Nombre comercial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqNomComercial, gridBagConstraints);

        etqTipoId.setText("Tipo ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqTipoId, gridBagConstraints);

        etqNumId.setText("Numero ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqNumId, gridBagConstraints);

        etqUbicacion.setText("Ubicación:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqUbicacion, gridBagConstraints);

        etqTelefono.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqTelefono, gridBagConstraints);

        etqFax.setText("Fax:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqFax, gridBagConstraints);

        etqCorreoElec.setText("Correo Electronico:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(etqCorreoElec, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.2;
        panelEmpresa.add(filler1, gridBagConstraints);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permitirModificarEmpresa(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(btnEditar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(filler2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
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
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoNombre, gridBagConstraints);

        campoNomComercial.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoNomComercial, gridBagConstraints);

        campoTipoId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoTipoId, gridBagConstraints);

        campoNumId.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoNumId, gridBagConstraints);

        campoUbicacion.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoUbicacion, gridBagConstraints);

        campoTelefono.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoTelefono, gridBagConstraints);

        campoFax.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoFax, gridBagConstraints);

        campoCorreo.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        panelEmpresa.add(campoCorreo, gridBagConstraints);

        btnListo.setText("Listo");
        btnListo.setEnabled(false);
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicaModificaEmpresa(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
        panelEmpresa.add(btnListo, gridBagConstraints);

        panelPrincipal.addTab("Empresa", panelEmpresa);

        panelProducto.setToolTipText("");

        btnAñadirProducto.setText("Añadir");
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirProducto(evt);
            }
        });

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Precio", "Unidades"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        javax.swing.GroupLayout panelProductoLayout = new javax.swing.GroupLayout(panelProducto);
        panelProducto.setLayout(panelProductoLayout);
        panelProductoLayout.setHorizontalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnAñadirProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirProducto)
                .addContainerGap())
        );

        panelPrincipal.addTab("Producto", panelProducto);
        panelProducto.getAccessibleContext().setAccessibleName("");

        btnCliente.setText("Añadir");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cédula", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaCliente);

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente)
                .addGap(12, 12, 12))
        );

        panelPrincipal.addTab("Cliente", panelCliente);

        btnSeleClien.setText("Comprobar");
        btnSeleClien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleClienActionPerformed(evt);
            }
        });

        btnSeleProd.setText("Agregar");
        btnSeleProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleProdActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese cédula del cliente");

        jLabel2.setText("Ingrese el codigo del producto ");

        textFactCanPro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        textFactClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFactClientActionPerformed(evt);
            }
        });

        tablaFactProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto / Servicio", "Cantidad "
            }
        ));
        jScrollPane3.setViewportView(tablaFactProd);

        btnCrearFactura.setText("Crear");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFactura(evt);
            }
        });

        textFactProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFactProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad del producto seleccionado");

        etqFactClien.setText("...");

        etqFactProd.setText("...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFactClient)
                            .addComponent(textFactProd)
                            .addComponent(textFactCanPro, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(etqFactClien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqFactProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleProd)
                            .addComponent(btnSeleClien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnCrearFactura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFactClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleClien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqFactClien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFactProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFactCanPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnSeleProd))
                .addGap(8, 8, 8)
                .addComponent(etqFactProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearFactura)
                .addContainerGap())
        );

        panelPrincipal.addTab("Factura", jPanel1);

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

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        new VentanaCliente(gestor).init();
    }//GEN-LAST:event_btnClienteActionPerformed

    private void crearFactura(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFactura

        Cliente c = encuentraCliente();

        if (c != null)
        {
            List productos = new ArrayList<Producto>();

            TableModel modeloProductosFactura = tablaFactProd.getModel();

            int filsProductosF = modeloProductosFactura.getRowCount();

            TableModel modeloProductos = tablaProductos.getModel();
            int filsProductos = modeloProductos.getRowCount();

            if (filsProductosF > 0)
            {
                String codigoAux;
                String codigo, descripcion;
                double precio;
                int unidades;
                for (int i = 0; i < filsProductosF; i++)
                {
                    codigoAux = (String) modeloProductosFactura.getValueAt(i, 0);
                    unidades = Integer.parseInt((String) modeloProductos.getValueAt(i, 2));

                    for (int j = 0; j < filsProductos; j++)
                    {
                        codigo = (String) modeloProductos.getValueAt(j, 0);
                        if (codigo.equals(codigoAux));
                        {
                            descripcion = (String) modeloProductos.getValueAt(i, 1);
                            precio = Double.parseDouble((String) modeloProductos.getValueAt(i, 2));
                            Producto p = new Producto(descripcion, precio, unidades, codigo);

                            productos.add(p);
                        }
                    }
                }
                gestor.crearFactura(productos, c);
                mostarMensaje("Factura creada");
            } else
            {
                mostrarError("No se agregó ningun producto");
            }
        } else
        {
            mostrarError("Cliente no registrado");
        }
    }//GEN-LAST:event_crearFactura

    private void textFactProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFactProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFactProdActionPerformed

    private void textFactClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFactClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFactClientActionPerformed

    private void btnSeleClienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleClienActionPerformed

        Cliente c = encuentraCliente();
        if (c != null)
        {
            etqFactClien.setForeground(Color.blue);
            etqFactClien.setText("Cliente encontrado - " + c.getNombre());
        } else
        {
            etqFactClien.setForeground(Color.red);
            etqFactClien.setText("Cliente no encontrado (crear cliente)");
        }

    }//GEN-LAST:event_btnSeleClienActionPerformed

    private Producto comprobarProducto()
    {
        Producto p = encuentraProducto();
        int cantP = (int) textFactCanPro.getValue();
        if (p != null)
        {
            //if()
            while (p.getUnidades() - cantP < 0)
            {
                cantP--;
            }

            if (cantP > 0)
            {
                etqFactProd.setForeground(Color.blue);
                etqFactProd.setText("Producto encontrado - " + p.getDescripcion());
                while (p.getUnidades() - cantP < 0)
                {
                    cantP--;
                }
                p.setUnidades(p.getUnidades() - cantP);
                mostarProductoFactura(p, cantP);
                actualizarProducto(p);
                return p;
            } else
            {
                etqFactProd.setForeground(Color.red);
                etqFactProd.setText("No hay unidades suficientes del producto");
                return p;
            }

        } else
        {
            etqFactProd.setForeground(Color.red);
            etqFactProd.setText("Producto no encontrado (crear producto)");
            return p;
        }
    }

    private void btnSeleProdActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSeleProdActionPerformed
    {//GEN-HEADEREND:event_btnSeleProdActionPerformed

        comprobarProducto();
    }//GEN-LAST:event_btnSeleProdActionPerformed

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

    public Cliente encuentraCliente()
    {
        String cli = textFactClient.getText();
        return (gestor.buscaCliente(cli));
    }

    public Producto encuentraProducto()
    {
        String codi = textFactProd.getText();
        return gestor.buscaProducto(codi);
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

        if ("clientes".equals(cambio))
        {
            mostrarCliente((Cliente) evt.getNewValue());
        }
    }

    public void mostrarProducto(Producto p)
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaProductos.getModel();
        String[] fila
                =
                {
                    p.getCodigo(), p.getDescripcion(), Double.toString(p.getPrecio()), Integer.toString(p.getUnidades())
                };
        tabla.addRow(fila);
    }

    public void actualizarProducto(Producto p)
    {
        TableModel modeloProductos = tablaProductos.getModel();
        int filsProductos = modeloProductos.getRowCount();

        String codigo = p.getCodigo();
        String codigoAux;

        for (int i = 0; i < filsProductos; i++)
        {
            codigoAux = (String) modeloProductos.getValueAt(i, 0);

            if (codigo.equals(codigoAux));
            {
                modeloProductos.setValueAt(p.getUnidades(), i, 3);
            }

        }
    }


    public void mostrarCliente(Cliente c)
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaCliente.getModel();
        String[] fila
                =
                {
                    c.getNombre(), c.getId(), c.getCorreo()
                };
        tabla.addRow(fila);
    }

    public void mostarProductoFactura(Producto p, int cant)
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaFactProd.getModel();
        String[] fila
                =
                {
                    p.getCodigo(), p.getDescripcion(), Integer.toString(cant)
                };
        tabla.addRow(fila);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnCrearFactura;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnListo;
    private javax.swing.JButton btnSeleClien;
    private javax.swing.JButton btnSeleProd;
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
    private javax.swing.JLabel etqFactClien;
    private javax.swing.JLabel etqFactProd;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEmpresa;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaFactProd;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JSpinner textFactCanPro;
    private javax.swing.JTextField textFactClient;
    private javax.swing.JTextField textFactProd;
    // End of variables declaration//GEN-END:variables

    private final ControlAplicacion gestor;

}
