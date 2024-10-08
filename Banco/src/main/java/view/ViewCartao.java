package view;
import model.CartaoVirtual;
import controller.CartaoControle;
import controller.ClienteControle;
import java.util.Random;
import javax.swing.JOptionPane;
import model.Conta;

public class ViewCartao extends javax.swing.JFrame {
    int login;
    String senha;
    public void pegarDados(int login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public ViewCartao() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lSaldo = new javax.swing.JLabel();
        jSaldo = new javax.swing.JTextField();
        lDados = new javax.swing.JLabel();
        jNum = new javax.swing.JTextField();
        lNum = new javax.swing.JLabel();
        lCvv = new javax.swing.JLabel();
        jCvv = new javax.swing.JTextField();
        btGerar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setText("Gerar Cartão Virtual");

        lSaldo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lSaldo.setText("Digite o saldo que deseja para o cartão");

        jSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaldoActionPerformed(evt);
            }
        });

        lDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lDados.setText("Dados Do Cartão");

        jNum.setEditable(false);

        lNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNum.setText("Numero");

        lCvv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCvv.setText("CVV");

        jCvv.setEditable(false);

        btGerar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btGerar.setText("Gerar Cartao");
        btGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGerarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTitulo)
                        .addComponent(jSaldo))
                    .addComponent(btGerar)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lCvv)
                        .addComponent(lNum)
                        .addComponent(jNum)
                        .addComponent(jCvv, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lDados))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSaldo)
                    .addComponent(lDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lCvv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btGerar))))
                .addGap(17, 17, 17)
                .addComponent(btVoltar)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSaldoActionPerformed

    private void btGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGerarActionPerformed
        try{
            CartaoVirtual cartao = new CartaoVirtual();
            cartao.setLimite(Integer.parseInt(jSaldo.getText()));
            CartaoControle controle = new CartaoControle();
            Conta conta = new Conta();
            ClienteControle pega = new ClienteControle();
            conta = pega.consultar3(login, senha);
            if(conta.getSaldo()>=cartao.getLimite()){
                controle.gerarCartão(cartao, login, senha);
                jCvv.setText(Integer.toString(cartao.getCvv()));
                jNum.setText(Long.toString(cartao.getCartao()));
                JOptionPane.showMessageDialog(null, "Cartão Gerado com sucesso", "Cartão gerado", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Transferencia Fracassada", 1);
            }
        }catch(Exception ex){    
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2); 
        }
    }//GEN-LAST:event_btGerarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ViewUsuario tela = new ViewUsuario();
        tela.receberDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btGerar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField jCvv;
    private javax.swing.JTextField jNum;
    private javax.swing.JTextField jSaldo;
    private javax.swing.JLabel lCvv;
    private javax.swing.JLabel lDados;
    private javax.swing.JLabel lNum;
    private javax.swing.JLabel lSaldo;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
