/*
 * Copyright (C) 2018 rafael.lopes
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
package Frm.Programacao;

/**
 *
 * @author rafael.lopes
 */
public class FrmEquipes extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    public FrmEquipes() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblEquipes = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        btnNovoCampanha = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        btnCancelarCampanha = new javax.swing.JButton();
        jToolBar4 = new javax.swing.JToolBar();
        jSeparator11 = new javax.swing.JToolBar.Separator();
        btnAtualizarEquipes = new javax.swing.JButton();
        jSeparator15 = new javax.swing.JToolBar.Separator();
        btnEmailEquipes = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JToolBar.Separator();
        btnImprimirEquipes = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        cmbTurno = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cmbEquipamento = new javax.swing.JComboBox();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipes"));

        tblEquipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Equipe", "Equipamento", "Turno", "Responsável", "Preparo", "Data Atualização"
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
        jScrollPane3.setViewportView(tblEquipes);
        if (tblEquipes.getColumnModel().getColumnCount() > 0) {
            tblEquipes.getColumnModel().getColumn(0).setMinWidth(0);
            tblEquipes.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblEquipes.getColumnModel().getColumn(0).setMaxWidth(0);
            tblEquipes.getColumnModel().getColumn(1).setMinWidth(120);
            tblEquipes.getColumnModel().getColumn(1).setPreferredWidth(120);
            tblEquipes.getColumnModel().getColumn(2).setMinWidth(100);
            tblEquipes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblEquipes.getColumnModel().getColumn(3).setMinWidth(80);
            tblEquipes.getColumnModel().getColumn(3).setPreferredWidth(80);
            tblEquipes.getColumnModel().getColumn(4).setMinWidth(100);
            tblEquipes.getColumnModel().getColumn(4).setPreferredWidth(100);
            tblEquipes.getColumnModel().getColumn(5).setMinWidth(100);
            tblEquipes.getColumnModel().getColumn(5).setPreferredWidth(100);
            tblEquipes.getColumnModel().getColumn(6).setMinWidth(180);
            tblEquipes.getColumnModel().getColumn(6).setPreferredWidth(180);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))
        );

        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        btnNovoCampanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/plus.png"))); // NOI18N
        btnNovoCampanha.setText("Novo");
        btnNovoCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCampanhaActionPerformed(evt);
            }
        });
        jToolBar3.add(btnNovoCampanha);
        jToolBar3.add(jSeparator8);

        btnCancelarCampanha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_cancel.png"))); // NOI18N
        btnCancelarCampanha.setText("Excluir");
        btnCancelarCampanha.setFocusable(false);
        btnCancelarCampanha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCampanhaActionPerformed(evt);
            }
        });
        jToolBar3.add(btnCancelarCampanha);

        jToolBar4.setFloatable(false);
        jToolBar4.setRollover(true);
        jToolBar4.add(jSeparator11);

        btnAtualizarEquipes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_raio.png"))); // NOI18N
        btnAtualizarEquipes.setText("Atualizar");
        btnAtualizarEquipes.setToolTipText("Atualizar");
        btnAtualizarEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarEquipesActionPerformed(evt);
            }
        });
        jToolBar4.add(btnAtualizarEquipes);
        jToolBar4.add(jSeparator15);

        btnEmailEquipes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_mail.png"))); // NOI18N
        btnEmailEquipes.setToolTipText("Enviar Relatório");
        btnEmailEquipes.setFocusable(false);
        btnEmailEquipes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmailEquipes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmailEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailEquipesActionPerformed(evt);
            }
        });
        jToolBar4.add(btnEmailEquipes);
        jToolBar4.add(jSeparator12);

        btnImprimirEquipes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon_print.png"))); // NOI18N
        btnImprimirEquipes.setToolTipText("Atualizar");
        btnImprimirEquipes.setFocusable(false);
        btnImprimirEquipes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirEquipesActionPerformed(evt);
            }
        });
        jToolBar4.add(btnImprimirEquipes);

        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyReleased(evt);
            }
        });

        cmbTurno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "1T", "2T", "3T", "Comercial" }));
        cmbTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTurnoActionPerformed(evt);
            }
        });

        jLabel1.setText("Pesquisar:");

        jLabel5.setText("Turno:");

        jLabel25.setText("Equipamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel25)
                        .addComponent(cmbEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(cmbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyReleased
        //tableSorter();
    }//GEN-LAST:event_txtPesquisarKeyReleased

    private void cmbTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTurnoActionPerformed
        //tableSorter();
    }//GEN-LAST:event_cmbTurnoActionPerformed

    private void btnNovoCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCampanhaActionPerformed
//        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//        FrmNovoCampanhaCromatografo frmNovoCampanha = new FrmNovoCampanhaCromatografo(null, true, 0);
//        frmNovoCampanha.setVisible(true);
//        readCampanhas();
//        setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btnNovoCampanhaActionPerformed

    private void btnCancelarCampanhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCampanhaActionPerformed
//        if (tblCampanhas.getSelectedRow() != -1) {
//            deletarDados((Integer) tblCampanhas.getValueAt(tblCampanhas.getSelectedRow(), 1));
//            readCampanhas();
//        }
    }//GEN-LAST:event_btnCancelarCampanhaActionPerformed

    private void btnAtualizarEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarEquipesActionPerformed
//        readCampanhas();
    }//GEN-LAST:event_btnAtualizarEquipesActionPerformed

    private void btnEmailEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailEquipesActionPerformed
//        FrmEnviarEmailProximasCampanhas frm = new FrmEnviarEmailProximasCampanhas(null, true, cmbPesquisarSetorCampanhas.getSelectedItem().toString());
//        frm.setVisible(true);
    }//GEN-LAST:event_btnEmailEquipesActionPerformed

    private void btnImprimirEquipesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirEquipesActionPerformed
//        int dialogResult = JOptionPane.showConfirmDialog(null,
//            "Deseja Imprimir Relatorio de Próximas Campanhas ?", "Aviso", JOptionPane.YES_NO_OPTION);
//        if (dialogResult == 0) {
//            final FrmCarregando frm = new FrmCarregando();
//            frm.setVisible(true);
//            Thread t1 = new Thread() {
//                @Override
//                public void run() {
//                    setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
//                    String where = "";
//                    if (!"Todos".equals(cmbPesquisarSetorCampanhas.getSelectedItem().toString())) {
//                        where = " AND tb_log_campanha.sigla_setor = '"
//                        + cmbPesquisarSetorCampanhas.getSelectedItem().toString() + "' ";
//                    }
//                    CampanhaDAO.printProximasCampanhas(System.getProperty("user"), where);
//                    frm.dispose();
//                    setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
//                }
//            };
//            t1.start();
//        }
    }//GEN-LAST:event_btnImprimirEquipesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarEquipes;
    public static javax.swing.JButton btnCancelarCampanha;
    private javax.swing.JButton btnEmailEquipes;
    private javax.swing.JButton btnImprimirEquipes;
    public static javax.swing.JButton btnNovoCampanha;
    private javax.swing.JComboBox cmbEquipamento;
    private javax.swing.JComboBox cmbTurno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator11;
    private javax.swing.JToolBar.Separator jSeparator12;
    private javax.swing.JToolBar.Separator jSeparator15;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JToolBar jToolBar4;
    private javax.swing.JTable tblEquipes;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
