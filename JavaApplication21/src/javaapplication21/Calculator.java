/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication21;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Calculator
     */
    public Calculator() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jbcong = new javax.swing.JButton();
        jbtru = new javax.swing.JButton();
        jbnhan = new javax.swing.JButton();
        jbchia = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSo2 = new javax.swing.JTextField();
        txtSo1 = new javax.swing.JTextField();
        txtKetQua = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbcong.setText("Cộng");
        jbcong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcongActionPerformed(evt);
            }
        });

        jbtru.setText("Trừ");
        jbtru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtruActionPerformed(evt);
            }
        });

        jbnhan.setText("Nhân");
        jbnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnhanActionPerformed(evt);
            }
        });

        jbchia.setText("Chia");
        jbchia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbchiaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nhập số thứ nhất");

        jLabel2.setText("Nhập số thứ hai");

        txtSo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSo2ActionPerformed(evt);
            }
        });

        txtSo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSo1ActionPerformed(evt);
            }
        });

        txtKetQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKetQuaActionPerformed(evt);
            }
        });

        jLabel3.setText("kết quả");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbcong)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSo2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtru)
                                .addGap(53, 53, 53))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSo1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbnhan)
                                .addGap(65, 65, 65)
                                .addComponent(jbchia))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbcong)
                    .addComponent(jbtru)
                    .addComponent(jbnhan)
                    .addComponent(jbchia))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbcongActionPerformed
       try{ // TODO add your handling code here:try {
        // Lấy giá trị từ các trường nhập liệu
        String so1Str = txtSo1.getText();
        String so2Str = txtSo2.getText();

        // Chuyển đổi chuỗi thành số nguyên
        int so1 = Integer.parseInt(so1Str);
        int so2 = Integer.parseInt(so2Str);

        // Tính tổng
        int ketQua = so1 + so2;

        // Hiển thị kết quả
        txtKetQua.setText(String.valueOf(ketQua));
    } catch (NumberFormatException e) {
        // Hiển thị thông báo lỗi nếu không phải là số nguyên
        JOptionPane.showMessageDialog(this, "Thông báo lỗi", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbcongActionPerformed

    private void txtSo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSo2ActionPerformed

    private void txtSo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSo1ActionPerformed

    private void txtKetQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKetQuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKetQuaActionPerformed

    private void jbtruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtruActionPerformed
    try{ // TODO add your handling code here:try {
        // Lấy giá trị từ các trường nhập liệu
        String so1Str = txtSo1.getText();
        String so2Str = txtSo2.getText();

        // Chuyển đổi chuỗi thành số nguyên
        int so1 = Integer.parseInt(so1Str);
        int so2 = Integer.parseInt(so2Str);

        // Tính trừ
        int ketQua = so1 - so2;

        // Hiển thị kết quả
        txtKetQua.setText(String.valueOf(ketQua));
    } catch (NumberFormatException e) {
        // Hiển thị thông báo lỗi nếu không phải là số nguyên
        JOptionPane.showMessageDialog(this, "Thông báo lỗi", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbtruActionPerformed

    private void jbnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnhanActionPerformed
    // TODO add your handling code here:try {
        // Lấy giá trị từ các trường nhập liệu
        try{String so1Str = txtSo1.getText();
        String so2Str = txtSo2.getText();

        // Chuyển đổi chuỗi thành số nguyên
        int so1 = Integer.parseInt(so1Str);
        int so2 = Integer.parseInt(so2Str);

        // Tính chia
        int ketQua = so1 / so2;

        // Hiển thị kết quả
        txtKetQua.setText(String.valueOf(ketQua));
    } catch (NumberFormatException e) {
        // Hiển thị thông báo lỗi nếu không phải là số nguyên
        JOptionPane.showMessageDialog(this, "Thông báo lỗi", "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_jbnhanActionPerformed

    private void jbchiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbchiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbchiaActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton jbchia;
    private javax.swing.JButton jbcong;
    private javax.swing.JButton jbnhan;
    private javax.swing.JButton jbtru;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JTextField txtKetQua;
    private javax.swing.JTextField txtSo1;
    private javax.swing.JTextField txtSo2;
    // End of variables declaration//GEN-END:variables
}
