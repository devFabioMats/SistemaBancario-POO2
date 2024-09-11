/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import view.Principal;
import model.Login;
import model.Conta;
import controller.ClienteControle;
import javax.swing.JOptionPane;
public class ViewUsuario extends javax.swing.JFrame {
    int login;
    String senha;
    ClienteControle consultar = new ClienteControle();
    Conta conta = new Conta();
    public void pegarDados(Login login){
        this.login = login.getLogin();
        this.senha = login.getSenha();
    };
    public void receberDados(int login, String senha){
        this.login = login;
        this.senha = senha;
    };
    public void getSaldo(){
        conta = consultar.consultar3(login, senha);
        jSaldo.setText("R$" + Float.toString(conta.getSaldo()));
    };
    public ViewUsuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lConta = new javax.swing.JLabel();
        lSaldo = new javax.swing.JLabel();
        jSaldo = new javax.swing.JTextField();
        btTransferir = new javax.swing.JButton();
        btCartao = new javax.swing.JButton();
        btEmprestimo = new javax.swing.JButton();
        btInvestir = new javax.swing.JButton();
        btVer = new javax.swing.JButton();
        btAlterar = new javax.swing.JButton();
        btEncerrar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        btRecarregar = new javax.swing.JButton();
        btSaldo = new javax.swing.JButton();
        btExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lConta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lConta.setText("sua conta");
        lConta.setInheritsPopupMenu(false);

        lSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lSaldo.setText("saldo:");
        lSaldo.setInheritsPopupMenu(false);

        jSaldo.setEditable(false);
        jSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSaldoActionPerformed(evt);
            }
        });

        btTransferir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btTransferir.setText("Transferir");
        btTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTransferirActionPerformed(evt);
            }
        });

        btCartao.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btCartao.setText("Gerar Cartão");
        btCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCartaoActionPerformed(evt);
            }
        });

        btEmprestimo.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btEmprestimo.setText("Empréstimo");
        btEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmprestimoActionPerformed(evt);
            }
        });

        btInvestir.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btInvestir.setText("Investir");
        btInvestir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInvestirActionPerformed(evt);
            }
        });

        btVer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVer.setText("Consultar Dados");
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btAlterar.setText("Alterar Dados");
        btAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarActionPerformed(evt);
            }
        });

        btEncerrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEncerrar.setText("Encerrar Conta");
        btEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEncerrarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        btRecarregar.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btRecarregar.setText("Recarregar Creditos");
        btRecarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRecarregarActionPerformed(evt);
            }
        });

        btSaldo.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btSaldo.setText("ver saldo");
        btSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaldoActionPerformed(evt);
            }
        });

        btExtrato.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btExtrato.setText("Extrato");
        btExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lConta)
                    .addComponent(btVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btEncerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btTransferir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btCartao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEmprestimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btInvestir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRecarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExtrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSaldo)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lConta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSaldo)
                            .addComponent(btSaldo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTransferir)
                    .addComponent(btVer))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAlterar)
                    .addComponent(btCartao))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEncerrar)
                    .addComponent(btEmprestimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btInvestir))
                .addGap(18, 18, 18)
                .addComponent(btRecarregar)
                .addGap(18, 18, 18)
                .addComponent(btExtrato)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmprestimoActionPerformed
        ViewEmprestimo tela = new ViewEmprestimo();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btEmprestimoActionPerformed

    private void btInvestirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInvestirActionPerformed
        ViewInvestir tela = new ViewInvestir();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btInvestirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        ViewAlterar tela = new ViewAlterar();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void btEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEncerrarActionPerformed
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja excluir sua conta?", "Cuidado",
                    JOptionPane.YES_NO_OPTION);
        if(opcao == JOptionPane.YES_OPTION){
            ClienteControle deletar = new ClienteControle();
            deletar.deletar(login, senha);
            JOptionPane.showMessageDialog(null, "Conta Excluida com sucesso", "Conta Excluida", 1);
            Principal tela = new Principal();
            tela.setVisible(true);
            dispose();
        }                

    }//GEN-LAST:event_btEncerrarActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        Principal tela = new Principal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCartaoActionPerformed
        ViewCartao tela = new ViewCartao();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCartaoActionPerformed

    private void btTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTransferirActionPerformed
        ViewTransferir tela = new ViewTransferir();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btTransferirActionPerformed

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        ViewConsultar tela = new ViewConsultar();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVerActionPerformed

    private void btRecarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRecarregarActionPerformed
        ViewRecarga tela = new ViewRecarga();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btRecarregarActionPerformed

    private void jSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSaldoActionPerformed

    }//GEN-LAST:event_jSaldoActionPerformed

    private void btSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaldoActionPerformed
        getSaldo();
    }//GEN-LAST:event_btSaldoActionPerformed

    private void btExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExtratoActionPerformed
        ViewExtrato tela = new ViewExtrato();
        tela.pegarDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btExtratoActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btCartao;
    private javax.swing.JButton btEmprestimo;
    private javax.swing.JButton btEncerrar;
    private javax.swing.JButton btExtrato;
    private javax.swing.JButton btInvestir;
    private javax.swing.JButton btRecarregar;
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSaldo;
    private javax.swing.JButton btTransferir;
    private javax.swing.JButton btVer;
    private javax.swing.JTextField jSaldo;
    private javax.swing.JLabel lConta;
    private javax.swing.JLabel lSaldo;
    // End of variables declaration//GEN-END:variables
}
