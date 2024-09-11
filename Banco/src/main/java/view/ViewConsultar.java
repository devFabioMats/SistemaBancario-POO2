/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import controller.ClienteControle;
import javax.swing.JOptionPane;
import model.Usuario;
import model.Login;
import model.Endereco;
import model.Conta;
import view.Principal;


public class ViewConsultar extends javax.swing.JFrame {
    int login;
    String senha;
    Usuario usuario = new Usuario();
    Conta conta = new Conta();
    Endereco ender = new Endereco();
    ClienteControle consultar = new ClienteControle();
    public void pegarDados(int login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public void mostrar(){
        usuario = consultar.consultar(login,senha);
        ender = consultar.consultar2(login, senha);
        conta = consultar.consultar3(login, senha);
        jNome.setText(usuario.getNome());
        jCpf.setText(Integer.toString(usuario.getCpf()));
        jAgencia.setText(Integer.toString(conta.getAgencia()));
        jNumeroConta.setText(Integer.toString(conta.getNumero()));
        jCidade.setText(ender.getCidade());
        jRua.setText(ender.getRua());
        jNumero.setText(Integer.toString(ender.getNum()));
    }
    public ViewConsultar() {
        initComponents();          
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        lCpf = new javax.swing.JLabel();
        jCpf = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        jCidade = new javax.swing.JTextField();
        lRua = new javax.swing.JLabel();
        jRua = new javax.swing.JTextField();
        lAgencia = new javax.swing.JLabel();
        jNumero = new javax.swing.JTextField();
        lNumero = new javax.swing.JLabel();
        jNumeroConta = new javax.swing.JTextField();
        lNumeroConta = new javax.swing.JLabel();
        jAgencia = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setText("Seus Dados");

        lNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNome.setText("Nome");

        jNome.setEditable(false);
        jNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNomeActionPerformed(evt);
            }
        });

        lCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCpf.setText("CPF");

        jCpf.setEditable(false);

        lCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lCidade.setText("Cidade");

        jCidade.setEditable(false);

        lRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lRua.setText("Rua");

        jRua.setEditable(false);
        jRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRuaActionPerformed(evt);
            }
        });

        lAgencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lAgencia.setText("Agencia");

        jNumero.setEditable(false);

        lNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNumero.setText("Numero");

        jNumeroConta.setEditable(false);

        lNumeroConta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lNumeroConta.setText("Numero Da Conta");

        jAgencia.setEditable(false);

        btVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btVer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVer.setText("Visualizar Dados");
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVer)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lTitulo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(lRua, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNumero)
                                    .addComponent(jNumeroConta)
                                    .addComponent(jAgencia)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNome)
                    .addComponent(lNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCpf)
                    .addComponent(lNumeroConta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNumeroConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCidade)
                    .addComponent(lAgencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAgencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lRua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVoltar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVer)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRuaActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ViewUsuario tela = new ViewUsuario();
        tela.receberDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void jNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNomeActionPerformed

    }//GEN-LAST:event_jNomeActionPerformed

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        try{
            mostrar();   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2);
        }
    }//GEN-LAST:event_btVerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVer;
    private javax.swing.JButton btVoltar;
    private javax.swing.JTextField jAgencia;
    private javax.swing.JTextField jCidade;
    private javax.swing.JTextField jCpf;
    private javax.swing.JTextField jNome;
    private javax.swing.JTextField jNumero;
    private javax.swing.JTextField jNumeroConta;
    private javax.swing.JTextField jRua;
    private javax.swing.JLabel lAgencia;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lNumeroConta;
    private javax.swing.JLabel lRua;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
