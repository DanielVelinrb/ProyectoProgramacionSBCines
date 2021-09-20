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
    private final int WIDTH = 500;
    private final int HEIGTH = 600;
    
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
        btnVisualizarRegistros = new javax.swing.JButton();
        btnAfiliarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Century", 0, 48)); // NOI18N
        lblNombre.setText("SB CINES");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 35, -1, 95));

        btnCompraSalaNormal.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnCompraSalaNormal.setText("Sala Normal");
        btnCompraSalaNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaNormalActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraSalaNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 207, 160, 36));

        btnCompraSalaAsistida.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnCompraSalaAsistida.setText("Sala Asistida");
        btnCompraSalaAsistida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaAsistidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraSalaAsistida, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 286, 160, 35));

        btnCompraSalaEjecutiva.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnCompraSalaEjecutiva.setText("Sala Ejecutiva");
        btnCompraSalaEjecutiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompraSalaEjecutivaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCompraSalaEjecutiva, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 360, 160, 37));

        btnVisualizarRegistros.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnVisualizarRegistros.setText("Visualizar Registros");
        btnVisualizarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarRegistrosActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisualizarRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, 39));

        btnAfiliarCliente.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnAfiliarCliente.setText("Afiliar ");
        btnAfiliarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfiliarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfiliarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 37));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("SALAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 157, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 255));
        jLabel2.setText("Información:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        jLabel3.setText("Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoMenuPrincipal (1).png"))); // NOI18N
        jLabel4.setMaximumSize(new java.awt.Dimension(500, 600));
        jLabel4.setMinimumSize(new java.awt.Dimension(500, 600));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 460));

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

    private void btnVisualizarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarRegistrosActionPerformed
        informacion.setVisible(true);
        informacion.mostrarInformacionCompras();
        informacion.mostrarInformacionClientes();
    }//GEN-LAST:event_btnVisualizarRegistrosActionPerformed

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
    private javax.swing.JButton btnVisualizarRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
