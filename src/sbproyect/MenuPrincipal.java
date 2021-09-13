package sbproyect;

import java.awt.Label;

public class MenuPrincipal extends javax.swing.JFrame {
    //VARIABLES AUXILIARES QUE SERVIRAN PARA EL AJUSTO DE LOS ELEMENTOS
    private final int WIDTH = 700;
    private final int HEIGTH = 500;
    
    //CREACION DE LAS SALAS EN LAS QUE SE REALIZARÁN LAS COMPRAS
    public static SalaNormal salasNormales[] = new SalaNormal[6];
    public static SalaAsistida salasAsistidas[] = new SalaAsistida[3];
    public static SalaEjecutiva salasEjecutivas[] = new SalaEjecutiva[2];
    
    //CREACIÓN DE LAS GUI QUE NOS PERMITIRÁN REALIZAR LAS COMPRAS 
    public GUICompraNormal compraNormal = new GUICompraNormal();
    public GUICompraAsistida compraAsistida = new GUICompraAsistida();
    public GUICompraEjecutiva compraEjecutiva = new GUICompraEjecutiva();
    public GUIInformacion imprimirInformacion = new GUIInformacion();
    public Prueba p = new Prueba();
    
    public MenuPrincipal() {
        initComponents();
        this.setSize(700, 500);
        compraNormal.setVisible(false);
        compraAsistida.setVisible(false);
        compraEjecutiva.setVisible(false);
        imprimirInformacion.setVisible(false);
        p.setVisible(false);
        
        for(int i = 0; i < 6; i++){
            salasNormales[i] = new SalaNormal();
        }
        for(int i = 0; i < 3; i++){
            salasAsistidas[i] = new SalaAsistida();
        }
        for(int i = 0; i < 2; i++){
            salasEjecutivas[i] = new SalaEjecutiva();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        btnSalaNormal = new javax.swing.JButton();
        btnSalaAsistida = new javax.swing.JButton();
        btnSalaEjecutiva = new javax.swing.JButton();
        btnImprimirInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        lblNombre.setText("NOMBRE CINE");

        btnSalaNormal.setText("Sala Normal");
        btnSalaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaNormalActionPerformed(evt);
            }
        });

        btnSalaAsistida.setText("Sala Asistida");
        btnSalaAsistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaAsistidaActionPerformed(evt);
            }
        });

        btnSalaEjecutiva.setText("Sala Ejecutiva");
        btnSalaEjecutiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaEjecutivaActionPerformed(evt);
            }
        });

        btnImprimirInformacion.setText("Imprimir Información");
        btnImprimirInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnSalaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnImprimirInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalaAsistida, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnSalaEjecutiva, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalaAsistida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalaEjecutiva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnImprimirInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaNormalActionPerformed
        compraNormal.setVisible(true);
    }//GEN-LAST:event_btnSalaNormalActionPerformed

    private void btnSalaAsistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaAsistidaActionPerformed
        compraAsistida.setVisible(true);
    }//GEN-LAST:event_btnSalaAsistidaActionPerformed

    private void btnSalaEjecutivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaEjecutivaActionPerformed
        //p.setVisible(true);
        compraEjecutiva.setVisible(true);
    }//GEN-LAST:event_btnSalaEjecutivaActionPerformed

    private void btnImprimirInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirInformacionActionPerformed
        // p.setVisible(true);
        imprimirInformacion.setVisible(true);
        
    }//GEN-LAST:event_btnImprimirInformacionActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImprimirInformacion;
    private javax.swing.JButton btnSalaAsistida;
    private javax.swing.JButton btnSalaEjecutiva;
    private javax.swing.JButton btnSalaNormal;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
