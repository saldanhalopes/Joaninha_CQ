package Frm.Recepcao;

import Classes.DAO.AcompanhamentoDAO;
import Classes.DAO.LoteAcompanhamentoDAO;
import Classes.DAO.LoteDAO;
import Frm.Cadastro.FrmProcurarRegistroAcompanhamento;
import Frm.Login.FrmSalvar;
import Classes.Modelo.Acompanhamento;
import Classes.Modelo.Lote;
import Classes.Modelo.Metodologia;
import Classes.Modelo.Usuario;
import Classes.Util.DataHora;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public final class FrmRegistroEntrada extends javax.swing.JInternalFrame {

    private TreeMap<Integer, String> categoryMapAcompanhamento = new TreeMap<>();

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmRegistroEntrada() {
        initComponents();
        readCadastroProduto();
        pnlRetiradaProduto.setEnabledAt(1, false);
        setTitle("Registro de Acompanhamentos de Lotes");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRetiradaProduto = new javax.swing.JTabbedPane();
        pnlLotes = new javax.swing.JPanel();
        Jpane8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnEditarLote = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnAtualizar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnImprimirLotes = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnProcurarCodigoBarras = new javax.swing.JButton();
        pnlEntrada = new javax.swing.JPanel();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAcompanhamento = new javax.swing.JTable();
        btnAdicionarCodigo = new javax.swing.JButton();
        btnRemoverCodigo = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes"));

        tblLotes.setAutoCreateRowSorter(true);
        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Lote", "Data Entrada"
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
        tblLotes.setSurrendersFocusOnKeystroke(true);
        tblLotes.getTableHeader().setReorderingAllowed(false);
        tblLotes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLotesMouseClicked(evt);
            }
        });
        tblLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLotesKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblLotes);
        if (tblLotes.getColumnModel().getColumnCount() > 0) {
            tblLotes.getColumnModel().getColumn(0).setMinWidth(80);
            tblLotes.getColumnModel().getColumn(0).setPreferredWidth(80);
            tblLotes.getColumnModel().getColumn(0).setMaxWidth(80);
            tblLotes.getColumnModel().getColumn(2).setMinWidth(80);
            tblLotes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblLotes.getColumnModel().getColumn(2).setMaxWidth(80);
            tblLotes.getColumnModel().getColumn(3).setMinWidth(150);
            tblLotes.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblLotes.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        txtPesquisarLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarLotesKeyReleased(evt);
            }
        });

        jLabel6.setText("Pesquisar:");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnEditarLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btnEditarLote.setText("Editar");
        btnEditarLote.setFocusable(false);
        btnEditarLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditarLote);
        jToolBar1.add(jSeparator8);

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

        javax.swing.GroupLayout Jpane8Layout = new javax.swing.GroupLayout(Jpane8);
        Jpane8.setLayout(Jpane8Layout);
        Jpane8Layout.setHorizontalGroup(
            Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Jpane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Jpane8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarLotes)))
                .addContainerGap())
        );
        Jpane8Layout.setVerticalGroup(
            Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpane8Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlLotesLayout = new javax.swing.GroupLayout(pnlLotes);
        pnlLotes.setLayout(pnlLotesLayout);
        pnlLotesLayout.setHorizontalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLotesLayout.setVerticalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlRetiradaProduto.addTab("Lotes", pnlLotes);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("R.A's"));

        tblRegistroAcompanhamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código de Barras", "Registro de Acompanhamento", "Data Registro", "Usuario", "lote_acompanhamento_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistroAcompanhamento.setRowHeight(20);
        tblRegistroAcompanhamento.setSurrendersFocusOnKeystroke(true);
        tblRegistroAcompanhamento.getTableHeader().setReorderingAllowed(false);
        tblRegistroAcompanhamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblRegistroAcompanhamentoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistroAcompanhamento);
        if (tblRegistroAcompanhamento.getColumnModel().getColumnCount() > 0) {
            tblRegistroAcompanhamento.getColumnModel().getColumn(0).setMinWidth(0);
            tblRegistroAcompanhamento.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblRegistroAcompanhamento.getColumnModel().getColumn(0).setMaxWidth(0);
            tblRegistroAcompanhamento.getColumnModel().getColumn(1).setPreferredWidth(200);
            tblRegistroAcompanhamento.getColumnModel().getColumn(1).setMaxWidth(200);
            tblRegistroAcompanhamento.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblRegistroAcompanhamento.getColumnModel().getColumn(3).setMaxWidth(150);
            tblRegistroAcompanhamento.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblRegistroAcompanhamento.getColumnModel().getColumn(4).setMaxWidth(120);
            tblRegistroAcompanhamento.getColumnModel().getColumn(5).setMinWidth(0);
            tblRegistroAcompanhamento.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblRegistroAcompanhamento.getColumnModel().getColumn(5).setMaxWidth(0);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
        );

        btnAdicionarCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnAdicionarCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarCodigoActionPerformed(evt);
            }
        });

        btnRemoverCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_remove.png"))); // NOI18N
        btnRemoverCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRemoverCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdicionarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(btnAdicionarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemoverCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 432, Short.MAX_VALUE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pnlRetiradaProduto.addTab("Registros de Acompanhamento", pnlEntrada);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRetiradaProduto)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRetiradaProduto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCodigoActionPerformed
        if (tblRegistroAcompanhamento.getSelectedRow() != -1) {
            if (tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 3) != null
                    && !"".equals(tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 3).toString())) {
                int option = JOptionPane.showConfirmDialog(
                        null,
                        "Tem certeza de que deseja remover esse registro?",
                        "Confirmação",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    FrmSalvar frmSalvar = new FrmSalvar(null, true);
                    frmSalvar.setVisible(true);
                    if (FrmSalvar.senha()) {
                        deletarLoteAcompanhamento((Integer) tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 5));
                        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
                        model.removeRow(tblRegistroAcompanhamento.getSelectedRow());
                    }
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            } else {
                DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
                model.removeRow(tblRegistroAcompanhamento.getSelectedRow());
            }
        }
    }//GEN-LAST:event_btnRemoverCodigoActionPerformed

    private void btnAdicionarCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarCodigoActionPerformed
        List<Acompanhamento> acomps = new ArrayList<>();
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        FrmProcurarRegistroAcompanhamento frm = new FrmProcurarRegistroAcompanhamento(null, true, acomps);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
        for (Acompanhamento acomp : acomps) {
            model.addRow(new Object[]{
                acomp.getRegistro_acompanhamento_id(),
                null,
                acomp.getRegistro_acompanhamento(),});
        }
    }//GEN-LAST:event_btnAdicionarCodigoActionPerformed

    private void tblRegistroAcompanhamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblRegistroAcompanhamentoKeyReleased
        try {
            if (tblRegistroAcompanhamento.getSelectedRow() != -1) {
                if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                    if (tblRegistroAcompanhamento.getSelectedRow() == tblRegistroAcompanhamento.getRowCount() - 1) {
                        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
                        model.removeRow(tblRegistroAcompanhamento.getSelectedRow());
                    } else {
                        JOptionPane.showMessageDialog(null, "Não é possivel excluir essa linha");
                    }
                }
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    if (!"".equals(tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 1).toString())) {
                        if (((String) tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 1)).length() == 22) {
                            String in = (String) tblRegistroAcompanhamento.getValueAt(tblRegistroAcompanhamento.getSelectedRow(), 1);
                            in = in.substring(0, 15);
                            in = in.replaceFirst("^0+(?!$)", "");
                            if (AcompanhamentoDAO.verificaCodigoBarras(in)) {
                                tblRegistroAcompanhamento.setValueAt("", tblRegistroAcompanhamento.getSelectedRow(), 1);
                                JOptionPane.showMessageDialog(null, "Código de Barras do RA " + in + " já existe!");
                                return;
                            }
                            int rows = tblRegistroAcompanhamento.getRowCount();
                            for (int row = 0; row < rows; row++) {
                                if (in.equals((String) tblRegistroAcompanhamento.getValueAt(row, 1))) {
                                    tblRegistroAcompanhamento.setValueAt("", tblRegistroAcompanhamento.getSelectedRow(), 1);
                                    JOptionPane.showMessageDialog(null, "Código de Barras do RA " + in + " já foi adicionado!");
                                    return;
                                }
                            }
                            tblRegistroAcompanhamento.setValueAt(in, tblRegistroAcompanhamento.getSelectedRow(), 1);
                        } else {
                            JOptionPane.showMessageDialog(null, "Registro de Acompanhamento Inválido");
                            tblRegistroAcompanhamento.setValueAt("", tblRegistroAcompanhamento.getSelectedRow(), 1);
                        }
                    }
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_tblRegistroAcompanhamentoKeyReleased
    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja esse registro?\nOs dados inseridos não serão salvos!",
                "Confirmação de Cancelamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            fecharDados();
        }
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        int rows = tblRegistroAcompanhamento.getRowCount();
        for (int row = 0; row < rows; row++) {
            if (AcompanhamentoDAO.verificaCodigoBarras((String) tblRegistroAcompanhamento.getValueAt(row, 3))) {
                JOptionPane.showMessageDialog(null, "Código de Barras do RA "
                        + (String) tblRegistroAcompanhamento.getValueAt(row, 3)
                        + " já existe!");
                tblRegistroAcompanhamento.setValueAt("", tblRegistroAcompanhamento.getSelectedRow(), 1);
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < rows; row++) {
            if (tblRegistroAcompanhamento.getValueAt(row, 1) != null) {
                if ("".equals(tblRegistroAcompanhamento.getValueAt(row, 1).toString())) {
                    sb.append(tblRegistroAcompanhamento.getValueAt(row, 2).toString()).append(row + 1).append("\n");
                }
            } else {
                sb.append(tblRegistroAcompanhamento.getValueAt(row, 2).toString()).append(row + 1).append("\n");
            }
        }
        if (sb.length() > 0) {
            int option = JOptionPane.showConfirmDialog(
                    null,
                    "Existem registros em branco :\n\n"
                    + sb.toString()
                    + "\nDeseja salvar mesmo assim?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE);
            if (option == JOptionPane.YES_OPTION) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                FrmSalvar frmSalvar = new FrmSalvar(null, true);
                frmSalvar.setVisible(true);
                if (FrmSalvar.senha()) {
                    for (int row = 0; row < rows; row++) {
                        if (tblRegistroAcompanhamento.getValueAt(row, 1) != null) {
                            if (!"".equals((String) tblRegistroAcompanhamento.getValueAt(row, 1))) {
                                if (tblRegistroAcompanhamento.getValueAt(row, 3) != null
                                        && !"".equals((String) tblRegistroAcompanhamento.getValueAt(row, 3))) {
                                    atulizarLoteAcompanhamento(row);
                                } else {
                                    criarLoteAcompanhamento(row);
                                }
                            }
                        }
                    }
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        } else {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                for (int row = 0; row < rows; row++) {
                    if (tblRegistroAcompanhamento.getValueAt(row, 1) != null) {
                        if (!"".equals((String) tblRegistroAcompanhamento.getValueAt(row, 1))) {
                            if (tblRegistroAcompanhamento.getValueAt(row, 3) != null
                                    && !"".equals((String) tblRegistroAcompanhamento.getValueAt(row, 3))) {
                                //update
                                atulizarLoteAcompanhamento(row);
                            } else {
                                //criar
                                criarLoteAcompanhamento(row);
                            }
                        }
                    }
                }
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
        fecharDados();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnImprimirLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirLotesActionPerformed
        FrmImpressaoRelatorioRecepcao frm = new FrmImpressaoRelatorioRecepcao(null, true, "< 4");
        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirLotesActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        readCadastroProduto();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void txtPesquisarLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarLotesKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblLotes.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblLotes.setRowSorter(sorter);
        String text = txtPesquisarLotes.getText().trim();
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_txtPesquisarLotesKeyReleased

    private void tblLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLotesKeyReleased
        if (tblLotes.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblLotesKeyReleased

    private void tblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLotesMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_tblLotesMouseClicked

    private void btnEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_btnEditarLoteActionPerformed

    private void btnProcurarCodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarCodigoBarrasActionPerformed
        Lote lote = new Lote();
        FrmProcurarCodigoBarras frm = new FrmProcurarCodigoBarras(null, true, lote);
        frm.setVisible(true);
        if (lote.getLote_id() > 0) {
            carregarDadosCadastroProduto(lote.getLote_id());
        }
    }//GEN-LAST:event_btnProcurarCodigoBarrasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpane8;
    private javax.swing.JButton btnAdicionarCodigo;
    private javax.swing.JButton btnAtualizar;
    public static javax.swing.JButton btnEditarLote;
    private javax.swing.JButton btnFechar;
    public static javax.swing.JButton btnImprimirLotes;
    public static javax.swing.JButton btnProcurarCodigoBarras;
    private javax.swing.JButton btnRemoverCodigo;
    public static javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTabbedPane pnlRetiradaProduto;
    private javax.swing.JTable tblLotes;
    private javax.swing.JTable tblRegistroAcompanhamento;
    private javax.swing.JTextField txtPesquisarLotes;
    // End of variables declaration//GEN-END:variables

    public void readCadastroProduto() {
        DefaultTableModel model = (DefaultTableModel) tblLotes.getModel();
        LoteDAO equipDao = new LoteDAO();
        model.setNumRows(0);
        for (Lote lot : equipDao.readTodosProdutosAtivos()) {
            model.addRow(new Object[]{
                lot.getLote_id(),
                lot.getAnalise().getSigla_analise_finalidade() + " - "
                + (lot.getProduto().getNome_material() == null
                ? lot.getMetodo().getMetodo()
                : lot.getProduto().getNome_material()),
                lot.getLote_produto(),
                lot.getData_entrada()
            });
        }
    }

    public void readRA(int lote_id) {
        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
        AcompanhamentoDAO acompDao = new AcompanhamentoDAO();
        model.setNumRows(0);
        for (Acompanhamento acomp : acompDao.readAcompanhamentoByLote(lote_id)) {
            model.addRow(new Object[]{
                acomp.getRegistro_acompanhamento_id(),
                acomp.getRegistro_acompanhamento(),
                acomp.getMetodo().getCod_metodo(),
                acomp.getSetor().getSetor(),
                acomp.getVersao(),
                acomp.getStatus(),
                DataHora.getStringDateTime(acomp.getData_registro()),
                acomp.getUser_registro().getUser()
            });
        }
    }

    private void carregarDadosCadastroProduto(Integer lote_id) {
        Lote lot = new Lote();
        lot.setLote_id(lote_id);
        LoteDAO lotDAO = new LoteDAO();
        lotDAO.selectLote(lot);
        pnlRetiradaProduto.setEnabledAt(0, false);
        pnlRetiradaProduto.setEnabledAt(1, true);
        pnlRetiradaProduto.setSelectedIndex(1);
        setTitle("Registro de Acompanhamentos de Lotes - " + lot.getLote_produto());
        readRegistroAcompanhanto(lot.getMetodo().getMetodo_id(), lote_id);
    }

    public void readRegistroAcompanhanto(Integer mtd_id, Integer lote_id) {
        Metodologia mtd = new Metodologia();
        mtd.setMetodo_id(mtd_id);
        AcompanhamentoDAO acompDao = new AcompanhamentoDAO();
        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
        model.setNumRows(0);
        for (Acompanhamento acomp : acompDao.readLoteAcompanhamento(mtd_id, lote_id)) {
            model.addRow(new Object[]{
                acomp.getRegistro_acompanhamento_id(),
                acomp.getCodigo_barras(),
                acomp.getRegistro_acompanhamento(),
                DataHora.getStringDateTime(acomp.getData_registro()),
                acomp.getUser_registro().getUser(),
                acomp.getLote_acompanhamento_id()
            });
        }
    }

    private void fecharDados() {
        setTitle("Registro de Acompanhamentos de Lotes");
        pnlRetiradaProduto.setEnabledAt(0, true);
        pnlRetiradaProduto.setEnabledAt(1, false);
        pnlRetiradaProduto.setSelectedIndex(0);
        tblLotes.setRowSorter(null);
        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
        model.setNumRows(0);
        btnAdicionarCodigo.setEnabled(true);
        btnRemoverCodigo.setEnabled(true);
        tblRegistroAcompanhamento.setEnabled(true);
        limparCampos();
        readCadastroProduto();
    }

    private void limparCampos() {
        txtPesquisarLotes.setText(null);
        tblLotes.setRowSorter(null);
    }

    private void criarLoteAcompanhamento(Integer linha) {
        Acompanhamento acomp = new Acompanhamento();
        LoteAcompanhamentoDAO loteacompDAO = new LoteAcompanhamentoDAO();
        Lote lot = new Lote();
        Usuario user = new Usuario();
        acomp.setRegistro_acompanhamento_id((Integer) tblRegistroAcompanhamento.getValueAt(linha, 0));
        lot.setLote_id((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
        acomp.setLote(lot);
        acomp.setCodigo_barras((String) tblRegistroAcompanhamento.getValueAt(linha, 1));
        acomp.setData_registro(DataHora.getTimestampDate(new Date()));
        user.setUser(System.getProperty("user"));
        acomp.setUser_registro(user);
        loteacompDAO.createLoteAcompanhamento(acomp);
    }

    private void atulizarLoteAcompanhamento(Integer linha) {
        Acompanhamento acomp = new Acompanhamento();
        AcompanhamentoDAO acompDAO = new AcompanhamentoDAO();
        Usuario user = new Usuario();
        acomp.setLote_acompanhamento_id((Integer) tblRegistroAcompanhamento.getValueAt(linha, 5));
        acomp.setCodigo_barras((String) tblRegistroAcompanhamento.getValueAt(linha, 1));
        acomp.setData_registro(DataHora.getTimestampDate(new Date()));
        user.setUser(System.getProperty("user"));
        acomp.setUser_registro(user);
        acompDAO.updateLoteAcompanhamento(acomp);
    }

    private void deletarLoteAcompanhamento(Integer lote_id) {
        Acompanhamento acomp = new Acompanhamento();
        AcompanhamentoDAO acompDAO = new AcompanhamentoDAO();
        try {
            acomp.setLote_acompanhamento_id(lote_id);
            acompDAO.deleteLoteAcompanhamento(acomp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atulalizar dados: " + e);
        }
    }

}
