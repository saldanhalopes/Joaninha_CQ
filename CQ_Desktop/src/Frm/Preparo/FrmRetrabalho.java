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
import Classes.Acesso.RetrabalhoAcesso;
import Classes.Modelo.AtividadePreparo;
import Classes.Util.DataHora;
import Frm.Login.FrmSalvar;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public class FrmRetrabalho extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmRetrabalho() {
        initComponents();
        setTitle("Retrabalhos de Preparo");
        readAtividadeRetrabalho();
        RetrabalhoAcesso Acesso = new RetrabalhoAcesso();
        Acesso.verificarAcessoRetrabalho();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtividadeRetrabalho = new javax.swing.JTable();
        txtPesquisar = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        cmbPesquisarStatus = new javax.swing.JComboBox<String>();
        jToolBar1 = new javax.swing.JToolBar();
        btnAtualizar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnImprimirRetrabalho = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnCancelarRetrabalho = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Atividades"));

        tblAtividadeRetrabalho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Data Registro", "Descrição", "Lote", "Equipamento", "Metodo", "Qtd", "Observação", "Retrabalho", "categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAtividadeRetrabalho.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblAtividadeRetrabalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAtividadeRetrabalhoMouseClicked(evt);
            }
        });
        tblAtividadeRetrabalho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAtividadeRetrabalhoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblAtividadeRetrabalho);
        if (tblAtividadeRetrabalho.getColumnModel().getColumnCount() > 0) {
            tblAtividadeRetrabalho.getColumnModel().getColumn(0).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblAtividadeRetrabalho.getColumnModel().getColumn(1).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblAtividadeRetrabalho.getColumnModel().getColumn(2).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(2).setPreferredWidth(550);
            tblAtividadeRetrabalho.getColumnModel().getColumn(3).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblAtividadeRetrabalho.getColumnModel().getColumn(4).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblAtividadeRetrabalho.getColumnModel().getColumn(5).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(5).setPreferredWidth(600);
            tblAtividadeRetrabalho.getColumnModel().getColumn(6).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(6).setPreferredWidth(50);
            tblAtividadeRetrabalho.getColumnModel().getColumn(7).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(7).setPreferredWidth(250);
            tblAtividadeRetrabalho.getColumnModel().getColumn(8).setResizable(false);
            tblAtividadeRetrabalho.getColumnModel().getColumn(8).setPreferredWidth(80);
            tblAtividadeRetrabalho.getColumnModel().getColumn(9).setMinWidth(0);
            tblAtividadeRetrabalho.getColumnModel().getColumn(9).setPreferredWidth(0);
            tblAtividadeRetrabalho.getColumnModel().getColumn(9).setMaxWidth(0);
        }

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        jLabel5.setText("Tipo:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Análise", "Soluções Reagentes", "System Suitability ", "Atividade Geral" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel13.setText("Status:");

        cmbPesquisarStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Pendentes", "Finalizados" }));
        cmbPesquisarStatus.setSelectedIndex(1);
        cmbPesquisarStatus.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPesquisarStatusItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 944, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPesquisarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbPesquisarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE))
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_atualizar.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizar.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAtualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizar);
        jToolBar1.add(jSeparator6);

        btnImprimirRetrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirRetrabalho.setText("Imprimir");
        btnImprimirRetrabalho.setFocusable(false);
        btnImprimirRetrabalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirRetrabalho.setPreferredSize(new java.awt.Dimension(60, 60));
        btnImprimirRetrabalho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirRetrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirRetrabalhoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimirRetrabalho);
        jToolBar1.add(jSeparator5);

        btnCancelarRetrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_close.png"))); // NOI18N
        btnCancelarRetrabalho.setText("Cancelar");
        btnCancelarRetrabalho.setFocusable(false);
        btnCancelarRetrabalho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCancelarRetrabalho.setPreferredSize(new java.awt.Dimension(60, 60));
        btnCancelarRetrabalho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCancelarRetrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarRetrabalhoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnCancelarRetrabalho);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblAtividadeRetrabalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAtividadeRetrabalhoMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDados();
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            readAtividadeRetrabalho();
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_tblAtividadeRetrabalhoMouseClicked

    private void tblAtividadeRetrabalhoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAtividadeRetrabalhoKeyPressed
        if (tblAtividadeRetrabalho.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletarDados((Integer) tblAtividadeRetrabalho.getValueAt(tblAtividadeRetrabalho.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblAtividadeRetrabalhoKeyPressed

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        tableSorter();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readAtividadeRetrabalho();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnCancelarRetrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarRetrabalhoActionPerformed
        if (tblAtividadeRetrabalho.getSelectedRow() != -1) {
            deletarDados((Integer) tblAtividadeRetrabalho.getValueAt(tblAtividadeRetrabalho.getSelectedRow(), 0));
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            readAtividadeRetrabalho();
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnCancelarRetrabalhoActionPerformed

    private void btnImprimirRetrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirRetrabalhoActionPerformed
        FrmImprimirRetrabalhoPreparo frm = new FrmImprimirRetrabalhoPreparo(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirRetrabalhoActionPerformed

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        tableSorter();
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void cmbPesquisarStatusItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPesquisarStatusItemStateChanged
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readAtividadeRetrabalho();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_cmbPesquisarStatusItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    public static javax.swing.JButton btnCancelarRetrabalho;
    public static javax.swing.JButton btnImprimirRetrabalho;
    private javax.swing.JComboBox<String> cmbPesquisarStatus;
    private javax.swing.JComboBox cmbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tblAtividadeRetrabalho;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private void tableSorter() {
        DefaultTableModel model = (DefaultTableModel) tblAtividadeRetrabalho.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblAtividadeRetrabalho.setRowSorter(sorter);
        String text = txtPesquisar.getText().trim();
        String parametro = "*";
        if (text.length() == 0 && "Todos".equals(cmbTipo.getSelectedItem().toString())) {
            sorter.setRowFilter(null);
        } else if (text.indexOf(parametro) > 0 && "Todos".equals(cmbTipo.getSelectedItem().toString())) {
            ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<>();
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(0, text.indexOf(parametro)).trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(text.indexOf(parametro) + 1, text.length()).trim().toUpperCase()));
            sorter.setRowFilter(RowFilter.andFilter(andFilters));
        } else if ("Todos".equals(cmbTipo.getSelectedItem().toString())) {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text.trim().toUpperCase()));
        } else if (text.indexOf(parametro) > 0) {
            ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<>();
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(0, text.indexOf(parametro)).trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(text.indexOf(parametro) + 1, text.length()).trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter(cmbTipo.getSelectedItem().toString()));
            sorter.setRowFilter(RowFilter.andFilter(andFilters));
        } else {
            ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<>();
            andFilters.add(RowFilter.regexFilter("(?i)" + text.trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter(cmbTipo.getSelectedItem().toString()));
            sorter.setRowFilter(RowFilter.andFilter(andFilters));
        }
    }

    private void readAtividadeRetrabalho() {
        DefaultTableModel model = (DefaultTableModel) tblAtividadeRetrabalho.getModel();
        AtividadePreparoDAO atvprepDao = new AtividadePreparoDAO();
        model.setNumRows(0);
        int status = cmbPesquisarStatus.getSelectedIndex();
        for (AtividadePreparo atvprep : atvprepDao.readRetrabalho(status)) {
            model.addRow(new Object[]{
                atvprep.getAtividade_preparo_id(),
                DataHora.getStringDateTime(atvprep.getData_hora_registro()),
                (atvprep.getAnalise().getAnalise() == null ? "" : atvprep.getAnalise().getAnalise() + "   ")
                + (atvprep.getTipo_preparo() == null ? "" : atvprep.getTipo_preparo() + " - ")
                + (atvprep.getDescricao_preparo() == null ? "" : atvprep.getDescricao_preparo()),
                atvprep.getLote_preparo(),
                atvprep.getCromatografo().getSystem_name(),
                ((atvprep.getMetodologia().getMetodo_id() == 0) ? "MULTIPROPÓSITO"
                : atvprep.getMetodologia().getCod_metodo() + " - "
                + (atvprep.getMetodologia().getMetodo() == null ? "" : atvprep.getMetodologia().getMetodo())),
                atvprep.getQtd_preparo(),
                atvprep.getObs_preparo(),
                atvprep.getRetrabalho_preparo(),
                atvprep.getCategoria_preparo()
            });
        }
    }

    private void deletarDados(int id) {
        RetrabalhoAcesso Acesso = new RetrabalhoAcesso();
        if (Acesso.verificarDeletarDadosRetrabalho()) {
            AtividadePreparo atvprep = new AtividadePreparo();
            AtividadePreparoDAO atvprepDAO = new AtividadePreparoDAO();
            try {
                int dialogResult = JOptionPane.showConfirmDialog(null,
                        "Realmente Deseja Cancelar Esse Retrabalho?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (dialogResult == 0) {
                    atvprep.setAtividade_preparo_id(id);
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    FrmSalvar frmSalvar = new FrmSalvar(null, true);
                    frmSalvar.setVisible(true);
                    if (FrmSalvar.senha()) {
                        atvprepDAO.updateCancelarRetrabalho(atvprep);
                    }
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atulalizar dados: " + e);
            } finally {
                readAtividadeRetrabalho();
            }
        }
    }

    private void carregarDados() {
        RetrabalhoAcesso Acesso = new RetrabalhoAcesso();
        if (Acesso.verificarCarregarDadosRetrabalho()) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            int id = (Integer) tblAtividadeRetrabalho.getValueAt(tblAtividadeRetrabalho.getSelectedRow(), 0);
            FrmTratarRetrabalho frm = new FrmTratarRetrabalho(null, true, id);
            frm.setVisible(true);
            readAtividadeRetrabalho();
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }
}
