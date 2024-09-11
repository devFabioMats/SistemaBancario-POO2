package view;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ViewSaque extends javax.swing.JFrame {

    private JTextField txtValor;
    private JButton btnSacar;

    public ViewSaque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        JLabel lblValor = new JLabel("Valor do Saque:");
        txtValor = new JTextField();
        btnSacar = new JButton("Sacar");

        btnSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtValor)
                    .addComponent(btnSacar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSacar)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnSacarActionPerformed(ActionEvent evt) {
        float valorSaque = Float.parseFloat(txtValor.getText());
        // LEMBRAR DE ADICIONAR LÓGICA PARA O SAQUE
        JOptionPane.showMessageDialog(this, "Saque de R$ " + valorSaque + " realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewSaque().setVisible(true);
            }
        });
    }
                 
}


