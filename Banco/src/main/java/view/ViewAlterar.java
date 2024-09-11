/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ClienteControle;
import javax.swing.JOptionPane;

/**
 *
 * @author leoch
 */
public class ViewAlterar extends javax.swing.JFrame {
    int login;
    String senha;
    public void pegarDados(int login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public ViewAlterar() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lSenha = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        jSenha = new javax.swing.JTextField();
        lNum = new javax.swing.JLabel();
        jNum = new javax.swing.JTextField();
        lRua = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        btAlterar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setText("Alterar Dados");

        lSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lSenha.setText("Senha");

        jCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCidadeActionPerformed(evt);
            }
        });

        lCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCidade.setText("Cidade");

        lNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNum.setText("Numero");

        jNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNumActionPerformed(evt);
            }
        });

        lRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lRua.setText("Rua");

        jRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRuaActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
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
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lSenha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(lCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSenha, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btAlterar))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRua, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(lRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jNum))
                    .addComponent(btVoltar))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(lRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCidade)
                    .addComponent(lNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btVoltar))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCidadeActionPerformed

    private void jNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNumActionPerformed

    private void jRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRuaActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        try{
            ClienteControle alterar = new ClienteControle();
            if(jSenha.getText().length() > 0){
                alterar.alterarSenha(login, senha, jSenha.getText());
            }
            if(jCidade.getText().length() > 0){
                alterar.alterarEndereco1(login, senha, jCidade.getText());
            }
            if(jRua.getText().length() > 0){
                alterar.alterarEndereco2(login, senha, jRua.getText());
            }
            if(jNum.getText().length() > 0){
                alterar.alterarEndereco3(login,senha, Integer.parseInt(jNum.getText()));
            }
            ViewUsuario tela = new ViewUsuario();
            tela.receberDados(login, jSenha.getText());
            tela.setVisible(true);
            dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2);
        }
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ViewUsuario tela = new ViewUsuario();
        tela.receberDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jNum;
    private javax.swing.JTextField jRua;
    private javax.swing.JTextField jSenha;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lNum;
    private javax.swing.JLabel lRua;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
