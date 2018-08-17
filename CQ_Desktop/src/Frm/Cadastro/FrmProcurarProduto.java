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
package Frm.Cadastro;

import Classes.DAO.MaterialDAO;
import Classes.Modelo.Material;
import Classes.Modelo.Metodologia;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public class FrmProcurarProduto extends javax.swing.JDialog {

    private Material produto;

    /**
     * Creates new form FrmProcurarProduto
     *
     * @param parent
     * @param modal
     * @param prd
     */
    public FrmProcurarProduto(java.awt.Frame parent, boolean modal, Material prd) {
        super(parent, modal);
        initComponents();
        produto = prd;
        setLocationRelativeTo(null);
        setTitle("Material");
        setResizable(false);
        readProduto();
    }

    public FrmProcurarProduto(java.awt.Frame parent, boolean modal, Material prd, String where) {
        super(parent, modal);
        initComponents();
        produto = prd;
        setLocationRelativeTo(null);
        setTitle("Material");
        setResizable(false);
        readProduto(where);
    }

    public FrmProcurarProduto(java.awt.Frame parent, boolean modal, Material prd, String[] tipo_produto) {
        super(parent, modal);
        initComponents();
        produto = prd;
        setLocationRelativeTo(null);
        setTitle("Material");
        setResizable(false);
        readProduto(tipo_produto);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlProdutos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtPesquisarProduto = new javax.swing.JTextField();
        btnSelecionar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

        tblProduto.setAutoCreateRowSorter(true);
        tblProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Material", "Produto", "Tipo", "Método", "metodo_id", "metodologia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        tblProduto.setSurrendersFocusOnKeystroke(true);
        tblProduto.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProduto);
        if (tblProduto.getColumnModel().getColumnCount() > 0) {
            tblProduto.getColumnModel().getColumn(0).setMinWidth(50);
            tblProduto.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblProduto.getColumnModel().getColumn(0).setMaxWidth(50);
            tblProduto.getColumnModel().getColumn(1).setMinWidth(80);
            tblProduto.getColumnModel().getColumn(1).setPreferredWidth(80);
            tblProduto.getColumnModel().getColumn(1).setMaxWidth(80);
            tblProduto.getColumnModel().getColumn(3).setMinWidth(80);
            tblProduto.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblProduto.getColumnModel().getColumn(3).setMaxWidth(80);
            tblProduto.getColumnModel().getColumn(4).setMinWidth(120);
            tblProduto.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblProduto.getColumnModel().getColumn(4).setMaxWidth(120);
            tblProduto.getColumnModel().getColumn(5).setMinWidth(0);
            tblProduto.getColumnModel().getColumn(5).setPreferredWidth(0);
            tblProduto.getColumnModel().getColumn(5).setMaxWidth(0);
            tblProduto.getColumnModel().getColumn(6).setMinWidth(0);
            tblProduto.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblProduto.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
        pnlProdutos.setLayout(pnlProdutosLayout);
        pnlProdutosLayout.setHorizontalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        pnlProdutosLayout.setVerticalGroup(
            pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        jLabel4.setText("Pesquisar:");

        txtPesquisarProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarProdutoKeyReleased(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlProdutos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarProduto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPesquisarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarProdutoKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblProduto.setRowSorter(sorter);
        String text = txtPesquisarProduto.getText().trim();
        String parametro = "*";
        if (text.length() == 0) {
            sorter.setRowFilter(null);
        } else if (text.indexOf(parametro) > 0) {
            ArrayList<RowFilter<Object, Object>> andFilters = new ArrayList<>();
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(0, text.indexOf(parametro)).trim().toUpperCase()));
            andFilters.add(RowFilter.regexFilter("(?i)" + text.substring(text.indexOf(parametro) + 1, text.length()).trim().toUpperCase()));
            sorter.setRowFilter(RowFilter.andFilter(andFilters));
        } else {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + text.toUpperCase()));
        }
    }//GEN-LAST:event_txtPesquisarProdutoKeyReleased

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblProduto.getSelectedRow() != -1) {
            Metodologia mtd = new Metodologia();
            mtd.setCod_metodo(tblProduto.getValueAt(tblProduto.getSelectedRow(), 4) == null ? null : tblProduto.getValueAt(tblProduto.getSelectedRow(), 4).toString());
            mtd.setMetodo_id(tblProduto.getValueAt(tblProduto.getSelectedRow(), 5) == null ? null : (Integer) tblProduto.getValueAt(tblProduto.getSelectedRow(), 5));
            mtd.setMetodo(tblProduto.getValueAt(tblProduto.getSelectedRow(), 6) == null ? null : tblProduto.getValueAt(tblProduto.getSelectedRow(), 6).toString());
            produto.setMetodo(mtd);
            produto.setMaterial_id((Integer) tblProduto.getValueAt(tblProduto.getSelectedRow(), 0));
            produto.setCod_material(tblProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());
            produto.setNome_material(tblProduto.getValueAt(tblProduto.getSelectedRow(), 2).toString());
            produto.setTipo(tblProduto.getValueAt(tblProduto.getSelectedRow(), 3).toString());
            dispose();
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_btnFecharActionPerformed

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
            java.util.logging.Logger.getLogger(FrmProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProcurarProduto dialog = new FrmProcurarProduto(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlProdutos;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextField txtPesquisarProduto;
    // End of variables declaration//GEN-END:variables

    private void readProduto() {
        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        MaterialDAO equipDao = new MaterialDAO();
        model.setNumRows(0);
        for (Material prod : equipDao.readMaterial()) {
            model.addRow(new Object[]{
                prod.getMaterial_id(),
                prod.getCod_material(),
                prod.getNome_material(),
                prod.getTipo(),
                prod.getMetodo().getCod_metodo(),
                prod.getMetodo().getMetodo_id(),
                prod.getMetodo().getMetodo()
            });
        }
    }

    private void readProduto(String sql) {
        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        MaterialDAO equipDao = new MaterialDAO();
        model.setNumRows(0);
        for (Material prod : equipDao.readMaterial(sql)) {
            model.addRow(new Object[]{
                prod.getMaterial_id(),
                prod.getCod_material(),
                prod.getNome_material(),
                prod.getTipo(),
                prod.getMetodo().getCod_metodo(),
                prod.getMetodo().getMetodo_id(),
                prod.getMetodo().getMetodo()
            });
        }
    }

    private void readProduto(String[] tipo_produto) {
        DefaultTableModel model = (DefaultTableModel) tblProduto.getModel();
        MaterialDAO equipDao = new MaterialDAO();
        model.setNumRows(0);
        for (String tipo : tipo_produto) {
            for (Material prod : equipDao.readMaterial()) {
                if (prod.getTipo().startsWith(tipo)) {
                    model.addRow(new Object[]{
                        prod.getMaterial_id(),
                        prod.getCod_material(),
                        prod.getNome_material(),
                        prod.getTipo(),
                        prod.getMetodo().getCod_metodo(),
                        prod.getMetodo().getMetodo_id(),
                        prod.getMetodo().getMetodo()
                    });
                }
            }
        }
    }

}
