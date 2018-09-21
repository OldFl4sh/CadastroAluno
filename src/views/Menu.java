/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblLogoutMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        optCadastros = new javax.swing.JMenuItem();
        optListar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );

        lblLogoutMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\supdesenvolvimento\\Documents\\CadastroAluno\\ico\\logout50.png")); // NOI18N
        lblLogoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMenuMouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setForeground(new java.awt.Color(102, 102, 102));

        menuArquivo.setForeground(new java.awt.Color(204, 204, 204));
        menuArquivo.setText("Arquivo");

        optCadastros.setBackground(new java.awt.Color(51, 51, 51));
        optCadastros.setForeground(new java.awt.Color(204, 204, 204));
        optCadastros.setText("Cadastros");
        optCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCadastrosActionPerformed(evt);
            }
        });
        menuArquivo.add(optCadastros);

        optListar.setBackground(new java.awt.Color(51, 51, 51));
        optListar.setForeground(new java.awt.Color(204, 204, 204));
        optListar.setText("Listar");
        optListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optListarActionPerformed(evt);
            }
        });
        menuArquivo.add(optListar);

        jMenuBar1.add(menuArquivo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblLogoutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                .addComponent(lblLogoutMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCadastrosActionPerformed
        Cadastros cad = new Cadastros();
        
        cad.setVisible(true);
    }//GEN-LAST:event_optCadastrosActionPerformed

    private void lblLogoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMenuMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblLogoutMenuMouseClicked

    private void optListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optListarActionPerformed
        Listar list = new Listar();
        
        list.setVisible(true);
    }//GEN-LAST:event_optListarActionPerformed

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
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoutMenu;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem optCadastros;
    private javax.swing.JMenuItem optListar;
    // End of variables declaration//GEN-END:variables
}
