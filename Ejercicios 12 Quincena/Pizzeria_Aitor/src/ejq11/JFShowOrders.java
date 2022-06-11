/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejq11;

import javax.swing.text.MaskFormatter;

/**
 *
 * @author ciber
 */
public class JFShowOrders extends javax.swing.JFrame {

    /**
     * Creates new form JFShowOrders
     */
    private ListaPedidos listaP;
    private boolean extra;
    private Pedido pedido;

    public JFShowOrders(ListaPedidos listaP) {
        initComponents();
        this.listaP = listaP;
        pedido = listaP.getPedidoActivo();
        showPedido(pedido);
        this.lblIndice.setText((listaP.getActivo() + 1) + "/" + listaP.getSize());
        updateBtn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupNombre = new javax.swing.ButtonGroup();
        btnGroupExtra1 = new javax.swing.ButtonGroup();
        btnGroupExtra2 = new javax.swing.ButtonGroup();
        btnGroupExtra3 = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanelCliente = new javax.swing.JPanel();
        lblNombreCliente = new javax.swing.JLabel();
        lblApellidosCliente = new javax.swing.JLabel();
        lblDniCliente = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidosCliente = new javax.swing.JTextField();
        MaskFormatter maskDNI = null;

        try {
            maskDNI = new MaskFormatter("########U");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        formatTxtDni = new javax.swing.JFormattedTextField(maskDNI);
        lblDatosCliente = new javax.swing.JLabel();
        jPanelPizza = new javax.swing.JPanel();
        lblNombrePedido = new javax.swing.JLabel();
        radioBtnNombreProducto1 = new javax.swing.JRadioButton();
        radioBtnNombreProducto2 = new javax.swing.JRadioButton();
        radioBtnNombreProducto3 = new javax.swing.JRadioButton();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        CheckBoxExtras = new javax.swing.JCheckBox();
        jPanelExtras = new javax.swing.JPanel();
        lblExtra1 = new javax.swing.JLabel();
        radioBtnExtra1_1 = new javax.swing.JRadioButton();
        radioBtnExtra1_2 = new javax.swing.JRadioButton();
        radioBtnExtra1_3 = new javax.swing.JRadioButton();
        radioBtnExtra1_4 = new javax.swing.JRadioButton();
        radioBtnExtra1_5 = new javax.swing.JRadioButton();
        lblExtra2 = new javax.swing.JLabel();
        radioBtnExtra2_1 = new javax.swing.JRadioButton();
        radioBtnExtra2_2 = new javax.swing.JRadioButton();
        radioBtnExtra2_3 = new javax.swing.JRadioButton();
        radioBtnExtra2_4 = new javax.swing.JRadioButton();
        radioBtnExtra2_5 = new javax.swing.JRadioButton();
        lblExtra3 = new javax.swing.JLabel();
        radioBtnExtra3_1 = new javax.swing.JRadioButton();
        radioBtnExtra3_2 = new javax.swing.JRadioButton();
        radioBtnExtra3_3 = new javax.swing.JRadioButton();
        radioBtnExtra3_4 = new javax.swing.JRadioButton();
        radioBtnExtra3_5 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnPrimero = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnVolber = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        lblIndice = new javax.swing.JLabel();
        lblNavegacion = new javax.swing.JLabel();
        lblPizza = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombreCliente.setText("Nombre:");

        lblApellidosCliente.setText("Apellidos:");

        lblDniCliente.setText("DNI:");

        txtNombreCliente.setEditable(false);

        txtApellidosCliente.setEditable(false);

        formatTxtDni.setEditable(false);

        javax.swing.GroupLayout jPanelClienteLayout = new javax.swing.GroupLayout(jPanelCliente);
        jPanelCliente.setLayout(jPanelClienteLayout);
        jPanelClienteLayout.setHorizontalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreCliente)
                    .addComponent(lblApellidosCliente)
                    .addComponent(lblDniCliente))
                .addGap(51, 51, 51)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreCliente)
                    .addComponent(txtApellidosCliente)
                    .addComponent(formatTxtDni))
                .addContainerGap())
        );
        jPanelClienteLayout.setVerticalGroup(
            jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelClienteLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(lblNombreCliente)
                        .addGap(18, 18, 18)
                        .addComponent(lblApellidosCliente))
                    .addGroup(jPanelClienteLayout.createSequentialGroup()
                        .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtApellidosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formatTxtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDniCliente))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        lblDatosCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDatosCliente.setText("Datos del Cliente");

        jPanelPizza.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNombrePedido.setText("Nombre:");

        btnGroupNombre.add(radioBtnNombreProducto1);
        radioBtnNombreProducto1.setText("Provenzal");
        radioBtnNombreProducto1.setEnabled(false);

        btnGroupNombre.add(radioBtnNombreProducto2);
        radioBtnNombreProducto2.setText("Barbacoa");
        radioBtnNombreProducto2.setEnabled(false);

        btnGroupNombre.add(radioBtnNombreProducto3);
        radioBtnNombreProducto3.setText("Mediterránea");
        radioBtnNombreProducto3.setEnabled(false);

        lblCantidad.setText("Cantidad");

        txtCantidad.setEditable(false);

        CheckBoxExtras.setText("Extras");
        CheckBoxExtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxExtrasActionPerformed(evt);
            }
        });

        jPanelExtras.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblExtra1.setText("Ingrediente Extra 1:");

        btnGroupExtra1.add(radioBtnExtra1_1);
        radioBtnExtra1_1.setText("1");
        radioBtnExtra1_1.setEnabled(false);

        btnGroupExtra1.add(radioBtnExtra1_2);
        radioBtnExtra1_2.setText("2");
        radioBtnExtra1_2.setEnabled(false);

        btnGroupExtra1.add(radioBtnExtra1_3);
        radioBtnExtra1_3.setText("3");
        radioBtnExtra1_3.setEnabled(false);

        btnGroupExtra1.add(radioBtnExtra1_4);
        radioBtnExtra1_4.setText("4");
        radioBtnExtra1_4.setEnabled(false);

        btnGroupExtra1.add(radioBtnExtra1_5);
        radioBtnExtra1_5.setText("5");
        radioBtnExtra1_5.setEnabled(false);

        lblExtra2.setText("Ingrediente Extra 2:");

        btnGroupExtra2.add(radioBtnExtra2_1);
        radioBtnExtra2_1.setText("1");
        radioBtnExtra2_1.setEnabled(false);

        btnGroupExtra2.add(radioBtnExtra2_2);
        radioBtnExtra2_2.setText("2");
        radioBtnExtra2_2.setEnabled(false);

        btnGroupExtra2.add(radioBtnExtra2_3);
        radioBtnExtra2_3.setText("3");
        radioBtnExtra2_3.setEnabled(false);

        btnGroupExtra2.add(radioBtnExtra2_4);
        radioBtnExtra2_4.setText("4");
        radioBtnExtra2_4.setEnabled(false);

        btnGroupExtra2.add(radioBtnExtra2_5);
        radioBtnExtra2_5.setText("5");
        radioBtnExtra2_5.setEnabled(false);

        lblExtra3.setText("Ingrediente Extra 3:");

        btnGroupExtra3.add(radioBtnExtra3_1);
        radioBtnExtra3_1.setText("1");
        radioBtnExtra3_1.setEnabled(false);

        btnGroupExtra3.add(radioBtnExtra3_2);
        radioBtnExtra3_2.setText("2");
        radioBtnExtra3_2.setEnabled(false);

        btnGroupExtra3.add(radioBtnExtra3_3);
        radioBtnExtra3_3.setText("3");
        radioBtnExtra3_3.setEnabled(false);

        btnGroupExtra3.add(radioBtnExtra3_4);
        radioBtnExtra3_4.setText("4");
        radioBtnExtra3_4.setEnabled(false);

        btnGroupExtra3.add(radioBtnExtra3_5);
        radioBtnExtra3_5.setText("5");
        radioBtnExtra3_5.setEnabled(false);

        javax.swing.GroupLayout jPanelExtrasLayout = new javax.swing.GroupLayout(jPanelExtras);
        jPanelExtras.setLayout(jPanelExtrasLayout);
        jPanelExtrasLayout.setHorizontalGroup(
            jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExtrasLayout.createSequentialGroup()
                        .addComponent(lblExtra1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBtnExtra1_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra1_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra1_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra1_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra1_5))
                    .addGroup(jPanelExtrasLayout.createSequentialGroup()
                        .addComponent(lblExtra2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBtnExtra2_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra2_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra2_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra2_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra2_5))
                    .addGroup(jPanelExtrasLayout.createSequentialGroup()
                        .addComponent(lblExtra3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioBtnExtra3_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra3_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra3_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra3_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radioBtnExtra3_5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelExtrasLayout.setVerticalGroup(
            jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExtra1)
                    .addComponent(radioBtnExtra1_1)
                    .addComponent(radioBtnExtra1_2)
                    .addComponent(radioBtnExtra1_3)
                    .addComponent(radioBtnExtra1_4)
                    .addComponent(radioBtnExtra1_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExtra2)
                    .addComponent(radioBtnExtra2_1)
                    .addComponent(radioBtnExtra2_2)
                    .addComponent(radioBtnExtra2_3)
                    .addComponent(radioBtnExtra2_4)
                    .addComponent(radioBtnExtra2_5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExtra3)
                    .addComponent(radioBtnExtra3_1)
                    .addComponent(radioBtnExtra3_2)
                    .addComponent(radioBtnExtra3_3)
                    .addComponent(radioBtnExtra3_4)
                    .addComponent(radioBtnExtra3_5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelPizzaLayout = new javax.swing.GroupLayout(jPanelPizza);
        jPanelPizza.setLayout(jPanelPizzaLayout);
        jPanelPizzaLayout.setHorizontalGroup(
            jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizzaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelExtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CheckBoxExtras)
                    .addGroup(jPanelPizzaLayout.createSequentialGroup()
                        .addGroup(jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePedido)
                            .addComponent(lblCantidad))
                        .addGap(51, 51, 51)
                        .addGroup(jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPizzaLayout.createSequentialGroup()
                                .addComponent(radioBtnNombreProducto1)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNombreProducto2)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnNombreProducto3))
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanelPizzaLayout.setVerticalGroup(
            jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPizzaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePedido)
                    .addComponent(radioBtnNombreProducto1)
                    .addComponent(radioBtnNombreProducto2)
                    .addComponent(radioBtnNombreProducto3))
                .addGap(18, 18, 18)
                .addGroup(jPanelPizzaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CheckBoxExtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnPrimero.setText("Primero");
        btnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeroActionPerformed(evt);
            }
        });

        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnVolber.setText("Volver");
        btnVolber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolberActionPerformed(evt);
            }
        });

        btnUltimo.setText("Ultimo");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        lblIndice.setText("X/X");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrimero)
                .addGap(18, 18, 18)
                .addComponent(btnAnterior)
                .addGap(18, 18, 18)
                .addComponent(lblIndice)
                .addGap(18, 18, 18)
                .addComponent(btnSiguiente)
                .addGap(18, 18, 18)
                .addComponent(btnUltimo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnVolber)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimero)
                    .addComponent(btnAnterior)
                    .addComponent(btnVolber)
                    .addComponent(btnUltimo)
                    .addComponent(btnSiguiente)
                    .addComponent(lblIndice))
                .addGap(32, 32, 32))
        );

        lblNavegacion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNavegacion.setText("Navegación");

        lblPizza.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblPizza.setText("Pizza");

        jLayeredPane1.setLayer(jPanelCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblDatosCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanelPizza, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblNavegacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblPizza, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNavegacion)
                    .addComponent(lblPizza)
                    .addComponent(jPanelPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDatosCliente)
                        .addComponent(jPanelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblDatosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPizza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPizza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNavegacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolberActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolberActionPerformed

    private void CheckBoxExtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxExtrasActionPerformed
        this.CheckBoxExtras.setSelected(extra);
    }//GEN-LAST:event_CheckBoxExtrasActionPerformed

    private void btnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeroActionPerformed
        pedido = listaP.getPrimero();
        showPedido(pedido);
        updateBtn();
        this.lblIndice.setText((listaP.getActivo() + 1) + "/" + listaP.getSize());
    }//GEN-LAST:event_btnPrimeroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        pedido = listaP.getAnterior();
        showPedido(pedido);
        updateBtn();
        this.lblIndice.setText((listaP.getActivo() + 1) + "/" + listaP.getSize());
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        pedido = listaP.getSiguiente();
        showPedido(pedido);
        updateBtn();
        this.lblIndice.setText((listaP.getActivo() + 1) + "/" + listaP.getSize());
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        pedido = listaP.getUltimo();
        showPedido(pedido);
        updateBtn();
        this.lblIndice.setText((listaP.getActivo() + 1) + "/" + listaP.getSize());
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void showPedido(Pedido pedido) {
        
        String nomPizza;

        this.txtNombreCliente.setText(pedido.getNombreC());
        this.txtApellidosCliente.setText(pedido.getApeC());
        this.formatTxtDni.setText(pedido.getDni());
        nomPizza = pedido.getNomPizza();
        switch (nomPizza) {
            case "Provenzal":
                this.radioBtnNombreProducto1.setSelected(true);
                break;
            case "Barbacoa":
                this.radioBtnNombreProducto2.setSelected(true);
                break;
            case "Mediterránea":
                this.radioBtnNombreProducto3.setSelected(true);
                break;
        }
        this.txtCantidad.setText(String.valueOf(pedido.getCantidad()));
        this.CheckBoxExtras.setSelected(pedido.isExtras());
        if (this.CheckBoxExtras.isSelected()) {
            if (pedido.getIngextras1() > 0) {
                switch (pedido.getIngextras1()) {
                    case 1:
                        this.radioBtnExtra1_1.setSelected(true);
                        break;
                    case 2:
                        this.radioBtnExtra1_2.setSelected(true);
                        break;
                    case 3:
                        this.radioBtnExtra1_3.setSelected(true);
                        break;
                    case 4:
                        this.radioBtnExtra1_4.setSelected(true);
                        break;
                    case 5:
                        this.radioBtnExtra1_5.setSelected(true);
                        break;
                }
            }
            if (pedido.getIngextras2() > 0) {
                switch (pedido.getIngextras2()) {
                    case 1:
                        this.radioBtnExtra2_1.setSelected(true);
                        break;
                    case 2:
                        this.radioBtnExtra2_2.setSelected(true);
                        break;
                    case 3:
                        this.radioBtnExtra2_3.setSelected(true);
                        break;
                    case 4:
                        this.radioBtnExtra2_4.setSelected(true);
                        break;
                    case 5:
                        this.radioBtnExtra2_5.setSelected(true);
                        break;
                }
            }
            if (pedido.getIngextras3() > 0) {
                switch (pedido.getIngextras3()) {
                    case 1:
                        this.radioBtnExtra3_1.setSelected(true);
                        break;
                    case 2:
                        this.radioBtnExtra3_2.setSelected(true);
                        break;
                    case 3:
                        this.radioBtnExtra3_3.setSelected(true);
                        break;
                    case 4:
                        this.radioBtnExtra3_4.setSelected(true);
                        break;
                    case 5:
                        this.radioBtnExtra3_5.setSelected(true);
                        break;
                }
            }
        } else {
            this.jPanelExtras.setVisible(false);
        }
    }

    private void updateBtn() {
        this.btnPrimero.setEnabled(false);
        this.btnAnterior.setEnabled(false);
        this.btnSiguiente.setEnabled(false);
        this.btnUltimo.setEnabled(false);
        if (listaP.getActivo() > 0) {
            this.btnPrimero.setEnabled(true);
            this.btnAnterior.setEnabled(true);
        }
        if (listaP.getActivo() < listaP.getSize() - 1) {
            this.btnSiguiente.setEnabled(true);
            this.btnUltimo.setEnabled(true);
        }
        extra = this.CheckBoxExtras.isSelected();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxExtras;
    private javax.swing.JButton btnAnterior;
    private javax.swing.ButtonGroup btnGroupExtra1;
    private javax.swing.ButtonGroup btnGroupExtra2;
    private javax.swing.ButtonGroup btnGroupExtra3;
    private javax.swing.ButtonGroup btnGroupNombre;
    private javax.swing.JButton btnPrimero;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JButton btnVolber;
    private javax.swing.JFormattedTextField formatTxtDni;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCliente;
    private javax.swing.JPanel jPanelExtras;
    private javax.swing.JPanel jPanelPizza;
    private javax.swing.JLabel lblApellidosCliente;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblDatosCliente;
    private javax.swing.JLabel lblDniCliente;
    private javax.swing.JLabel lblExtra1;
    private javax.swing.JLabel lblExtra2;
    private javax.swing.JLabel lblExtra3;
    private javax.swing.JLabel lblIndice;
    private javax.swing.JLabel lblNavegacion;
    private javax.swing.JLabel lblNombreCliente;
    private javax.swing.JLabel lblNombrePedido;
    private javax.swing.JLabel lblPizza;
    private javax.swing.JRadioButton radioBtnExtra1_1;
    private javax.swing.JRadioButton radioBtnExtra1_2;
    private javax.swing.JRadioButton radioBtnExtra1_3;
    private javax.swing.JRadioButton radioBtnExtra1_4;
    private javax.swing.JRadioButton radioBtnExtra1_5;
    private javax.swing.JRadioButton radioBtnExtra2_1;
    private javax.swing.JRadioButton radioBtnExtra2_2;
    private javax.swing.JRadioButton radioBtnExtra2_3;
    private javax.swing.JRadioButton radioBtnExtra2_4;
    private javax.swing.JRadioButton radioBtnExtra2_5;
    private javax.swing.JRadioButton radioBtnExtra3_1;
    private javax.swing.JRadioButton radioBtnExtra3_2;
    private javax.swing.JRadioButton radioBtnExtra3_3;
    private javax.swing.JRadioButton radioBtnExtra3_4;
    private javax.swing.JRadioButton radioBtnExtra3_5;
    private javax.swing.JRadioButton radioBtnNombreProducto1;
    private javax.swing.JRadioButton radioBtnNombreProducto2;
    private javax.swing.JRadioButton radioBtnNombreProducto3;
    private javax.swing.JTextField txtApellidosCliente;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}