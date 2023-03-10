package co.edu.unicauca.distribuidos.interface_usuarios.views;

import co.edu.unicauca.distribuidos.interface_usuarios.models.ProductoDTO;
import co.edu.unicauca.distribuidos.interface_usuarios.services.ProductoServices;
import javax.swing.JOptionPane;


public class servicio9 extends javax.swing.JPanel {

    /**
     * Creates new form servicio9
     */
    public servicio9() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabeltitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonRealizarOferta = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jLabeltitulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabeltitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabeltitulo.setForeground(new java.awt.Color(51, 153, 255));
        jLabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitulo.setText("Realizar Oferta");
        add(jLabeltitulo, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jButtonRealizarOferta.setBackground(new java.awt.Color(247, 247, 247));
        jButtonRealizarOferta.setForeground(new java.awt.Color(0, 153, 255));
        jButtonRealizarOferta.setText("OFERTAR");
        jButtonRealizarOferta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRealizarOferta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRealizarOfertaActionPerformed(evt);
            }
        });

        jLabelID.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelID.setForeground(new java.awt.Color(255, 255, 255));
        jLabelID.setText("Codigo Producto");

        jTextFieldValor.setBackground(new java.awt.Color(247, 247, 247));
        jTextFieldValor.setForeground(new java.awt.Color(51, 153, 255));
        jTextFieldValor.setPreferredSize(new java.awt.Dimension(64, 20));
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jLabelValor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelValor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelValor.setText("Valor Producto");

        jTextFieldID.setBackground(new java.awt.Color(247, 247, 247));
        jTextFieldID.setForeground(new java.awt.Color(51, 153, 255));
        jTextFieldID.setPreferredSize(new java.awt.Dimension(64, 20));
        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabelID))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelValor))
                .addGap(68, 68, 68))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jButtonRealizarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelID)
                    .addComponent(jLabelValor))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButtonRealizarOferta, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRealizarOfertaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRealizarOfertaActionPerformed
        try {
                if (!jTextFieldValor.getText().equals("") && !jTextFieldID.getText().equals("")) {
                    ProductoServices objProductoServices = new ProductoServices();
                    ProductoDTO objProducto = null;
                    objProducto = objProductoServices.consultarProductoSubastado(jTextFieldID.getText());
                    if (objProducto != null) {
                        if (objProducto.getValorInicial()<Integer.valueOf(jTextFieldValor.getText())) {
                            Boolean repuesta = objProductoServices.ofrecerOferta(objProducto, jTextFieldID.getText(), Integer.valueOf(jTextFieldValor.getText()));
                            if (repuesta) {
                                JOptionPane.showMessageDialog(null, "OFERTA REALIZADA CON EXITO!!!");
                                
                                  jTextFieldID.setText("");
                                  jTextFieldValor.setText("");
                            } else {
                                JOptionPane.showMessageDialog(null, "OFERTA NO REALIZADA!!!",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                                  jTextFieldValor.setText("");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "LA OFERTA REALIZADA DEBE SER MAYOR QUE EL VALOR INICIAL DEL PRODUCTO!!!",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL PRODUCTO PARA REALIZAR OFERTA!!!",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "LOS CAMPOS SON OBLIGATORIOS!!!",
                "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);
                }
        } catch (Exception NullException) {
            JOptionPane.showMessageDialog(null, "NO FUE POSIBLE APLICAR CAMBIOS!!!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRealizarOfertaActionPerformed

    private void jTextFieldIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyTyped
        
    }//GEN-LAST:event_jTextFieldIDKeyTyped

    private void jTextFieldValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldValorKeyPressed

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
       
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldValorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRealizarOferta;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
