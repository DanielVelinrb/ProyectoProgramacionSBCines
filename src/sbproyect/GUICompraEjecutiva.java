package sbproyect;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUICompraEjecutiva extends javax.swing.JFrame {

    DefaultTableModel datos;
    CompraAfiliada compra;
    double valorAlimentos = 0;
    int boletos = 0;
    
    public GUICompraEjecutiva() {
        initComponents();
        datos = new DefaultTableModel();
        datos.addColumn("");
        char nombreFila = 65;
        for(int i = 0; i < SalaEjecutiva.getCOLUMNAS(); i++){  
            datos.addColumn((char)(nombreFila + i));
        }
        tblAsientosEjecutivos.setModel(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHorarioFuncion = new javax.swing.JLabel();
        cmbHorarios = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        lblCanguilM = new javax.swing.JLabel();
        lblCanguilG = new javax.swing.JLabel();
        lblGaseosa = new javax.swing.JLabel();
        lblHotDog = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCanguilG = new javax.swing.JTextField();
        txtGaseosa = new javax.swing.JTextField();
        txtCanguilM = new javax.swing.JTextField();
        txtCombo3 = new javax.swing.JTextField();
        lblCombos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblC1CanguilM = new javax.swing.JLabel();
        lblC1Gaseosa = new javax.swing.JLabel();
        lblC1Nachos = new javax.swing.JLabel();
        lblPrecioCombo1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblC4Gaseosa = new javax.swing.JLabel();
        lblC4HotDog = new javax.swing.JLabel();
        lblC4Nachos = new javax.swing.JLabel();
        lblPrecioCombo4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblC2CanguilG = new javax.swing.JLabel();
        lblC2Gaseosa = new javax.swing.JLabel();
        lblC2HotDog = new javax.swing.JLabel();
        lblPrecioCombo2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblC3CanguilG = new javax.swing.JLabel();
        lblC3HotDog = new javax.swing.JLabel();
        lblC3Nachos = new javax.swing.JLabel();
        lblPrecioCombo3 = new javax.swing.JLabel();
        lblNachos = new javax.swing.JLabel();
        txtHotDog = new javax.swing.JTextField();
        txtNachos = new javax.swing.JTextField();
        txtCombo1 = new javax.swing.JTextField();
        txtCombo2 = new javax.swing.JTextField();
        txtCombo4 = new javax.swing.JTextField();
        lblPrecioCanguilG = new javax.swing.JLabel();
        lblPrecioGaseosa = new javax.swing.JLabel();
        lblPrecioHotDog = new javax.swing.JLabel();
        lblPrecioNachos = new javax.swing.JLabel();
        lblPrecioCanguilM = new javax.swing.JLabel();
        btnEscogerAsientos = new javax.swing.JButton();
        cmbFila = new javax.swing.JComboBox<>();
        cmbColumna = new javax.swing.JComboBox<>();
        tblAsientos = new javax.swing.JScrollPane();
        tblAsientosEjecutivos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaInformacionPagos = new javax.swing.JTextArea();
        btnRegistrarCompra = new javax.swing.JButton();

        setTitle("COMPRA SALA EJECUTIVA");

        lblHorarioFuncion.setText("Horario de la función");

        cmbHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Noche: (10 pm)" }));
        cmbHorarios.setSelectedIndex(-1);
        cmbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorariosActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Alimentos"));

        lblCanguilM.setText("Canguil Med.");

        lblCanguilG.setText("Canguil Grande");

        lblGaseosa.setText("Gaseosa");

        lblHotDog.setText("Hot-Dog");

        lblCombos.setText("Combos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 1"));

        lblC1CanguilM.setText("Canguil Med.");

        lblC1Gaseosa.setText("Gaseosa");

        lblC1Nachos.setText("Nachos");

        lblPrecioCombo1.setText("5$");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblC1CanguilM)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblC1Gaseosa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPrecioCombo1))
                            .addComponent(lblC1Nachos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblC1CanguilM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC1Gaseosa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC1Nachos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 4"));

        lblC4Gaseosa.setText("Gaseosa");

        lblC4HotDog.setText("Hot-Dog");

        lblC4Nachos.setText("Nachos");

        lblPrecioCombo4.setText("4$");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPrecioCombo4))
                    .addComponent(lblC4Nachos)
                    .addComponent(lblC4HotDog)
                    .addComponent(lblC4Gaseosa))
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(lblC4Gaseosa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC4HotDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC4Nachos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecioCombo4)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 2"));

        lblC2CanguilG.setText("Canguil Grande");

        lblC2Gaseosa.setText("Gaseosa");

        lblC2HotDog.setText("Hot-Dog");

        lblPrecioCombo2.setText("6$");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lblC2CanguilG)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPrecioCombo2))
                            .addComponent(lblC2HotDog)
                            .addComponent(lblC2Gaseosa))
                        .addGap(25, 25, 25))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblC2CanguilG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC2Gaseosa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC2HotDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo2)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 3"));

        lblC3CanguilG.setText("Canguil Grande");

        lblC3HotDog.setText("Hot-Dog");

        lblC3Nachos.setText("Nachos");

        lblPrecioCombo3.setText("7$");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblC3CanguilG)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblC3HotDog)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblPrecioCombo3))
                                .addComponent(lblC3Nachos)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblC3CanguilG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC3HotDog)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblC3Nachos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo3)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblNachos.setText("Nachos");

        lblPrecioCanguilG.setText("4$");

        lblPrecioGaseosa.setText("1$");

        lblPrecioHotDog.setText("2$");

        lblPrecioNachos.setText("2$");

        lblPrecioCanguilM.setText("3$");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCanguilM)
                    .addComponent(lblCanguilG)
                    .addComponent(lblGaseosa)
                    .addComponent(lblHotDog)
                    .addComponent(lblNachos))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecioCanguilM)
                        .addGap(18, 18, 18)
                        .addComponent(txtCanguilM, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecioNachos)
                        .addGap(18, 18, 18)
                        .addComponent(txtNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecioHotDog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecioGaseosa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPrecioCanguilG)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCanguilG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(txtCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(txtCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCombos)
                .addGap(224, 224, 224))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCombos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCanguilM)
                                            .addComponent(txtCanguilM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrecioCanguilM))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCanguilG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCanguilG)
                                            .addComponent(lblPrecioCanguilG))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblGaseosa)
                                            .addComponent(lblPrecioGaseosa))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblHotDog)
                                            .addComponent(txtHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrecioHotDog)))
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNachos)
                                .addComponent(txtNachos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblPrecioNachos)
                                .addComponent(txtCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btnEscogerAsientos.setText("Escoger Asientos");
        btnEscogerAsientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientosActionPerformed(evt);
            }
        });

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        cmbFila.setSelectedIndex(-1);

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H" }));
        cmbColumna.setSelectedIndex(-1);

        tblAsientosEjecutivos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAsientos.setViewportView(tblAsientosEjecutivos);

        txaInformacionPagos.setColumns(20);
        txaInformacionPagos.setRows(5);
        jScrollPane1.setViewportView(txaInformacionPagos);

        btnRegistrarCompra.setText("Registrar Compra");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(btnRegistrarCompra)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHorarioFuncion))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(154, 154, 154)
                                .addComponent(btnEscogerAsientos))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(tblAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorarioFuncion)
                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEscogerAsientos))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tblAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarCompra)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerAsientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerAsientosActionPerformed
        int fila = cmbFila.getSelectedIndex();
        int columna = cmbColumna.getSelectedIndex();
        try{
            if(MenuPrincipal.salasEjecutivas[cmbHorarios.getSelectedIndex()].asientos[fila][columna + 1].equals("OCUPADO")){
                JOptionPane.showMessageDialog(rootPane, "LO SIENTO. ASIENTO OCUPADO.");
            }
            else{
                MenuPrincipal.salasEjecutivas[cmbHorarios.getSelectedIndex()].asientos[fila][columna + 1] = "OCUPADO";
                tblAsientosEjecutivos.setValueAt("OCUPADO", fila, columna + 1);
                JOptionPane.showMessageDialog(rootPane, "ASIENTO AGREGADO");
                boletos++;
            }
            if(cmbHorarios.isEnabled())
                cmbHorarios.setEnabled(false);
        }
        catch(ArrayIndexOutOfBoundsException error){
            JOptionPane.showMessageDialog(rootPane, "ERROR. ASEGURESE DE SELECCIONAR "
                    + "TODOS LOS PARÁMETROS DEL ASIENTO NECESARIO");
        }
    }//GEN-LAST:event_btnEscogerAsientosActionPerformed

    private void cmbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorariosActionPerformed
        datos.setRowCount(0);
        if(cmbHorarios.getSelectedIndex() == 0){
            for(int i = 0; i < SalaEjecutiva.getFILAS(); i++){  
                datos.addRow(MenuPrincipal.salasEjecutivas[0].asientos[i]);
            }
        }
        if(cmbHorarios.getSelectedIndex() == 1){
            for(int i = 0; i < SalaEjecutiva.getFILAS(); i++){  
                datos.addRow(MenuPrincipal.salasEjecutivas[1].asientos[i]);
            }
        }
    }//GEN-LAST:event_cmbHorariosActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        //TENER EN CUENTA LA FALTA DE VALIDACION DE SOCIO. ACTUALIZACION EN PROXIMA REVISION
    
       
        try {
            if(txtCanguilM.getText().length() != 0){
            valorAlimentos += 3 * Integer.parseInt(txtCanguilM.getText());
            }else{
                txtCanguilM.invalidate();
            }
            if(txtCanguilG.getText().length() != 0){
            valorAlimentos += 4 * Integer.parseInt(txtCanguilG.getText());
            }else{
                txtCanguilG.invalidate();
            }
            if(txtGaseosa.getText().length() != 0){
            valorAlimentos += 1 * Integer.parseInt(txtGaseosa.getText());
            }else{
                txtGaseosa.invalidate();
            }
            if(txtHotDog.getText().length() != 0){
            valorAlimentos += 2 * Integer.parseInt(txtHotDog.getText());
            }else{
                txtHotDog.invalidate();
            }
            if(txtNachos.getText().length() != 0){
            valorAlimentos += 2 * Integer.parseInt(txtNachos.getText());
            }else{
                txtNachos.invalidate();
            }
            if(txtCombo1.getText().length() != 0){
            valorAlimentos += 5 * Integer.parseInt(txtCombo1.getText());
            }else{
                txtCombo1.invalidate();
            }
            if(txtCombo2.getText().length() != 0){
            valorAlimentos += 6 * Integer.parseInt(txtCombo2.getText());
            }else{
                txtCombo2.invalidate();
            }
            if(txtCombo3.getText().length() != 0){
            valorAlimentos += 7 * Integer.parseInt(txtCombo3.getText());
            }else{
                txtCombo3.invalidate();
            }
            if(txtCombo4.getText().length() != 0){
            valorAlimentos += 4 * Integer.parseInt(txtCombo4.getText());
            }else{
                txtCombo4.invalidate();
            }
            
            MenuPrincipal.compras.add(new CompraAfiliada(cmbHorarios.getSelectedIndex(), boletos, valorAlimentos));
            
            boletos = 0;
            valorAlimentos = 0;
            cmbHorarios.setEnabled(true);
            cmbHorarios.setSelectedIndex(-1);
            LimpiarGUI();
                    
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar números" +
                    "en los cuadros de texto","ERROR",JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

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
            java.util.logging.Logger.getLogger(GUICompraEjecutiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompraEjecutiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompraEjecutiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompraEjecutiva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompraEjecutiva().setVisible(true);
            }
        });
    }
    
    public void LimpiarGUI(){
        txtCanguilM.setText("");
        txtCanguilG.setText("");
        txtGaseosa.setText("");
        txtHotDog.setText("");
        txtNachos.setText("");
        txtCombo1.setText("");
        txtCombo2.setText("");
        txtCombo3.setText("");
        txtCombo4.setText("");
        cmbFila.setSelectedIndex(-1);
        cmbColumna.setSelectedIndex(-1);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEscogerAsientos;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JComboBox<String> cmbColumna;
    private javax.swing.JComboBox<String> cmbFila;
    private javax.swing.JComboBox<String> cmbHorarios;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblC1CanguilM;
    private javax.swing.JLabel lblC1Gaseosa;
    private javax.swing.JLabel lblC1Nachos;
    private javax.swing.JLabel lblC2CanguilG;
    private javax.swing.JLabel lblC2Gaseosa;
    private javax.swing.JLabel lblC2HotDog;
    private javax.swing.JLabel lblC3CanguilG;
    private javax.swing.JLabel lblC3HotDog;
    private javax.swing.JLabel lblC3Nachos;
    private javax.swing.JLabel lblC4Gaseosa;
    private javax.swing.JLabel lblC4HotDog;
    private javax.swing.JLabel lblC4Nachos;
    private javax.swing.JLabel lblCanguilG;
    private javax.swing.JLabel lblCanguilM;
    private javax.swing.JLabel lblCombos;
    private javax.swing.JLabel lblGaseosa;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JLabel lblHotDog;
    private javax.swing.JLabel lblNachos;
    private javax.swing.JLabel lblPrecioCanguilG;
    private javax.swing.JLabel lblPrecioCanguilM;
    private javax.swing.JLabel lblPrecioCombo1;
    private javax.swing.JLabel lblPrecioCombo2;
    private javax.swing.JLabel lblPrecioCombo3;
    private javax.swing.JLabel lblPrecioCombo4;
    private javax.swing.JLabel lblPrecioGaseosa;
    private javax.swing.JLabel lblPrecioHotDog;
    private javax.swing.JLabel lblPrecioNachos;
    private javax.swing.JScrollPane tblAsientos;
    private javax.swing.JTable tblAsientosEjecutivos;
    private javax.swing.JTextArea txaInformacionPagos;
    private javax.swing.JTextField txtCanguilG;
    private javax.swing.JTextField txtCanguilM;
    private javax.swing.JTextField txtCombo1;
    private javax.swing.JTextField txtCombo2;
    private javax.swing.JTextField txtCombo3;
    private javax.swing.JTextField txtCombo4;
    private javax.swing.JTextField txtGaseosa;
    private javax.swing.JTextField txtHotDog;
    private javax.swing.JTextField txtNachos;
    // End of variables declaration//GEN-END:variables
}
