
package com.mycompany.calculodetintam2.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Giuliano Vianna
 * data: 22/12/2023
 */
public class CalculoDeTintaM2View extends javax.swing.JFrame {

    /**
     * Creates new form CalculoDeTintaM2View
     */
    public CalculoDeTintaM2View() {
        initComponents();

        // Centraliza a janela
        setLocationRelativeTo(null);

        //colocar icone na janela
        //setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagens/icone.png"))); 


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxDemao = new javax.swing.JComboBox<>();
        txtLargura = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalM2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLitrosDeTinta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cálculo - Tinta - M2");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        cbxDemao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantidade Demão", "1 Demão", "2 Demão", "3 Demão" }));

        txtLargura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setText("Largura:");

        txtAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Altura:");

        txtTotalM2.setEditable(false);
        txtTotalM2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Total:");

        txtLitrosDeTinta.setEditable(false);
        txtLitrosDeTinta.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setText("L de Tinta:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        jLabel5.setText("M");

        jLabel6.setText("M");

        jLabel7.setText("M²");

        jLabel8.setText("L");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtLargura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAltura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalM2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLitrosDeTinta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(cbxDemao, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(cbxDemao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtLargura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLitrosDeTinta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAlturaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        calcularLitrosTinta();
    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(CalculoDeTintaM2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculoDeTintaM2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculoDeTintaM2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculoDeTintaM2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculoDeTintaM2View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JComboBox<String> cbxDemao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtLargura;
    private javax.swing.JTextField txtLitrosDeTinta;
    private javax.swing.JTextField txtTotalM2;
    // End of variables declaration//GEN-END:variables

    private double totalM2 = 0.0;
    private double totalLitrosTinta = 0.0;

    /**
     * Calcula a quantidade de litros de tinta necessária para pintar a área total em metros quadrados.
     * A quantidade de demãos de tinta é selecionada pelo usuário.
     * 
     * @throws CalculoInvalidoException se ocorrer um erro durante o cálculo
     */
    private void calcularLitrosTinta() {
        try {
            if (existeErroNosCampos()) {
                return;
            }
            
            calcularTotalM2();
            
            String demaoSelecionada = (String) cbxDemao.getSelectedItem();
            switch (demaoSelecionada) {
            case "1 Demão" -> totalLitrosTinta = totalM2 / 10;
            case "2 Demão" -> totalLitrosTinta = (totalM2 / 10) * 2;
            case "3 Demão" -> totalLitrosTinta = (totalM2 / 10) * 3;
            default -> {
                }
        }

            String totalLitrosTintaFormatado = String.format("%.2f", totalLitrosTinta);
            txtLitrosDeTinta.setText(totalLitrosTintaFormatado);

        } catch (CalculoInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Verifica se existem erros nos campos da tela.
     * 
     * @return true se houver algum erro nos campos, caso contrário, retorna false.
     */
    private boolean existeErroNosCampos() {
        if ("Quantidade Demão".equals(cbxDemao.getSelectedItem())) {
            JOptionPane.showMessageDialog(null, "Favor Selecionar a Quantidade de Demão!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            cbxDemao.requestFocus();
            return true;

        } else if (txtLargura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor Informar a Largura!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtLargura.requestFocus();
            return true;

        } else if (txtAltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Favor Informar a Altura!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            txtAltura.requestFocus();
            return true;

        }
        return false;
    }

    /**
     * Calcula o total de metros quadrados (m²) com base na largura e altura informadas.
     * 
     * @return O total de metros quadrados (m²) calculado.
     * @throws CalculoInvalidoException se a largura ou altura informada for inválida.
     */
    private double calcularTotalM2() throws CalculoInvalidoException {
        try {
            double largura = Double.parseDouble(txtLargura.getText().replace(",", "."));
            double altura = Double.parseDouble(txtAltura.getText().replace(",", "."));
            totalM2 = largura * altura;

            String totalM2Formatado = String.format("%.2f", totalM2);
            txtTotalM2.setText(totalM2Formatado);
            return totalM2;
        } catch (NumberFormatException error) {
            throw new CalculoInvalidoException("Entrada Inválida. Favor verificar as Medidas!");
        }
    }

    /**
     * Exceção lançada quando ocorre um cálculo inválido no programa CalculoDeTintaM2.
     */
    public class CalculoInvalidoException extends Exception {

        /**
         * Constrói uma nova instância da exceção com a mensagem especificada.
         * 
         * @param message a mensagem de erro
         */
        public CalculoInvalidoException(String message) {
            super(message);
        }
    }

    /**
     * Limpa os campos da interface de cálculo de tinta.
     */
    private void limparCampos() {
        cbxDemao.setSelectedItem("Quantidade Demão");
        txtLargura.setText("");
        txtAltura.setText("");
        txtTotalM2.setText("");
        txtLitrosDeTinta.setText("");

    }
}
