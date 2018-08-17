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

import Classes.DAO.AcompanhamentoDAO;
import Classes.DAO.AmostraDAO;
import Classes.DAO.AnaliseDAO;
import Classes.DAO.LoteDAO;
import Classes.DAO.MetodologiaDAO;
import Classes.DAO.SetorDAO;
import Classes.Modelo.Acompanhamento;
import Classes.Modelo.Amostra;
import Classes.Modelo.Analise;
import Classes.Modelo.Lote;
import Classes.Modelo.Metodologia;
import Classes.Modelo.Setor;
import java.awt.event.KeyEvent;
import java.util.TreeMap;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public final class FrmEntradaAmostra extends javax.swing.JInternalFrame {

    private boolean novoEntradaAmostra = false;
    private TreeMap<Integer, String> categoryMap = new TreeMap<>();
    private final TreeMap<Integer, String> categoryMapSetor = new TreeMap<>();
    private final TreeMap<Integer, String> categoryMapAcomp = new TreeMap<>();

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmEntradaAmostra() {
        initComponents();
        readCadastroProduto();
        pnlCadastroAmostra.setEnabledAt(1, false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroAmostra = new javax.swing.JTabbedPane();
        pnlLotes = new javax.swing.JPanel();
        Jpane8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLimitPesquisarLotes = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        pnlEntrada = new javax.swing.JPanel();
        btnFechar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAcompanhamento = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        pnlAnalises = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAnaliseMetodo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenuItem();
        mnuEditarLote = new javax.swing.JMenu();
        itmEditarLote = new javax.swing.JMenuItem();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes"));

        tblLotes.setAutoCreateRowSorter(true);
        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Lote", "Método", "Data Entrada", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            tblLotes.getColumnModel().getColumn(0).setMinWidth(60);
            tblLotes.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblLotes.getColumnModel().getColumn(0).setMaxWidth(60);
            tblLotes.getColumnModel().getColumn(2).setMinWidth(80);
            tblLotes.getColumnModel().getColumn(2).setPreferredWidth(80);
            tblLotes.getColumnModel().getColumn(2).setMaxWidth(80);
            tblLotes.getColumnModel().getColumn(3).setMinWidth(120);
            tblLotes.getColumnModel().getColumn(3).setPreferredWidth(120);
            tblLotes.getColumnModel().getColumn(3).setMaxWidth(120);
            tblLotes.getColumnModel().getColumn(4).setMinWidth(120);
            tblLotes.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblLotes.getColumnModel().getColumn(4).setMaxWidth(120);
            tblLotes.getColumnModel().getColumn(5).setMinWidth(100);
            tblLotes.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblLotes.getColumnModel().getColumn(5).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 947, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
        );

        txtPesquisarLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarLotesKeyReleased(evt);
            }
        });

        jLabel6.setText("Pesquisar:");

        cmbLimitPesquisarLotes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "50", "100", "1000", "10000" }));
        cmbLimitPesquisarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimitPesquisarLotesActionPerformed(evt);
            }
        });

        jLabel11.setText("Visualizar:");

        javax.swing.GroupLayout Jpane8Layout = new javax.swing.GroupLayout(Jpane8);
        Jpane8.setLayout(Jpane8Layout);
        Jpane8Layout.setHorizontalGroup(
            Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Jpane8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLimitPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Jpane8Layout.setVerticalGroup(
            Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpane8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbLimitPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlLotesLayout = new javax.swing.GroupLayout(pnlLotes);
        pnlLotes.setLayout(pnlLotesLayout);
        pnlLotesLayout.setHorizontalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLotesLayout.setVerticalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 425, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCadastroAmostra.addTab("Lotes", pnlLotes);

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
                "Id", "Registro de Acompanhamento", "Método", "Setor", "Versão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRegistroAcompanhamento.setSurrendersFocusOnKeystroke(true);
        tblRegistroAcompanhamento.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblRegistroAcompanhamento);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap(841, Short.MAX_VALUE)
                .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(btnFechar)
                .addContainerGap())
        );

        pnlCadastroAmostra.addTab("Cadastro Amostras", pnlEntrada);

        pnlAnalises.setBorder(javax.swing.BorderFactory.createTitledBorder("Análises"));

        tblAnaliseMetodo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Análise", "Sigla", "Setor", "RA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnaliseMetodo.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblAnaliseMetodo);

        javax.swing.GroupLayout pnlAnalisesLayout = new javax.swing.GroupLayout(pnlAnalises);
        pnlAnalises.setLayout(pnlAnalisesLayout);
        pnlAnalisesLayout.setHorizontalGroup(
            pnlAnalisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
        );
        pnlAnalisesLayout.setVerticalGroup(
            pnlAnalisesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(pnlAnalises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(37, 37, 37)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 441, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(pnlAnalises, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(131, 131, 131)))
        );

        pnlCadastroAmostra.addTab("tab3", jPanel1);

        mnuArquivo.setText("Arquivo");

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuSair);

        jMenuBar1.add(mnuArquivo);

        mnuEditarLote.setText("Editar");

        itmEditarLote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK));
        itmEditarLote.setText("Editar");
        itmEditarLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarLoteActionPerformed(evt);
            }
        });
        mnuEditarLote.add(itmEditarLote);

        jMenuBar1.add(mnuEditarLote);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroAmostra)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroAmostra)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLotesMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDadosCadastroAmostra(tblLotes.getValueAt(tblLotes.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_tblLotesMouseClicked

    private void tblLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLotesKeyReleased
        if (tblLotes.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletarCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblLotesKeyReleased

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

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void itmEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            carregarDadosCadastroAmostra(tblLotes.getValueAt(tblLotes.getSelectedRow(), 3).toString());
        }
    }//GEN-LAST:event_itmEditarLoteActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        fecharDados();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void cmbLimitPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimitPesquisarLotesActionPerformed
        readCadastroProduto();
    }//GEN-LAST:event_cmbLimitPesquisarLotesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpane8;
    private javax.swing.JButton btnFechar;
    private javax.swing.JComboBox<String> cmbLimitPesquisarLotes;
    public static javax.swing.JMenuItem itmEditarLote;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JMenu mnuArquivo;
    public static javax.swing.JMenu mnuEditarLote;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JPanel pnlAnalises;
    private javax.swing.JTabbedPane pnlCadastroAmostra;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTable tblAnaliseMetodo;
    private javax.swing.JTable tblLotes;
    private javax.swing.JTable tblRegistroAcompanhamento;
    private javax.swing.JTextField txtPesquisarLotes;
    // End of variables declaration//GEN-END:variables

    private void criarAnalises(int lote_id) {
        int rows = tblAnaliseMetodo.getRowCount();
        for (int row = 0; row < rows; row++) {
            try {
                Amostra ams = new Amostra();
                AmostraDAO amsDAO = new AmostraDAO();
                Lote lot = new Lote();
                Analise anls = new Analise();
                lot.setLote_id(lote_id);
                anls.setMetodologia_analise_id((Integer) tblAnaliseMetodo.getValueAt(row, 0));
                ams.setLote(lot);
                ams.setAnalise(anls);
                ams.setAmostra_status_id(1);
                amsDAO.createAmostra(ams);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
            }
        }
    }

    public final void readAnalises(int mtd_id) {

        Metodologia mtd = new Metodologia();
        mtd.setMetodo_id(mtd_id);
        DefaultTableModel model = (DefaultTableModel) tblAnaliseMetodo.getModel();
        AnaliseDAO anlsDao = new AnaliseDAO();
        model.setNumRows(0);
        JComboBox comboSetor = new JComboBox();
        comboSetor.addItem("");
        categoryMapSetor.clear();
        SetorDAO setorDao = new SetorDAO();
        for (Setor setor : setorDao.readSetor()) {
            Integer id = setor.getSetor_id();
            String name = setor.getSigla_setor();
            comboSetor.addItem(name);
            categoryMapSetor.put(id, name);
        }
        JComboBox comboRA = new JComboBox();
        comboRA.addItem("");
        categoryMapAcomp.clear();
        AcompanhamentoDAO acompDao = new AcompanhamentoDAO();
        for (Acompanhamento acomp : acompDao.readAcompanhamento(mtd)) {
            Integer id = acomp.getRegistro_acompanhamento_id();
            String name = acomp.getSigla_registro_acompanhamento();
            comboRA.addItem(name);
            categoryMapAcomp.put(id, name);
        }
        TableColumn colSetor = tblAnaliseMetodo.getColumnModel().getColumn(3);
        colSetor.setCellEditor(new DefaultCellEditor(comboSetor));
        TableColumn colRA = tblAnaliseMetodo.getColumnModel().getColumn(4);
        colRA.setCellEditor(new DefaultCellEditor(comboRA));
        for (Analise anls : anlsDao.readAnaliseEntrada(mtd_id)) {
            model.addRow(new Object[]{
                anls.getMetodologia_analise_id(),
                anls.getAnalise(),
                anls.getSigla_analise(),
                anls.getSetor().getSigla_setor(),
                anls.getAcompanhamento().getSigla_registro_acompanhamento()
            });
        }

    }

    public final void readCadastroProduto() {
        DefaultTableModel model = (DefaultTableModel) tblLotes.getModel();
        LoteDAO equipDao = new LoteDAO();
        model.setNumRows(0);
        for (Lote lot : equipDao.readCadastroProduto(Integer.valueOf(cmbLimitPesquisarLotes.getSelectedItem().toString()))) {
            model.addRow(new Object[]{
                lot.getLote_id(),
                lot.getAnalise().getSigla_analise_finalidade() + " - "
                + lot.getProduto().getNome_material(),
                lot.getLote_produto(),
                lot.getMetodo().getCod_metodo(),
                lot.getData_entrada(),
                lot.getLote_status()
            });
        }
    }

    public final void readRA(Acompanhamento acompanhamento) {
        DefaultTableModel model = (DefaultTableModel) tblRegistroAcompanhamento.getModel();
        AcompanhamentoDAO acompDao = new AcompanhamentoDAO();
        model.setNumRows(0);
        for (Acompanhamento acomp : acompDao.readAcompanhamento(acompanhamento.getMetodo())) {
            model.addRow(new Object[]{
                acomp.getRegistro_acompanhamento_id(),
                acomp.getRegistro_acompanhamento(),
                acomp.getMetodo().getCod_metodo(),
                acomp.getSetor().getSigla_setor(),
                acomp.getVersao()
            });
        }
    }

    private void carregarDadosCadastroAmostra(String cod_metodo) {

        Acompanhamento acomp = new Acompanhamento();
        Metodologia mtd = new Metodologia();
        MetodologiaDAO mtdDAO = new MetodologiaDAO();
        mtd.setMetodo_id(mtdDAO.selectMetodologiaIdByCodMetodo(cod_metodo));
        acomp.setMetodo(mtd);

//        txtLote.setText(prd.getLote_produto());
//        readMetodo();
//        String[] cod_mtd = {prd.getMetodo().getCod_metodo()};
//        cmbMetodo.setSelectedItem(cod_mtd[0]);
//        Lote lot = new Lote();
//        lot.setLote_id(id);
//        LoteDAO lotDAO = new LoteDAO();
//        lotDAO.selectLote(lot);
//        txtLoteProduto.setText(lot.getLote_produto());
//        txtIdProduto.setText(lot.getLote_id().toString());
//        txtObsProduto.setText(lot.getLote_obs());
//        txtCodMaterial.setText(lot.getProduto().getCod_material());
//        txtMaterial.setText(lot.getProduto().getNome_material());
//        txtTipo.setText(lot.getProduto().getTipo());
        mnuEditarLote.setEnabled(false);
        pnlCadastroAmostra.setEnabledAt(0, false);
        pnlCadastroAmostra.setEnabledAt(1, true);
        pnlCadastroAmostra.setSelectedIndex(1);
//        pnlDados.setVisible(false);
//        pnlAnalises.setVisible(true);
//        readAnalises(lot.getMetodo().getMetodo_id());
//        readStatusAmostra();
        readRA(acomp);
    }

    private void fecharDados() {
        pnlCadastroAmostra.setEnabledAt(0, true);
        pnlCadastroAmostra.setEnabledAt(1, false);
        pnlCadastroAmostra.setSelectedIndex(0);
        tblLotes.setRowSorter(null);
        mnuEditarLote.setEnabled(true);
        novoEntradaAmostra = false;
        limparCampos();
        readCadastroProduto();
    }

    private void limparCampos() {
        tblLotes.setRowSorter(null);
    }

    private void criarAnaliseAmostra() {
//        try {
//            Amostra ams = new Amostra();
//            AmostraDAO amsDAO = new AmostraDAO();
//            Lote lot = new Lote();
//            Analise anls = new Analise();
//            lot.setLote_id((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
//            anls.setMetodologia_analise_id((Integer) tblAnaliseMetodo.getValueAt(tblAnaliseMetodo.getSelectedRow(), 4));
//            ams.setLote(lot);
//            ams.setAnalise(anls);
//            ams.setAmostra_status_id(ComboBox.getKeyForValue(cmbStatusAmostra.getSelectedItem().toString(), categoryMap));
//            ams.setQuantidade_amostra(txtQuantidade.getText().toUpperCase());
//            ams.setObs_amostra(txtObsProduto.getText().toUpperCase());
//            JOptionPane.showMessageDialog(null, ams.getLote().getLote_id());
//            JOptionPane.showMessageDialog(null, ams.getAnalise().getMetodologia_analise_id());
//            JOptionPane.showMessageDialog(null, ams.getAmostra_status_id());
//            JOptionPane.showMessageDialog(null, ams.getQuantidade_amostra());
//            JOptionPane.showMessageDialog(null, ams.getObs_amostra());
//            amsDAO.createAmostra(ams);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
//        } finally {
//            fecharDadosAnalises();
//        }
    }

    private void atulizarAnaliseAmostra(int lote_id) {
//        Lote lot = new Lote();
//        LoteDAO lotDAO = new LoteDAO();
//        try {
//            JOptionPane.showMessageDialog(null, "atualizar");
//        } catch (NumberFormatException | HeadlessException e) {
//            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + e);
//        } finally {
//            fecharDadosAnalises();
//        }
    }

    private void deletarCadastroProduto(int lote_id) {
        Lote lot = new Lote();
        LoteDAO lotDAO = new LoteDAO();
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Realmente deseja Excluir esse registro?", "Aviso", JOptionPane.YES_NO_OPTION);
            if (dialogResult == 0) {
                lot.setLote_id(lote_id);
                lotDAO.deleteLote(lot);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao atulalizar dados: " + e);
        } finally {
            fecharDados();
        }
    }

}
