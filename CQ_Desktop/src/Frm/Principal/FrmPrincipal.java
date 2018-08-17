package Frm.Principal;

import Classes.Acesso.AcessoPrincipal;
import Classes.DAO.LoginDAO;
import Classes.Util.Backup;
import Classes.Util.Frames;
import Frm.Login.FrmLogin;
import Frm.Recepcao.FrmEntradaAmostra;
import Frm.Recepcao.FrmEntradaProduto;
import Frm.Recepcao.FrmRetiradaProduto;
import Frm.Cadastro.FrmAmostra;
import Frm.Cadastro.FrmAnalise;
import Frm.Cadastro.FrmColunaConfig;
import Frm.Laboratorio.FrmCromatografo;
import Frm.Cadastro.FrmMetodologia;
import Frm.Cadastro.FrmProduto;
import Frm.Cadastro.FrmSetor;
import Frm.Config.FrmConfigUsuario;
import Frm.Laboratorio.FrmColuna;
import Frm.Laboratorio.FrmVidraria;
import Frm.Programacao.FrmProgracaoCromatografo;
import Frm.Cadastro.FrmMetodologiaAnalise;
import Frm.Cadastro.FrmMotivoRetrabalho;
import Frm.Cadastro.FrmRegistroAcompanhamento;
import Frm.Config.FrmConfigGrupo;
import Frm.Config.FrmConfigSistema;
import Frm.Laboratorio.FrmAtaConferencia;
import Frm.Laboratorio.FrmDissolutor;
import Frm.Laboratorio.FrmHistoricoColuna;
import Frm.Laboratorio.FrmInfoMetodologias;
import Frm.Laboratorio.FrmPlacebo;
import Frm.Hplc.FrmAbrirCromatografo;
import Frm.Hplc.FrmImprimirLogbook;
import Frm.Hplc.FrmRetrabalhoEquipamento;
import Frm.Login.FrmAlterarSenha;
import Frm.Preparo.FrmPedidos;
import Frm.Preparo.FrmPreparo;
import Frm.Preparo.FrmRetrabalho;
import Frm.Recepcao.FrmEntradaDevolucao;
import Frm.Recepcao.FrmEntradaEEPIG;
import Frm.Recepcao.FrmEntradaValidacaoLimpeza;
import Frm.Recepcao.FrmEntradaValidacaoProcesso;
import Frm.Recepcao.FrmMenuEntrada;
import Frm.Recepcao.FrmRegistroEntrada;
import Frm.Logs.FrmLogErro;
import Frm.Recepcao.FrmRegistroRf;
import Classes.Util.Sistema;
import Frm.Laboratorio.FrmMatrizTreinamento;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.WindowConstants;

/**
 *
 * @author rafael.lopes
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private Timer timer;
    FrmConfigUsuario ConfigUsuario;
    FrmProduto Produto;
    FrmCromatografo CadastroEquipamento;
    FrmMetodologia CadastroMetodologia;
    FrmAnalise CadastroAnalise;
    FrmSetor CadastroSetor;
    FrmProgracaoCromatografo LogBooK;
    FrmEntradaProduto EntradaProduto;
    FrmRetiradaProduto RetiradaProduto;
    FrmAmostra ConfigAmostra;
    FrmEntradaAmostra EntradaAmostra;
    FrmVidraria LaboratorioVidraria;
    FrmColuna LaboratorioColuna;
    FrmMetodologiaAnalise MetodologiaAnalise;
    FrmAbrirCromatografo Equipamento;
    FrmProgracaoCromatografo PrograCromatografo;
    FrmColunaConfig ColunaConfig;
    FrmPreparo AtividadePreparo;
    FrmPedidos PedidoPreparo;
    FrmRetrabalho Retrabalho;
    FrmMotivoRetrabalho MotivoRetrabalho;
    FrmRegistroAcompanhamento RegistroAcompanhamento;
    FrmEntradaValidacaoLimpeza EntradaValidacaoLimpeza;
    FrmEntradaValidacaoProcesso EntradaValidacaoProcesso;
    FrmEntradaEEPIG EntradaEEPIG;
    FrmEntradaDevolucao EntradaDevolucao;
    FrmRegistroEntrada RegistroEntrada;
    FrmRetrabalhoEquipamento RetrabalhoEquipamento;
    FrmLogErro LogErro;
    FrmHistoricoColuna HistoricoColuna;
    FrmInfoMetodologias InfoMetodologias;
    FrmPlacebo Placebo;
    FrmAtaConferencia AtaConferencia;
    FrmRegistroRf RegistroRf;
    FrmConfigGrupo ConfigGrupo;
    FrmDissolutor Dissolutor;
    FrmMatrizTreinamento Treinamento;

    public FrmPrincipal() {
        initComponents();
        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // Ask for confirmation before terminating the program.
                int option = JOptionPane.showConfirmDialog(
                        null,
                        "Tem certeza de que deseja fechar o aplicativo?",
                        "Confirmação de Fechamento",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.YES_OPTION) {
                    LoginDAO loginDAO = new LoginDAO();
                    loginDAO.updateUserLogout(System.getProperty("user_id"));
                    loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
                    System.exit(0);
                }
            }
        });
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //setAlwaysOnTop(true);
        ImageIcon icone = new ImageIcon(getClass().getResource("/img/bug.png"));
        setIconImage(icone.getImage());
        Sistema sys = new Sistema();
        setTitle("Joaninha - Modulo Controle de Qualidade - Usuário: "
                + System.getProperty("user") + " - V: " + String.valueOf(sys.getSystemVersion()));
        AcessoPrincipal Acesso = new AcessoPrincipal();
        Acesso.verificarAcessoPrincipal();
        //mnuRetiradaProduto.setVisible(false);
        checkSystemLogOff();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnEntradaProduto = new javax.swing.JButton();
        btnRegistroRf = new javax.swing.JButton();
        spr1 = new javax.swing.JToolBar.Separator();
        btnAtividades = new javax.swing.JButton();
        btnPedidos = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnColunas = new javax.swing.JButton();
        btnHistoricoColunas = new javax.swing.JButton();
        btnVidrarias = new javax.swing.JButton();
        btnPlacebos = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnResumo = new javax.swing.JButton();
        btnEquipamentos = new javax.swing.JButton();
        btnInfoMetodologias = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnAtaConferencia = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnAtaConferencia1 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        btnTrocarSenha = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        btnLogut = new javax.swing.JButton();
        jSeparator13 = new javax.swing.JToolBar.Separator();
        btnSair = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuLogout = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        mnuRecepcao = new javax.swing.JMenu();
        mnuEntradaProduto = new javax.swing.JMenu();
        itmMenuEntradaProduto = new javax.swing.JMenuItem();
        itmMenuEntradaProdutoValidacaoLimpeza = new javax.swing.JMenuItem();
        itmMenuEntradaProdutoValidacaoProcesso = new javax.swing.JMenuItem();
        itmMenuEntradaProdutoEEPIG = new javax.swing.JMenuItem();
        itmMenuEntradaDevolucao = new javax.swing.JMenuItem();
        mnuRegistroRf = new javax.swing.JMenuItem();
        itmRegistroAcompanhamento = new javax.swing.JMenuItem();
        itmRetiradaProduto = new javax.swing.JMenuItem();
        mnuProgramacao = new javax.swing.JMenu();
        mnuPrograCromatografo = new javax.swing.JMenuItem();
        mnuCadastro = new javax.swing.JMenu();
        mnuCadastroProduto = new javax.swing.JMenuItem();
        mnuCadastroMetodologia = new javax.swing.JMenuItem();
        mnuCadastroMetodologia1 = new javax.swing.JMenuItem();
        mnuCadastroAcompanhamento = new javax.swing.JMenuItem();
        mnuCadastroAnalise = new javax.swing.JMenuItem();
        mnuCadastroAnaliseMetodologia = new javax.swing.JMenuItem();
        mnuCadastroSetor = new javax.swing.JMenuItem();
        mnuCadastroStatus = new javax.swing.JMenuItem();
        mnuCadastroColunaConfig = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuCadastroCromatografos = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuCadastroRetrabalho = new javax.swing.JMenuItem();
        mnuLaboratorio = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        mnuLogBook = new javax.swing.JMenu();
        itmMenuEquipamentoLogBook = new javax.swing.JMenuItem();
        itmRetrabalhosEquipamento = new javax.swing.JMenuItem();
        itmMenuRelatorio = new javax.swing.JMenuItem();
        mnuPreparo = new javax.swing.JMenu();
        itmAtividadePreparo = new javax.swing.JMenuItem();
        itmPedidos = new javax.swing.JMenuItem();
        itmRetrabalhos = new javax.swing.JMenuItem();
        mnuAtaConferencia = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuInfoMetodologias = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuColunas = new javax.swing.JMenuItem();
        mnuHistoricoColunas = new javax.swing.JMenuItem();
        mnuVidrarias = new javax.swing.JMenuItem();
        mnuPlacebo = new javax.swing.JMenuItem();
        mnuTreinamento = new javax.swing.JMenuItem();
        mnuConfig = new javax.swing.JMenu();
        itmMenuUsuarios = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itmMenuBackUp = new javax.swing.JMenuItem();
        itmMenuLogErro = new javax.swing.JMenuItem();
        itmMenuLogOffSystem = new javax.swing.JMenuItem();
        mnuJanela = new javax.swing.JMenu();
        mnuCascata = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fundo_1.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, Short.MAX_VALUE)
        );
        desktopPane.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        btnEntradaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_entrada.png"))); // NOI18N
        btnEntradaProduto.setToolTipText("Entrada de Produtos");
        btnEntradaProduto.setFocusable(false);
        btnEntradaProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEntradaProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEntradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaProdutoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEntradaProduto);

        btnRegistroRf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_retem_rf.png"))); // NOI18N
        btnRegistroRf.setToolTipText("Entrada de Produtos");
        btnRegistroRf.setFocusable(false);
        btnRegistroRf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistroRf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistroRf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroRfActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegistroRf);
        jToolBar1.add(spr1);

        btnAtividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_preparo.png"))); // NOI18N
        btnAtividades.setToolTipText("Atividades do Preparo");
        btnAtividades.setFocusable(false);
        btnAtividades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtividades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtividadesActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtividades);

        btnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_campainha.png"))); // NOI18N
        btnPedidos.setToolTipText("Pedidos de Preparo");
        btnPedidos.setFocusable(false);
        btnPedidos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedidos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPedidos);
        jToolBar1.add(jSeparator5);

        btnColunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coluna.png"))); // NOI18N
        btnColunas.setToolTipText("Colunas");
        btnColunas.setFocusable(false);
        btnColunas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnColunas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColunasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnColunas);

        btnHistoricoColunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coluna_historico.png"))); // NOI18N
        btnHistoricoColunas.setToolTipText("Histórico das Colunas");
        btnHistoricoColunas.setFocusable(false);
        btnHistoricoColunas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHistoricoColunas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHistoricoColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoColunasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHistoricoColunas);

        btnVidrarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_vidraria.png"))); // NOI18N
        btnVidrarias.setToolTipText("Vidrarias");
        btnVidrarias.setFocusable(false);
        btnVidrarias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVidrarias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVidrarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVidrariasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVidrarias);

        btnPlacebos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_placebo.png"))); // NOI18N
        btnPlacebos.setToolTipText("Placebos");
        btnPlacebos.setFocusable(false);
        btnPlacebos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlacebos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPlacebos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlacebosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPlacebos);
        jToolBar1.add(jSeparator8);

        btnResumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_clipboard.png"))); // NOI18N
        btnResumo.setToolTipText("Resumo dos Cromatografos");
        btnResumo.setFocusable(false);
        btnResumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnResumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResumoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnResumo);

        btnEquipamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_computer.png"))); // NOI18N
        btnEquipamentos.setToolTipText("Abrir Cromatografo");
        btnEquipamentos.setFocusable(false);
        btnEquipamentos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEquipamentos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEquipamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipamentosActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEquipamentos);

        btnInfoMetodologias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_info.png"))); // NOI18N
        btnInfoMetodologias.setToolTipText("Infomações das Metodologias");
        btnInfoMetodologias.setFocusable(false);
        btnInfoMetodologias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInfoMetodologias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnInfoMetodologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoMetodologiasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnInfoMetodologias);
        jToolBar1.add(jSeparator6);

        btnAtaConferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_ata_conferencia.png"))); // NOI18N
        btnAtaConferencia.setToolTipText("Ata Conferência");
        btnAtaConferencia.setFocusable(false);
        btnAtaConferencia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtaConferencia.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtaConferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaConferenciaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtaConferencia);
        jToolBar1.add(jSeparator7);

        btnAtaConferencia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_treinamento.png"))); // NOI18N
        btnAtaConferencia1.setToolTipText("Matriz de Treinamentos");
        btnAtaConferencia1.setFocusable(false);
        btnAtaConferencia1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtaConferencia1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtaConferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaConferencia1ActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAtaConferencia1);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);
        jToolBar2.add(jSeparator15);

        btnTrocarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_change_pass.png"))); // NOI18N
        btnTrocarSenha.setToolTipText("Trocar Senha");
        btnTrocarSenha.setFocusable(false);
        btnTrocarSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTrocarSenha.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrocarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrocarSenhaActionPerformed(evt);
            }
        });
        jToolBar2.add(btnTrocarSenha);
        jToolBar2.add(jSeparator14);

        btnLogut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logoff.png"))); // NOI18N
        btnLogut.setToolTipText("Logout");
        btnLogut.setFocusable(false);
        btnLogut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogutActionPerformed(evt);
            }
        });
        jToolBar2.add(btnLogut);
        jToolBar2.add(jSeparator13);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sair.png"))); // NOI18N
        btnSair.setToolTipText("Sair do Sistema");
        btnSair.setFocusable(false);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jToolBar2.add(btnSair);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Arquivo");
        fileMenu.add(jSeparator1);

        mnuLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        mnuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_logoff.png"))); // NOI18N
        mnuLogout.setMnemonic('L');
        mnuLogout.setText("Logout");
        mnuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuLogoutActionPerformed(evt);
            }
        });
        fileMenu.add(mnuLogout);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_sair.png"))); // NOI18N
        exitMenuItem.setMnemonic('S');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        mnuRecepcao.setMnemonic('e');
        mnuRecepcao.setText("Recepção");

        mnuEntradaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_entrada.png"))); // NOI18N
        mnuEntradaProduto.setText("Entrada");

        itmMenuEntradaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pilula.png"))); // NOI18N
        itmMenuEntradaProduto.setText("Produto");
        itmMenuEntradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEntradaProdutoActionPerformed(evt);
            }
        });
        mnuEntradaProduto.add(itmMenuEntradaProduto);

        itmMenuEntradaProdutoValidacaoLimpeza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_limpeza.png"))); // NOI18N
        itmMenuEntradaProdutoValidacaoLimpeza.setText("Validação de Limpeza");
        itmMenuEntradaProdutoValidacaoLimpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEntradaProdutoValidacaoLimpezaActionPerformed(evt);
            }
        });
        mnuEntradaProduto.add(itmMenuEntradaProdutoValidacaoLimpeza);

        itmMenuEntradaProdutoValidacaoProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_processo.png"))); // NOI18N
        itmMenuEntradaProdutoValidacaoProcesso.setText("Validação de Processos");
        itmMenuEntradaProdutoValidacaoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEntradaProdutoValidacaoProcessoActionPerformed(evt);
            }
        });
        mnuEntradaProduto.add(itmMenuEntradaProdutoValidacaoProcesso);

        itmMenuEntradaProdutoEEPIG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_EEPIG.png"))); // NOI18N
        itmMenuEntradaProdutoEEPIG.setText("EEPIG");
        itmMenuEntradaProdutoEEPIG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEntradaProdutoEEPIGActionPerformed(evt);
            }
        });
        mnuEntradaProduto.add(itmMenuEntradaProdutoEEPIG);

        itmMenuEntradaDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_devolver.png"))); // NOI18N
        itmMenuEntradaDevolucao.setText("Devoluções");
        itmMenuEntradaDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEntradaDevolucaoActionPerformed(evt);
            }
        });
        mnuEntradaProduto.add(itmMenuEntradaDevolucao);

        mnuRecepcao.add(mnuEntradaProduto);

        mnuRegistroRf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_retem_rf.png"))); // NOI18N
        mnuRegistroRf.setText("Referência Futura");
        mnuRegistroRf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegistroRfActionPerformed(evt);
            }
        });
        mnuRecepcao.add(mnuRegistroRf);

        itmRegistroAcompanhamento.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        itmRegistroAcompanhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_barcode.png"))); // NOI18N
        itmRegistroAcompanhamento.setText("Registro Acompanhamento");
        itmRegistroAcompanhamento.setEnabled(false);
        itmRegistroAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRegistroAcompanhamentoActionPerformed(evt);
            }
        });
        mnuRecepcao.add(itmRegistroAcompanhamento);

        itmRetiradaProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        itmRetiradaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons_retirada.png"))); // NOI18N
        itmRetiradaProduto.setText("Retirada de Produto");
        itmRetiradaProduto.setEnabled(false);
        itmRetiradaProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRetiradaProdutoActionPerformed(evt);
            }
        });
        mnuRecepcao.add(itmRetiradaProduto);

        menuBar.add(mnuRecepcao);

        mnuProgramacao.setText("Programação");

        mnuPrograCromatografo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_clipboard.png"))); // NOI18N
        mnuPrograCromatografo.setText("Resumo");
        mnuPrograCromatografo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPrograCromatografoActionPerformed(evt);
            }
        });
        mnuProgramacao.add(mnuPrograCromatografo);

        menuBar.add(mnuProgramacao);

        mnuCadastro.setText("Cadastro");

        mnuCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_produto.png"))); // NOI18N
        mnuCadastroProduto.setText("Produtos");
        mnuCadastroProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroProdutoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroProduto);

        mnuCadastroMetodologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_metodologia.png"))); // NOI18N
        mnuCadastroMetodologia.setText("Metodologias");
        mnuCadastroMetodologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroMetodologiaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroMetodologia);

        mnuCadastroMetodologia1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_procedimento.png"))); // NOI18N
        mnuCadastroMetodologia1.setText("Procedimentos");
        mnuCadastroMetodologia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroMetodologia1ActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroMetodologia1);

        mnuCadastroAcompanhamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_acompanhamento.png"))); // NOI18N
        mnuCadastroAcompanhamento.setText("R.A's");
        mnuCadastroAcompanhamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroAcompanhamentoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroAcompanhamento);

        mnuCadastroAnalise.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_analises.png"))); // NOI18N
        mnuCadastroAnalise.setText("Analises");
        mnuCadastroAnalise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroAnaliseActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroAnalise);

        mnuCadastroAnaliseMetodologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_metodo_analise.png"))); // NOI18N
        mnuCadastroAnaliseMetodologia.setText("Analise por Metodologia");
        mnuCadastroAnaliseMetodologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroAnaliseMetodologiaActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroAnaliseMetodologia);

        mnuCadastroSetor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_setores.png"))); // NOI18N
        mnuCadastroSetor.setText("Setores");
        mnuCadastroSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroSetorActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroSetor);

        mnuCadastroStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_status.png"))); // NOI18N
        mnuCadastroStatus.setText("Status");
        mnuCadastroStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroStatusActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroStatus);

        mnuCadastroColunaConfig.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_config_coluna.png"))); // NOI18N
        mnuCadastroColunaConfig.setText("Configurações de Coluna");
        mnuCadastroColunaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroColunaConfigActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroColunaConfig);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_equipamentos.png"))); // NOI18N
        jMenu4.setText("Equipamentos");

        mnuCadastroCromatografos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_pc.png"))); // NOI18N
        mnuCadastroCromatografos.setText("Cromatógrafos");
        mnuCadastroCromatografos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroCromatografosActionPerformed(evt);
            }
        });
        jMenu4.add(mnuCadastroCromatografos);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dissolutor.png"))); // NOI18N
        jMenuItem2.setText("Dissolutores");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        mnuCadastro.add(jMenu4);

        mnuCadastroRetrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_fluxo_trabalho.png"))); // NOI18N
        mnuCadastroRetrabalho.setText("Retrabalhos");
        mnuCadastroRetrabalho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCadastroRetrabalhoActionPerformed(evt);
            }
        });
        mnuCadastro.add(mnuCadastroRetrabalho);

        menuBar.add(mnuCadastro);

        mnuLaboratorio.setText("Laboratórios");

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cromatografia.png"))); // NOI18N
        jMenu1.setText("HPLC");

        mnuLogBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cromatografos.png"))); // NOI18N
        mnuLogBook.setText("Cromatógrafos");

        itmMenuEquipamentoLogBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_computer.png"))); // NOI18N
        itmMenuEquipamentoLogBook.setText("Equipamentos");
        itmMenuEquipamentoLogBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuEquipamentoLogBookActionPerformed(evt);
            }
        });
        mnuLogBook.add(itmMenuEquipamentoLogBook);

        itmRetrabalhosEquipamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_retrabalho.png"))); // NOI18N
        itmRetrabalhosEquipamento.setText("Retrabalhos Equipamento");
        itmRetrabalhosEquipamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRetrabalhosEquipamentoActionPerformed(evt);
            }
        });
        mnuLogBook.add(itmRetrabalhosEquipamento);

        itmMenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        itmMenuRelatorio.setText("Relatórios");
        itmMenuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuRelatorioActionPerformed(evt);
            }
        });
        mnuLogBook.add(itmMenuRelatorio);

        jMenu1.add(mnuLogBook);

        mnuPreparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_amostra.png"))); // NOI18N
        mnuPreparo.setText("Preparo");

        itmAtividadePreparo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_preparo.png"))); // NOI18N
        itmAtividadePreparo.setText("Atividades");
        itmAtividadePreparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAtividadePreparoActionPerformed(evt);
            }
        });
        mnuPreparo.add(itmAtividadePreparo);

        itmPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_campainha.png"))); // NOI18N
        itmPedidos.setText("Pedidos");
        itmPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPedidosActionPerformed(evt);
            }
        });
        mnuPreparo.add(itmPedidos);

        itmRetrabalhos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_retrabalho.png"))); // NOI18N
        itmRetrabalhos.setText("Retrabalhos Preparo");
        itmRetrabalhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmRetrabalhosActionPerformed(evt);
            }
        });
        mnuPreparo.add(itmRetrabalhos);

        jMenu1.add(mnuPreparo);

        mnuAtaConferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_ata_conferencia.png"))); // NOI18N
        mnuAtaConferencia.setText("Ata Conferência");
        mnuAtaConferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAtaConferenciaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAtaConferencia);

        mnuLaboratorio.add(jMenu1);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_dissolucao.png"))); // NOI18N
        jMenu3.setText("DISSOLUÇÃO");
        jMenu3.setEnabled(false);
        mnuLaboratorio.add(jMenu3);

        mnuInfoMetodologias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_info.png"))); // NOI18N
        mnuInfoMetodologias.setText("Infomações das Metodologias");
        mnuInfoMetodologias.setToolTipText("");
        mnuInfoMetodologias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuInfoMetodologiasActionPerformed(evt);
            }
        });
        mnuLaboratorio.add(mnuInfoMetodologias);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coluna.png"))); // NOI18N
        jMenu2.setText("Colunas");

        mnuColunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coluna.png"))); // NOI18N
        mnuColunas.setText("Colunas");
        mnuColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuColunasActionPerformed(evt);
            }
        });
        jMenu2.add(mnuColunas);

        mnuHistoricoColunas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_coluna_historico.png"))); // NOI18N
        mnuHistoricoColunas.setText("Histórico Colunas");
        mnuHistoricoColunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHistoricoColunasActionPerformed(evt);
            }
        });
        jMenu2.add(mnuHistoricoColunas);

        mnuLaboratorio.add(jMenu2);

        mnuVidrarias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_vidraria.png"))); // NOI18N
        mnuVidrarias.setText("Vidrarias");
        mnuVidrarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuVidrariasActionPerformed(evt);
            }
        });
        mnuLaboratorio.add(mnuVidrarias);

        mnuPlacebo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_placebo.png"))); // NOI18N
        mnuPlacebo.setText("Placebos");
        mnuPlacebo.setToolTipText("");
        mnuPlacebo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPlaceboActionPerformed(evt);
            }
        });
        mnuLaboratorio.add(mnuPlacebo);

        mnuTreinamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_treinamento.png"))); // NOI18N
        mnuTreinamento.setText("Matriz de Treinamentos");
        mnuTreinamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTreinamentoActionPerformed(evt);
            }
        });
        mnuLaboratorio.add(mnuTreinamento);

        menuBar.add(mnuLaboratorio);

        mnuConfig.setText("Configurações");

        itmMenuUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_usuario.png"))); // NOI18N
        itmMenuUsuarios.setText("Usuários");
        itmMenuUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuUsuariosActionPerformed(evt);
            }
        });
        mnuConfig.add(itmMenuUsuarios);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_usuarios.png"))); // NOI18N
        jMenuItem3.setText("Grupos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        mnuConfig.add(jMenuItem3);
        mnuConfig.add(jSeparator2);

        itmMenuBackUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_backup.png"))); // NOI18N
        itmMenuBackUp.setText("Backup");
        itmMenuBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuBackUpActionPerformed(evt);
            }
        });
        mnuConfig.add(itmMenuBackUp);

        itmMenuLogErro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_erro_report.png"))); // NOI18N
        itmMenuLogErro.setText("Logs");
        itmMenuLogErro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuLogErroActionPerformed(evt);
            }
        });
        mnuConfig.add(itmMenuLogErro);

        itmMenuLogOffSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_options.png"))); // NOI18N
        itmMenuLogOffSystem.setText("Opções");
        itmMenuLogOffSystem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmMenuLogOffSystemActionPerformed(evt);
            }
        });
        mnuConfig.add(itmMenuLogOffSystem);

        menuBar.add(mnuConfig);

        mnuJanela.setText("Janelas");

        mnuCascata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cascade.png"))); // NOI18N
        mnuCascata.setText("Cascata");
        mnuCascata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCascataActionPerformed(evt);
            }
        });
        mnuJanela.add(mnuCascata);

        menuBar.add(mnuJanela);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 865, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja fechar o aplicativo?",
                "Confirmação de Fechamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            LoginDAO loginDAO = new LoginDAO();
            loginDAO.updateUserLogout(System.getProperty("user_id"));
            loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
            System.exit(0);
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void itmMenuUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuUsuariosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (ConfigUsuario == null || ConfigUsuario.isClosed()) {
                ConfigUsuario = new FrmConfigUsuario();
                desktopPane.add(ConfigUsuario);
                Frames.centralizar(ConfigUsuario);
                ConfigUsuario.setVisible(true);
            } else if (ConfigUsuario.isVisible() == true) {
                ConfigUsuario.moveToFront();
                ConfigUsuario.setSelected(true);
                ConfigUsuario.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuUsuariosActionPerformed

    private void mnuCadastroCromatografosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroCromatografosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (CadastroEquipamento == null || CadastroEquipamento.isClosed()) {
                CadastroEquipamento = new FrmCromatografo();
                desktopPane.add(CadastroEquipamento);
                Frames.centralizar(CadastroEquipamento);
                CadastroEquipamento.setVisible(true);
            } else if (CadastroEquipamento.isVisible() == true) {
                CadastroEquipamento.moveToFront();
                CadastroEquipamento.setSelected(true);
                CadastroEquipamento.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroCromatografosActionPerformed

    private void mnuCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroProdutoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Produto == null || Produto.isClosed()) {
                Produto = new FrmProduto();
                desktopPane.add(Produto);
                Frames.centralizar(Produto);
                Produto.setVisible(true);
            } else if (Produto.isVisible() == true) {
                Produto.moveToFront();
                Produto.setSelected(true);
                Produto.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroProdutoActionPerformed

    private void mnuCadastroMetodologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroMetodologiaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (CadastroMetodologia == null || CadastroMetodologia.isClosed()) {
                CadastroMetodologia = new FrmMetodologia();
                desktopPane.add(CadastroMetodologia);
                Frames.centralizar(CadastroMetodologia);
                CadastroMetodologia.setVisible(true);
            } else if (CadastroMetodologia.isVisible() == true) {
                CadastroMetodologia.moveToFront();
                CadastroMetodologia.setSelected(true);
                CadastroMetodologia.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroMetodologiaActionPerformed

    private void mnuCadastroAnaliseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroAnaliseActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (CadastroAnalise == null || CadastroAnalise.isClosed()) {
                CadastroAnalise = new FrmAnalise();
                desktopPane.add(CadastroAnalise);
                Frames.centralizar(CadastroAnalise);
                CadastroAnalise.setVisible(true);
            } else if (CadastroAnalise.isVisible() == true) {
                CadastroAnalise.moveToFront();
                CadastroAnalise.setSelected(true);
                CadastroAnalise.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroAnaliseActionPerformed

    private void mnuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuLogoutActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Deseja fazer o Logout do aplicativo?",
                "Confirmação de Fechamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            LoginDAO loginDAO = new LoginDAO();
            loginDAO.updateUserLogout(System.getProperty("user_id"));
            loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
            FrmLogin frm = new FrmLogin();
            frm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_mnuLogoutActionPerformed

    private void itmMenuEntradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEntradaProdutoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (EntradaProduto == null || EntradaProduto.isClosed()) {
                EntradaProduto = new FrmEntradaProduto();
                desktopPane.add(EntradaProduto);
                Frames.centralizar(EntradaProduto);
                EntradaProduto.setVisible(true);
            } else if (EntradaProduto.isVisible() == true) {
                EntradaProduto.moveToFront();
                EntradaProduto.setSelected(true);
                EntradaProduto.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEntradaProdutoActionPerformed

    private void mnuCadastroSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroSetorActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (CadastroSetor == null || CadastroSetor.isClosed()) {
                CadastroSetor = new FrmSetor();
                desktopPane.add(CadastroSetor);
                Frames.centralizar(CadastroSetor);
                CadastroSetor.setVisible(true);
            } else if (CadastroSetor.isVisible() == true) {
                CadastroSetor.moveToFront();
                CadastroSetor.setSelected(true);
                CadastroSetor.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroSetorActionPerformed

    private void itmRetiradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRetiradaProdutoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RetiradaProduto == null || RetiradaProduto.isClosed()) {
                RetiradaProduto = new FrmRetiradaProduto();
                desktopPane.add(RetiradaProduto);
                Frames.centralizar(RetiradaProduto);
                RetiradaProduto.setVisible(true);
            } else if (RetiradaProduto.isVisible() == true) {
                RetiradaProduto.moveToFront();
                RetiradaProduto.setSelected(true);
                RetiradaProduto.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmRetiradaProdutoActionPerformed

    private void mnuCadastroStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroStatusActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (ConfigAmostra == null || ConfigAmostra.isClosed()) {
                ConfigAmostra = new FrmAmostra();
                desktopPane.add(ConfigAmostra);
                Frames.centralizar(ConfigAmostra);
                ConfigAmostra.setVisible(true);
            } else if (ConfigAmostra.isVisible() == true) {
                ConfigAmostra.moveToFront();
                ConfigAmostra.setSelected(true);
                ConfigAmostra.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroStatusActionPerformed

    private void mnuVidrariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuVidrariasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LaboratorioVidraria == null || LaboratorioVidraria.isClosed()) {
                LaboratorioVidraria = new FrmVidraria();
                desktopPane.add(LaboratorioVidraria);
                Frames.centralizar(LaboratorioVidraria);
                LaboratorioVidraria.setVisible(true);
            } else if (LaboratorioVidraria.isVisible() == true) {
                LaboratorioVidraria.moveToFront();
                LaboratorioVidraria.setSelected(true);
                LaboratorioVidraria.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuVidrariasActionPerformed

    private void mnuColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuColunasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LaboratorioColuna == null || LaboratorioColuna.isClosed()) {
                LaboratorioColuna = new FrmColuna();
                desktopPane.add(LaboratorioColuna);
                Frames.centralizar(LaboratorioColuna);
                LaboratorioColuna.setVisible(true);
            } else if (LaboratorioColuna.isVisible() == true) {
                LaboratorioColuna.moveToFront();
                LaboratorioColuna.setSelected(true);
                LaboratorioColuna.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuColunasActionPerformed

    private void mnuCadastroAnaliseMetodologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroAnaliseMetodologiaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (MetodologiaAnalise == null || MetodologiaAnalise.isClosed()) {
                MetodologiaAnalise = new FrmMetodologiaAnalise();
                desktopPane.add(MetodologiaAnalise);
                Frames.centralizar(MetodologiaAnalise);
                MetodologiaAnalise.setVisible(true);
            } else if (MetodologiaAnalise.isVisible() == true) {
                MetodologiaAnalise.moveToFront();
                MetodologiaAnalise.setSelected(true);
                MetodologiaAnalise.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroAnaliseMetodologiaActionPerformed

    private void itmMenuEquipamentoLogBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEquipamentoLogBookActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Equipamento == null) {
                Equipamento = new FrmAbrirCromatografo(this, true);
                Equipamento.setVisible(true);
            } else {
                Equipamento.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEquipamentoLogBookActionPerformed

    private void mnuCascataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCascataActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            Frames.cascade(desktopPane);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao Reorganizar Janelas" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCascataActionPerformed

    private void mnuPrograCromatografoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPrograCromatografoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (PrograCromatografo == null || PrograCromatografo.isClosed()) {
                PrograCromatografo = new FrmProgracaoCromatografo();
                desktopPane.add(PrograCromatografo);
                Frames.centralizar(PrograCromatografo);
                PrograCromatografo.setVisible(true);
            } else if (PrograCromatografo.isVisible() == true) {
                PrograCromatografo.moveToFront();
                PrograCromatografo.setSelected(true);
                PrograCromatografo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuPrograCromatografoActionPerformed

    private void mnuCadastroColunaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroColunaConfigActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (ColunaConfig == null || ColunaConfig.isClosed()) {
                ColunaConfig = new FrmColunaConfig();
                desktopPane.add(ColunaConfig);
                Frames.centralizar(ColunaConfig);
                ColunaConfig.setVisible(true);
            } else if (ColunaConfig.isVisible() == true) {
                ColunaConfig.moveToFront();
                ColunaConfig.setSelected(true);
                ColunaConfig.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroColunaConfigActionPerformed

    private void itmMenuBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuBackUpActionPerformed
//        JFrame parentFrame = new JFrame();
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("Especifique um local para salvar");
//        fileChooser.setDialogType(JFileChooser.SAVE_DIALOG);
//        fileChooser.setSelectedFile(new File("db_controle_" + DataHora.DateFileNow() + ".db"));
//        fileChooser.setFileFilter(new FileNameExtensionFilter("Arquivo de Banco de Dados", "db"));
//
//        int userSelection = fileChooser.showSaveDialog(parentFrame);
//
//        if (userSelection == JFileChooser.APPROVE_OPTION) {
//            File fileToSave = fileChooser.getSelectedFile();
//            Backup.copyFile(fileToSave.getAbsoluteFile());
//        }
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Backup.Atualizar();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuBackUpActionPerformed

    private void itmAtividadePreparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAtividadePreparoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (AtividadePreparo == null || AtividadePreparo.isClosed()) {
                AtividadePreparo = new FrmPreparo();
                desktopPane.add(AtividadePreparo);
                Frames.centralizar(AtividadePreparo);
                AtividadePreparo.setVisible(true);
            } else if (AtividadePreparo.isVisible() == true) {
                AtividadePreparo.moveToFront();
                AtividadePreparo.setSelected(true);
                AtividadePreparo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmAtividadePreparoActionPerformed

    private void itmPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPedidosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (PedidoPreparo == null || PedidoPreparo.isClosed()) {
                PedidoPreparo = new FrmPedidos();
                desktopPane.add(PedidoPreparo);
                Frames.centralizar(PedidoPreparo);
                PedidoPreparo.setVisible(true);
            } else if (PedidoPreparo.isVisible() == true) {
                PedidoPreparo.moveToFront();
                PedidoPreparo.setSelected(true);
                PedidoPreparo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmPedidosActionPerformed

    private void btnEntradaProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaProdutoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        FrmMenuEntrada frm = new FrmMenuEntrada(null, true);
        frm.setVisible(true);

//        try {
//            if (EntradaProduto == null || EntradaProduto.isClosed()) {
//                EntradaProduto = new FrmEntradaProduto();
//                desktopPane.add(EntradaProduto);
//                Frames.centralizar(EntradaProduto);
//                // EntradaProduto.setMaximum(true);
//                EntradaProduto.setVisible(true);
//            } else if (EntradaProduto.isVisible() == true) {
//                EntradaProduto.moveToFront();
//                EntradaProduto.setSelected(true);
//                EntradaProduto.show();
//                desktopPane.repaint();
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
//        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnEntradaProdutoActionPerformed

    private void btnAtividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtividadesActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (AtividadePreparo == null || AtividadePreparo.isClosed()) {
                AtividadePreparo = new FrmPreparo();
                desktopPane.add(AtividadePreparo);
                Frames.centralizar(AtividadePreparo);
                AtividadePreparo.setVisible(true);
            } else if (AtividadePreparo.isVisible() == true) {
                AtividadePreparo.moveToFront();
                AtividadePreparo.setSelected(true);
                AtividadePreparo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAtividadesActionPerformed

    private void btnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (PedidoPreparo == null || PedidoPreparo.isClosed()) {
                PedidoPreparo = new FrmPedidos();
                desktopPane.add(PedidoPreparo);
                Frames.centralizar(PedidoPreparo);
                PedidoPreparo.setVisible(true);
            } else if (PedidoPreparo.isVisible() == true) {
                PedidoPreparo.moveToFront();
                PedidoPreparo.setSelected(true);
                PedidoPreparo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnPedidosActionPerformed

    private void btnEquipamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipamentosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Equipamento == null) {
                Equipamento = new FrmAbrirCromatografo(this, true);
                Equipamento.setVisible(true);
            } else {
                Equipamento.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnEquipamentosActionPerformed

    private void btnColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColunasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LaboratorioColuna == null || LaboratorioColuna.isClosed()) {
                LaboratorioColuna = new FrmColuna();
                desktopPane.add(LaboratorioColuna);
                Frames.centralizar(LaboratorioColuna);
                LaboratorioColuna.setVisible(true);
            } else if (LaboratorioColuna.isVisible() == true) {
                LaboratorioColuna.moveToFront();
                LaboratorioColuna.setSelected(true);
                LaboratorioColuna.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnColunasActionPerformed

    private void btnVidrariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVidrariasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LaboratorioVidraria == null || LaboratorioVidraria.isClosed()) {
                LaboratorioVidraria = new FrmVidraria();
                desktopPane.add(LaboratorioVidraria);
                Frames.centralizar(LaboratorioVidraria);
                LaboratorioVidraria.setVisible(true);
            } else if (LaboratorioVidraria.isVisible() == true) {
                LaboratorioVidraria.moveToFront();
                LaboratorioVidraria.setSelected(true);
                LaboratorioVidraria.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnVidrariasActionPerformed

    private void itmRetrabalhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRetrabalhosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Retrabalho == null || Retrabalho.isClosed()) {
                Retrabalho = new FrmRetrabalho();
                desktopPane.add(Retrabalho);
                Frames.centralizar(Retrabalho);
                Retrabalho.setVisible(true);
            } else if (Retrabalho.isVisible() == true) {
                Retrabalho.moveToFront();
                Retrabalho.setSelected(true);
                Retrabalho.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmRetrabalhosActionPerformed

    private void mnuCadastroRetrabalhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroRetrabalhoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (MotivoRetrabalho == null || MotivoRetrabalho.isClosed()) {
                MotivoRetrabalho = new FrmMotivoRetrabalho();
                desktopPane.add(MotivoRetrabalho);
                Frames.centralizar(MotivoRetrabalho);
                MotivoRetrabalho.setVisible(true);
            } else if (MotivoRetrabalho.isVisible() == true) {
                MotivoRetrabalho.moveToFront();
                MotivoRetrabalho.setSelected(true);
                MotivoRetrabalho.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroRetrabalhoActionPerformed

    private void mnuCadastroAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroAcompanhamentoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RegistroAcompanhamento == null || RegistroAcompanhamento.isClosed()) {
                RegistroAcompanhamento = new FrmRegistroAcompanhamento();
                desktopPane.add(RegistroAcompanhamento);
                Frames.centralizar(RegistroAcompanhamento);
                RegistroAcompanhamento.setVisible(true);
            } else if (RegistroAcompanhamento.isVisible() == true) {
                RegistroAcompanhamento.moveToFront();
                RegistroAcompanhamento.setSelected(true);
                RegistroAcompanhamento.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuCadastroAcompanhamentoActionPerformed

    private void itmMenuEntradaProdutoValidacaoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEntradaProdutoValidacaoProcessoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (EntradaValidacaoProcesso == null || EntradaValidacaoProcesso.isClosed()) {
                EntradaValidacaoProcesso = new FrmEntradaValidacaoProcesso();
                desktopPane.add(EntradaValidacaoProcesso);
                Frames.centralizar(EntradaValidacaoProcesso);
                EntradaValidacaoProcesso.setVisible(true);
            } else if (EntradaValidacaoProcesso.isVisible() == true) {
                EntradaValidacaoProcesso.moveToFront();
                EntradaValidacaoProcesso.setSelected(true);
                EntradaValidacaoProcesso.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEntradaProdutoValidacaoProcessoActionPerformed

    private void itmMenuEntradaProdutoEEPIGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEntradaProdutoEEPIGActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (EntradaEEPIG == null || EntradaEEPIG.isClosed()) {
                EntradaEEPIG = new FrmEntradaEEPIG();
                desktopPane.add(EntradaEEPIG);
                Frames.centralizar(EntradaEEPIG);
                EntradaEEPIG.setVisible(true);
            } else if (EntradaEEPIG.isVisible() == true) {
                EntradaEEPIG.moveToFront();
                EntradaEEPIG.setSelected(true);
                EntradaEEPIG.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEntradaProdutoEEPIGActionPerformed

    private void itmMenuEntradaProdutoValidacaoLimpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEntradaProdutoValidacaoLimpezaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (EntradaValidacaoLimpeza == null || EntradaValidacaoLimpeza.isClosed()) {
                EntradaValidacaoLimpeza = new FrmEntradaValidacaoLimpeza();
                desktopPane.add(EntradaValidacaoLimpeza);
                Frames.centralizar(EntradaValidacaoLimpeza);
                EntradaValidacaoLimpeza.setVisible(true);
            } else if (EntradaValidacaoLimpeza.isVisible() == true) {
                EntradaValidacaoLimpeza.moveToFront();
                EntradaValidacaoLimpeza.setSelected(true);
                EntradaValidacaoLimpeza.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEntradaProdutoValidacaoLimpezaActionPerformed

    private void itmMenuEntradaDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuEntradaDevolucaoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (EntradaDevolucao == null || EntradaDevolucao.isClosed()) {
                EntradaDevolucao = new FrmEntradaDevolucao();
                desktopPane.add(EntradaDevolucao);
                Frames.centralizar(EntradaDevolucao);
                EntradaDevolucao.setVisible(true);
            } else if (EntradaDevolucao.isVisible() == true) {
                EntradaDevolucao.moveToFront();
                EntradaDevolucao.setSelected(true);
                EntradaDevolucao.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuEntradaDevolucaoActionPerformed

    private void itmRegistroAcompanhamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRegistroAcompanhamentoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RegistroEntrada == null || RegistroEntrada.isClosed()) {
                RegistroEntrada = new FrmRegistroEntrada();
                desktopPane.add(RegistroEntrada);
                Frames.centralizar(RegistroEntrada);
                RegistroEntrada.setVisible(true);
            } else if (RegistroEntrada.isVisible() == true) {
                RegistroEntrada.moveToFront();
                RegistroEntrada.setSelected(true);
                RegistroEntrada.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmRegistroAcompanhamentoActionPerformed

    private void btnResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResumoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LogBooK == null || LogBooK.isClosed()) {
                LogBooK = new FrmProgracaoCromatografo();
                desktopPane.add(LogBooK);
                Frames.centralizar(LogBooK);
                LogBooK.setVisible(true);
            } else if (LogBooK.isVisible() == true) {
                LogBooK.moveToFront();
                LogBooK.setSelected(true);
                LogBooK.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnResumoActionPerformed

    private void itmMenuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuRelatorioActionPerformed
        FrmImprimirLogbook frm = new FrmImprimirLogbook(null, true);
        frm.setVisible(true);
    }//GEN-LAST:event_itmMenuRelatorioActionPerformed

    private void btnInfoMetodologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoMetodologiasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (InfoMetodologias == null || InfoMetodologias.isClosed()) {
                InfoMetodologias = new FrmInfoMetodologias();
                desktopPane.add(InfoMetodologias);
                Frames.centralizar(InfoMetodologias);
                InfoMetodologias.setVisible(true);
            } else if (InfoMetodologias.isVisible() == true) {
                InfoMetodologias.moveToFront();
                InfoMetodologias.setSelected(true);
                InfoMetodologias.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnInfoMetodologiasActionPerformed

    private void itmRetrabalhosEquipamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmRetrabalhosEquipamentoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RetrabalhoEquipamento == null || RetrabalhoEquipamento.isClosed()) {
                RetrabalhoEquipamento = new FrmRetrabalhoEquipamento();
                desktopPane.add(RetrabalhoEquipamento);
                Frames.centralizar(RetrabalhoEquipamento);
                RetrabalhoEquipamento.setVisible(true);
            } else if (RetrabalhoEquipamento.isVisible() == true) {
                RetrabalhoEquipamento.moveToFront();
                RetrabalhoEquipamento.setSelected(true);
                RetrabalhoEquipamento.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmRetrabalhosEquipamentoActionPerformed

    private void itmMenuLogErroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuLogErroActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (LogErro == null || LogErro.isClosed()) {
                LogErro = new FrmLogErro();
                desktopPane.add(LogErro);
                Frames.centralizar(LogErro);
                LogErro.setVisible(true);
            } else if (LogErro.isVisible() == true) {
                LogErro.moveToFront();
                LogErro.setSelected(true);
                LogErro.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_itmMenuLogErroActionPerformed

    private void itmMenuLogOffSystemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmMenuLogOffSystemActionPerformed
        FrmConfigSistema frm = new FrmConfigSistema(this, true);
        frm.setVisible(true);
    }//GEN-LAST:event_itmMenuLogOffSystemActionPerformed

    private void btnLogutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogutActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Deseja fazer o Logout do aplicativo?",
                "Confirmação de Fechamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            LoginDAO loginDAO = new LoginDAO();
            loginDAO.updateUserLogout(System.getProperty("user_id"));
            loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
            FrmLogin frm = new FrmLogin();
            frm.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnLogutActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja fechar o aplicativo?",
                "Confirmação de Fechamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            LoginDAO loginDAO = new LoginDAO();
            loginDAO.updateUserLogout(System.getProperty("user_id"));
            loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
            System.exit(0);
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnTrocarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrocarSenhaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        FrmAlterarSenha frm = new FrmAlterarSenha(this, true);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnTrocarSenhaActionPerformed

    private void mnuHistoricoColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHistoricoColunasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (HistoricoColuna == null || HistoricoColuna.isClosed()) {
                HistoricoColuna = new FrmHistoricoColuna();
                desktopPane.add(HistoricoColuna);
                Frames.centralizar(HistoricoColuna);
                HistoricoColuna.setVisible(true);
            } else if (HistoricoColuna.isVisible() == true) {
                HistoricoColuna.moveToFront();
                HistoricoColuna.setSelected(true);
                HistoricoColuna.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuHistoricoColunasActionPerformed

    private void btnHistoricoColunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoColunasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (HistoricoColuna == null || HistoricoColuna.isClosed()) {
                HistoricoColuna = new FrmHistoricoColuna();
                desktopPane.add(HistoricoColuna);
                Frames.centralizar(HistoricoColuna);
                HistoricoColuna.setVisible(true);
            } else if (HistoricoColuna.isVisible() == true) {
                HistoricoColuna.moveToFront();
                HistoricoColuna.setSelected(true);
                HistoricoColuna.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnHistoricoColunasActionPerformed

    private void mnuInfoMetodologiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuInfoMetodologiasActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (InfoMetodologias == null || InfoMetodologias.isClosed()) {
                InfoMetodologias = new FrmInfoMetodologias();
                desktopPane.add(InfoMetodologias);
                Frames.centralizar(InfoMetodologias);
                InfoMetodologias.setVisible(true);
            } else if (InfoMetodologias.isVisible() == true) {
                InfoMetodologias.moveToFront();
                InfoMetodologias.setSelected(true);
                InfoMetodologias.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuInfoMetodologiasActionPerformed

    private void mnuPlaceboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPlaceboActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Placebo == null || Placebo.isClosed()) {
                Placebo = new FrmPlacebo();
                desktopPane.add(Placebo);
                Frames.centralizar(Placebo);
                Placebo.setVisible(true);
            } else if (Placebo.isVisible() == true) {
                Placebo.moveToFront();
                Placebo.setSelected(true);
                Placebo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuPlaceboActionPerformed

    private void btnPlacebosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlacebosActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Placebo == null || Placebo.isClosed()) {
                Placebo = new FrmPlacebo();
                desktopPane.add(Placebo);
                Frames.centralizar(Placebo);
                Placebo.setVisible(true);
            } else if (Placebo.isVisible() == true) {
                Placebo.moveToFront();
                Placebo.setSelected(true);
                Placebo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnPlacebosActionPerformed

    private void btnAtaConferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaConferenciaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (AtaConferencia == null || AtaConferencia.isClosed()) {
                AtaConferencia = new FrmAtaConferencia();
                desktopPane.add(AtaConferencia);
                Frames.centralizar(AtaConferencia);
                AtaConferencia.setVisible(true);
            } else if (AtaConferencia.isVisible() == true) {
                AtaConferencia.moveToFront();
                AtaConferencia.setSelected(true);
                AtaConferencia.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAtaConferenciaActionPerformed

    private void mnuAtaConferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAtaConferenciaActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (AtaConferencia == null || AtaConferencia.isClosed()) {
                AtaConferencia = new FrmAtaConferencia();
                desktopPane.add(AtaConferencia);
                Frames.centralizar(AtaConferencia);
                AtaConferencia.setVisible(true);
            } else if (AtaConferencia.isVisible() == true) {
                AtaConferencia.moveToFront();
                AtaConferencia.setSelected(true);
                AtaConferencia.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuAtaConferenciaActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Dissolutor == null || Dissolutor.isClosed()) {
                Dissolutor = new FrmDissolutor();
                desktopPane.add(Dissolutor);
                Frames.centralizar(Dissolutor);
                Dissolutor.setVisible(true);
            } else if (Dissolutor.isVisible() == true) {
                Dissolutor.moveToFront();
                Dissolutor.setSelected(true);
                Dissolutor.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void mnuRegistroRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegistroRfActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RegistroRf == null || RegistroRf.isClosed()) {
                RegistroRf = new FrmRegistroRf();
                desktopPane.add(RegistroRf);
                Frames.centralizar(RegistroRf);
                RegistroRf.setVisible(true);
            } else if (RegistroRf.isVisible() == true) {
                RegistroRf.moveToFront();
                RegistroRf.setSelected(true);
                RegistroRf.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuRegistroRfActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (ConfigGrupo == null || ConfigGrupo.isClosed()) {
                ConfigGrupo = new FrmConfigGrupo();
                desktopPane.add(ConfigGrupo);
                Frames.centralizar(ConfigGrupo);
                ConfigGrupo.setVisible(true);
            } else if (ConfigGrupo.isVisible() == true) {
                ConfigGrupo.moveToFront();
                ConfigGrupo.setSelected(true);
                ConfigGrupo.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnRegistroRfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroRfActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (RegistroRf == null || RegistroRf.isClosed()) {
                RegistroRf = new FrmRegistroRf();
                desktopPane.add(RegistroRf);
                Frames.centralizar(RegistroRf);
                RegistroRf.setVisible(true);
            } else if (RegistroRf.isVisible() == true) {
                RegistroRf.moveToFront();
                RegistroRf.setSelected(true);
                RegistroRf.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnRegistroRfActionPerformed

    private void mnuTreinamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTreinamentoActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Treinamento == null || Treinamento.isClosed()) {
                Treinamento = new FrmMatrizTreinamento();
                desktopPane.add(Treinamento);
                Frames.centralizar(Treinamento);
                Treinamento.setVisible(true);
            } else if (Treinamento.isVisible() == true) {
                Treinamento.moveToFront();
                Treinamento.setSelected(true);
                Treinamento.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_mnuTreinamentoActionPerformed

    private void mnuCadastroMetodologia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCadastroMetodologia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuCadastroMetodologia1ActionPerformed

    private void btnAtaConferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaConferencia1ActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        try {
            if (Treinamento == null || Treinamento.isClosed()) {
                Treinamento = new FrmMatrizTreinamento();
                desktopPane.add(Treinamento);
                Frames.centralizar(Treinamento);
                Treinamento.setVisible(true);
            } else if (Treinamento.isVisible() == true) {
                Treinamento.moveToFront();
                Treinamento.setSelected(true);
                Treinamento.show();
                desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAtaConferencia1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaConferencia;
    private javax.swing.JButton btnAtaConferencia1;
    private javax.swing.JButton btnAtividades;
    private javax.swing.JButton btnColunas;
    public static javax.swing.JButton btnEntradaProduto;
    private javax.swing.JButton btnEquipamentos;
    private javax.swing.JButton btnHistoricoColunas;
    private javax.swing.JButton btnInfoMetodologias;
    private javax.swing.JButton btnLogut;
    private javax.swing.JButton btnPedidos;
    private javax.swing.JButton btnPlacebos;
    public static javax.swing.JButton btnRegistroRf;
    private javax.swing.JButton btnResumo;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnTrocarSenha;
    private javax.swing.JButton btnVidrarias;
    public static javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itmAtividadePreparo;
    public static javax.swing.JMenuItem itmMenuBackUp;
    private javax.swing.JMenuItem itmMenuEntradaDevolucao;
    private javax.swing.JMenuItem itmMenuEntradaProduto;
    private javax.swing.JMenuItem itmMenuEntradaProdutoEEPIG;
    private javax.swing.JMenuItem itmMenuEntradaProdutoValidacaoLimpeza;
    private javax.swing.JMenuItem itmMenuEntradaProdutoValidacaoProcesso;
    private javax.swing.JMenuItem itmMenuEquipamentoLogBook;
    private javax.swing.JMenuItem itmMenuLogErro;
    private javax.swing.JMenuItem itmMenuLogOffSystem;
    private javax.swing.JMenuItem itmMenuRelatorio;
    private javax.swing.JMenuItem itmMenuUsuarios;
    private javax.swing.JMenuItem itmPedidos;
    private javax.swing.JMenuItem itmRegistroAcompanhamento;
    private javax.swing.JMenuItem itmRetiradaProduto;
    private javax.swing.JMenuItem itmRetrabalhos;
    private javax.swing.JMenuItem itmRetrabalhosEquipamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator13;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuAtaConferencia;
    public static javax.swing.JMenu mnuCadastro;
    private javax.swing.JMenuItem mnuCadastroAcompanhamento;
    private javax.swing.JMenuItem mnuCadastroAnalise;
    private javax.swing.JMenuItem mnuCadastroAnaliseMetodologia;
    private javax.swing.JMenuItem mnuCadastroColunaConfig;
    private javax.swing.JMenuItem mnuCadastroCromatografos;
    private javax.swing.JMenuItem mnuCadastroMetodologia;
    private javax.swing.JMenuItem mnuCadastroMetodologia1;
    private javax.swing.JMenuItem mnuCadastroProduto;
    private javax.swing.JMenuItem mnuCadastroRetrabalho;
    private javax.swing.JMenuItem mnuCadastroSetor;
    private javax.swing.JMenuItem mnuCadastroStatus;
    private javax.swing.JMenuItem mnuCascata;
    private javax.swing.JMenuItem mnuColunas;
    public static javax.swing.JMenu mnuConfig;
    private javax.swing.JMenu mnuEntradaProduto;
    private javax.swing.JMenuItem mnuHistoricoColunas;
    private javax.swing.JMenuItem mnuInfoMetodologias;
    private javax.swing.JMenu mnuJanela;
    public static javax.swing.JMenu mnuLaboratorio;
    private javax.swing.JMenu mnuLogBook;
    private javax.swing.JMenuItem mnuLogout;
    private javax.swing.JMenuItem mnuPlacebo;
    private javax.swing.JMenu mnuPreparo;
    private javax.swing.JMenuItem mnuPrograCromatografo;
    public static javax.swing.JMenu mnuProgramacao;
    public static javax.swing.JMenu mnuRecepcao;
    private javax.swing.JMenuItem mnuRegistroRf;
    private javax.swing.JMenuItem mnuTreinamento;
    private javax.swing.JMenuItem mnuVidrarias;
    private javax.swing.JToolBar.Separator spr1;
    // End of variables declaration//GEN-END:variables

    private void checkSystemLogOff() {
        AcessoPrincipal Acesso = new AcessoPrincipal();
        Acesso.verificarAcessoPrincipal();
        Sistema sys = new Sistema();
        if (sys.systemLog_Off()) {
            if (!Acesso.verificarAcessoLogOff()) {
                ActionListener action = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        LoginDAO loginDAO = new LoginDAO();
                        loginDAO.updateUserLogout(System.getProperty("user_id"));
                        loginDAO.createLogLoginLogout("Logout", System.getProperty("user"));
                        System.exit(0);
                    }
                };
                timer = new Timer(30000, action);
                ScheduledExecutorService scheduleService = Executors.newSingleThreadScheduledExecutor();
                scheduleService.scheduleAtFixedRate(new Runnable() {
                    @Override
                    public void run() {
                        Sistema sys = new Sistema();
                        if (sys.systemLog_Off()) {
                            timer.start();
                            JOptionPane.showMessageDialog(null,
                                    "Systema em Manutenção! \nIrá fechar em 30s", "Atualização",
                                    JOptionPane.NO_OPTION,
                                    new ImageIcon(getClass().getResource("/img/icon_sair.png")));
                        }
                    }
                }, 0, 1, TimeUnit.MINUTES);
            }
        }
    }

}
