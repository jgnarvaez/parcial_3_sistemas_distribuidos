package co.edu.unicauca.distribuidos.interface_usuarios.views;

import co.edu.unicauca.distribuidos.interface_usuarios.models.ProductoDTO;
import co.edu.unicauca.distribuidos.interface_usuarios.services.ProductoServices;
import javax.swing.JOptionPane;

public class servicio3 extends javax.swing.JPanel {

    /**
     * Creates new form servicio3
     */
    public servicio3() {
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
        jLabelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(734, 280));
        setMinimumSize(new java.awt.Dimension(734, 280));
        setPreferredSize(new java.awt.Dimension(643, 344));
        setLayout(new java.awt.BorderLayout());

        jLabeltitulo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabeltitulo.setForeground(new java.awt.Color(51, 153, 255));
        jLabeltitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabeltitulo.setText("Nuevo Producto");
        add(jLabeltitulo, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabelCodigo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelCodigo.setText("Codigo");

        jTextFieldCodigo.setBackground(new java.awt.Color(247, 247, 247));
        jTextFieldCodigo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(51, 153, 255));
        jTextFieldCodigo.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabelNombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jTextFieldNombre.setBackground(new java.awt.Color(247, 247, 247));
        jTextFieldNombre.setForeground(new java.awt.Color(51, 153, 255));
        jTextFieldNombre.setPreferredSize(new java.awt.Dimension(64, 20));

        jLabelValor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelValor.setText("Valor Inicial");

        jTextFieldValor.setBackground(new java.awt.Color(247, 247, 247));
        jTextFieldValor.setForeground(new java.awt.Color(51, 153, 255));
        jTextFieldValor.setPreferredSize(new java.awt.Dimension(64, 20));
        jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldValorKeyTyped(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(0, 153, 255));
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCodigo)
                            .addComponent(jLabelValor))
                        .addContainerGap(422, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabelValor)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrar)
                        .addGap(14, 14, 14))))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        try {
            ProductoServices objProductoServices = new ProductoServices();
            if (objProductoServices.consultarProducto(jTextFieldCodigo.getText())==null) {
                ProductoDTO objProducto = new ProductoDTO(jTextFieldCodigo.getText(), jTextFieldNombre.getText(), Integer.valueOf(jTextFieldValor.getText()));
                ProductoDTO objProductoRegistrado = objProductoServices.registrarProducto(objProducto);
                JOptionPane.showMessageDialog(null, "PRODUCTO REGISTRADO CON EXITO!!!");
            
                jTextFieldCodigo.setText("");
                jTextFieldNombre.setText("");
                jTextFieldValor.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "EL CODIGO DEL PRODUCTO YA EXISTE!!!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception NullException) {
            JOptionPane.showMessageDialog(null, "PRODUCTO NO REGISTRADO!!!","ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
        // TODO add your handling code here:
        char c=evt.getKeyChar();
        if(c<'0' || c>'9')evt.consume();
    }//GEN-LAST:event_jTextFieldValorKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JLabel jLabeltitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
