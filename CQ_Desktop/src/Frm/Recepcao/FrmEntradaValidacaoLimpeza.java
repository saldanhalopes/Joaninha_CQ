package Frm.Recepcao;

import Classes.Acesso.EntradaProdutoValidacaoLimpezaAcesso;
import Classes.DAO.LoteDAO;
import Classes.DAO.MetodologiaDAO;
import Frm.Cadastro.FrmProcurarMetodologia;
import Classes.Modelo.Analise;
import Classes.Modelo.Lote;
import Classes.Modelo.Material;
import Classes.Modelo.Usuario;
import Classes.Util.ComboBox;
import Classes.Util.DataHora;
import Frm.Login.FrmSalvar;
import Classes.Modelo.Metodologia;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.RowFilter;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public final class FrmEntradaValidacaoLimpeza extends javax.swing.JInternalFrame {

    private boolean novoEntradaProduto = false;
    private TreeMap<Integer, String> categoryMapMetodo = new TreeMap<>();

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmEntradaValidacaoLimpeza() {
        initComponents();
        setTitle("Entrada de Validação de Limpeza");
        loadHora();
        readCadastroLote();
        pnlCadastroProduto.setEnabledAt(1, false);
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        Acesso.verificarAcessoEntradaProduto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroProduto = new javax.swing.JTabbedPane();
        pnlLotes = new javax.swing.JPanel();
        Jpane8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLotesValidacaoLimpeza = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLimitPesquisarLotes = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovoLoteValidacaoLimpeza = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEditarLoteValidacaoLimpeza = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnImprimirLotesValidacaoLimpeza = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnAtualizarValidacaoLimpeza = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnExcluirLoteValidacaoLimpeza = new javax.swing.JButton();
        pnlEntrada = new javax.swing.JPanel();
        pnlDados = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox();
        btnProcurarMetodoValidacaoLimpeza = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLoteProduto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtObsProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDataPrevisaoLote = new com.toedter.calendar.JDateChooser();
        txtDataEntradaLote = new com.toedter.calendar.JDateChooser();
        txtHoraInicio = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        txtMinutoInicio = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        txtHoraFim = new javax.swing.JSpinner();
        txtMinutoFim = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtEtapa = new javax.swing.JTextField();
        btnExcluirCadastroProduto = new javax.swing.JButton();
        btnSalvarCadastroProduto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuNovoLoteValidacaoLimpeza = new javax.swing.JMenu();
        itmNovoLoteValidacaoLimpeza = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        mnuEditarLoteValidacaoLimpeza = new javax.swing.JMenu();
        itmEditarLoteValidacaoLimpeza = new javax.swing.JMenuItem();
        itmExcluirLoteValidacaoLimpeza = new javax.swing.JMenuItem();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes"));

        tblLotesValidacaoLimpeza.setAutoCreateRowSorter(true);
        tblLotesValidacaoLimpeza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Produto", "Etapa", "Lote", "Método", "Data Entrada", "Responsável"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLotesValidacaoLimpeza.setSurrendersFocusOnKeystroke(true);
        tblLotesValidacaoLimpeza.getTableHeader().setReorderingAllowed(false);
        tblLotesValidacaoLimpeza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLotesValidacaoLimpezaMouseClicked(evt);
            }
        });
        tblLotesValidacaoLimpeza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLotesValidacaoLimpezaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblLotesValidacaoLimpeza);
        if (tblLotesValidacaoLimpeza.getColumnModel().getColumnCount() > 0) {
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(0).setMinWidth(60);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(0).setMaxWidth(60);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(2).setMinWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(2).setMaxWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(3).setMinWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(3).setMaxWidth(150);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(4).setMinWidth(120);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(4).setMaxWidth(120);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(5).setMinWidth(180);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(5).setPreferredWidth(180);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(5).setMaxWidth(180);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(6).setMinWidth(100);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblLotesValidacaoLimpeza.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
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

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNovoLoteValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btnNovoLoteValidacaoLimpeza.setText("Novo");
        btnNovoLoteValidacaoLimpeza.setFocusable(false);
        btnNovoLoteValidacaoLimpeza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoLoteValidacaoLimpeza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovoLoteValidacaoLimpeza);
        jToolBar1.add(jSeparator6);

        btnEditarLoteValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btnEditarLoteValidacaoLimpeza.setText("Editar");
        btnEditarLoteValidacaoLimpeza.setFocusable(false);
        btnEditarLoteValidacaoLimpeza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarLoteValidacaoLimpeza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditarLoteValidacaoLimpeza);
        jToolBar1.add(jSeparator1);

        btnImprimirLotesValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirLotesValidacaoLimpeza.setText("Relatórios");
        btnImprimirLotesValidacaoLimpeza.setFocusable(false);
        btnImprimirLotesValidacaoLimpeza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirLotesValidacaoLimpeza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirLotesValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirLotesValidacaoLimpezaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimirLotesValidacaoLimpeza);
        jToolBar1.add(jSeparator7);

        btnAtualizarValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_atualizar.png"))); // NOI18N
        btnAtualizarValidacaoLimpeza.setText("Atualizar");
        btnAtualizarValidacaoLimpeza.setFocusable(false);
        btnAtualizarValidacaoLimpeza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizarValidacaoLimpeza.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAtualizarValidacaoLimpeza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizarValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarValidacaoLimpezaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizarValidacaoLimpeza);
        jToolBar1.add(jSeparator5);

        btnExcluirLoteValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_close.png"))); // NOI18N
        btnExcluirLoteValidacaoLimpeza.setText("Excluir");
        btnExcluirLoteValidacaoLimpeza.setFocusable(false);
        btnExcluirLoteValidacaoLimpeza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirLoteValidacaoLimpeza.setPreferredSize(new java.awt.Dimension(60, 60));
        btnExcluirLoteValidacaoLimpeza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluirLoteValidacaoLimpeza);

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
                        .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbLimitPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Jpane8Layout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(2, 2, 2)))
        );
        Jpane8Layout.setVerticalGroup(
            Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jpane8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmbLimitPesquisarLotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Jpane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Jpane8Layout.createSequentialGroup()
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 396, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlLotesLayout = new javax.swing.GroupLayout(pnlLotes);
        pnlLotes.setLayout(pnlLotesLayout);
        pnlLotesLayout.setHorizontalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLotesLayout.setVerticalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 473, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLotesLayout.createSequentialGroup()
                    .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlCadastroProduto.addTab("Lotes", pnlLotes);

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodologia"));

        jLabel10.setText("Método:");

        btnProcurarMetodoValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_config_produto.png"))); // NOI18N
        btnProcurarMetodoValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarMetodoValidacaoLimpezaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurarMetodoValidacaoLimpeza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcurarMetodoValidacaoLimpeza)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Lote"));

        jLabel1.setText("Lote:");

        jLabel24.setText("Entrada:");

        jLabel2.setText("Obs:");

        jLabel7.setText("Etapa:");

        jLabel25.setText("Previsão:");

        jLabel4.setText("h");

        jLabel9.setText("min");

        jLabel12.setText("h");

        jLabel13.setText("min");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtObsProduto)
                                .addGap(17, 17, 17))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataEntradaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataPrevisaoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addContainerGap(501, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataEntradaLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataPrevisaoLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEtapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObsProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        btnExcluirCadastroProduto.setText("Excuir");
        btnExcluirCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastroProdutoActionPerformed(evt);
            }
        });

        btnSalvarCadastroProduto.setText("Ok");
        btnSalvarCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCadastroProdutoActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(btnExcluirCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalvarCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCadastroProduto)
                    .addComponent(btnSalvarCadastroProduto)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        pnlCadastroProduto.addTab("Entrada", pnlEntrada);

        mnuArquivo.setText("Arquivo");

        mnuNovoLoteValidacaoLimpeza.setText("Novo");

        itmNovoLoteValidacaoLimpeza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.ALT_MASK));
        itmNovoLoteValidacaoLimpeza.setText("Lote");
        itmNovoLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNovoLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        mnuNovoLoteValidacaoLimpeza.add(itmNovoLoteValidacaoLimpeza);

        mnuArquivo.add(mnuNovoLoteValidacaoLimpeza);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuSair);

        jMenuBar1.add(mnuArquivo);

        mnuEditarLoteValidacaoLimpeza.setText("Editar");

        itmEditarLoteValidacaoLimpeza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK));
        itmEditarLoteValidacaoLimpeza.setText("Editar");
        itmEditarLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        mnuEditarLoteValidacaoLimpeza.add(itmEditarLoteValidacaoLimpeza);

        itmExcluirLoteValidacaoLimpeza.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK));
        itmExcluirLoteValidacaoLimpeza.setText("Excluir");
        itmExcluirLoteValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirLoteValidacaoLimpezaActionPerformed(evt);
            }
        });
        mnuEditarLoteValidacaoLimpeza.add(itmExcluirLoteValidacaoLimpeza);

        jMenuBar1.add(mnuEditarLoteValidacaoLimpeza);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCadastroProduto)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastroProduto)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLotesValidacaoLimpezaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLotesValidacaoLimpezaMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDadosCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_tblLotesValidacaoLimpezaMouseClicked

    private void tblLotesValidacaoLimpezaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLotesValidacaoLimpezaKeyReleased
        if (tblLotesValidacaoLimpeza.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletarCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblLotesValidacaoLimpezaKeyReleased

    private void txtPesquisarLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarLotesKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblLotesValidacaoLimpeza.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblLotesValidacaoLimpeza.setRowSorter(sorter);
        String text = txtPesquisarLotes.getText().trim();
        String parametro = "*";
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else if (text.indexOf(parametro) > 0) {
            ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<>();
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(0, text.indexOf(parametro)).trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(text.indexOf(parametro) + 1, text.length()).trim().toUpperCase()));
            sorter.setRowFilter(RowFilter.andFilter(andFilters));
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
        }
    }//GEN-LAST:event_txtPesquisarLotesKeyReleased

    private void itmNovoLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNovoLoteValidacaoLimpezaActionPerformed
        abrirDados();
    }//GEN-LAST:event_itmNovoLoteValidacaoLimpezaActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void itmEditarLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarLoteValidacaoLimpezaActionPerformed
        if (tblLotesValidacaoLimpeza.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_itmEditarLoteValidacaoLimpezaActionPerformed

    private void itmExcluirLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirLoteValidacaoLimpezaActionPerformed
        if (tblLotesValidacaoLimpeza.getSelectedRow() != -1) {
            deletarCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_itmExcluirLoteValidacaoLimpezaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        fecharDados();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCadastroProdutoActionPerformed
        Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                + " " + txtHoraInicio.getValue().toString()
                + ":" + txtMinutoInicio.getValue().toString() + ":00");
        Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                + " " + txtHoraFim.getValue().toString()
                + ":" + txtMinutoFim.getValue().toString() + ":00");
        if (cmbMetodo.getSelectedItem().toString().isEmpty() || cmbMetodo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o método");
            cmbMetodo.requestFocus();
        } else if (txtLoteProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lote inválido");
            txtLoteProduto.requestFocus();
        } else if (txtEtapa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecione o Ponto de Coleta");
            txtEtapa.requestFocus();
        } else if (datahora_inicio.after(datahora_fim)) {
            JOptionPane.showMessageDialog(null, "Data e Hora da Entrada e Previsão estão Inválidas!");
            txtDataEntradaLote.requestFocus();
        } else if (novoEntradaProduto) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                criarCadastroProduto();
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } else {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                atulizarCadastroProduto(((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0)));
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnSalvarCadastroProdutoActionPerformed

    private void btnExcluirCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroProdutoActionPerformed
        deletarCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
    }//GEN-LAST:event_btnExcluirCadastroProdutoActionPerformed

    private void cmbLimitPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimitPesquisarLotesActionPerformed
        readCadastroLote();
    }//GEN-LAST:event_cmbLimitPesquisarLotesActionPerformed

    private void btnNovoLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoteValidacaoLimpezaActionPerformed
        abrirDados();
    }//GEN-LAST:event_btnNovoLoteValidacaoLimpezaActionPerformed

    private void btnEditarLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLoteValidacaoLimpezaActionPerformed
        if (tblLotesValidacaoLimpeza.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_btnEditarLoteValidacaoLimpezaActionPerformed

    private void btnImprimirLotesValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirLotesValidacaoLimpezaActionPerformed
        FrmImpressaoRelatorioRecepcao frm = new FrmImpressaoRelatorioRecepcao(null, true, "= 7");
        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirLotesValidacaoLimpezaActionPerformed

    private void btnExcluirLoteValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLoteValidacaoLimpezaActionPerformed
        if (tblLotesValidacaoLimpeza.getSelectedRow() != -1) {
            deletarCadastroProduto((Integer) tblLotesValidacaoLimpeza.getValueAt(tblLotesValidacaoLimpeza.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_btnExcluirLoteValidacaoLimpezaActionPerformed

    private void btnAtualizarValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarValidacaoLimpezaActionPerformed
        readCadastroLote();
    }//GEN-LAST:event_btnAtualizarValidacaoLimpezaActionPerformed

    private void btnProcurarMetodoValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMetodoValidacaoLimpezaActionPerformed
        Metodologia mtd = new Metodologia();
        String tipo_metodo = "MAARL";
        FrmProcurarMetodologia frm = new FrmProcurarMetodologia(null, true, mtd, tipo_metodo);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readMetodo();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        String[] cod_mtd = {mtd.getCod_metodo()};
        cmbMetodo.setSelectedItem(cod_mtd[0]);
    }//GEN-LAST:event_btnProcurarMetodoValidacaoLimpezaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpane8;
    private javax.swing.JButton btnAtualizarValidacaoLimpeza;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnEditarLoteValidacaoLimpeza;
    public static javax.swing.JButton btnExcluirCadastroProduto;
    public static javax.swing.JButton btnExcluirLoteValidacaoLimpeza;
    public static javax.swing.JButton btnImprimirLotesValidacaoLimpeza;
    public static javax.swing.JButton btnNovoLoteValidacaoLimpeza;
    public static javax.swing.JButton btnProcurarMetodoValidacaoLimpeza;
    public static javax.swing.JButton btnSalvarCadastroProduto;
    private javax.swing.JComboBox<String> cmbLimitPesquisarLotes;
    private javax.swing.JComboBox cmbMetodo;
    public static javax.swing.JMenuItem itmEditarLoteValidacaoLimpeza;
    public static javax.swing.JMenuItem itmExcluirLoteValidacaoLimpeza;
    public static javax.swing.JMenuItem itmNovoLoteValidacaoLimpeza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnuArquivo;
    public static javax.swing.JMenu mnuEditarLoteValidacaoLimpeza;
    public static javax.swing.JMenu mnuNovoLoteValidacaoLimpeza;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JTabbedPane pnlCadastroProduto;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTable tblLotesValidacaoLimpeza;
    private com.toedter.calendar.JDateChooser txtDataEntradaLote;
    private com.toedter.calendar.JDateChooser txtDataPrevisaoLote;
    public static javax.swing.JTextField txtEtapa;
    private javax.swing.JSpinner txtHoraFim;
    private javax.swing.JSpinner txtHoraInicio;
    public static javax.swing.JTextField txtLoteProduto;
    private javax.swing.JSpinner txtMinutoFim;
    private javax.swing.JSpinner txtMinutoInicio;
    private javax.swing.JTextField txtObsProduto;
    private javax.swing.JTextField txtPesquisarLotes;
    // End of variables declaration//GEN-END:variables

    public void readMetodo() {
        cmbMetodo.removeAllItems();
        cmbMetodo.addItem("");
        categoryMapMetodo.clear();
        MetodologiaDAO mtdDao = new MetodologiaDAO();
        for (Metodologia mtd : mtdDao.readMetodologia()) {
            if (mtd.getCod_metodo().startsWith("MAARL")) {
                Integer id = mtd.getMetodo_id();
                String name = mtd.getCod_metodo();
                cmbMetodo.addItem(name);
                categoryMapMetodo.put(id, name);
            }
        }
    }

    private void loadHora() {
        SpinnerNumberModel modelHoraInicio = new SpinnerNumberModel(0, 0, 23, 1);
        txtHoraInicio.setModel(modelHoraInicio);
        JSpinner.NumberEditor editorHoraInicio = new JSpinner.NumberEditor(txtHoraInicio);
        txtHoraInicio.setEditor(editorHoraInicio);
        SpinnerNumberModel modelMinutoInicio = new SpinnerNumberModel(0, 0, 59, 1);
        txtMinutoInicio.setModel(modelMinutoInicio);
        JSpinner.NumberEditor editorMinutoInicio = new JSpinner.NumberEditor(txtMinutoInicio);
        txtMinutoInicio.setEditor(editorMinutoInicio);
        SpinnerNumberModel modelHoraFim = new SpinnerNumberModel(0, 0, 23, 1);
        txtHoraFim.setModel(modelHoraFim);
        JSpinner.NumberEditor editorHoraFim = new JSpinner.NumberEditor(txtHoraFim);
        txtHoraFim.setEditor(editorHoraFim);
        SpinnerNumberModel modelMinutoFim = new SpinnerNumberModel(0, 0, 59, 1);
        txtMinutoFim.setModel(modelMinutoFim);
        JSpinner.NumberEditor editorMinutoFim = new JSpinner.NumberEditor(txtMinutoFim);
        txtMinutoFim.setEditor(editorMinutoFim);
    }

    private void loadData() {
        Date currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        txtDataEntradaLote.setDate(currentDate);
        txtDataEntradaLote.setMaxSelectableDate(currentDate);
        txtHoraInicio.setValue((Integer) cal.get(Calendar.HOUR_OF_DAY));
        txtMinutoInicio.setValue((Integer) cal.get(Calendar.MINUTE));
        cal.add(Calendar.DATE, +5);
        cal.add(Calendar.HOUR_OF_DAY, +7);
        cal.add(Calendar.MINUTE, +20);
        txtDataPrevisaoLote.setDate(cal.getTime());
        txtHoraFim.setValue((Integer) cal.get(Calendar.HOUR_OF_DAY));
        txtMinutoFim.setValue((Integer) cal.get(Calendar.MINUTE));
    }

    private void carregarData(Timestamp Data_hora_entrada, Timestamp Data_hora_previsao) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(Data_hora_entrada);
        txtDataEntradaLote.setDate(Data_hora_entrada);
        txtDataEntradaLote.setMaxSelectableDate(new Date());
        txtHoraInicio.setValue((Integer) cal.get(Calendar.HOUR_OF_DAY));
        txtMinutoInicio.setValue((Integer) cal.get(Calendar.MINUTE));
        cal.setTime(Data_hora_previsao);
        txtDataPrevisaoLote.setDate(Data_hora_previsao);
        txtHoraFim.setValue((Integer) cal.get(Calendar.HOUR_OF_DAY));
        txtMinutoFim.setValue((Integer) cal.get(Calendar.MINUTE));
    }

    public final void readCadastroLote() {
        DefaultTableModel model = (DefaultTableModel) tblLotesValidacaoLimpeza.getModel();
        LoteDAO equipDao = new LoteDAO();
        model.setNumRows(0);
        for (Lote lot : equipDao.readCadastroValidacaoLimpeza(Integer.valueOf(cmbLimitPesquisarLotes.getSelectedItem().toString()))) {
            model.addRow(new Object[]{
                lot.getLote_id(),
                lot.getAnalise().getSigla_analise_finalidade() + " - "
                + lot.getMetodo().getCod_metodo() + " - "
                + lot.getMetodo().getMetodo(),
                lot.getEtapa(),
                lot.getLote_produto(),
                lot.getMetodo().getCod_metodo(),
                DataHora.getStringDateTime(lot.getData_entrada()),
                lot.getUser().getUser()
            });
        }
    }

    private void carregarDadosCadastroProduto(int id) {
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        if (Acesso.verificarCarregarDados()) {
            readMetodo();
            novoEntradaProduto = false;
            Lote lot = new Lote();
            lot.setLote_id(id);
            LoteDAO lotDAO = new LoteDAO();
            lotDAO.selectLoteOutros(lot);
            setTitle("Lote: - " + lot.getLote_produto()
                    + " - " + lot.getMetodo().getCod_metodo());
            String[] mtd = {lot.getMetodo().getCod_metodo()};
            cmbMetodo.setSelectedItem(mtd[0]);
            txtLoteProduto.setText(lot.getLote_produto());
            txtObsProduto.setText(lot.getLote_obs());
            txtEtapa.setText(lot.getEtapa());
            carregarData(lot.getData_entrada(), lot.getData_prevista());
            pnlCadastroProduto.setEnabledAt(0, false);
            pnlCadastroProduto.setEnabledAt(1, true);
            pnlCadastroProduto.setSelectedIndex(1);
            btnExcluirCadastroProduto.setVisible(true);
            mnuEditarLoteValidacaoLimpeza.setEnabled(false);
            mnuNovoLoteValidacaoLimpeza.setEnabled(false);
        }
    }

    private void abrirDados() {
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        if (Acesso.verificarAbrirDados()) {
            loadData();
            readMetodo();
            pnlCadastroProduto.setEnabledAt(0, false);
            pnlCadastroProduto.setEnabledAt(1, true);
            pnlCadastroProduto.setSelectedIndex(1);
            mnuNovoLoteValidacaoLimpeza.setEnabled(false);
            mnuEditarLoteValidacaoLimpeza.setEnabled(false);
            btnExcluirCadastroProduto.setVisible(false);
            limparCampos();
            novoEntradaProduto = true;
            setTitle("Entrada de Validação de Limpeza");
            btnProcurarMetodoValidacaoLimpeza.setEnabled(true);
            txtLoteProduto.setEnabled(true);
        }
    }

    private void fecharDados() {
        pnlCadastroProduto.setEnabledAt(0, true);
        pnlCadastroProduto.setEnabledAt(1, false);
        pnlCadastroProduto.setSelectedIndex(0);
        tblLotesValidacaoLimpeza.setRowSorter(null);
        mnuNovoLoteValidacaoLimpeza.setEnabled(true);
        mnuEditarLoteValidacaoLimpeza.setEnabled(true);
        novoEntradaProduto = false;
        limparCampos();
        readCadastroLote();
        setTitle("Entrada de Validação de Limpeza");
    }

    private void limparCampos() {
        txtEtapa.setText(null);
        txtLoteProduto.setText(null);
        txtObsProduto.setText(null);
        txtPesquisarLotes.setText(null);
        tblLotesValidacaoLimpeza.setRowSorter(null);
    }

    private void criarCadastroProduto() {
        Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                + " " + txtHoraInicio.getValue().toString()
                + ":" + txtMinutoInicio.getValue().toString() + ":00");
        Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                + " " + txtHoraFim.getValue().toString()
                + ":" + txtMinutoFim.getValue().toString() + ":00");
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        if (Acesso.verificarCriarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Material prod = new Material();
                Metodologia mtd = new Metodologia();
                Analise alns = new Analise();
                Usuario user = new Usuario();
                prod.setMaterial_id(0);
                mtd.setMetodo_id(ComboBox.getKeyForValue(cmbMetodo.getSelectedItem().toString(), categoryMapMetodo));
                alns.setAnalise_finalidade_id(7);
                lot.setProduto(prod);
                lot.setAnalise(alns);
                lot.setMetodo(mtd);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setEtapa(txtEtapa.getText().toUpperCase());
                lot.setLote_obs(txtObsProduto.getText().toUpperCase());
                user.setUser(System.getProperty("user"));
                lot.setUser(user);
                lot.setData_registro(DataHora.getTimestampDate(new Date()));
                lotDAO.createLoteOutros(lot);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
            } finally {
                fecharDados();
            }
        }
    }

    private void atulizarCadastroProduto(int lote_id) {
        Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                + " " + txtHoraInicio.getValue().toString()
                + ":" + txtMinutoInicio.getValue().toString() + ":00");
        Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                + " " + txtHoraFim.getValue().toString()
                + ":" + txtMinutoFim.getValue().toString() + ":00");
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        if (Acesso.verificarSalvarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Analise alns = new Analise();
                Metodologia mtd = new Metodologia();
                lot.setLote_id(lote_id);
                mtd.setMetodo_id(ComboBox.getKeyForValue(cmbMetodo.getSelectedItem().toString(), categoryMapMetodo));
                alns.setAnalise_finalidade_id(7);
                lot.setAnalise(alns);
                lot.setMetodo(mtd);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setEtapa(txtEtapa.getText().toUpperCase());
                lot.setLote_obs(txtObsProduto.getText().toUpperCase());
                lotDAO.updateLoteOutros(lot);
            } catch (NumberFormatException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + e);
            } finally {
                fecharDados();
            }
        }
    }

    private void deletarCadastroProduto(int lote_id) {
        EntradaProdutoValidacaoLimpezaAcesso Acesso = new EntradaProdutoValidacaoLimpezaAcesso();
        if (Acesso.verificarDeletarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                int dialogResult = JOptionPane.showConfirmDialog(null, "Realmente deseja Excluir esse registro?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (dialogResult == 0) {
                    lot.setLote_id(lote_id);
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    FrmSalvar frmSalvar = new FrmSalvar(null, true);
                    frmSalvar.setVisible(true);
                    if (FrmSalvar.senha()) {
                        lotDAO.deleteLote(lot);
                    }
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atulalizar dados: " + e);
            } finally {
                fecharDados();
            }
        }
    }
}
