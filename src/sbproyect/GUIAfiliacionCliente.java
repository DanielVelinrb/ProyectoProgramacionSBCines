package sbproyect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class GUIAfiliacionCliente extends javax.swing.JFrame {

    public GUIAfiliacionCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnAfiliarCliente = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 204, 255));
        lblNombre.setText("Nombre");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 32, -1, -1));

        lblCedula.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblCedula.setForeground(new java.awt.Color(204, 204, 255));
        lblCedula.setText("Cédula");
        getContentPane().add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 80, -1, -1));
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 78, 90, -1));

        btnAfiliarCliente.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        btnAfiliarCliente.setText("Afiliar Cliente");
        btnAfiliarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfiliarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAfiliarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 132, -1, -1));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 30, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoCliente.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAfiliarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfiliarClienteActionPerformed
        String nombre = txtNombre.getText();
        int cedula = 0;
        boolean valid = true;
        try{
            cedula = Integer.parseInt(txtCedula.getText());
            for(Afiliado a : MenuPrincipal.afiliados){
                if(a.getCedula() == cedula){
                    valid = false;
                }
            }
            if(valid){
                //SE EMPLEA 0 COMO TERCER PARÁMETRO PARA UNA CORRECTA LECTURA DE DATOS
                MenuPrincipal.afiliados.add(new Afiliado(nombre, cedula, 0));
                escrituraDatos(MenuPrincipal.afiliados);
                JOptionPane.showMessageDialog(rootPane, "Cliente registrado exitosamente.");
                //Limpieza de la GUI
                txtNombre.setText("");
                txtCedula.setText("");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Este cliente ya existe."
                        + " Registro fallido.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "Ingrese solo valores "
                    + "numéricos para el registro de su cédula.","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAfiliarClienteActionPerformed

     private void escrituraDatos(LinkedList<Afiliado> afiliados){
        ObjectOutputStream os = null;
        
        try{
            FileOutputStream file = new FileOutputStream("afiliados.ser");    
            os = new ObjectOutputStream(file);
            for(Afiliado a : afiliados){
                os.writeObject(a);
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo");
        }
        catch(IOException ioe){
            ioe.getStackTrace();
        }
        finally{
            try{
                os.close();
            }
            catch(IOException ioe){
                ioe.getStackTrace();
            }
            catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo");
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
            java.util.logging.Logger.getLogger(GUIAfiliacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAfiliacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAfiliacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAfiliacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAfiliacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfiliarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
