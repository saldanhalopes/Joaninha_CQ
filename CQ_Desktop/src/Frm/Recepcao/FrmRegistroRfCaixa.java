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
package Frm.Recepcao;

import Classes.DAO.RegistroRfDAO;
import Frm.Login.FrmSalvar;
import Classes.Modelo.RegistroRf;
import Classes.Modelo.Usuario;
import Classes.Util.DataHora;
import java.awt.Cursor;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmRegistroRfCaixa extends javax.swing.JDialog {

    final String zeros = "00000";

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     * @param prd
     */
    public FrmRegistroRfCaixa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Caixa");
        setResizable(false);
        read();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechar = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovoCaixa = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnFecharCaixa = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCaixa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNovoCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btnNovoCaixa.setText("Nova Caixa ");
        btnNovoCaixa.setFocusable(false);
        btnNovoCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCaixaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovoCaixa);
        jToolBar1.add(jSeparator6);

        btnFecharCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sinal_fechado.png"))); // NOI18N
        btnFecharCaixa.setText("Fechar Caixa");
        btnFecharCaixa.setFocusable(false);
        btnFecharCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFecharCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharCaixaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFecharCaixa);
        jToolBar1.add(jSeparator7);

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        btnImprimir.setFocusable(false);
        btnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimir);

        tblCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Caixa", "Data Início / Responável", "Data Fim / Responável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblCaixa.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCaixa);
        if (tblCaixa.getColumnModel().getColumnCount() > 0) {
            tblCaixa.getColumnModel().getColumn(0).setMinWidth(0);
            tblCaixa.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblCaixa.getColumnModel().getColumn(0).setMaxWidth(0);
            tblCaixa.getColumnModel().getColumn(1).setMinWidth(150);
            tblCaixa.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblCaixa.getColumnModel().getColumn(1).setMaxWidth(150);
            tblCaixa.getColumnModel().getColumn(2).setMinWidth(250);
            tblCaixa.getColumnModel().getColumn(2).setPreferredWidth(250);
            tblCaixa.getColumnModel().getColumn(2).setMaxWidth(250);
            tblCaixa.getColumnModel().getColumn(3).setMinWidth(250);
            tblCaixa.getColumnModel().getColumn(3).setPreferredWidth(250);
            tblCaixa.getColumnModel().getColumn(3).setMaxWidth(250);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCaixaActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null, "Tem certeza de que deseja criar nova caixa?",
                "Confirmação de Criação", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                novaCaixa();
                read();
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
    }//GEN-LAST:event_btnNovoCaixaActionPerformed

    private void btnFecharCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharCaixaActionPerformed
        if (tblCaixa.getSelectedRow() != -1) {
            if ("".equals(tblCaixa.getValueAt(tblCaixa.getSelectedRow(), 3).toString())) {
                int option = JOptionPane.showConfirmDialog(
                        null, "Tem certeza de que deseja fechar essa caixa?",
                        "Confirmação de Fechamento", JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    FrmSalvar frmSalvar = new FrmSalvar(null, true);
                    frmSalvar.setVisible(true);
                    if (FrmSalvar.senha()) {
                        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                        fecharCaixa((Integer) tblCaixa.getValueAt(tblCaixa.getSelectedRow(), 0));
                        read();
                        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    }
                }
            }
        }
    }//GEN-LAST:event_btnFecharCaixaActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        RegistroRfDAO regrfDao = new RegistroRfDAO();
        if (tblCaixa.getSelectedRow() != -1) {
            int option = JOptionPane.showConfirmDialog(
                    null, "Deseja imprimir a etiqueta dessa caixa?",
                    "Confirmação de Impressão", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                Thread t1 = new Thread() {
                    @Override
                    public void run() {
                        regrfDao.printEtiquetaCaixa((Integer) tblCaixa.getValueAt(tblCaixa.getSelectedRow(), 0));
                    }
                };
                t1.start();
                dispose();

            }
        }
    }//GEN-LAST:event_btnImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRegistroRfCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroRfCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroRfCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroRfCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmRegistroRfCaixa dialog = new FrmRegistroRfCaixa(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFechar;
    public static javax.swing.JButton btnFecharCaixa;
    public static javax.swing.JButton btnImprimir;
    public static javax.swing.JButton btnNovoCaixa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblCaixa;
    // End of variables declaration//GEN-END:variables

    private void read() {
        DefaultTableModel model = (DefaultTableModel) tblCaixa.getModel();
        RegistroRfDAO regrfDao = new RegistroRfDAO();
        model.setNumRows(0);
        for (RegistroRf regrf : regrfDao.readCaixa()) {
            model.addRow(new Object[]{
                regrf.getCaixa_rf_id(),
                regrf.getCaixa(),
                DataHora.getStringDateTime(regrf.getData_inicio()) + " / "
                + regrf.getUser_inicio().getUser(),
                regrf.getData_fim() == null ? "" : DataHora.getStringDateTime(regrf.getData_fim()) + " / "
                + regrf.getUser_fim().getUser()
            });
        }
    }

    private void fecharCaixa(Integer id) {
        RegistroRf regrf = new RegistroRf();
        RegistroRfDAO regrfDao = new RegistroRfDAO();
        Usuario user = new Usuario();
        regrf.setCaixa_rf_id(id);
        regrf.setData_fim(DataHora.getTimestampDate(new Date()));
        user.setUser(System.getProperty("user"));
        regrf.setUser_fim(user);
        regrfDao.updateFecharCaixa(regrf);
    }

    private void novaCaixa() {
        RegistroRf regrf = new RegistroRf();
        RegistroRfDAO regrfDao = new RegistroRfDAO();
        Usuario user = new Usuario();
        regrfDao.selectUltimaCaixa(regrf);
        if (regrf.getData_fim() == null) {
            fecharCaixa(regrf.getCaixa_rf_id());
        }
        Integer caixa = Integer.valueOf(regrf.getCaixa().substring(6, 11)) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append("RMP - ");
        sb.append(zeros.substring(String.valueOf(caixa).length()));
        sb.append(caixa);
        sb.append("/");
        sb.append(DataHora.getStringDateFinalAno(new Date()));
        regrf.setCaixa(sb.toString());
        regrf.setData_inicio(DataHora.getTimestampDate(new Date()));
        user.setUser(System.getProperty("user"));
        regrf.setUser_inicio(user);
        regrfDao.createCaixa(regrf);
    }

}
