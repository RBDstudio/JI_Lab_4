import javax.swing.table.DefaultTableModel;
import java.util.Collection;
import java.lang.Math;

/**
 *
 * @author RBDstudio
 */

//public class RecIntegral
public class JFrame extends javax.swing.JFrame {
    
    public JFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lower_bound_ent = new javax.swing.JTextField();
        step_ent = new javax.swing.JTextField();
        upper_bound_ent = new javax.swing.JTextField();
        Add_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Calcul_button = new javax.swing.JButton();
        Delete_button = new javax.swing.JButton();
        Logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "нижняя гр.", "верхняя гр.", "шаг", "результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        lower_bound_ent.setToolTipText("введите нижнюю границу");
        lower_bound_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lower_bound_entActionPerformed(evt);
            }
        });

        step_ent.setToolTipText("введите шаг");

        upper_bound_ent.setToolTipText("введите верхнюю границу");
        upper_bound_ent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upper_bound_entActionPerformed(evt);
            }
        });

        Add_button.setText("добавить");
        Add_button.setToolTipText("добавляет введёные значения в таблицу");
        Add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("верхняя граница");

        jLabel2.setText("нижняя граница");

        jLabel3.setText(" шаг");
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        Calcul_button.setText("вычислить");
        Calcul_button.setToolTipText("вычисляет значение выбранной строки");
        Calcul_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calcul_buttonActionPerformed(evt);
            }
        });

        Delete_button.setText("удалить");
        Delete_button.setToolTipText("удаляет выбранную строку");
        Delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_buttonActionPerformed(evt);
            }
        });

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg"))); // NOI18N
        Logo.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Delete_button, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Calcul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lower_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(upper_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(step_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(step_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lower_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(upper_bound_ent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Add_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Calcul_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete_button, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lower_bound_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lower_bound_entActionPerformed

    }//GEN-LAST:event_lower_bound_entActionPerformed

////////////////////////////////////////////////////////////////////////////////////////////////////
    //ВЫЧИСЛЕНИЕ
    private void Calcul_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calcul_buttonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        double Lower_bound = 0, Upper_bound = 0,Step = 0, Res = 0;
        if(selectedRow!=-1)
        {
           Lower_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 0).toString());
           Upper_bound = Double.parseDouble(myTable.getValueAt(selectedRow, 1).toString());
           Step = Double.parseDouble(myTable.getValueAt(selectedRow, 2).toString());
        }
        
        for (double i = Lower_bound; i < Upper_bound; i=i+Step)
        {
            if(i+Step > Upper_bound)
            {
                Step = Upper_bound-i;
            }
           Res += Step * (Math.tan(i) + Math.tan(i+Step)) / 2;
        }
        myTable.setValueAt(Res, selectedRow, 3);
    }//GEN-LAST:event_Calcul_buttonActionPerformed

    //ДОБАВЛЕНИЕ
    private void Add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_buttonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)jTable1.getModel();
        myTable.insertRow(0, new Object[]{
            lower_bound_ent.getText(),
            upper_bound_ent.getText(),
            step_ent.getText(),
        });
    }//GEN-LAST:event_Add_buttonActionPerformed

    //УДАЛЕНИЕ
    private void Delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_buttonActionPerformed
        DefaultTableModel myTable=(DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow!=-1)
        {
        myTable.removeRow(selectedRow);
        }

    }//GEN-LAST:event_Delete_buttonActionPerformed
////////////////////////////////////////////////////////////////////////////////////////////////////
    
    private void upper_bound_entActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upper_bound_entActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_upper_bound_entActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        Collection<String> a;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_button;
    private javax.swing.JButton Calcul_button;
    private javax.swing.JButton Delete_button;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lower_bound_ent;
    private javax.swing.JTextField step_ent;
    private javax.swing.JTextField upper_bound_ent;
    // End of variables declaration//GEN-END:variables
}
