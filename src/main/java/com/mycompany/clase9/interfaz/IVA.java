package com.mycompany.clase9.interfaz;

public class IVA extends javax.swing.JFrame {
    double iva;
    double descuento;
    
    public IVA() {
        initComponents();
        iva = 0;
        descuento = 0;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JLabel();
        txttotalapagar = new javax.swing.JLabel();
        txtIVA = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JLabel();
        txtImpuesto = new javax.swing.JLabel();
        txtunidades = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        txttotalpagar = new javax.swing.JTextField();
        txtdescuento = new javax.swing.JTextField();
        txtiva = new javax.swing.JTextField();
        txtimpuesto = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 400));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 400));
        jPanel2.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("MI TIENDA DEL DESCUENTO");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(210, 10, 160, 16);

        txtUnidades.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtUnidades.setText("Unidades");
        jPanel2.add(txtUnidades);
        txtUnidades.setBounds(60, 40, 80, 20);

        txtPrecio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPrecio.setText("Precio");
        jPanel2.add(txtPrecio);
        txtPrecio.setBounds(60, 110, 60, 20);

        txttotalapagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txttotalapagar.setText("Total a pagar");
        jPanel2.add(txttotalapagar);
        txttotalapagar.setBounds(60, 190, 100, 19);

        txtIVA.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIVA.setText("IVA");
        jPanel2.add(txtIVA);
        txtIVA.setBounds(360, 40, 22, 19);

        txtDescuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDescuento.setText("Descuento");
        jPanel2.add(txtDescuento);
        txtDescuento.setBounds(350, 110, 76, 19);

        txtImpuesto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtImpuesto.setText("Impuesto");
        jPanel2.add(txtImpuesto);
        txtImpuesto.setBounds(350, 190, 80, 19);

        txtunidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtunidadesActionPerformed(evt);
            }
        });
        jPanel2.add(txtunidades);
        txtunidades.setBounds(160, 40, 130, 24);
        jPanel2.add(txtprecio);
        txtprecio.setBounds(160, 110, 130, 24);
        jPanel2.add(txttotalpagar);
        txttotalpagar.setBounds(160, 190, 130, 24);
        jPanel2.add(txtdescuento);
        txtdescuento.setBounds(430, 110, 110, 24);

        txtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtivaActionPerformed(evt);
            }
        });
        jPanel2.add(txtiva);
        txtiva.setBounds(430, 40, 110, 24);
        jPanel2.add(txtimpuesto);
        txtimpuesto.setBounds(430, 190, 110, 24);

        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel2.add(Calcular);
        Calcular.setBounds(90, 250, 77, 32);

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(Limpiar);
        Limpiar.setBounds(240, 250, 73, 32);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel2.add(Salir);
        Salir.setBounds(400, 250, 56, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtunidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtunidadesActionPerformed

    }//GEN-LAST:event_txtunidadesActionPerformed

    private void txtivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtivaActionPerformed

    }//GEN-LAST:event_txtivaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
        double unidades;
        double precio;
        double totalpagar;
        double precioconiva;
        double cantidadescuento;
        double preciosiniva;
        unidades = Double.parseDouble(txtunidades.getText());
        precio = Double.parseDouble(txtprecio.getText());
        iva = Double.parseDouble(txtiva.getText());
        descuento = Double.parseDouble(txtdescuento.getText());
        preciosiniva = precio * unidades;
        precioconiva=preciosiniva*iva/100;
        cantidadescuento=descuento;
        totalpagar=preciosiniva+precioconiva-descuento;
        
        txttotalapagar.setText(""+totalpagar);
        txtImpuesto.setText(""+precioconiva);

    }//GEN-LAST:event_CalcularActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        txtUnidades.setText("");
        txtPrecio.setText("");
        txtIVA.setText("");
        txtDescuento.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IVA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IVA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txtDescuento;
    private javax.swing.JLabel txtIVA;
    private javax.swing.JLabel txtImpuesto;
    private javax.swing.JLabel txtPrecio;
    private javax.swing.JLabel txtUnidades;
    private javax.swing.JTextField txtdescuento;
    private javax.swing.JTextField txtimpuesto;
    private javax.swing.JTextField txtiva;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JLabel txttotalapagar;
    private javax.swing.JTextField txttotalpagar;
    private javax.swing.JTextField txtunidades;
    // End of variables declaration//GEN-END:variables
}
