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

        setTitle("COMPRA SALA NORMAL");

        btnEscogerAsiento.setText("Escoger Asiento");
        btnEscogerAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientoActionPerformed(evt);
            }
        });

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cmbFila.setSelectedIndex(-1);

        pnlDatosSala.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Sala"));

        lblNumeroSala.setText("Sala:");

        cmbHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Tarde: (4 pm)", "Noche: (10 pm)" }));
        cmbHorarios.setSelectedIndex(-1);

        cmbNumeroSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        cmbNumeroSala.setSelectedIndex(-1);

        lblHorarioFuncion.setText("Horario de la función");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnVerAsientos)
                .addGap(20, 20, 20))
        );

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

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L" }));
        cmbColumna.setSelectedIndex(-1);

        btnRegistrarCompra.setText("Registrar Compra");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        lblFila.setText("Fila:");

        lblColumna.setText("Columna:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnRegistrarCompra)
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlDatosSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblColumna)
                        .addGap(25, 25, 25)
                        .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnEscogerAsiento)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlDatosSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFila))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblColumna))
                        .addGap(18, 18, 18)
                        .addComponent(btnEscogerAsiento)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnRegistrarCompra)
                .addGap(29, 29, 29))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JLabel lblNumeroSala;
    private javax.swing.JPanel pnlDatosSala;
    private javax.swing.JTable tblAsientosNormal;
    // End of variables declaration//GEN-END:variables
}
