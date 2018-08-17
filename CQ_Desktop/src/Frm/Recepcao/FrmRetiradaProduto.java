package Frm.Recepcao;

import Classes.DAO.LoteAcompanhamentoDAO;
import Classes.Modelo.LoteAcompanhamento;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public final class FrmRetiradaProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmRetiradaProduto() {
        initComponents();
        readLoteAcompanhamento();
        txtCodigoBarras.setVisible(false);
        lblPesquisa.setText("Pesquisar");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLotes = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAcompanamento = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        lblPesquisa = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnAtualizar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnImprimirLotes = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnProcurarCodigoBarras = new javax.swing.JButton();
        txtCodigoBarras = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Acompanhamentos"));

        tblAcompanamento.setAutoCreateRowSorter(true);
        tblAcompanamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Lote", "RA", "Produto", "Data Entrada", "Data Retirada", "Usuario", "Codigo de Barras"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAcompanamento.setSurrendersFocusOnKeystroke(true);
        tblAcompanamento.getTableHeader().setReorderingAllowed(false);
        tblAcompanamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcompanamentoMouseClicked(evt);
            }
        });
        tblAcompanamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblAcompanamentoKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblAcompanamento);
        if (tblAcompanamento.getColumnModel().getColumnCount() > 0) {
            tblAcompanamento.getColumnModel().getColumn(0).setMinWidth(0);
            tblAcompanamento.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblAcompanamento.getColumnModel().getColumn(0).setMaxWidth(0);
            tblAcompanamento.getColumnModel().getColumn(1).setMinWidth(80);
            tblAcompanamento.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblAcompanamento.getColumnModel().getColumn(1).setMaxWidth(80);
            tblAcompanamento.getColumnModel().getColumn(2).setMinWidth(180);
            tblAcompanamento.getColumnModel().getColumn(2).setPreferredWidth(180);
            tblAcompanamento.getColumnModel().getColumn(2).setMaxWidth(180);
            tblAcompanamento.getColumnModel().getColumn(4).setMinWidth(150);
            tblAcompanamento.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblAcompanamento.getColumnModel().getColumn(4).setMaxWidth(150);
            tblAcompanamento.getColumnModel().getColumn(5).setMinWidth(150);
            tblAcompanamento.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblAcompanamento.getColumnModel().getColumn(5).setMaxWidth(150);
            tblAcompanamento.getColumnModel().getColumn(6).setMinWidth(120);
            tblAcompanamento.getColumnModel().getColumn(6).setPreferredWidth(120);
            tblAcompanamento.getColumnModel().getColumn(6).setMaxWidth(120);
            tblAcompanamento.getColumnModel().getColumn(7).setMinWidth(0);
            tblAcompanamento.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblAcompanamento.getColumnModel().getColumn(7).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );

        txtPesquisarLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarLotesKeyReleased(evt);
            }
        });

        lblPesquisa.setText("Pesquisar:");

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

        btnImprimirLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirLotes.setText("Relatórios");
        btnImprimirLotes.setEnabled(false);
        btnImprimirLotes.setFocusable(false);
        btnImprimirLotes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirLotes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirLotesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimirLotes);
        jToolBar1.add(jSeparator7);

        btnProcurarCodigoBarras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_barcode.png"))); // NOI18N
        btnProcurarCodigoBarras.setText("Procurar");
        btnProcurarCodigoBarras.setFocusable(false);
        btnProcurarCodigoBarras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProcurarCodigoBarras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProcurarCodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarCodigoBarrasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnProcurarCodigoBarras);

        txtCodigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoBarrasKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlLotesLayout = new javax.swing.GroupLayout(pnlLotes);
        pnlLotes.setLayout(pnlLotesLayout);
        pnlLotesLayout.setHorizontalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPesquisa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarLotes)
                .addGap(18, 18, 18)
                .addComponent(txtCodigoBarras)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLotesLayout.setVerticalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLotesLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPesquisa)
                    .addComponent(txtCodigoBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(pnlLotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoBarrasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoBarrasKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txtCodigoBarras.getText().isEmpty()) {
                if (txtCodigoBarras.getText().length() == 22) {
                    String in = txtCodigoBarras.getText();
                    in = in.substring(0, 15);
                    in = in.replaceFirst("^0+(?!$)", "");
                    DefaultTableModel model = (DefaultTableModel) tblAcompanamento.getModel();
                    TableRowSorter sorter = new TableRowSorter<>(model);
                    tblAcompanamento.setRowSorter(sorter);
                    if (in.length() == 0) {
                        sorter.setRowFilter(null);
                    } else {
                        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + in));
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Registro de Acompanhamento Inválido");
                }
                txtCodigoBarras.setText(null);
            }
        }
    }//GEN-LAST:event_txtCodigoBarrasKeyReleased

    private void btnProcurarCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarCodigoBarrasActionPerformed
        txtPesquisarLotes.setVisible(false);
        txtPesquisarLotes.setText(null);
        txtCodigoBarras.setVisible(true);
        lblPesquisa.setText("Código de Barras");
        txtCodigoBarras.requestFocus();
    }//GEN-LAST:event_btnProcurarCodigoBarrasActionPerformed

    private void btnImprimirLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirLotesActionPerformed
        //        FrmImpressaoRelatorioRecepcao frm = new FrmImpressaoRelatorioRecepcao(null, true, "< 4");
        //        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirLotesActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        readLoteAcompanhamento();
        txtPesquisarLotes.setVisible(true);
        txtCodigoBarras.setVisible(false);
        lblPesquisa.setText("Pesquisar");
        txtCodigoBarras.setText(null);
        tblAcompanamento.setRowSorter(null);
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtPesquisarLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarLotesKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblAcompanamento.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblAcompanamento.setRowSorter(sorter);
        String text = txtPesquisarLotes.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_txtPesquisarLotesKeyReleased

    private void tblAcompanamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcompanamentoMouseClicked
        if (evt.getClickCount() == 2) {
            if (tblAcompanamento.getSelectedRow() != -1) {
                FrmConfirmarRetiradaProduto frm = new FrmConfirmarRetiradaProduto(null, true,
                        (Integer) tblAcompanamento.getValueAt(tblAcompanamento.getSelectedRow(), 0),
                        tblAcompanamento.getValueAt(tblAcompanamento.getSelectedRow(), 6) != null);
                frm.setVisible(true);
                readLoteAcompanhamento();
            }
        }
    }//GEN-LAST:event_tblAcompanamentoMouseClicked

    private void tblAcompanamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblAcompanamentoKeyPressed
        if (tblAcompanamento.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                FrmConfirmarRetiradaProduto frm = new FrmConfirmarRetiradaProduto(null, true,
                        (Integer) tblAcompanamento.getValueAt(tblAcompanamento.getSelectedRow(), 0),
                        tblAcompanamento.getValueAt(tblAcompanamento.getSelectedRow(), 0) != null);
                frm.setVisible(true);
                readLoteAcompanhamento();
            }
        }
    }//GEN-LAST:event_tblAcompanamentoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnImprimirLotes;
    private javax.swing.JButton btnProcurarCodigoBarras;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTable tblAcompanamento;
    private javax.swing.JTextField txtCodigoBarras;
    private javax.swing.JTextField txtPesquisarLotes;
    // End of variables declaration//GEN-END:variables

    public void readLoteAcompanhamento() {
        DefaultTableModel model = (DefaultTableModel) tblAcompanamento.getModel();
        LoteAcompanhamentoDAO loteacompDao = new LoteAcompanhamentoDAO();
        model.setNumRows(0);
        for (LoteAcompanhamento loteacomp : loteacompDao.readLoteAcompanhamento()) {
            model.addRow(new Object[]{
                loteacomp.getLote_acompanhamento_id(),
                loteacomp.getLote().getLote_produto(),
                loteacomp.getAcompanhamento().getSigla_registro_acompanhamento(),
                loteacomp.getMaterial().getNome_material(),
                loteacomp.getLote().getData_entrada(),
                loteacomp.getData_retirada(),
                loteacomp.getUser_retirada().getUser(),
                loteacomp.getCodigo_barras()
            });
        }
    }

}
