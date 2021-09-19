package sbproyect;

import java.awt.Label;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

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
    public GUIInformacion informacion = new GUIInformacion();
    public GUIAfiliacionCliente registroAfiliados = new GUIAfiliacionCliente();
    
    public static LinkedList<Compra> compras;
    public static LinkedList<Afiliado> afiliados;
    
    public MenuPrincipal() {
        initComponents();
        this.setSize(700, 500);
        compraNormal.setVisible(false);
        compraAsistida.setVisible(false);
        compraEjecutiva.setVisible(false);
        informacion.setVisible(false);
        registroAfiliados.setVisible(false);
        compras = new LinkedList();
        afiliados = new LinkedList();
        lecturaArchivoCompras();
        lecturaAfiliados();
        
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
        btnCompraSalaNormal = new javax.swing.JButton();
        btnCompraSalaAsistida = new javax.swing.JButton();
        btnCompraSalaEjecutiva = new javax.swing.JButton();
        btnImprimirInformacion = new javax.swing.JButton();
        btnAfiliarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        lblNombre.setText("SB CINES");

        btnCompraSalaNormal.setText("Sala Normal");
        btnCompraSalaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaNormalActionPerformed(evt);
            }
        });

        btnCompraSalaAsistida.setText("Sala Asistida");
        btnCompraSalaAsistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaAsistidaActionPerformed(evt);
            }
        });

        btnCompraSalaEjecutiva.setText("Sala Ejecutiva");
        btnCompraSalaEjecutiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaEjecutivaActionPerformed(evt);
            }
        });

        btnImprimirInformacion.setText("Imprimir Información");
        btnImprimirInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirInformacionActionPerformed(evt);
            }
        });

        btnAfiliarCliente.setText("Afiliar Cliente");
        btnAfiliarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfiliarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnCompraSalaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCompraSalaAsistida, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(btnCompraSalaEjecutiva, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(btnImprimirInformacion)
                .addGap(73, 73, 73)
                .addComponent(btnAfiliarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompraSalaNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompraSalaAsistida, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompraSalaEjecutiva, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImprimirInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAfiliarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompraSalaNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraSalaNormalActionPerformed
        compraNormal.setVisible(true);
    }//GEN-LAST:event_btnCompraSalaNormalActionPerformed

    private void btnCompraSalaAsistidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraSalaAsistidaActionPerformed
        compraAsistida.setVisible(true);
    }//GEN-LAST:event_btnCompraSalaAsistidaActionPerformed

    private void btnCompraSalaEjecutivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompraSalaEjecutivaActionPerformed
        compraEjecutiva.setVisible(true);
    }//GEN-LAST:event_btnCompraSalaEjecutivaActionPerformed

    private void btnImprimirInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirInformacionActionPerformed
        informacion.setVisible(true);
        informacion.mostrarInformacionCompras();
        informacion.mostrarInformacionClientes();
    }//GEN-LAST:event_btnImprimirInformacionActionPerformed

    private void btnAfiliarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfiliarClienteActionPerformed
        registroAfiliados.setVisible(true);
    }//GEN-LAST:event_btnAfiliarClienteActionPerformed

    private void lecturaArchivoCompras(){
        ObjectInputStream ois = null;
        Compra c = null;
        try{
            FileInputStream file = new FileInputStream("compras.ser");    
            ois = new ObjectInputStream(file);

            c = (Compra)ois.readObject();
            while(c != null){
                compras.add(c);
                c = (Compra)ois.readObject();
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Creación de registro de compras completada.");
        }
        catch(IOException ioe){
            ioe.getStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Error al realizar el casting.");
        }
        finally{
            try{
                if(ois != null){
                   ois.close();
                }
            }
            catch(IOException ioe){
                ioe.getStackTrace();
            }
        }
    
    }
    
    private void lecturaAfiliados(){
        ObjectInputStream ois = null;
        Afiliado a = null;
        try{
            FileInputStream file = new FileInputStream("afiliados.ser");    
            ois = new ObjectInputStream(file);

            a = (Afiliado)ois.readObject();
            while(a != null){
                afiliados.add(a);
                a = (Afiliado)ois.readObject();
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Creación de registro de afiliados completa.");
        }
        catch(IOException ioe){
            ioe.getStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Error al realizar el casting.");
        }
        finally{
            try{
                if(ois != null){
                   ois.close();
                }
            }
            catch(IOException ioe){
                ioe.getStackTrace();
            }
        }
    
    }

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
    private javax.swing.JButton btnAfiliarCliente;
    private javax.swing.JButton btnCompraSalaAsistida;
    private javax.swing.JButton btnCompraSalaEjecutiva;
    private javax.swing.JButton btnCompraSalaNormal;
    private javax.swing.JButton btnImprimirInformacion;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
