/*
 * Copyright (C) 2017 rafael.lopes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Frm.Preparo;

import Classes.DAO.AtividadePreparoDAO;
import Frm.Principal.FrmCarregando;
import java.awt.Cursor;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.lopes
 */
public class FrmImprimirPedidoPreparo extends javax.swing.JDialog {

    /**
     * Creates new form FrmAtividades
     */
    public FrmImprimirPedidoPreparo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Imprimir Pedidos de Preparo");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAnalise = new javax.swing.JButton();
        btnOutro = new javax.swing.JButton();
        btnSolucoes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        btnAnalise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_analises.png"))); // NOI18N
        btnAnalise.setText("Análises");
        btnAnalise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAnalise.setIconTextGap(50);
        btnAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnaliseActionPerformed(evt);
            }
        });

        btnOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coisas.png"))); // NOI18N
        btnOutro.setText("Outros");
        btnOutro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOutro.setIconTextGap(50);
        btnOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutroActionPerformed(evt);
            }
        });

        btnSolucoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSolucoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_solucoes.png"))); // NOI18N
        btnSolucoes.setText("Soluções Reagentes");
        btnSolucoes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSolucoes.setIconTextGap(50);
        btnSolucoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucoesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalise, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(btnOutro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSolucoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolucoes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnaliseActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Deseja Imprimir Relatorio de Pedidos Análises?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (dialogResult == 0) {
            final FrmCarregando frm = new FrmCarregando();
            frm.setVisible(true);
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    AtividadePreparoDAO.printPedidosAnalise(System.getProperty("user"));
                    frm.dispose();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            };
            t1.start();
        }
        dispose();
    }//GEN-LAST:event_btnAnaliseActionPerformed

    private void btnOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutroActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Deseja Imprimir Relatorio de Outros Pedidos?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (dialogResult == 0) {
            final FrmCarregando frm = new FrmCarregando();
            frm.setVisible(true);
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    AtividadePreparoDAO.printPedidos(System.getProperty("user"));
                    frm.dispose();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            };
            t1.start();
        }
        dispose();
    }//GEN-LAST:event_btnOutroActionPerformed

    private void btnSolucoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucoesActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Deseja Imprimir Relatorio de Pedidos Soluções Reagentes?", "Aviso", JOptionPane.YES_NO_OPTION);
        if (dialogResult == 0) {
            final FrmCarregando frm = new FrmCarregando();
            frm.setVisible(true);
            Thread t1 = new Thread() {
                @Override
                public void run() {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    AtividadePreparoDAO.printPedidosSolucoesReagente(System.getProperty("user"));
                    frm.dispose();
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            };
            t1.start();
        }
        dispose();
    }//GEN-LAST:event_btnSolucoesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmImprimirPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmImprimirPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmImprimirPedidoPreparo dialog = new FrmImprimirPedidoPreparo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalise;
    private javax.swing.JButton btnOutro;
    private javax.swing.JButton btnSolucoes;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
