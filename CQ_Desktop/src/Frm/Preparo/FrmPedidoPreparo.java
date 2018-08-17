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

/**
 *
 * @author rafael.lopes
 */
public class FrmPedidoPreparo extends javax.swing.JDialog {

    /**
     * Creates new form FrmAtividades
     */
    public FrmPedidoPreparo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Registro de Atividade");
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
        btnMultiplasAnalise = new javax.swing.JButton();
        btnSolucaoReagente = new javax.swing.JButton();
        btnSystemSuitability = new javax.swing.JButton();
        btnOutro = new javax.swing.JButton();
        btnMultiplosLotes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Status"));

        btnMultiplasAnalise.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMultiplasAnalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_analises.png"))); // NOI18N
        btnMultiplasAnalise.setText("Multiplas Análises");
        btnMultiplasAnalise.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMultiplasAnalise.setIconTextGap(50);
        btnMultiplasAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplasAnaliseActionPerformed(evt);
            }
        });

        btnSolucaoReagente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSolucaoReagente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_solucoes.png"))); // NOI18N
        btnSolucaoReagente.setText("Soluções Reagentes");
        btnSolucaoReagente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSolucaoReagente.setIconTextGap(50);
        btnSolucaoReagente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolucaoReagenteActionPerformed(evt);
            }
        });

        btnSystemSuitability.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSystemSuitability.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_system.png"))); // NOI18N
        btnSystemSuitability.setText("System Suitability");
        btnSystemSuitability.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSystemSuitability.setIconTextGap(50);
        btnSystemSuitability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSystemSuitabilityActionPerformed(evt);
            }
        });

        btnOutro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOutro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_outros.png"))); // NOI18N
        btnOutro.setText("Outros");
        btnOutro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOutro.setIconTextGap(50);
        btnOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutroActionPerformed(evt);
            }
        });

        btnMultiplosLotes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMultiplosLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_lotes.png"))); // NOI18N
        btnMultiplosLotes.setText("Multiplos Lotes");
        btnMultiplosLotes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMultiplosLotes.setIconTextGap(50);
        btnMultiplosLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplosLotesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSolucaoReagente, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(btnMultiplasAnalise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSystemSuitability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMultiplosLotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnMultiplasAnalise, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMultiplosLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSolucaoReagente, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSystemSuitability, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnMultiplasAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplasAnaliseActionPerformed
        FrmPedidoAnalisePorLote frm = new FrmPedidoAnalisePorLote(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMultiplasAnaliseActionPerformed

    private void btnSolucaoReagenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolucaoReagenteActionPerformed
        FrmPedidoSolucaoPreparo frm = new FrmPedidoSolucaoPreparo(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnSolucaoReagenteActionPerformed

    private void btnSystemSuitabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSystemSuitabilityActionPerformed
        FrmPedidoSystemPreparo frm = new FrmPedidoSystemPreparo(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnSystemSuitabilityActionPerformed

    private void btnOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutroActionPerformed
        FrmPedidoAtividadeGeralPreparo frm = new FrmPedidoAtividadeGeralPreparo(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnOutroActionPerformed

    private void btnMultiplosLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplosLotesActionPerformed
        FrmPedidoLotePorAnalise frm = new FrmPedidoLotePorAnalise(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnMultiplosLotesActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPedidoPreparo dialog = new FrmPedidoPreparo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnMultiplasAnalise;
    private javax.swing.JButton btnMultiplosLotes;
    private javax.swing.JButton btnOutro;
    private javax.swing.JButton btnSolucaoReagente;
    private javax.swing.JButton btnSystemSuitability;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
