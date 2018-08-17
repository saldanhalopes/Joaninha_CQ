package Frm.Laboratorio;

import Classes.DAO.PlaceboDAO;
import Classes.Modelo.Placebo;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael.lopes
 */
public class FrmVagaPlacebo extends javax.swing.JDialog {

    private Placebo placebo;

    /**
     * Creates new form FrmVagaColuna
     *
     * @param parent
     * @param modal
     */
    public FrmVagaPlacebo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Vaga Placebo");
        this.setResizable(false);
        readVagaPlacebo();
        btnSelecionar.setVisible(false);
    }

    public FrmVagaPlacebo(java.awt.Frame parent, boolean modal, Placebo plac) {
        super(parent, modal);
        initComponents();
        placebo = plac;
        setLocationRelativeTo(null);
        setTitle("Vaga Placebo");
        this.setResizable(false);
        readVagaPlacebo();
        btnSelecionar.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblVagaPlacebo = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblVagaPlacebo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaga", "Material"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVagaPlacebo.setColumnSelectionAllowed(true);
        tblVagaPlacebo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblVagaPlacebo.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblVagaPlacebo);
        tblVagaPlacebo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblVagaPlacebo.getColumnModel().getColumnCount() > 0) {
            tblVagaPlacebo.getColumnModel().getColumn(0).setMinWidth(50);
            tblVagaPlacebo.getColumnModel().getColumn(0).setPreferredWidth(50);
            tblVagaPlacebo.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSelecionar.setText("Selecionar");
        btnSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarActionPerformed(evt);
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
                        .addComponent(btnSelecionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSelecionar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed
    private void btnSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarActionPerformed
        if (tblVagaPlacebo.getSelectedRow() != -1) {
            if ("-".equals(tblVagaPlacebo.getValueAt(tblVagaPlacebo.getSelectedRow(), 1))) {
                placebo.setVaga_placebo_id((Integer) tblVagaPlacebo.getValueAt(tblVagaPlacebo.getSelectedRow(), 0));
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Vaga indisponível");
            }
        }
    }//GEN-LAST:event_btnSelecionarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmVagaPlacebo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmVagaPlacebo dialog = new FrmVagaPlacebo(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton btnSelecionar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblVagaPlacebo;
    // End of variables declaration//GEN-END:variables

    public final void readVagaPlacebo() {
        DefaultTableModel model = (DefaultTableModel) tblVagaPlacebo.getModel();
        PlaceboDAO placDao = new PlaceboDAO();
        model.setNumRows(0);
        for (Placebo plac : placDao.readVagaPlacebo()) {
            model.addRow(new Object[]{
                plac.getVaga_placebo_id(),
                plac.getMaterial().getNome_material() == null
                || plac.getMaterial().getNome_material().isEmpty()
                ? "-" : plac.getMaterial().getNome_material()
            });
        }
    }
}
