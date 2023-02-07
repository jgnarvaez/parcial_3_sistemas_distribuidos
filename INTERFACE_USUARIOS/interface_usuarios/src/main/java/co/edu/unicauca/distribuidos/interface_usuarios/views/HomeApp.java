/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.unicauca.distribuidos.interface_usuarios.views;

import javax.swing.JMenu;
import javax.swing.JOptionPane;


public class HomeApp extends javax.swing.JFrame {
    static public String tipoUserHome;
    /**
     * Creates new form HomeApp
     */
    public HomeApp() {
        initComponents();
        iniciaValores();
    }
    public HomeApp(String tipoUser) {
        tipoUserHome=tipoUser;
        initComponents();
        iniciaValores();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPaneHiloAlterno = new javax.swing.JDesktopPane();
        jButtonCerrar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(741, 402));
        setResizable(false);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setMaximumSize(new java.awt.Dimension(734, 280));
        Contenedor.setMinimumSize(new java.awt.Dimension(734, 280));
        Contenedor.setPreferredSize(new java.awt.Dimension(734, 280));
        Contenedor.setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(249, 249, 249));
        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("entraste");
        Contenedor.add(jLabel1, java.awt.BorderLayout.CENTER);
        Contenedor.add(jDesktopPaneHiloAlterno, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(Contenedor, java.awt.BorderLayout.CENTER);

        jButtonCerrar.setBackground(new java.awt.Color(249, 249, 249));
        jButtonCerrar.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButtonCerrar.setForeground(new java.awt.Color(51, 153, 255));
        jButtonCerrar.setText("Cerrrar Sesion");
        jButtonCerrar.setToolTipText("");
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCerrar.setMargin(new java.awt.Insets(8, 14, 8, 14));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCerrar, java.awt.BorderLayout.PAGE_END);

        jMenuBar1.setBackground(new java.awt.Color(249, 249, 249));
        jMenuBar1.setFocusCycleRoot(true);
        jMenuBar1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N

        jMenu3.setText("|");
        jMenu3.setToolTipText("fffffffffffffff");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
             JOptionPane.showMessageDialog(null, "hola");
    
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        // TODO add your handling code here:
        int salida =JOptionPane.showConfirmDialog(null , "Desea Salir de la Aplicacion" 
                , "Exit", JOptionPane.YES_NO_OPTION);
        if (salida==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonCerrarActionPerformed
    private void RegistraProductoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
             // JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio3 registro= new servicio3();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
     private void ListarProductoMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio4 registro= new servicio4();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
      private void AbrirCerrarSubastaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio5 registro= new servicio5();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
       private void MenuListProductoSubastadosNoSubastadosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio6 registro= new servicio6();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
     private void MenuConsultarProductoSubastadosNoSubastadosMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio7 registro= new servicio7();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
      private void MenuProductosSubastadosOfertasMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio8 registro= new servicio8();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
    }  
       private void MenuHacerOfertaMouseClicked(java.awt.event.MouseEvent evt) {                                    
        // TODO add your handling code here:
              //JOptionPane.showMessageDialog(null, "cambiando el panel");
             servicio9 registro= new servicio9();
             Contenedor.removeAll();
             Contenedor.add(registro);
             registro.setVisible(true);
             pack();
    
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
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JDesktopPane jDesktopPaneHiloAlterno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

    private void iniciaValores() {
        
        this.jLabel1.setText("Bienvenido "+tipoUserHome+".");
        
        
        if(tipoUserHome.equals("admin")){
            JMenu MenuRegistraProducto = new javax.swing.JMenu();
            JMenu MenuListarProductosOfertar = new javax.swing.JMenu();
            JMenu MenuAbrirCerrarSubasta = new javax.swing.JMenu();

            MenuRegistraProducto.setText("RegistrarProducto");
            MenuRegistraProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistraProductoMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuRegistraProducto);

            MenuListarProductosOfertar.setText("ListarProductoO");
              MenuListarProductosOfertar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListarProductoMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuListarProductosOfertar);

            MenuAbrirCerrarSubasta.setText("Abre/CierraSubasta");
             MenuAbrirCerrarSubasta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AbrirCerrarSubastaMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuAbrirCerrarSubasta);
            
        }
        if(tipoUserHome.equals("cliente")){
            servicio8 s8 =new servicio8();
            s8.setVisible(true);
            
            JMenu MenuListProductoSubastadosNoSubastados = new javax.swing.JMenu();

            JMenu MenuConsultarProducto = new javax.swing.JMenu();
            JMenu MenuProductosSubastadosOfertas = new javax.swing.JMenu();
            JMenu MenuHacerOferta = new javax.swing.JMenu();

            MenuListProductoSubastadosNoSubastados.setText("Subastados/NoSubastados");
             MenuListProductoSubastadosNoSubastados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuListProductoSubastadosNoSubastadosMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuListProductoSubastadosNoSubastados);

            MenuConsultarProducto.setText("ConsultarProducto");
            MenuConsultarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuConsultarProductoSubastadosNoSubastadosMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuConsultarProducto);

            MenuProductosSubastadosOfertas.setText("ProductosSubastadosOfertas");
            MenuProductosSubastadosOfertas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuProductosSubastadosOfertasMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuProductosSubastadosOfertas);

            MenuHacerOferta.setText("HacerOferta");
             MenuHacerOferta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHacerOfertaMouseClicked(evt);
                }
            });
            jMenuBar1.add(MenuHacerOferta);
        }
        setJMenuBar(jMenuBar1);
       }
}
