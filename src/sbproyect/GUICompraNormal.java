package sbproyect;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUICompraNormal extends javax.swing.JFrame {
    
    DefaultTableModel datos;
    CompraNormal compra;
    int boletos = 0;
    
    public GUICompraNormal() {
        initComponents();
        datos = new DefaultTableModel();
        datos.addColumn("");
        char nombreFila = 65;
        for(int i=0 ; i < SalaNormal.getCOLUMNAS() ; i++){
            datos.addColumn((char)(nombreFila+i));
        }
        btnEscogerAsiento.setEnabled(false);
        tblAsientosNormal.setModel(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEscogerAsiento = new javax.swing.JButton();
        cmbFila = new javax.swing.JComboBox<>();
        pnlDatosSala = new javax.swing.JPanel();
        lblNumeroSala = new javax.swing.JLabel();
        cmbHorarios = new javax.swing.JComboBox<>();
        cmbNumeroSala = new javax.swing.JComboBox<>();
        lblHorarioFuncion = new javax.swing.JLabel();
        btnVerAsientos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsientosNormal = new javax.swing.JTable();
        cmbColumna = new javax.swing.JComboBox<>();
        btnRegistrarCompra = new javax.swing.JButton();
        lblFila = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setTitle("COMPRA SALA NORMAL");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEscogerAsiento.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnEscogerAsiento.setText("Escoger Asiento");
        btnEscogerAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEscogerAsiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, -1, -1));

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbFila.setSelectedIndex(-1);
        getContentPane().add(cmbFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 120, -1));

        pnlDatosSala.setBackground(new java.awt.Color(153, 0, 0));
        pnlDatosSala.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sala"));
        pnlDatosSala.setForeground(new java.awt.Color(102, 0, 51));

        lblNumeroSala.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblNumeroSala.setText("Sala:");

        cmbHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Tarde: (4 pm)", "Noche: (10 pm)" }));
        cmbHorarios.setSelectedIndex(-1);

        cmbNumeroSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cmbNumeroSala.setSelectedIndex(-1);

        lblHorarioFuncion.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblHorarioFuncion.setText("Horario de la función");

        btnVerAsientos.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnVerAsientos.setText("Ver Asientos");
        btnVerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAsientosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDatosSalaLayout = new javax.swing.GroupLayout(pnlDatosSala);
        pnlDatosSala.setLayout(pnlDatosSalaLayout);
        pnlDatosSalaLayout.setHorizontalGroup(
            pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHorarioFuncion)
                    .addComponent(lblNumeroSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbHorarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbNumeroSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlDatosSalaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnVerAsientos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDatosSalaLayout.setVerticalGroup(
            pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDatosSalaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroSala)
                    .addComponent(cmbNumeroSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlDatosSalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorarioFuncion)
                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnVerAsientos)
                .addGap(20, 20, 20))
        );

        getContentPane().add(pnlDatosSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 24, 300, 160));

        tblAsientosNormal.setFont(new java.awt.Font("Century", 0, 11)); // NOI18N
        tblAsientosNormal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblAsientosNormal);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 220, 572, 200));

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" }));
        cmbColumna.setSelectedIndex(-1);
        getContentPane().add(cmbColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 120, -1));

        btnRegistrarCompra.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnRegistrarCompra.setText("Registrar Compra");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 456, -1, -1));

        lblFila.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblFila.setText("Fila:");
        getContentPane().add(lblFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, -1, -1));

        lblColumna.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblColumna.setText("Columna:");
        getContentPane().add(lblColumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoCompras.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -240, 630, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerAsientoActionPerformed
        int fila = cmbFila.getSelectedIndex();
        int columna = cmbColumna.getSelectedIndex();
        int sala = cmbNumeroSala.getSelectedIndex();
        int funcion = cmbHorarios.getSelectedIndex();
        int posArray = sala + funcion;
        try{
            if(cmbHorarios.getSelectedIndex() == 1){
                posArray += 2;
            }
            if(MenuPrincipal.salasNormales[posArray].asientos[fila][columna + 1].equals("OCUPADO")){
                JOptionPane.showMessageDialog(rootPane, "LO SIENTO. ASIENTO OCUPADO.");
            }
            else{
                MenuPrincipal.salasNormales[posArray].asientos[fila][columna + 1] = "OCUPADO";
                tblAsientosNormal.setValueAt("OCUPADO", fila, columna + 1);
                JOptionPane.showMessageDialog(rootPane, "ASIENTO AGREGADO");
                boletos++;
            }
            if(cmbHorarios.isEnabled() && cmbNumeroSala.isEnabled())
                cmbHorarios.setEnabled(false);
                cmbNumeroSala.setEnabled(false);
        }
        catch(ArrayIndexOutOfBoundsException error){
            JOptionPane.showMessageDialog(rootPane, "ERROR. ASEGURESE DE SELECCIONAR "
                    + "TODOS LOS PARÁMETROS DEL ASIENTO NECESARIO");
        }
    }//GEN-LAST:event_btnEscogerAsientoActionPerformed

    private void btnVerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAsientosActionPerformed
        datos.setRowCount(0);
        int sala = cmbNumeroSala.getSelectedIndex();
        int funcion = cmbHorarios.getSelectedIndex();
        int posArray = sala + funcion;
        if(sala == 0){
            for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                datos.addRow(MenuPrincipal.salasNormales[posArray].asientos[i]);
        }
        else if (sala == 1){
            for(int i=0 ; i < SalaNormal.getFILAS() ; i++)
                datos.addRow(MenuPrincipal.salasNormales[posArray + 2].asientos[i]);
        }
        btnEscogerAsiento.setEnabled(true);
    }//GEN-LAST:event_btnVerAsientosActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        if(boletos > 0){
            MenuPrincipal.compras.add(new CompraNormal(cmbHorarios.getSelectedIndex(), boletos));
            MenuPrincipal.compras.getLast().escrituraDatos(MenuPrincipal.compras);
            JOptionPane.showMessageDialog(rootPane, MenuPrincipal.compras.getLast().toString());
            limpiarGUI();
            boletos = 0;
            cmbHorarios.setEnabled(true);
            cmbNumeroSala.setEnabled(true);
            btnEscogerAsiento.setEnabled(false);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "No se pueden realizar compras por valores de $0","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void limpiarGUI(){
        cmbHorarios.setSelectedIndex(-1);
        cmbNumeroSala.setSelectedIndex(-1);
        cmbFila.setSelectedIndex(-1);
        cmbColumna.setSelectedIndex(-1);
        datos.setRowCount(0);
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompraNormal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompraNormal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscogerAsiento;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JButton btnVerAsientos;
    private javax.swing.JComboBox<String> cmbColumna;
    private javax.swing.JComboBox<String> cmbFila;
    private javax.swing.JComboBox<String> cmbHorarios;
    private javax.swing.JComboBox<String> cmbNumeroSala;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JLabel lblNumeroSala;
    private javax.swing.JPanel pnlDatosSala;
    private javax.swing.JTable tblAsientosNormal;
    // End of variables declaration//GEN-END:variables
}
