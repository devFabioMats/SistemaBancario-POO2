package view;

import controller.ClienteControle;
import controller.EmprestimoControle;
import javax.swing.JOptionPane;
import model.Conta;


public class ViewEmprestimo extends javax.swing.JFrame {
    int login;
    String senha;
    public void pegarDados(int login, String senha){
        this.login = login;
        this.senha = senha;
    }
    public ViewEmprestimo() {
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

        lTitulo = new javax.swing.JLabel();
        lQuantia = new javax.swing.JLabel();
        cbEmprestimo = new javax.swing.JComboBox<>();
        btPegar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        lPago = new javax.swing.JLabel();
        jPago = new javax.swing.JTextField();
        lPagar = new javax.swing.JLabel();
        jPagar = new javax.swing.JTextField();
        btPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lTitulo.setText("Empréstimo");

        lQuantia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lQuantia.setText("Selecione a quantia que deseja");

        cbEmprestimo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R$ 1.000,00", "R$ 2.500,00", "RS 3.000,00" }));
        cbEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmprestimoActionPerformed(evt);
            }
        });

        btPegar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPegar.setText("Pegar Empréstimo");
        btPegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPegarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        lPago.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPago.setText("Quantia Paga");

        jPago.setEditable(false);

        lPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lPagar.setText("Insira uma quantia");

        btPagar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btPagar.setText("Pagar");
        btPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagarActionPerformed(evt);
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
                        .addComponent(lQuantia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTitulo)
                        .addComponent(btPegar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbEmprestimo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btVoltar))
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPagar)
                            .addComponent(jPago)
                            .addComponent(lPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPagar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQuantia)
                    .addComponent(lPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btPegar)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btPagar)))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmprestimoActionPerformed

    }//GEN-LAST:event_cbEmprestimoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ViewUsuario tela = new ViewUsuario();
        tela.receberDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btPegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPegarActionPerformed
        try{
            EmprestimoControle pegar = new EmprestimoControle();
            Conta conta = new Conta();
            ClienteControle receber = new ClienteControle();
            conta = receber.consultar3(login, senha);
            if(cbEmprestimo.getSelectedIndex() == 0){
                pegar.pegarEmprestimo(login, senha, 1000, conta);
                JOptionPane.showMessageDialog(null, "Emprestimo realizado", "Emprestimo", 2);
            }else if(cbEmprestimo.getSelectedIndex()==1){
                pegar.pegarEmprestimo(login, senha, 2500, conta);
                JOptionPane.showMessageDialog(null, "Emprestimo realizado", "Emprestimo", 2);
            }else if(cbEmprestimo.getSelectedIndex()==2){
                pegar.pegarEmprestimo(login, senha, 3000, conta);
                JOptionPane.showMessageDialog(null, "Emprestimo realizado", "Emprestimo", 2);
            }
            jPago.setText("0");
            btPegar.setEnabled(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2);
        }
    }//GEN-LAST:event_btPegarActionPerformed

    private void btPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagarActionPerformed
        try{
            EmprestimoControle pagar = new EmprestimoControle();
            Conta conta = new Conta();
            ClienteControle pegar = new ClienteControle();
            conta = pegar.consultar3(login, senha);
            if(conta.getSaldo() >= Float.valueOf(jPagar.getText())){
                pagar.pagarEmprestimo(login, senha, Float.valueOf(jPagar.getText()), conta);
                jPago.setText("R$" + Float.valueOf(jPagar.getText()));
                jPagar.setText("");
                JOptionPane.showMessageDialog(null, "Emprestimo Pago com sucesso", "Emprestimo", 2);
            }else {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Transferencia Fracassada", 1);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "ERRO", 2);
        }
    }//GEN-LAST:event_btPagarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPagar;
    private javax.swing.JButton btPegar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbEmprestimo;
    private javax.swing.JTextField jPagar;
    private javax.swing.JTextField jPago;
    private javax.swing.JLabel lPagar;
    private javax.swing.JLabel lPago;
    private javax.swing.JLabel lQuantia;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
