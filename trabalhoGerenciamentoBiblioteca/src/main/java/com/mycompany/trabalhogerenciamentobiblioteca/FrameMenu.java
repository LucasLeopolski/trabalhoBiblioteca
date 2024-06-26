/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.trabalhogerenciamentobiblioteca;

import javax.swing.JFrame;

/**
 *
 * @author Usuário
 */
public class FrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrameMenu
     */
    public FrameMenu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmLivros = new javax.swing.JMenu();
        jmCadastrarLivro = new javax.swing.JMenuItem();
        jmClientes = new javax.swing.JMenu();
        jmCadastrarClientes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmEmprestimos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 265, Short.MAX_VALUE)
        );

        jmLivros.setText("Livros");
        jmLivros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmLivrosActionPerformed(evt);
            }
        });

        jmCadastrarLivro.setText("Cadastrar");
        jmCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarLivroActionPerformed(evt);
            }
        });
        jmLivros.add(jmCadastrarLivro);

        jMenuBar1.add(jmLivros);

        jmClientes.setText("Clientes");
        jmClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClientesActionPerformed(evt);
            }
        });

        jmCadastrarClientes.setText("Cadastrar");
        jmCadastrarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastrarClientesActionPerformed(evt);
            }
        });
        jmClientes.add(jmCadastrarClientes);

        jMenuBar1.add(jmClientes);

        jMenu3.setText("Emprestimos");

        jmEmprestimos.setText("Novo");
        jmEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmEmprestimosActionPerformed(evt);
            }
        });
        jMenu3.add(jmEmprestimos);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmLivrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmLivrosActionPerformed

    }//GEN-LAST:event_jmLivrosActionPerformed

    private void jmCadastrarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarClientesActionPerformed
        FrameCadastroCliente frameCadastrarCliente = new FrameCadastroCliente();
        frameCadastrarCliente.setVisible(true);
       
        
    }//GEN-LAST:event_jmCadastrarClientesActionPerformed

    private void jmClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmClientesActionPerformed

    private void jmCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastrarLivroActionPerformed
        FrameCadastrarLivro frameCadastrarLivro = new FrameCadastrarLivro();
        frameCadastrarLivro.setVisible(true);
       
    }//GEN-LAST:event_jmCadastrarLivroActionPerformed

    private void jmEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmEmprestimosActionPerformed
        FrameEmprestimo frameEmprestimo = new FrameEmprestimo();
        frameEmprestimo.setVisible(true);
       
    }//GEN-LAST:event_jmEmprestimosActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenu4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem jmCadastrarClientes;
    private javax.swing.JMenuItem jmCadastrarLivro;
    private javax.swing.JMenu jmClientes;
    private javax.swing.JMenuItem jmEmprestimos;
    private javax.swing.JMenu jmLivros;
    // End of variables declaration//GEN-END:variables
}
