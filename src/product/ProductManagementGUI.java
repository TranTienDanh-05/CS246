/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package productmanagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import product.Product;
public class ProductManagementGUI extends javax.swing.JFrame {

    private List<Product> productList; // Danh sách sản phẩm
    private JTable productTable; // Bảng hiển thị sản phẩm
    private DefaultTableModel tableModel; // Model cho bảng
    private JTextField idField, nameField, priceField; // Các trường nhập liệu.
    
    public ProductManagementGUI() {
        // Khởi tạo danh sách sản phẩm
        productList = new ArrayList<>();

        // Thiết lập giao diện chính
        setTitle("Product Management System");
        setSize(746, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Căn giữa màn hình

        // Tạo bảng hiển thị sản phẩm
        createProductTable();

        // Tạo panel nhập liệu
        JPanel inputPanel = createInputPanel();

        // Tạo panel chứa các nút
        JPanel buttonPanel = createButtonPanel();

        // Thêm các thành phần vào giao diện chính
        add(new JScrollPane(productTable), BorderLayout.CENTER);
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // Tạo bảng hiển thị sản phẩm
    private void createProductTable() {
        String[] columnNames = {"ID San Pham", "Ten San Pham", "Gia"};
        tableModel = new DefaultTableModel(columnNames, 0);
        productTable = new JTable(tableModel);
    }

    // Tạo panel chứa các trường nhập liệu
    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Tạo các nhãn và trường nhập liệu
        panel.add(new JLabel("ID San Pham:"));
        idField = new JTextField();
        panel.add(idField);

        panel.add(new JLabel("Ten San Pham:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Gia:"));
        priceField = new JTextField();
        panel.add(priceField);

        return panel;
    }

    // Tạo panel chứa các nút chức năng
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        JButton addButton = new JButton("Them");
        JButton updateButton = new JButton("Cap nhat");
        JButton deleteButton = new JButton("Xoa");
        JButton exitButton = new JButton("Thoat");

        // Thêm hành động cho các nút
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addProduct();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateProduct();
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteProduct();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Thêm các nút vào panel
        panel.add(addButton);
        panel.add(updateButton);
        panel.add(deleteButton);
        panel.add(exitButton);

        return panel;
    }

    // Chức năng thêm sản phẩm
    private void addProduct() {
        try {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());

            // Kiểm tra ID đã tồn tại chưa
            for (Product p : productList) {
                if (p.getProductId().equals(id)) {
                    JOptionPane.showMessageDialog(this, "Product ID already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            // Tạo sản phẩm mới và thêm vào danh sách
            Product product = new Product(id, name, price);
            productList.add(product);

            // Thêm vào bảng
            tableModel.addRow(new Object[]{id, name, price});

            // Xóa nội dung các trường nhập liệu
            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dinh dang gia khong hop le!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Chức năng sửa sản phẩm
    private void updateProduct() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui long chon san pham de nhap!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String id = idField.getText().trim();
            String name = nameField.getText().trim();
            double price = Double.parseDouble(priceField.getText().trim());

            // Cập nhật danh sách sản phẩm
            productList.get(selectedRow).setPrice(price);

            // Cập nhật bảng
            tableModel.setValueAt(id, selectedRow, 0);
            tableModel.setValueAt(name, selectedRow, 1);
            tableModel.setValueAt(price, selectedRow, 2);

            // Xóa nội dung các trường nhập liệu
            clearFields();
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Dinh dang gia khong hop le!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Chức năng xóa sản phẩm
    private void deleteProduct() {
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui long chon san pham de xoa!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Xóa sản phẩm khỏi danh sách
        productList.remove(selectedRow);

        // Xóa hàng khỏi bảng
        tableModel.removeRow(selectedRow);

        // Xóa nội dung các trường nhập liệu
        clearFields();
    }

    // Xóa nội dung các trường nhập liệu
    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        priceField.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ProductManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductManagementGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductManagementGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
