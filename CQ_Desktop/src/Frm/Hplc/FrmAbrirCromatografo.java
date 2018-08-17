package Frm.Hplc;

import Classes.DAO.CromatografoDAO;
import Frm.Principal.FrmPrincipal;
import Classes.Modelo.Cromatografo;
import Classes.Util.Frames;
import java.awt.Cursor;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael.lopes
 */
public class FrmAbrirCromatografo extends javax.swing.JDialog {

    FrmLogCromatografo frm;

    /**
     * Creates new form FrmEquipamento
     *
     * @param parent
     * @param modal
     */
    public FrmAbrirCromatografo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Selecionar Sistema Cromatográfico");
        this.setResizable(false);
        readEquipamento();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEquipamentos = new javax.swing.JList();
        btnAbrir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEquipamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEquipamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEquipamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEquipamentos);

        btnAbrir.setText("OK");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAbrir))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        String title = lstEquipamentos.getSelectedValue().toString();
        try {
            if (frm == null || frm.isClosed()) {
                frm = new FrmLogCromatografo(title);
                FrmPrincipal.desktopPane.add(frm);
                Frames.centralizar(frm);
                frm.criarJanela(title);
                frm.setVisible(true);
            } else if (frm.isVisible() == true) {
                frm.criarJanela(title);
                frm.moveToFront();
                frm.setSelected(true);
                frm.show();
                FrmPrincipal.desktopPane.repaint();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
        }
        dispose();
        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void lstEquipamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEquipamentosMouseClicked
        if (evt.getClickCount() == 2) {
            setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
            String title = lstEquipamentos.getSelectedValue().toString();
            //Frames.addTelaDesk(FrmPrincipal.desktopPane, new FrmLogCromatografo(title), title);
            try {
                if (frm == null || frm.isClosed()) {
                    frm = new FrmLogCromatografo(title);
                    FrmPrincipal.desktopPane.add(frm);
                    Frames.centralizar(frm);
                    frm.criarJanela(title);
                    frm.setVisible(true);
                } else if (frm.isVisible() == true) {
                    frm.criarJanela(title);
                    frm.moveToFront();
                    frm.setSelected(true);
                    frm.show();
                    FrmPrincipal.desktopPane.repaint();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir" + e);
            }
            dispose();
            setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_lstEquipamentosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAbrirCromatografo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                FrmAbrirCromatografo dialog = new FrmAbrirCromatografo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstEquipamentos;
    // End of variables declaration//GEN-END:variables

    public final void readEquipamento() {
        DefaultListModel model = new DefaultListModel();
        CromatografoDAO cromatDao = new CromatografoDAO();
        for (Cromatografo cromat : cromatDao.readCromatografo()) {
            model.addElement(cromat.getSystem_name());
        }
        lstEquipamentos.setModel(model);
    }

}
