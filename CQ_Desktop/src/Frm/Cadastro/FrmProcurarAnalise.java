package Frm.Cadastro;

import Classes.DAO.AnaliseDAO;
import Classes.Modelo.Analise;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author rafael.lopes
 */
public class FrmProcurarAnalise extends javax.swing.JDialog {

    private Analise analise;

    /**
     * Creates new form FrmProcurarMetodologia
     *
     * @param parent
     * @param modal
     * @param mtd
     */
    public FrmProcurarAnalise(java.awt.Frame parent, boolean modal, Analise anls) {
        super(parent, modal);
        initComponents();
        analise = anls;
        setLocationRelativeTo(null);
        setTitle("Análises");
        this.setResizable(false);
        readAnalises();
    }

    public final void readAnalises() {
        DefaultTableModel model = (DefaultTableModel) tblAnalises.getModel();
        AnaliseDAO anlsDao = new AnaliseDAO();
        model.setNumRows(0);
        for (Analise anls : anlsDao.readAnalise()) {
            model.addRow(new Object[]{
                anls.getAnalise_id(),
                anls.getAnalise(),
                anls.getSigla_analise()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPesquisarAnalises = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnalises = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSelecionar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtPesquisarAnalises.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarAnalisesKeyReleased(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Analises"));

        tblAnalises.setAutoCreateRowSorter(true);
        tblAnalises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Análise", "Sigla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAnalises.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(tblAnalises);
        if (tblAnalises.getColumnModel().getColumnCount() > 0) {
            tblAnalises.getColumnModel().getColumn(0).setMinWidth(50);
            tblAnalises.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblAnalises.getColumnModel().getColumn(0).setMaxWidth(50);
            tblAnalises.getColumnModel().getColumn(2).setMinWidth(120);
            tblAnalises.getColumnModel().getColumn(2).setPreferredWidth(120);
            tblAnalises.getColumnModel().getColumn(2).setMaxWidth(120);
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
                        .addComponent(txtPesquisarAnalises))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisarAnalises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtPesquisarAnalisesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarAnalisesKeyReleased
        DefaultTableModel model = (DefaultTableModel) tblAnalises.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        tblAnalises.setRowSorter(sorter);
        String text = txtPesquisarAnalises.getText().trim();
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
    }//GEN-LAST:event_txtPesquisarAnalisesKeyReleased

    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblAnalises.getSelectedRow() != -1) {
            analise.setAnalise_id((Integer) tblAnalises.getValueAt(tblAnalises.getSelectedRow(), 0));
            analise.setAnalise(tblAnalises.getValueAt(tblAnalises.getSelectedRow(), 1).toString());
            analise.setSigla_analise(tblAnalises.getValueAt(tblAnalises.getSelectedRow(), 2).toString());
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
            java.util.logging.Logger.getLogger(FrmProcurarAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmProcurarAnalise.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmProcurarAnalise dialog = new FrmProcurarAnalise(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JTable tblAnalises;
    private javax.swing.JTextField txtPesquisarAnalises;
    // End of variables declaration//GEN-END:variables
}
