package com.quena.peluqueriacanina.igu;

import java.awt.Color;

public class Principal extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMain = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        btnCargar = new javax.swing.JPanel();
        cargar = new javax.swing.JLabel();
        btnVer = new javax.swing.JPanel();
        ver = new javax.swing.JLabel();
        btnSalir = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bgMain.setBackground(new java.awt.Color(255, 255, 255));
        bgMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\PERRUQUERIA.png")); // NOI18N
        bgMain.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 380, 410));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\fondo.png")); // NOI18N
        bg.setText("jLabel1");
        bgMain.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 464, 699));

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

        btnCargar.setBackground(new java.awt.Color(98, 126, 216));
        btnCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cargar.setBackground(new java.awt.Color(255, 255, 255));
        cargar.setFont(new java.awt.Font("Changa One", 0, 24)); // NOI18N
        cargar.setForeground(new java.awt.Color(255, 255, 255));
        cargar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cargar.setText("CARGAR DATOS");
        cargar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cargarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cargarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnCargarLayout = new javax.swing.GroupLayout(btnCargar);
        btnCargar.setLayout(btnCargarLayout);
        btnCargarLayout.setHorizontalGroup(
            btnCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargar, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnCargarLayout.setVerticalGroup(
            btnCargarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        bgMain.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 280, 90));

        btnVer.setBackground(new java.awt.Color(98, 126, 216));
        btnVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ver.setBackground(new java.awt.Color(255, 255, 255));
        ver.setFont(new java.awt.Font("Changa One", 0, 24)); // NOI18N
        ver.setForeground(new java.awt.Color(255, 255, 255));
        ver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ver.setText("VER DATOS");
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                verMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                verMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVerLayout = new javax.swing.GroupLayout(btnVer);
        btnVer.setLayout(btnVerLayout);
        btnVerLayout.setHorizontalGroup(
            btnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnVerLayout.setVerticalGroup(
            btnVerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ver, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        bgMain.add(btnVer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 280, 90));

        btnSalir.setBackground(new java.awt.Color(98, 126, 216));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setFont(new java.awt.Font("Changa One", 0, 24)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText("SALIR");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );

        bgMain.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

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

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

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

    private void cargarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarMouseEntered
        btnCargar.setBackground(new Color(101, 129, 222));
    }//GEN-LAST:event_cargarMouseEntered

    private void cargarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarMouseExited
        btnCargar.setBackground(new Color(98, 126, 216));
    }//GEN-LAST:event_cargarMouseExited

    private void verMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseEntered
        btnVer.setBackground(new Color(101, 129, 222));
    }//GEN-LAST:event_verMouseEntered

    private void verMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseExited
        btnVer.setBackground(new Color(98, 126, 216));
    }//GEN-LAST:event_verMouseExited

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        btnSalir.setBackground(new Color(98, 126, 216));
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        btnSalir.setBackground(new Color(101, 129, 222));
    }//GEN-LAST:event_salirMouseEntered

    private void cargarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargarMouseClicked
        
        CargaDatos pantalla = new CargaDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }//GEN-LAST:event_cargarMouseClicked

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgMain;
    private javax.swing.JPanel btnCargar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel btnSalir;
    private javax.swing.JPanel btnVer;
    private javax.swing.JLabel cargar;
    private javax.swing.JPanel header;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel salir;
    private javax.swing.JLabel txtExit;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
