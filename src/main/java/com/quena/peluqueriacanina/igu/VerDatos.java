package com.quena.peluqueriacanina.igu;

import com.quena.peluqueriacanina.logica.Controladora;
import com.quena.peluqueriacanina.logica.Mascota;
import java.awt.Color;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JFrame {

    int xMouse, yMouse;

    Controladora control = null;

    public VerDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgMain = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        btnEditar = new javax.swing.JPanel();
        txtEditar = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JPanel();
        txtEliminar = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnExit = new javax.swing.JPanel();
        txtExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        bgMain.setBackground(new java.awt.Color(255, 255, 255));
        bgMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\PERRUQUERIA.png")); // NOI18N
        bgMain.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 110, 370, 410));

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtEditar.setFont(new java.awt.Font("Changa One", 0, 22)); // NOI18N
        txtEditar.setForeground(new java.awt.Color(98, 126, 216));
        txtEditar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEditar.setText("EDITAR");
        txtEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEditarLayout = new javax.swing.GroupLayout(btnEditar);
        btnEditar.setLayout(btnEditarLayout);
        btnEditarLayout.setHorizontalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
            .addGroup(btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEditarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        btnEditarLayout.setVerticalGroup(
            btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
            .addGroup(btnEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEditarLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(txtEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bgMain.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 570, 160, 90));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        txtEliminar.setFont(new java.awt.Font("Changa One", 0, 22)); // NOI18N
        txtEliminar.setForeground(new java.awt.Color(98, 126, 216));
        txtEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtEliminar.setText("ELIMINAR");
        txtEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout btnEliminarLayout = new javax.swing.GroupLayout(btnEliminar);
        btnEliminar.setLayout(btnEliminarLayout);
        btnEliminarLayout.setHorizontalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
            .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
        );
        btnEliminarLayout.setVerticalGroup(
            btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
            .addGroup(btnEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnEliminarLayout.createSequentialGroup()
                    .addComponent(txtEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        bgMain.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 570, 150, 90));

        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\allos\\Documents\\0-programacion\\PeluqueriaCanina\\src\\main\\java\\com\\quena\\peluqueriacanina\\imgs\\fondo.png")); // NOI18N
        bg.setText("jLabel1");
        bgMain.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 380, 700));

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
        txtExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        jLabel1.setText("VISUALIZACIÓN DE DATOS");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bgMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, 90));

        jLabel2.setFont(new java.awt.Font("Changa One", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 126, 216));
        jLabel2.setText("DATOS DE MASCOTAS");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaVer.setBackground(new java.awt.Color(255, 255, 255));
        tablaVer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaVer.setFont(new java.awt.Font("Changa One", 0, 12)); // NOI18N
        tablaVer.setForeground(new java.awt.Color(102, 102, 102));
        tablaVer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaVer.setToolTipText("");
        tablaVer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tablaVer.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tablaVer);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        bgMain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 680, 580));

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JPanel bgMain;
    private javax.swing.JPanel btnEditar;
    private javax.swing.JPanel btnEliminar;
    private javax.swing.JPanel btnExit;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tablaVer;
    private javax.swing.JLabel txtEditar;
    private javax.swing.JLabel txtEliminar;
    private javax.swing.JLabel txtExit;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        // Definir modelo
        DefaultTableModel tabla = new DefaultTableModel(){
        
            @Override
            public boolean isCellEditable (int row , int column){
               return false; 
            }
            
        };
        
        // Columnas 
        String titulos[] = {"Num", "Nombre", "Color","Raza", "Alérgico", "At. Esp." , "Dueeño", "Cel"};
        
        tabla.setColumnIdentifiers(titulos);
        
        // carga desde BD
        List<Mascota> listaMascotas = control.traerMascotas();
        
        // recorrer y mostrar
        if(listaMascotas != null){
            for(Mascota mascota : listaMascotas){
                Object[] objeto = {mascota.getId_mascota(), mascota.getNombre(), mascota.getColor(), mascota.getRaza(), mascota.isAlergico(), mascota.isAtencion_especial(), mascota.getDuenio().getNombre(), mascota.getDuenio().getCelular()};
                
                tabla.addRow(objeto);
            }
        }
        
        tablaVer.setModel(tabla);
    }
}
