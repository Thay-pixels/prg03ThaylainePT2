/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.ifba.curso.view;

import br.com.ifba.curso.entity.Curso;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import br.com.ifba.curso.dao.CursoDao;
import br.com.ifba.curso.dao.CursoIDao;

/**
 *
 * @author sunhe
 */
public class CursoListar extends javax.swing.JFrame {
    CursoListar tela;
    //CursoFind cursoFind = new CursoFind();
    
    /**
     * Creates new form CursoListar
     */
    public CursoListar() {
        initComponents();
        //inserirDadosTela();
    }
    
    /*private void inserirDadosTela(){//Preenche a tabela com os dados do BD.
        CursoFind cursoFindInstance = new CursoFind();
        for(Curso curso : cursoFind.findAll()){
            Object[] cursos = {curso.getNome(), curso.getId(), curso.isAtivo()};
            DefaultTableModel dtmCursos = (DefaultTableModel) CursoListar.this.getTblListaCurso().getModel();
            dtmCursos.addRow(cursos);
        }  
    }*/

    //Getter e Setter Tabela e Caixa de Busca.
    public JTable getlistaCurso() {
        return listaCurso;
    }

    public void setlistaCurso(JTable listaCurso) {
        this.listaCurso = listaCurso;
    }

    public JTextField getTxtPegaBusca() {
        return txtPegaBusca;
    }

    public void setTxtPegaBusca(JTextField txtPegaBusca) {
        this.txtPegaBusca = txtPegaBusca;
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaCurso = new javax.swing.JTable();
        txtPegaBusca = new javax.swing.JTextField();
        btnCadastrarCurso = new javax.swing.JButton();
        btnEditarCurso = new javax.swing.JButton();
        btnRemoverCurso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaCurso.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        listaCurso.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        listaCurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURSO", "CÓDIGO", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(listaCurso);

        txtPegaBusca.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtPegaBusca.setText("      pesquisar...");
        txtPegaBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPegaBuscaActionPerformed(evt);
            }
        });

        btnCadastrarCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCadastrarCurso.setText("CADASTRAR CURSO");
        btnCadastrarCurso.setBorder(null);
        btnCadastrarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarCursoActionPerformed(evt);
            }
        });

        btnEditarCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEditarCurso.setText("EDITAR CURSO");
        btnEditarCurso.setBorder(null);
        btnEditarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCursoActionPerformed(evt);
            }
        });

        btnRemoverCurso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverCurso.setText("APAGAR CURSO");
        btnRemoverCurso.setBorder(null);
        btnRemoverCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCursoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPegaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemoverCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPegaBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoverCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPegaBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPegaBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPegaBuscaActionPerformed

    private void btnEditarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCursoActionPerformed
        // TODO add your handling code here:
        
        new EditarCurso().setVisible(true);//Linha que traz a tela de editar curso para a principal.
        
    }//GEN-LAST:event_btnEditarCursoActionPerformed

    private void btnCadastrarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarCursoActionPerformed
        // TODO add your handling code here:
        
        new CadastrarCurso().setVisible(true);//Linha que traz a tela de cadastrar curso para a principal.
       
    }//GEN-LAST:event_btnCadastrarCursoActionPerformed

    private void btnRemoverCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCursoActionPerformed
        // TODO add your handling code here:
        
        new RemoverCurso().setVisible(true);//Linha que traz a tela de remover curso para a principal.
        
    }//GEN-LAST:event_btnRemoverCursoActionPerformed

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
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CursoListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CursoListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCurso;
    private javax.swing.JButton btnEditarCurso;
    private javax.swing.JButton btnRemoverCurso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaCurso;
    private javax.swing.JTextField txtPegaBusca;
    // End of variables declaration//GEN-END:variables
}
