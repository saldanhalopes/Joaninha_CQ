package Frm.Cadastro;

import Classes.DAO.MetodologiaDAO;
import Classes.Modelo.Metodologia;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public class FrmProcurarMetodologia extends javax.swing.JDialog {

    private Metodologia metodo;

    /**
     * Creates new form FrmProcurarMetodologia
     *
     * @param parent
     * @param modal
     * @param mtd
     */
    public FrmProcurarMetodologia(java.awt.Frame parent, boolean modal, Metodologia mtd) {
        super(parent, modal);
        initComponents();
        metodo = mtd;
        setLocationRelativeTo(null);
        setTitle("Metodologia");
        this.setResizable(false);
        readMetodologia();
    }

    public FrmProcurarMetodologia(java.awt.Frame parent, boolean modal, Metodologia mtd, String tipo_metodo) {
        super(parent, modal);
        initComponents();
        metodo = mtd;
        setLocationRelativeTo(null);
        setTitle("Metodologia");
        this.setResizable(false);
        readMetodologia(tipo_metodo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisarMetodologia = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMetodologia = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPesquisarMetodologia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarMetodologiaKeyReleased(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Metodologias"));

        tblMetodologia.setAutoCreateRowSorter(true);
        tblMetodologia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Código", "Método", "Versão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        tblMetodologia.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblMetodologia);
        if (tblMetodologia.getColumnModel().getColumnCount() > 0) {
            tblMetodologia.getColumnModel().getColumn(0).setMinWidth(50);
            tblMetodologia.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblMetodologia.getColumnModel().getColumn(0).setMaxWidth(50);
            tblMetodologia.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblMetodologia.getColumnModel().getColumn(1).setMaxWidth(120);
            tblMetodologia.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblMetodologia.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 813, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        jLabel4.setText("Pesquisar:");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarMetodologia))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarMetodologia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelecionar)
                    .addComponent(btnFechar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarMetodologiaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarMetodologiaKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblMetodologia.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblMetodologia.setRowSorter(sorter);
        String text = txtPesquisarMetodologia.getText().trim();
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
    }//GEN-LAST:event_txtPesquisarMetodologiaKeyReleased

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblMetodologia.getSelectedRow() != -1) {
            metodo.setMetodo_id(tblMetodologia.getValueAt(tblMetodologia.getSelectedRow(), 0) == null ? 0 : (Integer) tblMetodologia.getValueAt(tblMetodologia.getSelectedRow(), 0));
            metodo.setCod_metodo(tblMetodologia.getValueAt(tblMetodologia.getSelectedRow(), 1).toString());
            metodo.setMetodo(tblMetodologia.getValueAt(tblMetodologia.getSelectedRow(), 2).toString());
            metodo.setVersao((Integer) tblMetodologia.getValueAt(tblMetodologia.getSelectedRow(), 3));
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
            java.util.logging.Logger.getLogger(FrmProcurarMetodologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarMetodologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarMetodologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarMetodologia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProcurarMetodologia dialog = new FrmProcurarMetodologia(new javax.swing.JFrame(), true, null, null);
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMetodologia;
    private javax.swing.JTextField txtPesquisarMetodologia;
    // End of variables declaration//GEN-END:variables

    public final void readMetodologia() {
        DefaultTableModel model = (DefaultTableModel) tblMetodologia.getModel();
        MetodologiaDAO equipDao = new MetodologiaDAO();
        model.setNumRows(0);
        for (Metodologia mtd : equipDao.readMetodologia()) {
            model.addRow(new Object[]{
                mtd.getMetodo_id(),
                mtd.getCod_metodo(),
                mtd.getMetodo(),
                mtd.getVersao()
            });
        }
    }

    public final void readMetodologia(String tipo) {
        DefaultTableModel model = (DefaultTableModel) tblMetodologia.getModel();
        MetodologiaDAO equipDao = new MetodologiaDAO();
        model.setNumRows(0);
        for (Metodologia mtd : equipDao.readMetodologia()) {
            if (mtd.getCod_metodo().startsWith(tipo)) {
                model.addRow(new Object[]{
                    mtd.getMetodo_id(),
                    mtd.getCod_metodo(),
                    mtd.getMetodo(),
                    mtd.getVersao()
                });
            }
        }
    }
}
