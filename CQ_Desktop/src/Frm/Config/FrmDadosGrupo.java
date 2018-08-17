package Frm.Config;

import Classes.DAO.AcessoDAO;
import Classes.DAO.FormularioDAO;
import Classes.DAO.GrupoDAO;
import Frm.Login.FrmSalvar;
import Classes.Modelo.Acesso;
import Classes.Modelo.Formulario;
import Classes.Modelo.Grupo;
import Classes.Util.ComboBox;
import java.awt.Cursor;
import java.util.ArrayList;
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
public class FrmDadosGrupo extends javax.swing.JDialog {

    private Grupo grupo;
    private boolean novoGrupo = false;
    private final TreeMap<Integer, String> categoryMapAcesso = new TreeMap<>();

    /**
     * Creates new form FrmConfigAcesso
     *
     * @param parent
     * @param modal
     * @param user
     */
    public FrmDadosGrupo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Dados do Grupo");
        setResizable(false);
        limparCampos();
        novoGrupo = true;
        readPermissao();
    }

    public FrmDadosGrupo(java.awt.Frame parent, boolean modal, Grupo grup) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Dados do Grupo");
        setResizable(false);
        grupo = grup;
        readPermissaoGrupo();
        limparCampos();
        carregarDados();
        txtGrupo.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPermissao = new javax.swing.JTable();
        txtPesquisarForm = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnSalvarUsuario = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        txtGrupo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissões"));

        tblPermissao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Formulário", "Permissões", "regra_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPermissao.setSurrendersFocusOnKeystroke(true);
        tblPermissao.getTableHeader().setReorderingAllowed(false);
        tblPermissao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPermissaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPermissao);
        if (tblPermissao.getColumnModel().getColumnCount() > 0) {
            tblPermissao.getColumnModel().getColumn(0).setMinWidth(0);
            tblPermissao.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblPermissao.getColumnModel().getColumn(0).setMaxWidth(0);
            tblPermissao.getColumnModel().getColumn(2).setMinWidth(150);
            tblPermissao.getColumnModel().getColumn(2).setPreferredWidth(150);
            tblPermissao.getColumnModel().getColumn(2).setMaxWidth(150);
            tblPermissao.getColumnModel().getColumn(3).setMinWidth(0);
            tblPermissao.getColumnModel().getColumn(3).setPreferredWidth(0);
            tblPermissao.getColumnModel().getColumn(3).setMaxWidth(0);
        }

        txtPesquisarForm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarFormKeyReleased(evt);
            }
        });

        jLabel7.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPesquisarForm))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE))
        );

        btnSalvarUsuario.setText("Ok");
        btnSalvarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarUsuarioActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel8.setText("Grupo:");

        jLabel9.setText("Tipo:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGrupo)
                    .addComponent(txtTipo))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarUsuario)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblPermissaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPermissaoMouseClicked

    }//GEN-LAST:event_tblPermissaoMouseClicked

    private void txtPesquisarFormKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarFormKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblPermissao.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblPermissao.setRowSorter(sorter);
        String text = txtPesquisarForm.getText().trim();
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
    }//GEN-LAST:event_txtPesquisarFormKeyReleased

    private void btnSalvarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarUsuarioActionPerformed
        int rows = tblPermissao.getRowCount();
        if (txtGrupo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Grupo inválido");
            txtGrupo.requestFocus();
        } else if (txtTipo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tipo inválido");
            txtTipo.requestFocus();
        } else if (novoGrupo) {
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                Integer grupo_id = criarGrupo();
                for (int row = 0; row < rows; row++) {
                    criarPermissao(tblPermissao.getValueAt(row, 2) != null ? ComboBox.getKeyForValue(
                            (String) tblPermissao.getModel().getValueAt(row, 2), categoryMapAcesso)
                            : ((Integer) tblPermissao.getValueAt(row, 0) == 1 ? 1 : 0),
                            (Integer) tblPermissao.getValueAt(row, 0),
                            grupo_id);
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        } else {
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                atulizarGrupo();
                for (int row = 0; row < rows; row++) {
                    if ((Integer) tblPermissao.getValueAt(row, 3) > 0) {
                        atualizarPermissao((Integer) tblPermissao.getValueAt(row, 3),
                                tblPermissao.getValueAt(row, 2) != null ? ComboBox.getKeyForValue(
                                                (String) tblPermissao.getModel().getValueAt(row, 2), categoryMapAcesso)
                                        : ((Integer) tblPermissao.getValueAt(row, 0) == 1 ? 1 : 0),
                                (Integer) tblPermissao.getValueAt(row, 0),
                                grupo.getGroup_id());
                    } else {
                        criarPermissao(tblPermissao.getValueAt(row, 2) != null ? ComboBox.getKeyForValue(
                                (String) tblPermissao.getModel().getValueAt(row, 2), categoryMapAcesso)
                                : ((Integer) tblPermissao.getValueAt(row, 0) == 1 ? 1 : 0),
                                (Integer) tblPermissao.getValueAt(row, 0),
                                grupo.getGroup_id());
                    }
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
            }
        }
        dispose();
    }//GEN-LAST:event_btnSalvarUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int option = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza de que deseja fechar esse registro?\nOs dados inseridos não serão salvos!",
                "Confirmação de Cancelamento",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmDadosGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmDadosGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmDadosGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmDadosGrupo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmDadosGrupo dialog = new FrmDadosGrupo(new javax.swing.JFrame(), true, null);
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
    public static javax.swing.JButton btnSalvarUsuario;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPermissao;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtPesquisarForm;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables

    public final void readPermissao() {
        DefaultTableModel model = (DefaultTableModel) tblPermissao.getModel();
        model.setNumRows(0);
        JComboBox comboAcesso = new JComboBox();
        categoryMapAcesso.clear();
        AcessoDAO acessDao = new AcessoDAO();
        FormularioDAO formDao = new FormularioDAO();
        for (Acesso acess : acessDao.readAcesso()) {
            Integer id = acess.getAcesso_id();
            String name = acess.getAcesso();
            comboAcesso.addItem(name);
            categoryMapAcesso.put(id, name);
        }
        TableColumn colAcesso = tblPermissao.getColumnModel().getColumn(2);
        colAcesso.setCellEditor(new DefaultCellEditor(comboAcesso));
        for (Formulario form : formDao.readFormulario()) {
            model.addRow(new Object[]{
                form.getForm_id(),
                form.getForm_name(),
                "",
                0
            });
        }
    }

    public final void readPermissaoGrupo() {
        DefaultTableModel model = (DefaultTableModel) tblPermissao.getModel();
        model.setNumRows(0);
        JComboBox comboAcesso = new JComboBox();
        categoryMapAcesso.clear();
        AcessoDAO acessDao = new AcessoDAO();
        for (Acesso acess : acessDao.readAcesso()) {
            Integer id = acess.getAcesso_id();
            String name = acess.getAcesso();
            comboAcesso.addItem(name);
            categoryMapAcesso.put(id, name);
        }
        TableColumn colAcesso = tblPermissao.getColumnModel().getColumn(2);
        colAcesso.setCellEditor(new DefaultCellEditor(comboAcesso));
        for (Acesso acess : acessDao.readAcessobyGrupo(grupo)) {
            model.addRow(new Object[]{
                acess.getForm().getForm_id(),
                acess.getForm().getForm_name(),
                acess.getAcesso(),
                acess.getRegra_acesso_id()
            });
        }
    }

    private void criarPermissao(Integer acesso_id, Integer form_id, Integer grupo_id) {
        Acesso acesso = new Acesso();
        AcessoDAO acessoDAO = new AcessoDAO();
        Grupo grup = new Grupo();
        Formulario form = new Formulario();
        acesso.setAcesso_id(acesso_id);
        form.setForm_id(form_id);
        grup.setGroup_id(grupo_id);
        acesso.setForm(form);
        acesso.setGrupo(grup);
        acessoDAO.createAcesso(acesso);
    }

    private void atualizarPermissao(Integer regra_id, Integer acesso_id, Integer form_id, Integer grupo_id) {
        Acesso acesso = new Acesso();
        AcessoDAO acessoDAO = new AcessoDAO();
        Grupo grup = new Grupo();
        Formulario form = new Formulario();
        acesso.setRegra_acesso_id(regra_id);
        acesso.setAcesso_id(acesso_id);
        form.setForm_id(form_id);
        grup.setGroup_id(grupo_id);
        acesso.setForm(form);
        acesso.setGrupo(grupo);
        acessoDAO.updateAcesso(acesso);
    }

    private int criarGrupo() {
        GrupoDAO grupDAO = new GrupoDAO();
        Grupo grup = new Grupo();
        Integer grupo_id = 0;
        try {
            grup.setGroup_name(txtGrupo.getText().toUpperCase().trim());
            grup.setGroup_type(txtTipo.getText().toUpperCase().trim());
            grupo_id = grupDAO.createGrupo(grup);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        } finally {
            dispose();
        }
        return grupo_id;
    }

    private void carregarDados() {
        GrupoDAO grupDAO = new GrupoDAO();
        grupDAO.selectGrupo(grupo);
        txtGrupo.setText(grupo.getGroup_name());
        txtTipo.setText(grupo.getGroup_type());

    }

    private void atulizarGrupo() {
        GrupoDAO grupDAO = new GrupoDAO();
        try {
            grupo.setGroup_name(txtGrupo.getText().toUpperCase().trim());
            grupo.setGroup_type(txtTipo.getText().toUpperCase().trim());
            grupDAO.updateGrupo(grupo);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar dados: " + e);
        } finally {
            dispose();
        }

    }

    private void limparCampos() {
        txtGrupo.setText(null);
        txtTipo.setText(null);
    }

//    public final void readPermissao(Usuario user) {
//        DefaultTableModel model = (DefaultTableModel) tblPermissao.getModel();
//        model.setNumRows(0);
//        JComboBox comboAcesso = new JComboBox();
//        categoryMapAcesso.clear();
//        AcessoDAO acessDao = new AcessoDAO();
//        for (Acesso acess : acessDao.readAcesso()) {
//            Integer id = acess.getAcesso_id();
//            String name = acess.getAcesso();
//            comboAcesso.addItem(name);
//            categoryMapAcesso.put(id, name);
//        }
//        TableColumn colAcesso = tblPermissao.getColumnModel().getColumn(2);
//        colAcesso.setCellEditor(new DefaultCellEditor(comboAcesso));
//        for (Acesso acess : acessDao.readAcessobyUser(user)) {
//            model.addRow(new Object[]{
//                acess.getForm().getForm_id(),
//                acess.getForm().getForm_name(),
//                valorAcesso(acess.getAcesso().equals("") ? "1-Ler;" : acess.getAcesso(),
//                String.valueOf(acess.getForm().getForm_id()))
//            });
//        }
//    }
//    private String valorAcesso(String valor, String indice) {
////        String acesso = "";
////        String[] valorComSplit = valor.split(";");
////        for (String s : valorComSplit) {
////            if (s.substring(0, s.indexOf("-")).equals(indice)) {
////                acesso = s.substring(s.indexOf("-") + 1);
////            }
////        }
////        return acesso;
//    }
//    private String dadosPermissao() {
//        StringBuilder sb = new StringBuilder();
//        try {
//            int rows = tblPermissao.getRowCount();
//            for (int row = 0; row < rows; row++) {
//                if (ComboBox.getKeyForValue((String) tblPermissao.getModel().getValueAt(row, 2), categoryMapAcesso) > 0) {
//                    sb.append(tblPermissao.getModel().getValueAt(row, 0)).append("-");
//                    sb.append(tblPermissao.getModel().getValueAt(row, 2)).append(";");
//                } else {
//                    sb.append(tblPermissao.getModel().getValueAt(row, 0)).append("-").append("Ler").append(";");
//                }
//            }
//        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, "Erro: " + e);
//        }
//        return sb.toString();
//    }
}
