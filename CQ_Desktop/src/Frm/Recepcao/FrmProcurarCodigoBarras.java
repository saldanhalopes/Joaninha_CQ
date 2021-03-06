/*
 * Copyright (C) 2018 rafael.lopes
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
package Frm.Recepcao;

import Classes.DAO.AcompanhamentoDAO;
import Classes.Modelo.Acompanhamento;
import Classes.Modelo.Lote;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmProcurarCodigoBarras extends javax.swing.JDialog {

    private Lote lote;

    /**
     * Creates new form FrmCadastroRetirada
     */
    public FrmProcurarCodigoBarras(java.awt.Frame parent, boolean modal, Lote lot) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        lote = lot;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSelecionarLote = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCodigoBarras = new javax.swing.JTable();
        txtCodigoBarras = new javax.swing.JTextField();
        btnProcurarCodigo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnSelecionarLote.setText("Selecionar");
        btnSelecionarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarLoteActionPerformed(evt);
            }
        });

        btnCancelar.setText("Fechar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tblCodigoBarras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Lote", "Produto", "Código Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCodigoBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCodigoBarrasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCodigoBarras);
        if (tblCodigoBarras.getColumnModel().getColumnCount() > 0) {
            tblCodigoBarras.getColumnModel().getColumn(0).setMinWidth(0);
            tblCodigoBarras.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblCodigoBarras.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCodigoBarras.getColumnModel().getColumn(1).setMinWidth(100);
            tblCodigoBarras.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblCodigoBarras.getColumnModel().getColumn(1).setMaxWidth(100);
            tblCodigoBarras.getColumnModel().getColumn(3).setMinWidth(100);
            tblCodigoBarras.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblCodigoBarras.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyReleased(evt);
            }
        });

        btnProcurarCodigo.setText("Procurar");
        btnProcurarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelecionarLote, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurarCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionarLote)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelecionarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarLoteActionPerformed
        if (tblCodigoBarras.getSelectedRow() != -1) {
            lote.setLote_id((Integer) tblCodigoBarras.getValueAt(tblCodigoBarras.getSelectedRow(), 0));
            dispose();
        }
    }//GEN-LAST:event_btnSelecionarLoteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodigoBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCodigoBarras.getText().isEmpty()) {
                if (txtCodigoBarras.getText().length() == 22) {
                    procurarCodigo(txtCodigoBarras.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "Registro de Acompanhamento Inválido");
                }
            }
            txtCodigoBarras.setText(null);
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyReleased

    private void btnProcurarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarCodigoActionPerformed
        if (!txtCodigoBarras.getText().isEmpty()) {
            if (txtCodigoBarras.getText().length() == 22) {
                procurarCodigo(txtCodigoBarras.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Registro de Acompanhamento Inválido");
                txtCodigoBarras.setText(null);
            }
        }
    }//GEN-LAST:event_btnProcurarCodigoActionPerformed

    private void tblCodigoBarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCodigoBarrasMouseClicked
        if (evt.getClickCount() == 2) {
            lote.setLote_id((Integer) tblCodigoBarras.getValueAt(tblCodigoBarras.getSelectedRow(), 0));
            dispose();
        }
    }//GEN-LAST:event_tblCodigoBarrasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmProcurarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarCodigoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProcurarCodigoBarras dialog = new FrmProcurarCodigoBarras(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnProcurarCodigo;
    public static javax.swing.JButton btnSelecionarLote;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCodigoBarras;
    private javax.swing.JTextField txtCodigoBarras;
    // End of variables declaration//GEN-END:variables

    private void procurarCodigo(String in) {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DefaultTableModel model = (DefaultTableModel) tblCodigoBarras.getModel();
        AcompanhamentoDAO acompDao = new AcompanhamentoDAO();
        model.setNumRows(0);
        in = in.substring(0, 15);
        in = in.replaceFirst("^0+(?!$)", "");
        txtCodigoBarras.setText(in);
        if (acompDao.procurarCodigoBarras(in).size() > 0) {
            for (Acompanhamento acomp : acompDao.procurarCodigoBarras(in)) {
                model.addRow(new Object[]{
                    acomp.getLote().getLote_id(),
                    acomp.getLote().getLote_produto(),
                    acomp.getMaterial().getNome_material(),
                    acomp.getCodigo_barras()
                });
            }
            tblCodigoBarras.setRowSelectionInterval(0, 0);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado!");
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

}
