package Frm.Recepcao;

import Classes.Acesso.EntradaProdutoDevolucao;
import Classes.DAO.LoteDAO;
import Classes.DAO.MetodologiaDAO;
import Frm.Cadastro.FrmProcurarMetodologia;
import Frm.Cadastro.FrmProcurarProduto;
import Classes.Modelo.Analise;
import Classes.Modelo.Lote;
import Classes.Modelo.Material;
import Classes.Modelo.Usuario;
import Classes.Util.DataHora;
import Frm.Login.FrmSalvar;
import Classes.Modelo.Metodologia;
import Classes.Util.ComboBox;
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
public final class FrmEntradaDevolucao extends javax.swing.JInternalFrame {

    private boolean novoEntradaProduto = false;
    private TreeMap<Integer, String> categoryMapMetodo = new TreeMap<>();

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmEntradaDevolucao() {
        initComponents();
        setTitle("Entrada de Devoluções");
        loadHora();
        readMetodo();
        readCadastroLote();
        pnlCadastroProduto.setEnabledAt(1, false);
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
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
        tblLotesDevolucao = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLimitPesquisarLotes = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovoLoteDevolucao = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEditarLoteDevolucao = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnImprimirLotesDevolucao = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnAtualizarDevolucao = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnExcluirLoteDevolucao = new javax.swing.JButton();
        pnlEntrada = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtLoteProduto = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtObsProduto = new javax.swing.JTextField();
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
        btnExcluirCadastroProduto = new javax.swing.JButton();
        btnSalvarCadastroProduto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        pnlDados = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodMaterial = new javax.swing.JTextField();
        txtNomeMaterial = new javax.swing.JTextField();
        txtMetodo = new javax.swing.JTextField();
        btnProcurarMaterial = new javax.swing.JButton();
        txtTipo = new javax.swing.JTextField();
        txtIdProduto = new javax.swing.JTextField();
        txtCodMetodo = new javax.swing.JTextField();
        pnlDadosMetodologia = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox();
        btnProcurarMetodoDevolucao = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuNovoLoteDevolucao = new javax.swing.JMenu();
        itmNovoLoteDevolucao = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        mnuEditarLoteDevolucao = new javax.swing.JMenu();
        itmEditarLoteDevolucao = new javax.swing.JMenuItem();
        itmExcluirLoteDevolucao = new javax.swing.JMenuItem();

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes"));

        tblLotesDevolucao.setAutoCreateRowSorter(true);
        tblLotesDevolucao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Material", "Produto", "Lote", "Métodos", "Data Entrada", "Responsável"
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
        tblLotesDevolucao.setSurrendersFocusOnKeystroke(true);
        tblLotesDevolucao.getTableHeader().setReorderingAllowed(false);
        tblLotesDevolucao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLotesDevolucaoMouseClicked(evt);
            }
        });
        tblLotesDevolucao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblLotesDevolucaoKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblLotesDevolucao);
        if (tblLotesDevolucao.getColumnModel().getColumnCount() > 0) {
            tblLotesDevolucao.getColumnModel().getColumn(0).setMinWidth(60);
            tblLotesDevolucao.getColumnModel().getColumn(0).setPreferredWidth(60);
            tblLotesDevolucao.getColumnModel().getColumn(0).setMaxWidth(60);
            tblLotesDevolucao.getColumnModel().getColumn(1).setMinWidth(80);
            tblLotesDevolucao.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblLotesDevolucao.getColumnModel().getColumn(1).setMaxWidth(80);
            tblLotesDevolucao.getColumnModel().getColumn(3).setMinWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(3).setMaxWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(4).setMinWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(4).setPreferredWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(4).setMaxWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(5).setMinWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(5).setPreferredWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(5).setMaxWidth(150);
            tblLotesDevolucao.getColumnModel().getColumn(6).setMinWidth(100);
            tblLotesDevolucao.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblLotesDevolucao.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
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

        btnNovoLoteDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btnNovoLoteDevolucao.setText("Novo");
        btnNovoLoteDevolucao.setFocusable(false);
        btnNovoLoteDevolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoLoteDevolucao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLoteDevolucaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovoLoteDevolucao);
        jToolBar1.add(jSeparator6);

        btnEditarLoteDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_edit.png"))); // NOI18N
        btnEditarLoteDevolucao.setText("Editar");
        btnEditarLoteDevolucao.setFocusable(false);
        btnEditarLoteDevolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarLoteDevolucao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarLoteDevolucaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEditarLoteDevolucao);
        jToolBar1.add(jSeparator1);

        btnImprimirLotesDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirLotesDevolucao.setText("Relatórios");
        btnImprimirLotesDevolucao.setFocusable(false);
        btnImprimirLotesDevolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImprimirLotesDevolucao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImprimirLotesDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirLotesDevolucaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnImprimirLotesDevolucao);
        jToolBar1.add(jSeparator7);

        btnAtualizarDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_atualizar.png"))); // NOI18N
        btnAtualizarDevolucao.setText("Atualizar");
        btnAtualizarDevolucao.setFocusable(false);
        btnAtualizarDevolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtualizarDevolucao.setPreferredSize(new java.awt.Dimension(60, 60));
        btnAtualizarDevolucao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtualizarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarDevolucaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtualizarDevolucao);
        jToolBar1.add(jSeparator5);

        btnExcluirLoteDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_close.png"))); // NOI18N
        btnExcluirLoteDevolucao.setText("Excluir");
        btnExcluirLoteDevolucao.setFocusable(false);
        btnExcluirLoteDevolucao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirLoteDevolucao.setPreferredSize(new java.awt.Dimension(60, 60));
        btnExcluirLoteDevolucao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLoteDevolucaoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluirLoteDevolucao);

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
            .addGap(0, 478, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLotesLayout.createSequentialGroup()
                    .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlCadastroProduto.addTab("Lotes", pnlLotes);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Lote"));

        jLabel1.setText("Lote:");

        jLabel24.setText("Entrada:");

        jLabel2.setText("Obs:");

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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObsProduto)
                        .addGap(17, 17, 17))
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

        pnlDados.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel5.setText("Produto:");

        jLabel10.setText("Método:");

        jLabel3.setText("Tipo:");

        jLabel8.setText("Material:");

        txtCodMaterial.setEditable(false);
        txtCodMaterial.setBackground(new java.awt.Color(204, 204, 204));

        txtNomeMaterial.setEditable(false);
        txtNomeMaterial.setBackground(new java.awt.Color(204, 204, 204));

        txtMetodo.setEditable(false);
        txtMetodo.setBackground(new java.awt.Color(204, 204, 204));

        btnProcurarMaterial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_config_produto.png"))); // NOI18N
        btnProcurarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarMaterialActionPerformed(evt);
            }
        });

        txtTipo.setEditable(false);
        txtTipo.setBackground(new java.awt.Color(204, 204, 204));

        txtIdProduto.setEditable(false);
        txtIdProduto.setBackground(new java.awt.Color(204, 204, 204));

        txtCodMetodo.setEditable(false);
        txtCodMetodo.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeMaterial))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMetodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCodMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcurarMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosMetodologia.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodologia de Produto de Degradação"));

        jLabel14.setText("Produto de Degradação:");

        btnProcurarMetodoDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_config_produto.png"))); // NOI18N
        btnProcurarMetodoDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarMetodoDevolucaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDadosMetodologiaLayout = new javax.swing.GroupLayout(pnlDadosMetodologia);
        pnlDadosMetodologia.setLayout(pnlDadosMetodologiaLayout);
        pnlDadosMetodologiaLayout.setHorizontalGroup(
            pnlDadosMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosMetodologiaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProcurarMetodoDevolucao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosMetodologiaLayout.setVerticalGroup(
            pnlDadosMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosMetodologiaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnProcurarMetodoDevolucao)
                    .addGroup(pnlDadosMetodologiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlEntradaLayout = new javax.swing.GroupLayout(pnlEntrada);
        pnlEntrada.setLayout(pnlEntradaLayout);
        pnlEntradaLayout.setHorizontalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(btnExcluirCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 709, Short.MAX_VALUE)
                        .addComponent(btnSalvarCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaLayout.createSequentialGroup()
                        .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDadosMetodologia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirCadastroProduto)
                    .addComponent(btnSalvarCadastroProduto)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        pnlCadastroProduto.addTab("Entrada", pnlEntrada);

        mnuArquivo.setText("Arquivo");

        mnuNovoLoteDevolucao.setText("Novo");

        itmNovoLoteDevolucao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.ALT_MASK));
        itmNovoLoteDevolucao.setText("Lote");
        itmNovoLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNovoLoteDevolucaoActionPerformed(evt);
            }
        });
        mnuNovoLoteDevolucao.add(itmNovoLoteDevolucao);

        mnuArquivo.add(mnuNovoLoteDevolucao);

        mnuSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mnuSair.setText("Sair");
        mnuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSairActionPerformed(evt);
            }
        });
        mnuArquivo.add(mnuSair);

        jMenuBar1.add(mnuArquivo);

        mnuEditarLoteDevolucao.setText("Editar");

        itmEditarLoteDevolucao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ENTER, java.awt.event.InputEvent.ALT_MASK));
        itmEditarLoteDevolucao.setText("Editar");
        itmEditarLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarLoteDevolucaoActionPerformed(evt);
            }
        });
        mnuEditarLoteDevolucao.add(itmEditarLoteDevolucao);

        itmExcluirLoteDevolucao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK));
        itmExcluirLoteDevolucao.setText("Excluir");
        itmExcluirLoteDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirLoteDevolucaoActionPerformed(evt);
            }
        });
        mnuEditarLoteDevolucao.add(itmExcluirLoteDevolucao);

        jMenuBar1.add(mnuEditarLoteDevolucao);

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

    private void tblLotesDevolucaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLotesDevolucaoMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDadosCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_tblLotesDevolucaoMouseClicked

    private void tblLotesDevolucaoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblLotesDevolucaoKeyReleased
        if (tblLotesDevolucao.getSelectedRow() != -1) {
            if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
                deletarCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
            }
        }
    }//GEN-LAST:event_tblLotesDevolucaoKeyReleased

    private void txtPesquisarLotesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarLotesKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblLotesDevolucao.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblLotesDevolucao.setRowSorter(sorter);
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

    private void itmNovoLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNovoLoteDevolucaoActionPerformed
        abrirDados();
    }//GEN-LAST:event_itmNovoLoteDevolucaoActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void itmEditarLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarLoteDevolucaoActionPerformed
        if (tblLotesDevolucao.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_itmEditarLoteDevolucaoActionPerformed

    private void itmExcluirLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirLoteDevolucaoActionPerformed
        if (tblLotesDevolucao.getSelectedRow() != -1) {
            deletarCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_itmExcluirLoteDevolucaoActionPerformed

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
        if (txtCodMaterial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecionar Produto");
            txtCodMaterial.requestFocus();
        } else if (cmbMetodo.getSelectedItem().toString().isEmpty() || cmbMetodo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Selecione o método de Produto de Degradação");
            cmbMetodo.requestFocus();
        } else if (txtLoteProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lote inválido");
            txtLoteProduto.requestFocus();
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
                atulizarCadastroProduto(((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0)));
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnSalvarCadastroProdutoActionPerformed

    private void btnExcluirCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastroProdutoActionPerformed
        deletarCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
    }//GEN-LAST:event_btnExcluirCadastroProdutoActionPerformed

    private void cmbLimitPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimitPesquisarLotesActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readCadastroLote();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_cmbLimitPesquisarLotesActionPerformed

    private void btnNovoLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoteDevolucaoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        abrirDados();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnNovoLoteDevolucaoActionPerformed

    private void btnEditarLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLoteDevolucaoActionPerformed
        if (tblLotesDevolucao.getSelectedRow() != -1) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            carregarDadosCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
            novoEntradaProduto = false;
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnEditarLoteDevolucaoActionPerformed

    private void btnImprimirLotesDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirLotesDevolucaoActionPerformed
        FrmImpressaoRelatorioRecepcao frm = new FrmImpressaoRelatorioRecepcao(null, true, "= 9");
        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirLotesDevolucaoActionPerformed

    private void btnExcluirLoteDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLoteDevolucaoActionPerformed
        if (tblLotesDevolucao.getSelectedRow() != -1) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            deletarCadastroProduto((Integer) tblLotesDevolucao.getValueAt(tblLotesDevolucao.getSelectedRow(), 0));
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnExcluirLoteDevolucaoActionPerformed

    private void btnAtualizarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarDevolucaoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readCadastroLote();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAtualizarDevolucaoActionPerformed

    private void btnProcurarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMaterialActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Material prod = new Material();
        String[] tipo_produto = {"PA"};
        FrmProcurarProduto frm = new FrmProcurarProduto(null, true, prod, tipo_produto);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Integer[] id = {prod.getMaterial_id()};
        if (id[0] > 0) {
            txtIdProduto.setText(String.valueOf(prod.getMaterial_id()));
            txtCodMaterial.setText(prod.getCod_material());
            txtNomeMaterial.setText(prod.getNome_material());
            txtTipo.setText(prod.getTipo());
            txtCodMetodo.setText(prod.getMetodo().getCod_metodo());
            txtMetodo.setText(prod.getMetodo().getMetodo());
        }
    }//GEN-LAST:event_btnProcurarMaterialActionPerformed

    private void btnProcurarMetodoDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMetodoDevolucaoActionPerformed
        Metodologia mtd = new Metodologia();
        String tipo_metodo = "PD";
        FrmProcurarMetodologia frm = new FrmProcurarMetodologia(null, true, mtd, tipo_metodo);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readMetodo();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        String[] cod_mtd = {mtd.getCod_metodo()};
        cmbMetodo.setSelectedItem(cod_mtd[0]);
    }//GEN-LAST:event_btnProcurarMetodoDevolucaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpane8;
    private javax.swing.JButton btnAtualizarDevolucao;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnEditarLoteDevolucao;
    public static javax.swing.JButton btnExcluirCadastroProduto;
    public static javax.swing.JButton btnExcluirLoteDevolucao;
    public static javax.swing.JButton btnImprimirLotesDevolucao;
    public static javax.swing.JButton btnNovoLoteDevolucao;
    public static javax.swing.JButton btnProcurarMaterial;
    public static javax.swing.JButton btnProcurarMetodoDevolucao;
    public static javax.swing.JButton btnSalvarCadastroProduto;
    private javax.swing.JComboBox<String> cmbLimitPesquisarLotes;
    private javax.swing.JComboBox cmbMetodo;
    public static javax.swing.JMenuItem itmEditarLoteDevolucao;
    public static javax.swing.JMenuItem itmExcluirLoteDevolucao;
    public static javax.swing.JMenuItem itmNovoLoteDevolucao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
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
    public static javax.swing.JMenu mnuEditarLoteDevolucao;
    public static javax.swing.JMenu mnuNovoLoteDevolucao;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JTabbedPane pnlCadastroProduto;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JPanel pnlDadosMetodologia;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTable tblLotesDevolucao;
    private javax.swing.JTextField txtCodMaterial;
    private javax.swing.JTextField txtCodMetodo;
    private com.toedter.calendar.JDateChooser txtDataEntradaLote;
    private com.toedter.calendar.JDateChooser txtDataPrevisaoLote;
    private javax.swing.JSpinner txtHoraFim;
    private javax.swing.JSpinner txtHoraInicio;
    private javax.swing.JTextField txtIdProduto;
    public static javax.swing.JTextField txtLoteProduto;
    private javax.swing.JTextField txtMetodo;
    private javax.swing.JSpinner txtMinutoFim;
    private javax.swing.JSpinner txtMinutoInicio;
    private javax.swing.JTextField txtNomeMaterial;
    private javax.swing.JTextField txtObsProduto;
    private javax.swing.JTextField txtPesquisarLotes;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    public void readMetodo() {
        cmbMetodo.removeAllItems();
        cmbMetodo.addItem("");
        categoryMapMetodo.clear();
        MetodologiaDAO mtdDao = new MetodologiaDAO();
        for (Metodologia mtd : mtdDao.readMetodologia()) {
            if (mtd.getCod_metodo().startsWith("PD")) {
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
        DefaultTableModel model = (DefaultTableModel) tblLotesDevolucao.getModel();
        LoteDAO equipDao = new LoteDAO();
        model.setNumRows(0);
        for (Lote lot : equipDao.readCadastroDevolucao(Integer.valueOf(cmbLimitPesquisarLotes.getSelectedItem().toString()))) {
            model.addRow(new Object[]{
                lot.getLote_id(),
                lot.getProduto().getCod_material(),
                lot.getAnalise().getSigla_analise_finalidade() + " - "
                + lot.getProduto().getNome_material(),
                lot.getLote_produto(),
                lot.getMetodo().getCod_metodo() + " / " + lot.getMetodo2().getCod_metodo(),
                DataHora.getStringDateTime(lot.getData_entrada()),
                lot.getUser().getUser()
            });
        }
    }

    private void carregarDadosCadastroProduto(int id) {
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
        if (Acesso.verificarCarregarDados()) {
            novoEntradaProduto = false;
            Lote lot = new Lote();
            lot.setLote_id(id);
            LoteDAO lotDAO = new LoteDAO();
            lotDAO.selectLote(lot);
            setTitle("Lote: - " + lot.getLote_produto()
                    + " - " + lot.getProduto().getCod_material()
                    + " " + lot.getProduto().getNome_material());
            String[] mtd = {lot.getMetodo2().getCod_metodo()};
            cmbMetodo.setSelectedItem(mtd[0]);
            txtCodMaterial.setText(lot.getProduto().getCod_material());
            txtNomeMaterial.setText(lot.getProduto().getNome_material());
            txtIdProduto.setText(String.valueOf(lot.getProduto().getMaterial_id()));
            txtCodMetodo.setText(lot.getMetodo().getCod_metodo());
            txtMetodo.setText(lot.getMetodo().getMetodo());
            txtLoteProduto.setText(lot.getLote_produto());
            txtObsProduto.setText(lot.getLote_obs());
            txtTipo.setText(lot.getProduto().getTipo());
            carregarData(lot.getData_entrada(), lot.getData_prevista());
            pnlCadastroProduto.setEnabledAt(0, false);
            pnlCadastroProduto.setEnabledAt(1, true);
            pnlCadastroProduto.setSelectedIndex(1);
            btnExcluirCadastroProduto.setVisible(true);
            mnuEditarLoteDevolucao.setEnabled(false);
            mnuNovoLoteDevolucao.setEnabled(false);
        }
    }

    private void abrirDados() {
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
        if (Acesso.verificarAbrirDados()) {
            loadData();
            pnlCadastroProduto.setEnabledAt(0, false);
            pnlCadastroProduto.setEnabledAt(1, true);
            pnlCadastroProduto.setSelectedIndex(1);
            mnuNovoLoteDevolucao.setEnabled(false);
            mnuEditarLoteDevolucao.setEnabled(false);
            btnExcluirCadastroProduto.setVisible(false);
            limparCampos();
            novoEntradaProduto = true;
            setTitle("Entrada de Devoluções");
            btnProcurarMaterial.setEnabled(true);
            txtLoteProduto.setEnabled(true);
        }
    }

    private void fecharDados() {
        pnlCadastroProduto.setEnabledAt(0, true);
        pnlCadastroProduto.setEnabledAt(1, false);
        pnlCadastroProduto.setSelectedIndex(0);
        tblLotesDevolucao.setRowSorter(null);
        mnuNovoLoteDevolucao.setEnabled(true);
        mnuEditarLoteDevolucao.setEnabled(true);
        novoEntradaProduto = false;
        limparCampos();
        readCadastroLote();
        setTitle("Entrada de Devoluções");
    }

    private void limparCampos() {
        txtLoteProduto.setText(null);
        txtObsProduto.setText(null);
        txtPesquisarLotes.setText(null);
        tblLotesDevolucao.setRowSorter(null);
    }

    private void criarCadastroProduto() {
        Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                + " " + txtHoraInicio.getValue().toString()
                + ":" + txtMinutoInicio.getValue().toString() + ":00");
        Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                + " " + txtHoraFim.getValue().toString()
                + ":" + txtMinutoFim.getValue().toString() + ":00");
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
        if (Acesso.verificarCriarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Material prod = new Material();
                Metodologia mtd = new Metodologia();
                Analise alns = new Analise();
                Usuario user = new Usuario();
                prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
                mtd.setMetodo_id(ComboBox.getKeyForValue(cmbMetodo.getSelectedItem().toString(), categoryMapMetodo));
                alns.setAnalise_finalidade_id(9);
                lot.setProduto(prod);
                lot.setAnalise(alns);
                lot.setMetodo(mtd);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setEtapa("");
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
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
        if (Acesso.verificarSalvarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Analise alns = new Analise();
                Metodologia mtd = new Metodologia();
                Material prod = new Material();
                lot.setLote_id(lote_id);
                prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
                mtd.setMetodo_id(ComboBox.getKeyForValue(cmbMetodo.getSelectedItem().toString(), categoryMapMetodo));
                alns.setAnalise_finalidade_id(9);
                lot.setAnalise(alns);
                lot.setMetodo(mtd);
                lot.setProduto(prod);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setEtapa("");
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
        EntradaProdutoDevolucao Acesso = new EntradaProdutoDevolucao();
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
