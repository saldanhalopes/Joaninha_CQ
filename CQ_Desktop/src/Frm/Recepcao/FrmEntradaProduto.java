package Frm.Recepcao;

import Classes.DAO.AnaliseDAO;
import Classes.DAO.LoteDAO;
import Classes.Acesso.EntradaProdutoAcesso;
import Classes.Modelo.Analise;
import Classes.Modelo.Lote;
import Classes.Modelo.Material;
import Classes.Modelo.Usuario;
import Classes.Util.DataHora;
import Frm.Cadastro.FrmProcurarProduto;
import Frm.Login.FrmSalvar;
import Classes.Modelo.Metodologia;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
public final class FrmEntradaProduto extends javax.swing.JInternalFrame {

    private Boolean novoEntradaProduto = false;
    private Metodologia mtd;

    /**
     * Creates new form FrmCadastroLote
     */
    public FrmEntradaProduto() {
        initComponents();
        setTitle("Entrada de Produtos");
        loadHora();
        readCadastroLote();
        pnlCadastroProduto.setEnabledAt(1, false);
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
        Acesso.verificarAcessoEntradaProduto();
        mtd = new Metodologia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastroProduto = new javax.swing.JTabbedPane();
        pnlLotes = new javax.swing.JPanel();
        Jpane8 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        txtPesquisarLotes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbLimitPesquisarLotes = new javax.swing.JComboBox<String>();
        jLabel11 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnNovoLote = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnEditarLote = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnImprimirLotes = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnAtualizar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnExcluirLote = new javax.swing.JButton();
        pnlEntrada = new javax.swing.JPanel();
        pnlDadosProduto = new javax.swing.JPanel();
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
        pnlDadosLote = new javax.swing.JPanel();
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
        btnSalvarCadastroProduto = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArquivo = new javax.swing.JMenu();
        mnuNovoLote = new javax.swing.JMenu();
        itmNovoLote = new javax.swing.JMenuItem();
        mnuSair = new javax.swing.JMenuItem();
        mnuEditarLote = new javax.swing.JMenu();
        itmEditarLote = new javax.swing.JMenuItem();
        itmExcluirLote = new javax.swing.JMenuItem();

        setAutoscrolls(true);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Lotes"));

        tblLotes.setAutoCreateRowSorter(true);
        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Material", "Produto", "Lote", "Método", "Data Entrada", "Responsável"
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
            tblLotes.getColumnModel().getColumn(1).setMinWidth(80);
            tblLotes.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblLotes.getColumnModel().getColumn(1).setMaxWidth(80);
            tblLotes.getColumnModel().getColumn(3).setMinWidth(150);
            tblLotes.getColumnModel().getColumn(3).setPreferredWidth(150);
            tblLotes.getColumnModel().getColumn(3).setMaxWidth(150);
            tblLotes.getColumnModel().getColumn(4).setMinWidth(120);
            tblLotes.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblLotes.getColumnModel().getColumn(4).setMaxWidth(120);
            tblLotes.getColumnModel().getColumn(5).setMinWidth(180);
            tblLotes.getColumnModel().getColumn(5).setPreferredWidth(180);
            tblLotes.getColumnModel().getColumn(5).setMaxWidth(180);
            tblLotes.getColumnModel().getColumn(6).setMinWidth(100);
            tblLotes.getColumnModel().getColumn(6).setPreferredWidth(100);
            tblLotes.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        txtPesquisarLotes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarLotesKeyReleased(evt);
            }
        });

        jLabel6.setText("Pesquisar:");

        cmbLimitPesquisarLotes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "100", "1000", "10000", "100000", "1000000" }));
        cmbLimitPesquisarLotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimitPesquisarLotesActionPerformed(evt);
            }
        });

        jLabel11.setText("Visualizar:");

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnNovoLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_add.png"))); // NOI18N
        btnNovoLote.setText("Novo");
        btnNovoLote.setFocusable(false);
        btnNovoLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNovoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNovoLote);
        jToolBar1.add(jSeparator6);

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
        jToolBar1.add(jSeparator1);

        btnImprimirLotes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirLotes.setText("Relatórios");
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
        jToolBar1.add(jSeparator5);

        btnExcluirLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_close.png"))); // NOI18N
        btnExcluirLote.setText("Excluir");
        btnExcluirLote.setFocusable(false);
        btnExcluirLote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExcluirLote.setPreferredSize(new java.awt.Dimension(60, 60));
        btnExcluirLote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExcluirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirLoteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnExcluirLote);

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
                        .addComponent(txtPesquisarLotes, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
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
            .addGap(0, 975, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLotesLayout.setVerticalGroup(
            pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 556, Short.MAX_VALUE)
            .addGroup(pnlLotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlLotesLayout.createSequentialGroup()
                    .addComponent(Jpane8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pnlCadastroProduto.addTab("Lotes", pnlLotes);

        pnlDadosProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

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

        javax.swing.GroupLayout pnlDadosProdutoLayout = new javax.swing.GroupLayout(pnlDadosProduto);
        pnlDadosProduto.setLayout(pnlDadosProdutoLayout);
        pnlDadosProdutoLayout.setHorizontalGroup(
            pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNomeMaterial))
                    .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
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
        pnlDadosProdutoLayout.setVerticalGroup(
            pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtCodMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcurarMaterial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosLote.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Lote"));

        jLabel1.setText("Lote:");

        jLabel24.setText("Entrada:");

        jLabel2.setText("Obs:");

        jLabel25.setText("Previsão:");

        jLabel4.setText("h");

        jLabel9.setText("min");

        jLabel12.setText("h");

        jLabel13.setText("min");

        javax.swing.GroupLayout pnlDadosLoteLayout = new javax.swing.GroupLayout(pnlDadosLote);
        pnlDadosLote.setLayout(pnlDadosLoteLayout);
        pnlDadosLoteLayout.setHorizontalGroup(
            pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtObsProduto)
                        .addGap(17, 17, 17))
                    .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataEntradaLote, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataPrevisaoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                                .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                                .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addContainerGap(407, Short.MAX_VALUE))))
        );
        pnlDadosLoteLayout.setVerticalGroup(
            pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataEntradaLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataPrevisaoLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(txtMinutoInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoraFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtMinutoFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoteProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObsProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

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
                    .addGroup(pnlEntradaLayout.createSequentialGroup()
                        .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlDadosProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEntradaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnSalvarCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEntradaLayout.createSequentialGroup()
                        .addComponent(pnlDadosLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnlEntradaLayout.setVerticalGroup(
            pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
                .addGroup(pnlEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCadastroProduto)
                    .addComponent(btnCancelar))
                .addGap(21, 21, 21))
        );

        pnlCadastroProduto.addTab("Entrada", pnlEntrada);

        mnuArquivo.setText("Arquivo");

        mnuNovoLote.setText("Novo");

        itmNovoLote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.ALT_MASK));
        itmNovoLote.setText("Lote");
        itmNovoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmNovoLoteActionPerformed(evt);
            }
        });
        mnuNovoLote.add(itmNovoLote);

        mnuArquivo.add(mnuNovoLote);

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

        itmExcluirLote.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_DELETE, java.awt.event.InputEvent.ALT_MASK));
        itmExcluirLote.setText("Excluir");
        itmExcluirLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExcluirLoteActionPerformed(evt);
            }
        });
        mnuEditarLote.add(itmExcluirLote);

        jMenuBar1.add(mnuEditarLote);

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

    private void tblLotesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLotesMouseClicked
        if (evt.getClickCount() == 2) {
            carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
            novoEntradaProduto = false;
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

    private void itmNovoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmNovoLoteActionPerformed
        abrirDados();
    }//GEN-LAST:event_itmNovoLoteActionPerformed

    private void mnuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSairActionPerformed
        dispose();
    }//GEN-LAST:event_mnuSairActionPerformed

    private void itmEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_itmEditarLoteActionPerformed

    private void itmExcluirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExcluirLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            deletarCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_itmExcluirLoteActionPerformed

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
        } else if (txtLoteProduto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Lote inválido");
            txtLoteProduto.requestFocus();
        } else if (datahora_inicio.after(datahora_fim)) {
            JOptionPane.showMessageDialog(null, "Data e Hora da Entrada e Previsão estão Inválidas!");
            txtDataEntradaLote.requestFocus();
        } else if (novoEntradaProduto) {
            if (LoteDAO.verificarLote(txtLoteProduto.getText().trim())) {
                JOptionPane.showMessageDialog(null, "Lote já existe!", "Alerta", JOptionPane.ERROR_MESSAGE);
                txtLoteProduto.requestFocus();
            } else {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                FrmSalvar frmSalvar = new FrmSalvar(null, true);
                frmSalvar.setVisible(true);
                if (FrmSalvar.senha()) {
                    criarCadastroProduto();
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        } else {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                atulizarCadastroProduto(((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0)));
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnSalvarCadastroProdutoActionPerformed

    private void cmbLimitPesquisarLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimitPesquisarLotesActionPerformed
        readCadastroLote();
    }//GEN-LAST:event_cmbLimitPesquisarLotesActionPerformed

    private void btnProcurarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMaterialActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Material prod = new Material();
        FrmProcurarProduto frm = new FrmProcurarProduto(null, true, prod);
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
            mtd.setMetodo_id(prod.getMetodo().getMetodo_id());
        }
    }//GEN-LAST:event_btnProcurarMaterialActionPerformed

    private void btnNovoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoLoteActionPerformed
        abrirDados();
    }//GEN-LAST:event_btnNovoLoteActionPerformed

    private void btnEditarLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            carregarDadosCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
            novoEntradaProduto = false;
        }
    }//GEN-LAST:event_btnEditarLoteActionPerformed

    private void btnImprimirLotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirLotesActionPerformed
        FrmImpressaoRelatorioRecepcao frm = new FrmImpressaoRelatorioRecepcao(null, true, "< 4");
        frm.setVisible(true);
    }//GEN-LAST:event_btnImprimirLotesActionPerformed

    private void btnExcluirLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirLoteActionPerformed
        if (tblLotes.getSelectedRow() != -1) {
            deletarCadastroProduto((Integer) tblLotes.getValueAt(tblLotes.getSelectedRow(), 0));
        }
    }//GEN-LAST:event_btnExcluirLoteActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        readCadastroLote();
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpane8;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnEditarLote;
    public static javax.swing.JButton btnExcluirLote;
    public static javax.swing.JButton btnImprimirLotes;
    public static javax.swing.JButton btnNovoLote;
    public static javax.swing.JButton btnProcurarMaterial;
    public static javax.swing.JButton btnSalvarCadastroProduto;
    private javax.swing.JComboBox<String> cmbLimitPesquisarLotes;
    public static javax.swing.JMenuItem itmEditarLote;
    public static javax.swing.JMenuItem itmExcluirLote;
    public static javax.swing.JMenuItem itmNovoLote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnuArquivo;
    public static javax.swing.JMenu mnuEditarLote;
    public static javax.swing.JMenu mnuNovoLote;
    private javax.swing.JMenuItem mnuSair;
    private javax.swing.JTabbedPane pnlCadastroProduto;
    private javax.swing.JPanel pnlDadosLote;
    private javax.swing.JPanel pnlDadosProduto;
    private javax.swing.JPanel pnlEntrada;
    private javax.swing.JPanel pnlLotes;
    private javax.swing.JTable tblLotes;
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
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        DefaultTableModel model = (DefaultTableModel) tblLotes.getModel();
        LoteDAO equipDao = new LoteDAO();
        model.setNumRows(0);
        for (Lote lot : equipDao.readCadastroProduto(Integer.valueOf(cmbLimitPesquisarLotes.getSelectedItem().toString()))) {
            model.addRow(new Object[]{
                lot.getLote_id(),
                lot.getProduto().getCod_material(),
                lot.getAnalise().getSigla_analise_finalidade() + " - "
                + lot.getProduto().getNome_material(),
                lot.getLote_produto(),
                lot.getMetodo().getCod_metodo(),
                DataHora.getStringDateTime(lot.getData_entrada()),
                lot.getUser().getUser()
            });
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void carregarDadosCadastroProduto(int id) {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
        if (Acesso.verificarCarregarDados()) {
            novoEntradaProduto = false;
            Lote lot = new Lote();
            lot.setLote_id(id);
            LoteDAO lotDAO = new LoteDAO();
            lotDAO.selectLote(lot);
            setTitle("Lote: - " + lot.getLote_produto()
                    + " - " + lot.getProduto().getCod_material()
                    + " " + lot.getProduto().getNome_material());
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
            mnuEditarLote.setEnabled(false);
            mnuNovoLote.setEnabled(false);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void abrirDados() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
        if (Acesso.verificarAbrirDados()) {
            loadData();
            pnlCadastroProduto.setEnabledAt(0, false);
            pnlCadastroProduto.setEnabledAt(1, true);
            pnlCadastroProduto.setSelectedIndex(1);
            mnuNovoLote.setEnabled(false);
            mnuEditarLote.setEnabled(false);
            limparCampos();
            novoEntradaProduto = true;
            setTitle("Entrada de Produtos");
            btnProcurarMaterial.setEnabled(true);
            txtLoteProduto.setEnabled(true);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void fecharDados() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        pnlCadastroProduto.setEnabledAt(0, true);
        pnlCadastroProduto.setEnabledAt(1, false);
        pnlCadastroProduto.setSelectedIndex(0);
        tblLotes.setRowSorter(null);
        mnuNovoLote.setEnabled(true);
        mnuEditarLote.setEnabled(true);
        novoEntradaProduto = false;
        limparCampos();
        readCadastroLote();
        setTitle("Entrada de Produtos");
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void limparCampos() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        txtCodMaterial.setText(null);
        txtIdProduto.setText(null);
        txtNomeMaterial.setText(null);
        txtCodMetodo.setText(null);
        txtMetodo.setText(null);
        txtLoteProduto.setText(null);
        txtObsProduto.setText(null);
        txtPesquisarLotes.setText(null);
        txtTipo.setText(null);
        tblLotes.setRowSorter(null);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void criarCadastroProduto() {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
        if (Acesso.verificarCriarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Material prod = new Material();
                Analise alns = new Analise();
                AnaliseDAO alnsDAO = new AnaliseDAO();
                Usuario user = new Usuario();
                prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
                alns.setSigla_analise_finalidade(txtTipo.getText());
                alns.setAnalise_finalidade_id(alnsDAO.selectMaterialPorTipo(alns));
                lot.setProduto(prod);
                lot.setAnalise(alns);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                        + " " + txtHoraInicio.getValue().toString()
                        + ":" + txtMinutoInicio.getValue().toString() + ":00");
                Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                        + " " + txtHoraFim.getValue().toString()
                        + ":" + txtMinutoFim.getValue().toString() + ":00");
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setLote_obs(txtObsProduto.getText().toUpperCase());
                user.setUser(System.getProperty("user"));
                lot.setUser(user);
                lot.setData_registro(DataHora.getTimestampDate(new Date()));
                int lot_id = lotDAO.createLote(lot);
                createAnalises(lot_id);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
            } finally {
                fecharDados();
            }
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void createAnalises(int lote_id) {
        AnaliseDAO anlsDAO = new AnaliseDAO();
        for (Analise anls : anlsDAO.readAnaliseMetodologiaByLote(mtd)) {
            Usuario user_registro = new Usuario();
            Lote lote = new Lote();
            lote.setLote_id(lote_id);
            anls.setLote(lote);
            anls.setData_hora_registro(DataHora.getTimestampDate(new Date()));
            user_registro.setUser(System.getProperty("user"));
            anls.setUser_registro(user_registro);
            anls.setStatus("Recepção");
            anlsDAO.createAnaliseByLote(anls);
        }
    }

    private void atulizarCadastroProduto(int lote_id) {
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
        if (Acesso.verificarSalvarDados()) {
            Lote lot = new Lote();
            LoteDAO lotDAO = new LoteDAO();
            try {
                Material prod = new Material();
                Analise alns = new Analise();
                AnaliseDAO alnsDAO = new AnaliseDAO();
                lot.setLote_id(lote_id);
                prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
                alns.setSigla_analise_finalidade(txtTipo.getText());
                alns.setAnalise_finalidade_id(alnsDAO.selectMaterialPorTipo(alns));
                lot.setProduto(prod);
                lot.setAnalise(alns);
                lot.setLote_produto(txtLoteProduto.getText().trim().toUpperCase());
                Timestamp datahora_inicio = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataEntradaLote.getDate())
                        + " " + txtHoraInicio.getValue().toString()
                        + ":" + txtMinutoInicio.getValue().toString() + ":00");
                Timestamp datahora_fim = DataHora.getTimestampDateTime(DataHora.getStringDate(txtDataPrevisaoLote.getDate())
                        + " " + txtHoraFim.getValue().toString()
                        + ":" + txtMinutoFim.getValue().toString() + ":00");
                lot.setData_entrada(datahora_inicio);
                lot.setData_prevista(datahora_fim);
                lot.setLote_obs(txtObsProduto.getText().toUpperCase());
                lotDAO.updateLote(lot);
            } catch (NumberFormatException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + e);
            } finally {
                fecharDados();
            }
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }

    private void deletarCadastroProduto(int lote_id) {
        EntradaProdutoAcesso Acesso = new EntradaProdutoAcesso();
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
