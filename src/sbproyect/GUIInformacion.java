package sbproyect;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUIInformacion extends javax.swing.JFrame {

    DefaultTableModel dtmDatosCompras = new DefaultTableModel();
    DefaultTableModel dtmRegistroClientes = new DefaultTableModel();
    public GUIInformacion() {
        initComponents();
        dtmDatosCompras.addColumn("Sala de la compra");
        dtmDatosCompras.addColumn("Valor Facturado");
        dtmDatosCompras.addColumn("Descuento usado");
        tblDatosCompras.setModel(dtmDatosCompras);
        dtmRegistroClientes.addColumn("Nombre");
        dtmRegistroClientes.addColumn("Cedula");
        dtmRegistroClientes.addColumn("Puntos de descuento disponibles");
        tblDatosClientes.setModel(dtmRegistroClientes);
    }

    public void mostrarInformacionCompras(){
        dtmDatosCompras.setRowCount(0);
        //CONSIDERAR EL DESCUENTO A SER IMPLEMENTADO
        for(Compra c : MenuPrincipal.compras){
            if(c instanceof CompraAfiliada){
                dtmDatosCompras.addRow(new Object[]{c.getSala(), "$" + c.getPrecioFacturado(), "$" + ((CompraAfiliada)c).getDescuentoCompra()});
            }
            else{
                dtmDatosCompras.addRow(new Object[]{c.getSala(), "$" + c.getPrecioFacturado(), "$" + 0.0});
            }
        }  
    }
    
    public void mostrarInformacionClientes(){
        dtmRegistroClientes.setRowCount(0);
        for(Afiliado a : MenuPrincipal.afiliados){
            dtmRegistroClientes.addRow(new Object[]{a.getNombre(), a.getCedula(), a.getPuntos()});
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatosCompras = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDatosClientes = new javax.swing.JTable();
        lblRegistroCompras = new javax.swing.JLabel();
        lblRegistroClientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatosCompras.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tblDatosCompras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblDatosCompras);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 37, 311, 408));

        tblDatosClientes.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tblDatosClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblDatosClientes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 343, 408));

        lblRegistroCompras.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblRegistroCompras.setForeground(new java.awt.Color(204, 204, 255));
        lblRegistroCompras.setText("Registro de compras:");
        getContentPane().add(lblRegistroCompras, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 11, -1, -1));

        lblRegistroClientes.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        lblRegistroClientes.setForeground(new java.awt.Color(204, 204, 255));
        lblRegistroClientes.setText("Registro Clientes:");
        getContentPane().add(lblRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/FondoGUIInformacion.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -540, 700, 1090));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIInformacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInformacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblRegistroClientes;
    private javax.swing.JLabel lblRegistroCompras;
    private javax.swing.JTable tblDatosClientes;
    private javax.swing.JTable tblDatosCompras;
    // End of variables declaration//GEN-END:variables
}
