package sbproyect;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GUICompraAsistida extends javax.swing.JFrame {

    DefaultTableModel datos;
    CompraAsistida compra;
    int boletos = 0;
    double valorAlimentos = 0;
    
    public GUICompraAsistida() {
        initComponents();
        datos = new DefaultTableModel();
        datos.addColumn("");
        char nombreFila = 65;
        for (int i=0;i<SalaAsistida.getCOLUMNAS();i++){
            datos.addColumn((char)(nombreFila+i));
        }     
        tblAsientosAsistidos.setModel(datos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHorarioFuncion = new javax.swing.JLabel();
        cmbHorarios = new javax.swing.JComboBox<>();
        btnEscogerAsiento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAsientosAsistidos = new javax.swing.JTable();
        btnRegistrarCompra = new javax.swing.JButton();
        cmbFila = new javax.swing.JComboBox<>();
        lblFila = new javax.swing.JLabel();
        lblColumna = new javax.swing.JLabel();
        cmbColumna = new javax.swing.JComboBox<>();
        pnlAlimentos = new javax.swing.JPanel();
        lblCanguilMediano = new javax.swing.JLabel();
        lblCanguilGrande = new javax.swing.JLabel();
        lblGaseosa = new javax.swing.JLabel();
        lblHotDog = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCanguilGrande = new javax.swing.JTextField();
        txtGaseosa = new javax.swing.JTextField();
        txtCanguilMediano = new javax.swing.JTextField();
        txtCombo3 = new javax.swing.JTextField();
        lblCombos = new javax.swing.JLabel();
        pnlCombo1 = new javax.swing.JPanel();
        lblCanguilCombo1 = new javax.swing.JLabel();
        lblGaseosaCombo1 = new javax.swing.JLabel();
        lblNachosCombo1 = new javax.swing.JLabel();
        lblPrecioCombo1 = new javax.swing.JLabel();
        pnlCombo4 = new javax.swing.JPanel();
        lblGaseosaCombo4 = new javax.swing.JLabel();
        lblHotDogCombo4 = new javax.swing.JLabel();
        lblNachosCombo4 = new javax.swing.JLabel();
        lblPrecioCombo4 = new javax.swing.JLabel();
        pnlCombo2 = new javax.swing.JPanel();
        lblCanguilCombo2 = new javax.swing.JLabel();
        lblGaseosaCombo2 = new javax.swing.JLabel();
        lblHotDogCombo2 = new javax.swing.JLabel();
        lblPrecioCombo2 = new javax.swing.JLabel();
        pnlCombo3 = new javax.swing.JPanel();
        lblCanguilCombo3 = new javax.swing.JLabel();
        lblHotDogCombo3 = new javax.swing.JLabel();
        lblNachosCombo3 = new javax.swing.JLabel();
        lblPrecioCombo3 = new javax.swing.JLabel();
        lblNachos = new javax.swing.JLabel();
        txtHotDog = new javax.swing.JTextField();
        txtNachos = new javax.swing.JTextField();
        txtCombo1 = new javax.swing.JTextField();
        txtCombo2 = new javax.swing.JTextField();
        txtCombo4 = new javax.swing.JTextField();
        lblCanguilGrandePrecio = new javax.swing.JLabel();
        lblGaseosaPrecio = new javax.swing.JLabel();
        lblHotDogPrecio = new javax.swing.JLabel();
        lblNachosPrecio = new javax.swing.JLabel();
        lblCanguilMedianoPrecio = new javax.swing.JLabel();

        setTitle("COMPRA SALA ASISTIDA");

        lblHorarioFuncion.setText("Horario de la función");

        cmbHorarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mañana: (10 am)", "Tarde: (4 pm)", "Noche: (10 pm)" }));
        cmbHorarios.setSelectedIndex(-1);
        cmbHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorariosActionPerformed(evt);
            }
        });

        btnEscogerAsiento.setText("Escoger Asiento");
        btnEscogerAsiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEscogerAsientoActionPerformed(evt);
            }
        });

        tblAsientosAsistidos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblAsientosAsistidos);

        btnRegistrarCompra.setText("Registrar Compra");
        btnRegistrarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarCompraActionPerformed(evt);
            }
        });

        cmbFila.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        cmbFila.setSelectedIndex(-1);
        cmbFila.setToolTipText("");

        lblFila.setText("Fila:");

        lblColumna.setText("Columna:");

        cmbColumna.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" }));
        cmbColumna.setSelectedIndex(-1);

        pnlAlimentos.setBorder(javax.swing.BorderFactory.createTitledBorder("Alimentos"));

        lblCanguilMediano.setText("Canguil Med.");

        lblCanguilGrande.setText("Canguil Grande");

        lblGaseosa.setText("Gaseosa");

        lblHotDog.setText("Hot-Dog");

        lblCombos.setText("Combos:");

        pnlCombo1.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 1"));

        lblCanguilCombo1.setText("Canguil Med.");

        lblGaseosaCombo1.setText("Gaseosa");

        lblNachosCombo1.setText("Nachos");

        lblPrecioCombo1.setText("5$");

        javax.swing.GroupLayout pnlCombo1Layout = new javax.swing.GroupLayout(pnlCombo1);
        pnlCombo1.setLayout(pnlCombo1Layout);
        pnlCombo1Layout.setHorizontalGroup(
            pnlCombo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlCombo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCanguilCombo1)
                    .addGroup(pnlCombo1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlCombo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblGaseosaCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlCombo1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPrecioCombo1))
                            .addComponent(lblNachosCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pnlCombo1Layout.setVerticalGroup(
            pnlCombo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo1Layout.createSequentialGroup()
                .addComponent(lblCanguilCombo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGaseosaCombo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNachosCombo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo1)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlCombo4.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 4"));

        lblGaseosaCombo4.setText("Gaseosa");

        lblHotDogCombo4.setText("Hot-Dog");

        lblNachosCombo4.setText("Nachos");

        lblPrecioCombo4.setText("4$");

        javax.swing.GroupLayout pnlCombo4Layout = new javax.swing.GroupLayout(pnlCombo4);
        pnlCombo4.setLayout(pnlCombo4Layout);
        pnlCombo4Layout.setHorizontalGroup(
            pnlCombo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCombo4Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(pnlCombo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCombo4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPrecioCombo4))
                    .addComponent(lblNachosCombo4)
                    .addComponent(lblHotDogCombo4)
                    .addComponent(lblGaseosaCombo4))
                .addGap(25, 25, 25))
        );
        pnlCombo4Layout.setVerticalGroup(
            pnlCombo4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo4Layout.createSequentialGroup()
                .addComponent(lblGaseosaCombo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHotDogCombo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNachosCombo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrecioCombo4)
                .addContainerGap())
        );

        pnlCombo2.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 2"));

        lblCanguilCombo2.setText("Canguil Grande");

        lblGaseosaCombo2.setText("Gaseosa");

        lblHotDogCombo2.setText("Hot-Dog");

        lblPrecioCombo2.setText("6$");

        javax.swing.GroupLayout pnlCombo2Layout = new javax.swing.GroupLayout(pnlCombo2);
        pnlCombo2.setLayout(pnlCombo2Layout);
        pnlCombo2Layout.setHorizontalGroup(
            pnlCombo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCombo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCombo2Layout.createSequentialGroup()
                        .addComponent(lblCanguilCombo2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCombo2Layout.createSequentialGroup()
                        .addGroup(pnlCombo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCombo2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPrecioCombo2))
                            .addComponent(lblHotDogCombo2)
                            .addComponent(lblGaseosaCombo2))
                        .addGap(25, 25, 25))))
        );
        pnlCombo2Layout.setVerticalGroup(
            pnlCombo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo2Layout.createSequentialGroup()
                .addComponent(lblCanguilCombo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGaseosaCombo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHotDogCombo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo2)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pnlCombo3.setBorder(javax.swing.BorderFactory.createTitledBorder("Combo 3"));

        lblCanguilCombo3.setText("Canguil Grande");

        lblHotDogCombo3.setText("Hot-Dog");

        lblNachosCombo3.setText("Nachos");

        lblPrecioCombo3.setText("7$");

        javax.swing.GroupLayout pnlCombo3Layout = new javax.swing.GroupLayout(pnlCombo3);
        pnlCombo3.setLayout(pnlCombo3Layout);
        pnlCombo3Layout.setHorizontalGroup(
            pnlCombo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCombo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCanguilCombo3)
                    .addGroup(pnlCombo3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlCombo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHotDogCombo3)
                            .addGroup(pnlCombo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlCombo3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lblPrecioCombo3))
                                .addComponent(lblNachosCombo3)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCombo3Layout.setVerticalGroup(
            pnlCombo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCombo3Layout.createSequentialGroup()
                .addComponent(lblCanguilCombo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHotDogCombo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNachosCombo3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPrecioCombo3)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        lblNachos.setText("Nachos");

        lblCanguilGrandePrecio.setText("4$");

        lblGaseosaPrecio.setText("1$");

        lblHotDogPrecio.setText("2$");

        lblNachosPrecio.setText("2$");

        lblCanguilMedianoPrecio.setText("3$");

        javax.swing.GroupLayout pnlAlimentosLayout = new javax.swing.GroupLayout(pnlAlimentos);
        pnlAlimentos.setLayout(pnlAlimentosLayout);
        pnlAlimentosLayout.setHorizontalGroup(
            pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlimentosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCanguilMediano)
                    .addComponent(lblCanguilGrande)
                    .addComponent(lblGaseosa)
                    .addComponent(lblHotDog)
                    .addComponent(lblNachos))
                .addGap(18, 18, 18)
                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(lblCanguilMedianoPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(txtCanguilMediano, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(lblNachosPrecio)
                        .addGap(18, 18, 18)
                        .addComponent(txtNachos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(lblHotDogPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(lblGaseosaPrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(lblCanguilGrandePrecio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCanguilGrande, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(pnlCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(txtCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addComponent(pnlCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAlimentosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCombos)
                .addGap(224, 224, 224))
        );
        pnlAlimentosLayout.setVerticalGroup(
            pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlimentosLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lblCombos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAlimentosLayout.createSequentialGroup()
                                .addComponent(pnlCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlAlimentosLayout.createSequentialGroup()
                                .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblCanguilMediano)
                                            .addComponent(txtCanguilMediano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCanguilMedianoPrecio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCanguilGrande, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCanguilGrande)
                                            .addComponent(lblCanguilGrandePrecio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(txtGaseosa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblGaseosa)
                                            .addComponent(lblGaseosaPrecio))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblHotDog)
                                            .addComponent(txtHotDog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblHotDogPrecio)))
                                    .addComponent(pnlCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCombo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNachos)
                                .addComponent(txtNachos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNachosPrecio)
                                .addComponent(txtCombo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAlimentosLayout.createSequentialGroup()
                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAlimentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHorarioFuncion)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblFila)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblColumna)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(67, 67, 67)
                                        .addComponent(btnEscogerAsiento))))
                            .addComponent(pnlAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnRegistrarCompra))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHorarioFuncion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEscogerAsiento)
                    .addComponent(cmbFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFila)
                    .addComponent(lblColumna)
                    .addComponent(cmbColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnlAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarCompra)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEscogerAsientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEscogerAsientoActionPerformed
        int fila = cmbFila.getSelectedIndex();
        int columna = cmbColumna.getSelectedIndex();
        try{
            if(MenuPrincipal.salasAsistidas[cmbHorarios.getSelectedIndex()].asientos[fila][columna + 1].equals("OCUPADO")){
                JOptionPane.showMessageDialog(rootPane, "LO SIENTO. ASIENTO OCUPADO.");
            }
            else{
                MenuPrincipal.salasAsistidas[cmbHorarios.getSelectedIndex()].asientos[fila][columna+1] = "OCUPADO";
                tblAsientosAsistidos.setValueAt("OCUPADO", fila, columna+1);
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
    }//GEN-LAST:event_btnEscogerAsientoActionPerformed

    private void cmbHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorariosActionPerformed
        datos.setRowCount(0);
        if(cmbHorarios.getSelectedIndex() == 0){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[0].asientos[i]);
            }
        }
        if(cmbHorarios.getSelectedIndex()==1){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[1].asientos[i]);
            }
        }
        if(cmbHorarios.getSelectedIndex()==2){
            for(int i=0 ; i<SalaAsistida.getFILAS() ; i++){
                datos.addRow(MenuPrincipal.salasAsistidas[2].asientos[i]);
            }
        }
    }//GEN-LAST:event_cmbHorariosActionPerformed

    private void btnRegistrarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarCompraActionPerformed
        
        try {
            if(txtCanguilMediano.getText().length() != 0)
                valorAlimentos += 3 * Integer.parseInt(txtCanguilMediano.getText());
            if(txtCanguilGrande.getText().length() != 0)
                valorAlimentos += 4 * Integer.parseInt(txtCanguilGrande.getText());
            if(txtGaseosa.getText().length() != 0)
                valorAlimentos += 1 * Integer.parseInt(txtGaseosa.getText());
            if(txtHotDog.getText().length() != 0)
                valorAlimentos += 2 * Integer.parseInt(txtHotDog.getText());
            if(txtNachos.getText().length() != 0)
                valorAlimentos += 2 * Integer.parseInt(txtNachos.getText());
            if(txtCombo1.getText().length() != 0)
                valorAlimentos += 5 * Integer.parseInt(txtCombo1.getText());
            if(txtCombo2.getText().length() != 0)
                valorAlimentos += 6 * Integer.parseInt(txtCombo2.getText());
            if(txtCombo3.getText().length() != 0)
                valorAlimentos += 7 * Integer.parseInt(txtCombo3.getText());
            if(txtCombo4.getText().length() != 0)
                valorAlimentos += 4 * Integer.parseInt(txtCombo4.getText());
              
            if(boletos > 0 || valorAlimentos > 0){
                MenuPrincipal.compras.add(new CompraAsistida(cmbHorarios.getSelectedIndex(), boletos, valorAlimentos));
                MenuPrincipal.compras.getLast().escrituraDatos(MenuPrincipal.compras);
                JOptionPane.showMessageDialog(rootPane, MenuPrincipal.compras.getLast().toString());
                limpiarGUI();
                boletos = 0;
                valorAlimentos = 0;
                cmbHorarios.setEnabled(true);    
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "No se pueden realizar compras por valores de $0","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        
                    
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar números" +
                    "en los cuadros de texto","ERROR",JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_btnRegistrarCompraActionPerformed

    private void limpiarGUI(){
        cmbHorarios.setSelectedIndex(-1);
        cmbFila.setSelectedIndex(-1);
        cmbColumna.setSelectedIndex(-1);
        datos.setRowCount(0);
        txtCanguilMediano.setText("");
        txtCanguilGrande.setText("");
        txtGaseosa.setText("");
        txtHotDog.setText("");
        txtNachos.setText("");
        txtCombo1.setText("");
        txtCombo2.setText("");
        txtCombo3.setText("");
        txtCombo4.setText("");
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
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUICompraAsistida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUICompraAsistida().setVisible(true);
            }
        });
    }
    
    public void LimpiarGUI(){
        txtCanguilMediano.setText("");
        txtCanguilGrande.setText("");
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
    private javax.swing.JButton btnEscogerAsiento;
    private javax.swing.JButton btnRegistrarCompra;
    private javax.swing.JComboBox<String> cmbColumna;
    private javax.swing.JComboBox<String> cmbFila;
    private javax.swing.JComboBox<String> cmbHorarios;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCanguilCombo1;
    private javax.swing.JLabel lblCanguilCombo2;
    private javax.swing.JLabel lblCanguilCombo3;
    private javax.swing.JLabel lblCanguilGrande;
    private javax.swing.JLabel lblCanguilGrandePrecio;
    private javax.swing.JLabel lblCanguilMediano;
    private javax.swing.JLabel lblCanguilMedianoPrecio;
    private javax.swing.JLabel lblColumna;
    private javax.swing.JLabel lblCombos;
    private javax.swing.JLabel lblFila;
    private javax.swing.JLabel lblGaseosa;
    private javax.swing.JLabel lblGaseosaCombo1;
    private javax.swing.JLabel lblGaseosaCombo2;
    private javax.swing.JLabel lblGaseosaCombo4;
    private javax.swing.JLabel lblGaseosaPrecio;
    private javax.swing.JLabel lblHorarioFuncion;
    private javax.swing.JLabel lblHotDog;
    private javax.swing.JLabel lblHotDogCombo2;
    private javax.swing.JLabel lblHotDogCombo3;
    private javax.swing.JLabel lblHotDogCombo4;
    private javax.swing.JLabel lblHotDogPrecio;
    private javax.swing.JLabel lblNachos;
    private javax.swing.JLabel lblNachosCombo1;
    private javax.swing.JLabel lblNachosCombo3;
    private javax.swing.JLabel lblNachosCombo4;
    private javax.swing.JLabel lblNachosPrecio;
    private javax.swing.JLabel lblPrecioCombo1;
    private javax.swing.JLabel lblPrecioCombo2;
    private javax.swing.JLabel lblPrecioCombo3;
    private javax.swing.JLabel lblPrecioCombo4;
    private javax.swing.JPanel pnlAlimentos;
    private javax.swing.JPanel pnlCombo1;
    private javax.swing.JPanel pnlCombo2;
    private javax.swing.JPanel pnlCombo3;
    private javax.swing.JPanel pnlCombo4;
    private javax.swing.JTable tblAsientosAsistidos;
    private javax.swing.JTextField txtCanguilGrande;
    private javax.swing.JTextField txtCanguilMediano;
    private javax.swing.JTextField txtCombo1;
    private javax.swing.JTextField txtCombo2;
    private javax.swing.JTextField txtCombo3;
    private javax.swing.JTextField txtCombo4;
    private javax.swing.JTextField txtGaseosa;
    private javax.swing.JTextField txtHotDog;
    private javax.swing.JTextField txtNachos;
    // End of variables declaration//GEN-END:variables
}
