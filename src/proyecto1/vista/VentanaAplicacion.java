package proyecto1.vista;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto1.control.ControlAplicacion;
import proyecto1.modelo.Cliente;
import proyecto1.modelo.Factura;
import proyecto1.modelo.LineaDetalle;
import proyecto1.modelo.Producto;

/**
 *
 * @author Cristopher Ureña D.
 * @author Calef Lopez B.
 * 
 * @version 1.0
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
        panelCliente = new javax.swing.JPanel();
        btnCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        panelFactura = new javax.swing.JPanel();
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
        panelListaFacturas = new javax.swing.JPanel();
        etqFactura = new javax.swing.JLabel();
        comboFacturas = new javax.swing.JComboBox<>();
        etqCodFactura = new javax.swing.JLabel();
        etqId = new javax.swing.JLabel();
        etqCliente1 = new javax.swing.JLabel();
        etqId1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMostarFactura = new javax.swing.JTable();
        etqFactNum = new javax.swing.JLabel();
        etqCliente2 = new javax.swing.JLabel();
        etqCedula2 = new javax.swing.JLabel();

        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowClosing(java.awt.event.WindowEvent evt)
            {
                cerrarAplicacion(evt);
            }
        });

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
        gridBagConstraints.insets = new java.awt.Insets(9, 9, 9, 9);
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
                "Código", "Descripción", "Precio", "Unidades"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addGap(254, 254, 254)
                .addComponent(btnAñadirProducto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelProductoLayout.setVerticalGroup(
            panelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAñadirProducto)
                .addContainerGap())
        );

        panelPrincipal.addTab("Producto", panelProducto);
        panelProducto.getAccessibleContext().setAccessibleName("");

        btnCliente.setText("Añadir");
        btnCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnClienteActionPerformed(evt);
            }
        });

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Nombre", "Cédula", "Correo"
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
        jScrollPane2.setViewportView(tablaCliente);

        javax.swing.GroupLayout panelClienteLayout = new javax.swing.GroupLayout(panelCliente);
        panelCliente.setLayout(panelClienteLayout);
        panelClienteLayout.setHorizontalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(panelClienteLayout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(btnCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelClienteLayout.setVerticalGroup(
            panelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClienteLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCliente)
                .addGap(12, 12, 12))
        );

        panelPrincipal.addTab("Cliente", panelCliente);

        btnSeleClien.setText("Comprobar");
        btnSeleClien.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnSeleClienActionPerformed(evt);
            }
        });

        btnSeleProd.setText("Agregar");
        btnSeleProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                agregarProducto(evt);
            }
        });

        jLabel1.setText("Ingrese cédula del cliente");

        jLabel2.setText("Ingrese el codigo del producto ");

        textFactCanPro.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        textFactClient.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textFactClientActionPerformed(evt);
            }
        });

        tablaFactProd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Codigo", "Producto / Servicio", "Cantidad "
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
        jScrollPane3.setViewportView(tablaFactProd);

        btnCrearFactura.setText("Crear");
        btnCrearFactura.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                crearFactura(evt);
            }
        });

        textFactProd.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                textFactProdActionPerformed(evt);
            }
        });

        jLabel3.setText("Cantidad del producto seleccionado");

        etqFactClien.setText("...");

        etqFactProd.setText("...");

        javax.swing.GroupLayout panelFacturaLayout = new javax.swing.GroupLayout(panelFactura);
        panelFactura.setLayout(panelFacturaLayout);
        panelFacturaLayout.setHorizontalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textFactClient)
                            .addComponent(textFactProd)
                            .addComponent(textFactCanPro, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(etqFactClien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etqFactProd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSeleProd)
                            .addComponent(btnSeleClien, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFacturaLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnCrearFactura)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelFacturaLayout.setVerticalGroup(
            panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFacturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFactClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleClien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqFactClien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFactProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(panelFacturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        panelPrincipal.addTab("Factura", panelFactura);

        etqFactura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqFactura.setText("Facturas por codigo");

        comboFacturas.setModel(modeloCombo);
        comboFacturas.setToolTipText("");
        comboFacturas.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                mostarFactura(evt);
            }
        });

        etqCodFactura.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqCodFactura.setText("Factura número: ");

        etqId.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqId.setText("Cédula:");

        etqCliente1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqCliente1.setText("Cliente:");

        etqId1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        etqId1.setText("Productos");

        tablaMostarFactura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tablaMostarFactura.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        tablaMostarFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {

            },
            new String []
            {
                "Código", "Descripción", "Cantidad", "Precio", "TOTAL"
            }
        )
        {
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        tablaMostarFactura.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(tablaMostarFactura);

        etqFactNum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        etqCliente2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        etqCedula2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelListaFacturasLayout = new javax.swing.GroupLayout(panelListaFacturas);
        panelListaFacturas.setLayout(panelListaFacturasLayout);
        panelListaFacturasLayout.setHorizontalGroup(
            panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaFacturasLayout.createSequentialGroup()
                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListaFacturasLayout.createSequentialGroup()
                        .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelListaFacturasLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etqFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelListaFacturasLayout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(etqId1))
                            .addGroup(panelListaFacturasLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(etqCodFactura)
                                    .addComponent(etqCliente1)
                                    .addComponent(etqId))
                                .addGap(66, 66, 66)
                                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelListaFacturasLayout.createSequentialGroup()
                                        .addComponent(etqFactNum, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(etqCedula2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqCliente2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 263, Short.MAX_VALUE))
                    .addGroup(panelListaFacturasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );
        panelListaFacturasLayout.setVerticalGroup(
            panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListaFacturasLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelListaFacturasLayout.createSequentialGroup()
                        .addComponent(etqFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqFactNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqCodFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etqCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(etqCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelListaFacturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etqId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etqId1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPrincipal.addTab("Lista de facturas", panelListaFacturas);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

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
            panelPrincipal.setEnabledAt(2, true);
            panelPrincipal.setEnabledAt(3, true);
            panelPrincipal.setEnabledAt(4, true);
        }
    }//GEN-LAST:event_aplicaModificaEmpresa

    private void permitirModificarEmpresa(java.awt.event.ActionEvent evt)//GEN-FIRST:event_permitirModificarEmpresa
    {//GEN-HEADEREND:event_permitirModificarEmpresa
        editarCampos(true);
        btnEditar.setEnabled(false);
        btnListo.setEnabled(true);

        panelPrincipal.setEnabledAt(1, false);
        panelPrincipal.setEnabledAt(2, false);
        panelPrincipal.setEnabledAt(3, false);
        panelPrincipal.setEnabledAt(4, false);
    }//GEN-LAST:event_permitirModificarEmpresa

    private boolean modificarEmpresa()//agregar para cada atributo
    {
        String nombre = campoNombre.getText();
        String nombreComercial = campoNomComercial.getText();
        String ubicacion = campoUbicacion.getText();
        String fax = campoFax.getText();
        String correo = campoCorreo.getText();

        try
        {
            int numId = Integer.parseInt(campoNumId.getText());
            int tipoId = Integer.parseInt(campoTipoId.getText());
            int telefono = Integer.parseInt(campoTelefono.getText());

            if (!nombre.isEmpty() && !nombreComercial.isEmpty() && !ubicacion.isEmpty() && !fax.isEmpty() && !correo.isEmpty())
            {
                gestor.setNombreEmpresa(nombre);
                gestor.setNombreComercial(nombreComercial);
                gestor.setUbicacion(ubicacion);
                gestor.setFax(fax);
                gestor.setCorreo(correo);
                gestor.setNumeroId(numId);
                gestor.setTelefono(telefono);
                gestor.setTipoId(tipoId);
                return true;
            } else
            {
                mostrarError("Los campos no deben de quedar vacios");
                return false;
            }

        } catch (NumberFormatException e)
        {
            mostrarError("El numero ID,tipo ID y teléfono deben de ser un número");
            return false;
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
        List lineasDetalle = new ArrayList<LineaDetalle>();

        if (c != null)
        {
            TableModel modeloProductosFactura = tablaFactProd.getModel();
            int filsProductosF = modeloProductosFactura.getRowCount();

            Producto p;
            String codigo;
            int cant;

            LineaDetalle ln;
            for (int i = 0; i < filsProductosF; i++)
            {
                codigo = (String) tablaFactProd.getValueAt(i, 0);
                p = gestor.buscaProducto(codigo);
                if (p != null)
                {
                    cant = Integer.parseInt((String) tablaFactProd.getValueAt(i, 2));
                    ln = new LineaDetalle(p, cant);
                    lineasDetalle.add(ln);
                }
            }
            gestor.crearFactura(lineasDetalle, c);
            mostarMensaje("Factura creada");
            eliminarTablaProductosFactura();

        } else
        {
            mostrarError("Cliente no encontrado (crear cliente)");
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

    private void agregarProducto(java.awt.event.ActionEvent evt)//GEN-FIRST:event_agregarProducto
    {//GEN-HEADEREND:event_agregarProducto
        Producto p = encuentraProducto();
        int cantP = (int) textFactCanPro.getValue(); //cantidad producto

        if (cantP > 0)
        {
            if (p != null)
            {
                if (p.getUnidades() - cantP >= 0)
                {

                    p.setUnidades(p.getUnidades() - cantP);
                    mostarProductoFactura(p, cantP);
                    actualizaTablaProductos();
                } else
                {
                    etqFactProd.setForeground(Color.red);
                    etqFactProd.setText("No hay unidades suficientes del producto");
                }
            } else
            {
                etqFactProd.setForeground(Color.red);
                etqFactProd.setText("Producto no encontrado (crear producto)");
            }
        } else
        {
            etqFactProd.setForeground(Color.red);
            etqFactProd.setText("La cantidad del producto debe ser mayor a 0");
        }
    }//GEN-LAST:event_agregarProducto

    private void mostarFactura(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mostarFactura
    {//GEN-HEADEREND:event_mostarFactura
        eliminarTablaFactura();
        Factura f = (Factura) comboFacturas.getSelectedItem();
        Cliente c = f.getCliente();

        mostrarFacturas(f.getLineas());
        etqFactNum.setText(String.format("%d", f.getCodigo()));

        etqCliente2.setText(c.getNombre());
        etqCedula2.setText(c.getId());
    }//GEN-LAST:event_mostarFactura

    private void cerrarAplicacion(java.awt.event.WindowEvent evt)//GEN-FIRST:event_cerrarAplicacion
    {//GEN-HEADEREND:event_cerrarAplicacion
        gestor.guardarModelo("../datos.xml");
        gestor.eliminarObs(this);
        dispose();
        System.exit(0);
    }//GEN-LAST:event_cerrarAplicacion

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
        setResizable(false);
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

        if ("nombreComercial".equals(cambio))
        {
            campoNomComercial.setText((String) evt.getNewValue());
        }

        if ("tipoId".equals(cambio))
        {
            campoTipoId.setText(Integer.toString((int) evt.getNewValue()));
        }

        if ("numeroId".equals(cambio))
        {
            campoNumId.setText(Integer.toString((int) evt.getNewValue()));
        }

        if ("ubicacion".equals(cambio))
        {
            campoUbicacion.setText((String) evt.getNewValue());
        }

        if ("telefono".equals(cambio))
        {
            campoTelefono.setText(Integer.toString((int) evt.getNewValue()));
        }

        if ("fax".equals(cambio))
        {
            campoFax.setText((String) evt.getNewValue());
        }

        if ("correo".equals(cambio))
        {
            campoCorreo.setText((String) evt.getNewValue());
        }

        if ("productos".equals(cambio))
        {
            mostrarProducto((Producto) evt.getNewValue());
        }

        if ("clientes".equals(cambio))
        {
            mostrarCliente((Cliente) evt.getNewValue());
        }

        if ("facturas".equals(cambio))
        {
            Factura f = (Factura) evt.getNewValue();
            modeloCombo.addElement(f);
        }

        if ("Actualizar".equals(cambio))
        {
            actualizarEmpresa();

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

    public void actualizaTablaProductos()
    {
        List<Producto> list = gestor.getProductos();
        if (list != null)
        {
            eliminarTablaProductos();
            if (!list.isEmpty())
            {
                for (Producto p : list)
                {
                    mostrarProducto(p);
                }
            }
        }
    }

    public void actualizaTablaClientes()
    {
        List<Cliente> list = gestor.getClientes();

        if (list != null)
        {
            eliminarTablaCliente();
            if (!list.isEmpty())
            {
                for (Cliente c : list)
                {
                    mostrarCliente(c);
                }
            }
        }
    }

    public void actualizaFacturas()
    {
        List<Factura> facturas = gestor.getFacturas();

        if (facturas != null)
        {
            for (Factura f : facturas)
            {
                modeloCombo.addElement(f);
            }
        }
    }

    public void actualizarEmpresa()
    {
        campoNombre.setText(gestor.getNombre());
        campoNomComercial.setText(gestor.getNombreComercial());
        campoCorreo.setText(gestor.getCorreo());
        campoFax.setText(gestor.getFax());
        campoNumId.setText(Integer.toString(gestor.getNumeroId()));
        campoTipoId.setText(Integer.toString(gestor.getTipoId()));
        campoUbicacion.setText(gestor.getUbicacion());
        campoTelefono.setText(Integer.toString(gestor.getTelefono()));

        actualizaTablaClientes();
        actualizaTablaProductos();
        actualizaFacturas();
    }

    public void eliminarTablaProductos()
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaProductos.getModel();
        int fila = tablaProductos.getRowCount();
        for (int i = fila - 1; i >= 0; i--)
        {
            tabla.removeRow(i);
        }
    }

    public void eliminarTablaCliente()
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaCliente.getModel();
        int fila = tablaProductos.getRowCount();
        for (int i = fila - 1; i >= 0; i--)
        {
            tabla.removeRow(i);
        }
    }

    public void eliminarTablaProductosFactura()
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaFactProd.getModel();

        tabla.setRowCount(0);
    }

    public void eliminarTablaFactura()
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaMostarFactura.getModel();

        tabla.setRowCount(0);
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

    public void mostrarFacturas(List<LineaDetalle> lineas)
    {
        DefaultTableModel tabla = (DefaultTableModel) tablaMostarFactura.getModel();
        Producto p;
        int cant;
        double precio;
        double suma = 0;

        if (!lineas.isEmpty() | lineas != null)
        {
            for (int i = 0; i < lineas.size(); i++)
            {
                p = lineas.get(i).getProducto();
                cant = lineas.get(i).getCantidad();
                precio = p.getPrecio() * cant;
                suma += precio;

                String[] fila
                        =
                        {
                            p.getCodigo(), p.getDescripcion(), Integer.toString(cant), Double.toString(p.getPrecio()), " "
                        };
                tabla.addRow(fila);
            }
            String[] fila
                    =
                    {
                        " ", " ", " ", " ", Double.toString(suma)
                    };
            tabla.addRow(fila);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JComboBox<String> comboFacturas;
    private javax.swing.JLabel etqCedula2;
    private javax.swing.JLabel etqCliente1;
    private javax.swing.JLabel etqCliente2;
    private javax.swing.JLabel etqCodFactura;
    private javax.swing.JLabel etqCorreoElec;
    private javax.swing.JLabel etqEstado;
    private javax.swing.JLabel etqFactClien;
    private javax.swing.JLabel etqFactNum;
    private javax.swing.JLabel etqFactProd;
    private javax.swing.JLabel etqFactura;
    private javax.swing.JLabel etqFax;
    private javax.swing.JLabel etqId;
    private javax.swing.JLabel etqId1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel panelCliente;
    private javax.swing.JPanel panelEmpresa;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelFactura;
    private javax.swing.JPanel panelListaFacturas;
    private javax.swing.JTabbedPane panelPrincipal;
    private javax.swing.JPanel panelProducto;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JTable tablaFactProd;
    private javax.swing.JTable tablaMostarFactura;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JSpinner textFactCanPro;
    private javax.swing.JTextField textFactClient;
    private javax.swing.JTextField textFactProd;
    // End of variables declaration//GEN-END:variables

    private final ControlAplicacion gestor;
    private DefaultComboBoxModel modeloCombo = new DefaultComboBoxModel();

}
