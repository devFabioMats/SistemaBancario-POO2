
package view;
import controller.ClienteControle;
import model.Usuario;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.ViewCriarUsuario;
import view.ViewTransferir;
import view.ViewCartao;
import model.Login;
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lLogin = new javax.swing.JLabel();
        lCPF = new javax.swing.JLabel();
        jCPF = new javax.swing.JTextField();
        lSenha = new javax.swing.JLabel();
        jSenha = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        btCriar = new javax.swing.JButton();
        lCriar = new javax.swing.JLabel();
        lText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lTitulo.setText("Sistema Bancario");
        lTitulo.setToolTipText("");

        lLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lLogin.setText("Login");

        lCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCPF.setText("CPF");

        lSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lSenha.setText("Senha");

        btEntrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCriar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCriar.setText("Criar Conta");
        btCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarActionPerformed(evt);
            }
        });

        lCriar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lCriar.setText("Criar Conta");

        lText.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lText.setText("Crie uma conta clicando no botão abaixo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lSenha)
                            .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lLogin)
                            .addComponent(lCPF)
                            .addComponent(jCPF)
                            .addComponent(jSenha))
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCriar)
                            .addComponent(lText)
                            .addComponent(lCriar)))
                    .addComponent(btEntrar))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogin)
                    .addComponent(lCriar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCPF)
                    .addComponent(lText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lSenha)
                    .addComponent(btCriar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btEntrar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        try{
            Login login = new Login();
            login.setLogin(Integer.parseInt(jCPF.getText()));
            login.setSenha(jSenha.getText());
            ViewUsuario tela = new ViewUsuario();
            ClienteControle verificar = new ClienteControle();
            Usuario usuario = new Usuario();
            usuario = verificar.verificarLogin(Integer.parseInt(jCPF.getText()), jSenha.getText());
            if(usuario.getCpf() == Integer.parseInt(jCPF.getText()) && usuario.getSenha().equals(jSenha.getText())){
                tela.pegarDados(login);
                tela.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não cadastrado", "Falha no Login", 2);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarActionPerformed
        ViewCriarUsuario tela = new ViewCriarUsuario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCriarActionPerformed
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Principal tela = new Principal();
                tela.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                tela.setUndecorated(true);
                tela.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriar;
    private javax.swing.JButton btEntrar;
    private javax.swing.JTextField jCPF;
    private javax.swing.JTextField jSenha;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lCriar;
    private javax.swing.JLabel lLogin;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lText;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
