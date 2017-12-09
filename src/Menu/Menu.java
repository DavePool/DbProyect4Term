package Menu;
import AppPackage.AnimationClass;
public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelArriba = new javax.swing.JPanel();
        panelExit = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelMinimizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        panelAltas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelModificaciones = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        labelAlta = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        labelModificar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelArriba.setBackground(new java.awt.Color(44, 150, 117));
        panelArriba.setPreferredSize(new java.awt.Dimension(843, 40));
        panelArriba.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelArribaMouseDragged(evt);
            }
        });
        panelArriba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelArribaMousePressed(evt);
            }
        });
        panelArriba.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelExit.setBackground(new java.awt.Color(44, 150, 117));
        panelExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelExit.setPreferredSize(new java.awt.Dimension(51, 30));
        panelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelExitMouseExited(evt);
            }
        });
        panelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-delete.png"))); // NOI18N
        panelExit.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        panelArriba.add(panelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        panelMinimizar.setBackground(new java.awt.Color(44, 150, 117));
        panelMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        panelMinimizar.setPreferredSize(new java.awt.Dimension(51, 30));
        panelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelMinimizarMouseExited(evt);
            }
        });
        panelMinimizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-compress.png"))); // NOI18N
        panelMinimizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        panelArriba.add(panelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Menu");
        panelArriba.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, -1, 60, 30));

        getContentPane().add(panelArriba, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 30));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(843, 457));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAltas.setBackground(new java.awt.Color(204, 204, 204));
        panelAltas.setPreferredSize(new java.awt.Dimension(100, 100));
        panelAltas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelAltasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelAltasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelAltasMouseExited(evt);
            }
        });
        panelAltas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-presentation.png"))); // NOI18N
        panelAltas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 50));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 28, 72));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Consultas");
        panelAltas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 90, -1));

        jPanel2.add(panelAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 130, 125));

        panelModificaciones.setBackground(new java.awt.Color(204, 204, 204));
        panelModificaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelModificacionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelModificacionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelModificacionesMouseExited(evt);
            }
        });
        panelModificaciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 28, 72));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Modificaciones");
        panelModificaciones.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 120, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-file.png"))); // NOI18N
        panelModificaciones.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 50, 50));

        jPanel2.add(panelModificaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 130, 125));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 28, 72));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Consultas");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, 60, -1, -1));

        labelAlta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/515958.jpg"))); // NOI18N
        jPanel2.add(labelAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(-175, 0, 170, 460));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 28, 72));
        jLabel13.setText("Modificaciones");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 40, -1, -1));

        labelModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/515958.jpg"))); // NOI18N
        jPanel2.add(labelModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(-175, 0, 160, 460));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 28, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario(1).png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 360, 80, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 840, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_panelExitMouseClicked

    private void panelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseEntered
        panelExit.setBackground(new java.awt.Color(204, 0, 0));
    }//GEN-LAST:event_panelExitMouseEntered

    private void panelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelExitMouseExited
        panelExit.setBackground(new java.awt.Color(44, 150, 117));
    }//GEN-LAST:event_panelExitMouseExited

    private void panelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseClicked
        this.setState(Menu.ICONIFIED);
    }//GEN-LAST:event_panelMinimizarMouseClicked

    private void panelMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseEntered
        panelMinimizar.setBackground(new java.awt.Color(0, 204, 204));
    }//GEN-LAST:event_panelMinimizarMouseEntered

    private void panelMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMinimizarMouseExited
        panelMinimizar.setBackground(new java.awt.Color(44, 150, 117));
    }//GEN-LAST:event_panelMinimizarMouseExited

    int xx, xy;
    private void panelArribaMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelArribaMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_panelArribaMouseDragged

    private void panelArribaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelArribaMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_panelArribaMousePressed

    private void panelAltasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAltasMouseEntered
        panelAltas.setBackground(new java.awt.Color(143, 143, 143));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));

        AnimationClass alta = new AnimationClass();
        alta.jLabelXRight(-175, 0, 10, 100, labelAlta);
        
        AnimationClass alta1 = new AnimationClass();
        alta1.jLabelXRight(-80, 50, 10, 100, jLabel12);
    }//GEN-LAST:event_panelAltasMouseEntered

    private void panelAltasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAltasMouseExited
        panelAltas.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setForeground(new java.awt.Color(0, 28, 72));
        
        AnimationClass alta = new AnimationClass();
        alta.jLabelXLeft(0, -175, 10, 5, labelAlta);
        
        AnimationClass alta1 = new AnimationClass();
        alta1.jLabelXLeft(50, -80, 10, 5, jLabel12);
    }//GEN-LAST:event_panelAltasMouseExited

    private void panelModificacionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificacionesMouseEntered
        panelModificaciones.setBackground(new java.awt.Color(143, 143, 143));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        
        AnimationClass modificacion = new AnimationClass();
        modificacion.jLabelXRight(-175, 0, 10, 100, labelModificar);
        
        AnimationClass modificacion1 = new AnimationClass();
        modificacion1.jLabelXRight(-160, 0, 10, 100, jLabel13);
    }//GEN-LAST:event_panelModificacionesMouseEntered

    private void panelModificacionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificacionesMouseExited
        panelModificaciones.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setForeground(new java.awt.Color(0, 28, 72));
        
        AnimationClass modificacion = new AnimationClass();
        modificacion.jLabelXLeft(0, -175, 10, 5, labelModificar);
        
        AnimationClass modificacion1 = new AnimationClass();
        modificacion1.jLabelXLeft(0, -160, 10, 5, jLabel13);
    }//GEN-LAST:event_panelModificacionesMouseExited

    private void panelAltasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelAltasMouseClicked
        this.dispose();
        new Con_Menu().show();
    }//GEN-LAST:event_panelAltasMouseClicked

    private void panelModificacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelModificacionesMouseClicked
        this.dispose();
        new Mod_Menu().show();
    }//GEN-LAST:event_panelModificacionesMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
        new añadir().show();
    }//GEN-LAST:event_jLabel4MouseClicked
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelAlta;
    private javax.swing.JLabel labelModificar;
    private javax.swing.JPanel panelAltas;
    private javax.swing.JPanel panelArriba;
    private javax.swing.JPanel panelExit;
    private javax.swing.JPanel panelMinimizar;
    private javax.swing.JPanel panelModificaciones;
    // End of variables declaration//GEN-END:variables
}
