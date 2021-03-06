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
package Frm.Laboratorio;

import Classes.DAO.PlaceboDAO;
import Classes.DAO.SetorDAO;
import Classes.Modelo.Material;
import Classes.Modelo.Placebo;
import Classes.Modelo.Setor;
import Classes.Modelo.Usuario;
import Classes.Util.ComboBox;
import Classes.Util.DataHora;
import Frm.Cadastro.FrmProcurarProduto;
import Frm.Login.FrmSalvar;
import java.awt.Cursor;
import java.util.Date;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.lopes
 */
public class FrmConfigPlacebo extends javax.swing.JDialog {

    private TreeMap<Integer, String> categoryMapSetor = new TreeMap<>();
    private Integer placebo_id;

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     * @param prd
     */
    public FrmConfigPlacebo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Novo placebo");
        setResizable(false);
        readSetor();
    }

    public FrmConfigPlacebo(java.awt.Frame parent, boolean modal, Integer plac_id) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Configurações do placebo");
        setResizable(false);
        readSetor();
        placebo_id = plac_id;
        carregarDados(plac_id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        pnlDadosProduto = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
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
        txtObs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtVaga = new javax.swing.JTextField();
        btnVagaColuna = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        cmbSetor = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        pnlDadosProduto.setBorder(javax.swing.BorderFactory.createTitledBorder("Produto"));

        jLabel7.setText("Produto:");

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
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProcurarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                        .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeMaterial))
                            .addGroup(pnlDadosProdutoLayout.createSequentialGroup()
                                .addComponent(txtCodMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMetodo, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodMetodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDadosLote.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        jLabel6.setText("Obs:");

        jLabel35.setText("Vaga:");

        txtVaga.setEditable(false);
        txtVaga.setBackground(new java.awt.Color(204, 204, 204));

        btnVagaColuna.setText("Vaga");
        btnVagaColuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVagaColunaActionPerformed(evt);
            }
        });

        jLabel28.setText("Setor:");

        javax.swing.GroupLayout pnlDadosLoteLayout = new javax.swing.GroupLayout(pnlDadosLote);
        pnlDadosLote.setLayout(pnlDadosLoteLayout);
        pnlDadosLoteLayout.setHorizontalGroup(
            pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtObs)
                    .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                        .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbSetor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtVaga, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVagaColuna, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 495, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlDadosLoteLayout.setVerticalGroup(
            pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(cmbSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVagaColuna))
                .addGap(7, 7, 7)
                .addGroup(pnlDadosLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtObs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlDadosProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDadosLote, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlDadosProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDadosLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnProcurarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcurarMaterialActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        Material prod = new Material();
        String[] tipo_produto = {"SA"};
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

    private void btnVagaColunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVagaColunaActionPerformed
        Placebo placebo = new Placebo();
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        FrmVagaPlacebo frm = new FrmVagaPlacebo(null, true, placebo);
        frm.setVisible(true);
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        Integer[] vaga = {placebo.getVaga_placebo_id()};
        if (vaga[0] != null) {
            if (vaga[0] > 0) {
                txtVaga.setText(String.valueOf(vaga[0]));
            }
        }
    }//GEN-LAST:event_btnVagaColunaActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (txtCodMaterial.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecionar Produto");
            txtCodMaterial.requestFocus();
        } else if (txtVaga.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vaga inválida");
            txtVaga.requestFocus();
        } else if (cmbSetor.getSelectedItem().toString().isEmpty() || cmbSetor.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Setor inválido");
            cmbSetor.requestFocus();
        } else if (placebo_id != null) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                atualizarPlacebo();
                dispose();
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        } else {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            FrmSalvar frmSalvar = new FrmSalvar(null, true);
            frmSalvar.setVisible(true);
            if (FrmSalvar.senha()) {
                criarPlacebo();
                dispose();
            }
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConfigPlacebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPlacebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPlacebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPlacebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmConfigPlacebo dialog = new FrmConfigPlacebo(new javax.swing.JFrame(), true);
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
    public static javax.swing.JButton btnProcurarMaterial;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVagaColuna;
    private javax.swing.JComboBox cmbSetor;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnlDadosLote;
    private javax.swing.JPanel pnlDadosProduto;
    private javax.swing.JTextField txtCodMaterial;
    private javax.swing.JTextField txtCodMetodo;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtMetodo;
    private javax.swing.JTextField txtNomeMaterial;
    private javax.swing.JTextField txtObs;
    private javax.swing.JTextField txtTipo;
    public static javax.swing.JTextField txtVaga;
    // End of variables declaration//GEN-END:variables

    private void criarPlacebo() {
        Placebo placebo = new Placebo();
        PlaceboDAO placeboDAO = new PlaceboDAO();
        Setor setor = new Setor();
        Material prod = new Material();
        Usuario user = new Usuario();
        try {
            prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
            placebo.setMaterial(prod);
            setor.setSetor_id(ComboBox.getKeyForValue(cmbSetor.getSelectedItem().toString(), categoryMapSetor));
            placebo.setSetor(setor);
            placebo.setVaga_placebo_id(Integer.parseInt(txtVaga.getText()));
            placebo.setObs(txtObs.getText().toUpperCase());
            placebo.setData_registro(DataHora.getTimestampDate(new Date()));
            user.setUser(System.getProperty("user"));
            placebo.setUser_registro(user);
            placeboDAO.createPlacebo(placebo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }

    private void atualizarPlacebo() {
        Placebo placebo = new Placebo();
        PlaceboDAO placeboDAO = new PlaceboDAO();
        Setor setor = new Setor();
        Material prod = new Material();
        Usuario user = new Usuario();
        try {
            placebo.setPlacebo_id(placebo_id);
            prod.setMaterial_id(Integer.parseInt(txtIdProduto.getText()));
            placebo.setMaterial(prod);
            setor.setSetor_id(ComboBox.getKeyForValue(cmbSetor.getSelectedItem().toString(), categoryMapSetor));
            placebo.setSetor(setor);
            placebo.setVaga_placebo_id(Integer.parseInt(txtVaga.getText()));
            placebo.setObs(txtObs.getText().toUpperCase());
            placebo.setData_registro(DataHora.getTimestampDate(new Date()));
            user.setUser(System.getProperty("user"));
            placebo.setUser_registro(user);
            placeboDAO.updatePlacebo(placebo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar dados: " + e);
        }
    }

    public final void readSetor() {
        cmbSetor.removeAllItems();
        cmbSetor.addItem("");
        categoryMapSetor.clear();
        SetorDAO setorDao = new SetorDAO();
        for (Setor setor : setorDao.readSetor()) {
            Integer id = setor.getSetor_id();
            String name = setor.getSigla_setor();
            cmbSetor.addItem(name);
            categoryMapSetor.put(id, name);
        }
    }

    private void carregarDados(Integer id) {
        Placebo placebo = new Placebo();
        placebo.setPlacebo_id(id);
        PlaceboDAO placeboDAO = new PlaceboDAO();
        placeboDAO.selectPlacebo(placebo);
        txtIdProduto.setText(String.valueOf(placebo.getMaterial().getMaterial_id()));
        txtCodMaterial.setText(placebo.getMaterial().getCod_material());
        txtNomeMaterial.setText(placebo.getMaterial().getNome_material());
        txtTipo.setText(placebo.getMaterial().getTipo());
        txtCodMetodo.setText(placebo.getMetodologia().getCod_metodo());
        txtMetodo.setText(placebo.getMetodologia().getMetodo());
        String[] setor = {placebo.getSetor().getSigla_setor()};
        cmbSetor.setSelectedItem(setor[0]);
        txtVaga.setText(String.valueOf(placebo.getVaga_placebo_id()));
        txtObs.setText(placebo.getObs().toUpperCase());
    }

}
