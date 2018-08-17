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
import Classes.DAO.CromatografoDAO;
import Classes.DAO.MetodologiaDAO;
import Classes.Modelo.Analise;
import Classes.Modelo.AtividadePreparo;
import Classes.Modelo.Cromatografo;
import Classes.Modelo.Metodologia;
import Classes.Modelo.Usuario;
import Classes.Util.ComboBox;
import Classes.Util.DataHora;
import Frm.Cadastro.FrmProcurarMetodologia;
import Frm.Login.FrmUsuarioSalvar;
import java.awt.Cursor;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.lopes
 */
public class FrmPedidoAtividadeGeralPreparo extends javax.swing.JDialog {

    private TreeMap<Integer, String> categoryMapEquipamento = new TreeMap<>();
    private TreeMap<Integer, String> categoryMapMetodo = new TreeMap<>();

    /**
     * Creates new form FrmNovoRegistroCromatografo
     *
     * @param parent
     * @param modal
     */
    public FrmPedidoAtividadeGeralPreparo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Outros Registros");
        readEquipamento();
        readMetodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlDados = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ckbRetrabalho = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        cmbEquipamento = new javax.swing.JComboBox();
        jLabel24 = new javax.swing.JLabel();
        cmbMetodo = new javax.swing.JComboBox();
        btnProcurarMetodo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObs = new javax.swing.JTextArea();
        btnSalvar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel10.setText("Descrição:");

        txtDescricao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setText("Observação:");

        ckbRetrabalho.setText("Retrabalho");

        jLabel25.setText("Equipamento:");

        jLabel24.setText("Método:");

        btnProcurarMetodo.setText("Buscar");
        btnProcurarMetodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcurarMetodoActionPerformed(evt);
            }
        });

        txtObs.setColumns(20);
        txtObs.setRows(5);
        jScrollPane1.setViewportView(txtObs);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmbMetodo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarMetodo))
                    .addComponent(txtDescricao)
                    .addComponent(cmbEquipamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ckbRetrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cmbMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcurarMetodo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(cmbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ckbRetrabalho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFechar)
                    .addComponent(btnSalvar))
                .addGap(16, 16, 16))
        );

        getContentPane().add(pnlDados);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if (txtDescricao.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Descreva a Atividade!");
                txtDescricao.requestFocus();
            } else if (cmbMetodo.getSelectedItem().toString().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Selecione a Metodologia!");
                cmbMetodo.requestFocus();
            } else {
                //Abre Dialog para savar
                Usuario user = new Usuario();
                FrmUsuarioSalvar frmSalvar = new FrmUsuarioSalvar(null, true, user);
                frmSalvar.setVisible(true);
                if (FrmUsuarioSalvar.senha()) {
                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                    criarAtividade(user);
                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                    dispose();
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possivel salvar. Algum Campo está inválido!");
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnProcurarMetodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMetodoActionPerformed
        Metodologia mtd = new Metodologia();
        FrmProcurarMetodologia frm = new FrmProcurarMetodologia(null, true, mtd);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        readMetodo();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        String[] cod_mtd = {mtd.getCod_metodo()};
        cmbMetodo.setSelectedItem(cod_mtd[0]);
    }//GEN-LAST:event_btnProcurarMetodoActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPedidoAtividadeGeralPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoAtividadeGeralPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoAtividadeGeralPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPedidoAtividadeGeralPreparo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmPedidoAtividadeGeralPreparo dialog = new FrmPedidoAtividadeGeralPreparo(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnFechar;
    private javax.swing.JButton btnProcurarMetodo;
    public static javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox ckbRetrabalho;
    private javax.swing.JComboBox cmbEquipamento;
    private javax.swing.JComboBox cmbMetodo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextArea txtObs;
    // End of variables declaration//GEN-END:variables

    public final void readMetodo() {
        cmbMetodo.removeAllItems();
        cmbMetodo.addItem("");
        cmbMetodo.addItem("MULTIPROPÓSITO");
        categoryMapMetodo.clear();
        MetodologiaDAO mtdDao = new MetodologiaDAO();
        for (Metodologia mtd : mtdDao.readMetodologia()) {
            Integer id = (Integer) mtd.getMetodo_id();
            String name = mtd.getCod_metodo();
            cmbMetodo.addItem(name);
            categoryMapMetodo.put(id, name);
        }
    }

    public final void readEquipamento() {
        cmbEquipamento.removeAllItems();
        cmbEquipamento.addItem("");
        categoryMapEquipamento.clear();
        CromatografoDAO equipDao = new CromatografoDAO();
        for (Cromatografo equip : equipDao.readCromatografo()) {
            Integer id = equip.getCromatografo_id();
            String name = equip.getSystem_name();
            cmbEquipamento.addItem(name);
            categoryMapEquipamento.put(id, name);
        }
    }

    private void criarAtividade(Usuario user) {
        try {
            AtividadePreparo atvprep = new AtividadePreparo();
            AtividadePreparoDAO atvprepDAO = new AtividadePreparoDAO();
            Cromatografo equip = new Cromatografo();
            Metodologia mtd = new Metodologia();
            Analise anls = new Analise();
            atvprep.setCategoria_preparo("Atividade Geral");
            atvprep.setDescricao_preparo(txtDescricao.getText().trim().toUpperCase());
            atvprep.setLote_preparo(null);
            atvprep.setQtd_preparo(1.0);
            anls.setAnalise_id(0);
            atvprep.setAnalise(anls);
            atvprep.setData_hora_registro(DataHora.getTimestampDate(new Date()));
            atvprep.setUser_registro(user);
            if (cmbEquipamento.getSelectedItem() != null) {
                equip.setCromatografo_id(ComboBox.getKeyForValue(cmbEquipamento.getSelectedItem().toString(), categoryMapEquipamento));
            } else {
                equip.setCromatografo_id(0);
            }
            atvprep.setCromatografo(equip);
            mtd.setMetodo_id(ComboBox.getKeyForValue(cmbMetodo.getSelectedItem().toString(), categoryMapMetodo));
            atvprep.setMetodologia(mtd);
            atvprep.setRetrabalho_preparo(ckbRetrabalho.isSelected());
            atvprep.setObs_preparo(txtObs.getText().trim().toUpperCase());
            atvprepDAO.createPedido(atvprep);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }

}
