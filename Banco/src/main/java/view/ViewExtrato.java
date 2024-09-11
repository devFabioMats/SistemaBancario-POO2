package view;
import model.Conta;
import model.Usuario;
import model.Extrato;
import controller.ExtratoControle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

    public class ViewExtrato extends javax.swing.JFrame {
        int login;
        String senha;
        public void pegarDados(int login, String senha){
            this.login = login;
            this.senha = senha;
        }
        public void lerTabela(){
            DefaultTableModel modelo = (DefaultTableModel) jExtrato.getModel();
            ExtratoControle extrato = new ExtratoControle();
            for(Extrato e: extrato.pegarExtrato(login, senha)){
                modelo.addRow(new Object[]{
                    "R$ " + e.getValor(),
                    e.getTipo(),
                    e.getNumero(),
                    e.getCpf()
                });
            }
        }
    public ViewExtrato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jExtrato = new javax.swing.JTable();
        lTitulo = new javax.swing.JLabel();
        btVer = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jExtrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Tipo", "Conta", "CPF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jExtrato);

        lTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lTitulo.setText("Extrato");

        btVer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVer.setText("Ver Extrato");
        btVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVerActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVoltar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(btVer)
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        ViewUsuario tela = new ViewUsuario();
        tela.receberDados(login, senha);
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVerActionPerformed
        try{
            lerTabela();
            btVer.setEnabled(false);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Insira Dados Validos", "Falha no Login", 2);
        }
    }//GEN-LAST:event_btVerActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVer;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jExtrato;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lTitulo;
    // End of variables declaration//GEN-END:variables
}
