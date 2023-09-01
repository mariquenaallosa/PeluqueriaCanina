package com.quena.peluqueriacanina.igu;

import java.awt.Color;

public class CargaDatos extends javax.swing.JFrame {

    int xMouse, yMouse;

    public CargaDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMain = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JPanel();
        txtLimpiar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        txtGuardar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNombreP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbAlergico = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbAtencion = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        txtNombreD = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        txtRaza = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgMain.setBackground(new java.awt.Color(255, 255, 255));
        bgMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\PERRUQUERIA.png")); // NOI18N
        bgMain.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 360, 410));

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        btnLimpiar.setToolTipText("");

        txtLimpiar.setBackground(new java.awt.Color(98, 126, 216));
        txtLimpiar.setFont(new java.awt.Font("Changa One", 0, 22)); // NOI18N
        txtLimpiar.setForeground(new java.awt.Color(98, 126, 216));
        txtLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLimpiar.setText("LIMPIAR");
        txtLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        txtLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtLimpiarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLimpiarLayout = new javax.swing.GroupLayout(btnLimpiar);
        btnLimpiar.setLayout(btnLimpiarLayout);
        btnLimpiarLayout.setHorizontalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnLimpiarLayout.setVerticalGroup(
            btnLimpiarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        bgMain.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 140, 70));

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtGuardar.setFont(new java.awt.Font("Changa One", 0, 22)); // NOI18N
        txtGuardar.setForeground(new java.awt.Color(98, 126, 216));
        txtGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtGuardar.setText("GUARDAR");
        txtGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        bgMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\fondo.png")); // NOI18N
        bg.setText("jLabel1");
        bgMain.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 0, 380, 699));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 255, 255));

        txtExit.setBackground(new java.awt.Color(0, 0, 0));
        txtExit.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtExit.setForeground(new java.awt.Color(0, 0, 0));
        txtExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtExit.setText("X");
        txtExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnExitLayout = new javax.swing.GroupLayout(btnExit);
        btnExit.setLayout(btnExitLayout);
        btnExitLayout.setHorizontalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        btnExitLayout.setVerticalGroup(
            btnExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 924, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bgMain.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 30));

        jLabel1.setFont(new java.awt.Font("Changa One", 0, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(98, 126, 216));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARGA DE DATOS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 600, 90));

        jSeparator1.setBackground(new java.awt.Color(98, 126, 216));
        jSeparator1.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 330, 20));

        jSeparator2.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 290, 20));

        jLabel3.setBackground(new java.awt.Color(98, 126, 216));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(98, 126, 216));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Raza");
        bgMain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 120, 40));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(98, 126, 216));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Nombre");
        bgMain.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 120, 40));

        txtNombreP.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreP.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombreP.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreP.setToolTipText("");
        txtNombreP.setBorder(null);
        txtNombreP.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombreP.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNombreP.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtNombreP.setSelectionColor(new java.awt.Color(98, 126, 216));
        bgMain.add(txtNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 330, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(98, 126, 216));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Alérgico");
        bgMain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 120, 40));

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.setToolTipText("");
        txtColor.setBorder(null);
        txtColor.setCaretColor(new java.awt.Color(0, 0, 0));
        txtColor.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtColor.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        bgMain.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 330, 40));

        jLabel11.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(98, 126, 216));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Color");
        bgMain.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 40));

        cmbAlergico.setBackground(new java.awt.Color(98, 126, 216));
        cmbAlergico.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cmbAlergico.setForeground(new java.awt.Color(255, 255, 255));
        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SI", "NO" }));
        cmbAlergico.setBorder(null);
        bgMain.add(cmbAlergico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 150, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(98, 126, 216));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Atención especial");
        bgMain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 190, 40));

        cmbAtencion.setBackground(new java.awt.Color(98, 126, 216));
        cmbAtencion.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        cmbAtencion.setForeground(new java.awt.Color(255, 255, 255));
        cmbAtencion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "SI", "NO" }));
        cmbAtencion.setBorder(null);
        cmbAtencion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtencionActionPerformed(evt);
            }
        });
        bgMain.add(cmbAtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 150, 40));

        jLabel12.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(98, 126, 216));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Nombre dueño");
        bgMain.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, 40));

        txtNombreD.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreD.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtNombreD.setForeground(new java.awt.Color(0, 0, 0));
        txtNombreD.setToolTipText("");
        txtNombreD.setBorder(null);
        txtNombreD.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNombreD.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNombreD.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        bgMain.add(txtNombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 290, 40));

        jLabel13.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(98, 126, 216));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Observaciones");
        bgMain.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 160, 40));

        txtCelular.setBackground(new java.awt.Color(255, 255, 255));
        txtCelular.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtCelular.setForeground(new java.awt.Color(0, 0, 0));
        txtCelular.setToolTipText("");
        txtCelular.setBorder(null);
        txtCelular.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCelular.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCelular.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        bgMain.add(txtCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 290, 40));

        jLabel14.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(98, 126, 216));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Celular dueño");
        bgMain.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 160, 40));

        txtObs.setBackground(new java.awt.Color(255, 255, 255));
        txtObs.setColumns(20);
        txtObs.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtObs.setForeground(new java.awt.Color(0, 0, 0));
        txtObs.setRows(5);
        txtObs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(98, 126, 216)));
        txtObs.setCaretColor(new java.awt.Color(102, 102, 102));
        txtObs.setSelectionColor(new java.awt.Color(98, 126, 216));
        jScrollPane1.setViewportView(txtObs);

        bgMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 500, 290, 170));

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(0, 0, 0));
        txtRaza.setToolTipText("");
        txtRaza.setBorder(null);
        txtRaza.setCaretColor(new java.awt.Color(0, 0, 0));
        txtRaza.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRaza.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        txtRaza.setSelectionColor(new java.awt.Color(98, 126, 216));
        bgMain.add(txtRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 330, 40));

        jSeparator3.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 290, 10));

        jSeparator4.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 330, 10));

        jSeparator5.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 330, 10));

        jSeparator6.setForeground(new java.awt.Color(98, 126, 216));
        bgMain.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 330, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLimpiarMouseEntered
        btnLimpiar.setBackground(new Color(98,126,216));
        txtLimpiar.setForeground(Color.white);
    }//GEN-LAST:event_txtLimpiarMouseEntered

    private void txtGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseEntered
        btnGuardar.setBackground(new Color(98,126,216));
        txtGuardar.setForeground(Color.white);
    }//GEN-LAST:event_txtGuardarMouseEntered

    private void txtLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtLimpiarMouseExited
        btnLimpiar.setBackground(Color.white);
        txtLimpiar.setForeground(new Color(98,126,216));
    }//GEN-LAST:event_txtLimpiarMouseExited

    private void txtGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGuardarMouseExited
        btnGuardar.setBackground(Color.white);
        txtGuardar.setForeground(new Color(98,126,216));
    }//GEN-LAST:event_txtGuardarMouseExited

    private void cmbAtencionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtencionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAtencionActionPerformed

    private void txtExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_txtExitMouseClicked

    private void txtExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseEntered
        btnExit.setBackground(Color.red);
        txtExit.setForeground(Color.white);
    }//GEN-LAST:event_txtExitMouseEntered

    private void txtExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtExitMouseExited
        btnExit.setBackground(Color.white);
        txtExit.setForeground(Color.black);
    }//GEN-LAST:event_txtExitMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgMain;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencion;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtColor;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel txtGuardar;
    private javax.swing.JLabel txtLimpiar;
    private javax.swing.JTextField txtNombreD;
    private javax.swing.JTextField txtNombreP;
    private javax.swing.JTextArea txtObs;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables
}
