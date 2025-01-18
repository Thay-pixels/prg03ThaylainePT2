/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;
import br.com.ifba.curso.controller.CursoController;
import br.com.ifba.curso.controller.CursoIController;
import br.com.ifba.curso.entity.Curso;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


/**
 *
 * @author sunhe
 */

public class TelaCadastrar extends javax.swing.JFrame {

    //Variaveis para pegar os dados do curso.
    @Getter @Setter private String nomeCurso;
    @Getter @Setter private String codCurso;
    
    //private final TelaCurso telaCurso;
    
    //private final CursoIController cursoController = new CursoController();

    /**
     * Creates new form CadastrarCurso
     */
  
    public TelaCadastrar() {
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

        lblTituloCadastrar = new javax.swing.JLabel();
        lblInfoNomeCurso = new javax.swing.JLabel();
        lbldDescCurso = new javax.swing.JLabel();
        txtNomeCurso = new javax.swing.JTextField();
        txtIdCurso = new javax.swing.JTextField();
        btnEnviaCadastro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTituloCadastrar.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblTituloCadastrar.setText("CADASTRAR NOVO CURSO");

        lblInfoNomeCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblInfoNomeCurso.setText("NOME DO CURSO:");

        lbldDescCurso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldDescCurso.setText("CÓDIGO DO CURSO:");

        txtNomeCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeCursoActionPerformed(evt);
            }
        });

        txtIdCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdCursoActionPerformed(evt);
            }
        });

        btnEnviaCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnviaCadastro.setText("CADASTRAR");
        btnEnviaCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviaCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblTituloCadastrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfoNomeCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbldDescCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(btnEnviaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblTituloCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfoNomeCurso)
                    .addComponent(txtNomeCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldDescCurso)
                    .addComponent(txtIdCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(btnEnviaCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeCursoActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtNomeCursoActionPerformed

    private void txtIdCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdCursoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtIdCursoActionPerformed

    private void btnEnviaCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviaCadastroActionPerformed
        // TODO add your handling code here:
        
        
        //Faz a verificacao se todos os campos estão preenchidos.
        if(txtNomeCurso.getText().isEmpty() || txtIdCurso.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ERRO! PREENCHA TODOS OS CAMPOS!", "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }else{
            //Insere os dados obtidos da tela em um objeto Cuurso.
            Curso curso = new Curso();
            nomeCurso = txtNomeCurso.getText();
            curso.setNome(nomeCurso);
            codCurso = txtIdCurso.getText();
            curso.setCodCurso(codCurso);
            curso.setAtivo(true);

            //Salva as informações do curso no banco de dados.
            //cursoController.save(curso);

            //Atualiza a tabela de cursos e fecha a tela de cadastro
            this.dispose();
      
    }//GEN-LAST:event_btnEnviaCadastroActionPerformed
}
    
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
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviaCadastro;
    private javax.swing.JLabel lblInfoNomeCurso;
    private javax.swing.JLabel lblTituloCadastrar;
    private javax.swing.JLabel lbldDescCurso;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtNomeCurso;
    // End of variables declaration//GEN-END:variables


}
