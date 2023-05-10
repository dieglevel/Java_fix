/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ql_xe;

import dao.Contract_DAO;
import dao.Customer_DAO;
import dao.Motobike_DAO;
import entity.Contract;
import entity.Customer;
import entity.Motobike;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ContractAdd extends javax.swing.JFrame {

    /**
     * Creates new form CustomerAdd
     */
    public ContractAdd() throws SQLException {
        this.customerADD = new CustomerAdd();
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2, size.height/2-getHeight()/2);
        disableTextField();
        loadFirstTimeAdd();
        customerADD.buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (evt.getSource().equals(customerADD.buttonAdd)){
                    if (customerADD.table.getSelectedRow() != -1 ){
                        txtCustomerID.setText(customerADD.table.getValueAt(customerADD.table.getSelectedRow(), 0).toString());
                        customerADD.dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Vui lòng chọn khách hàng");
                    }
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roboto1 = new efectos.Roboto();
        rSFotoSquareResizeBeanInfo1 = new rojerusan.RSFotoSquareResizeBeanInfo();
        head = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonAddCustomer = new javax.swing.JButton();
        buttonCancel = new javax.swing.JButton();
        panelNumberOfInstallments = new javax.swing.JPanel();
        txtNumberOfInstallments = new RoundJTextField(30);
        labelNumberOfInstallments = new javax.swing.JLabel();
        panelMethod = new javax.swing.JPanel();
        labelMethod = new javax.swing.JLabel();
        comboMethod = new javax.swing.JComboBox<>();
        panelDayContract = new javax.swing.JPanel();
        txtDayContract = new RoundJTextField(30);
        labelDayContract = new javax.swing.JLabel();
        panelEmployeeID = new javax.swing.JPanel();
        txtEmployeeID = new RoundJTextField(30);
        labelEmployeeID = new javax.swing.JLabel();
        panelCustomerID = new javax.swing.JPanel();
        txtCustomerID = new RoundJTextField(30);
        labelCustomerID = new javax.swing.JLabel();
        panelContractID = new javax.swing.JPanel();
        txtContractID = new RoundJTextField(30);
        labelContractID = new javax.swing.JLabel();
        panelMoneyToPay = new javax.swing.JPanel();
        txtMoneyToPay = new JTextField();
        labelMoneyToPay = new javax.swing.JLabel();
        panelVoucher = new javax.swing.JPanel();
        txtVoucher = new JTextField();
        labelVoucher = new javax.swing.JLabel();
        panelTotal = new javax.swing.JPanel();
        txtTotal =  new JTextField();
        labelTotal = new javax.swing.JLabel();
        scrollTable = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();
        jPanel2 = new javax.swing.JPanel();
        buttonAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        head.setBackground(new java.awt.Color(255, 255, 255));
        head.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HỢP ĐỒNG");
        head.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 930, 47));

        buttonAddCustomer.setBackground(new java.awt.Color(255, 255, 255));
        buttonAddCustomer.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonAddCustomer.setForeground(new java.awt.Color(0, 0, 0));
        buttonAddCustomer.setText("ĐÔNG Ý");
        buttonAddCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonAddCustomer.setIconTextGap(15);
        buttonAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonAddCustomer(evt);
            }
        });
        buttonAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddCustomerActionPerformed(evt);
            }
        });
        head.add(buttonAddCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 115, 30, -1));

        buttonCancel.setBackground(new java.awt.Color(255, 255, 255));
        buttonCancel.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonCancel.setForeground(new java.awt.Color(0, 0, 0));
        buttonCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-x-20.png"))); // NOI18N
        buttonCancel.setText("HỦY");
        buttonCancel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonCancel.setIconTextGap(15);
        buttonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelActionPerformed(evt);
            }
        });
        head.add(buttonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 770, 170, 50));

        panelNumberOfInstallments.setBackground(new java.awt.Color(255, 255, 255));
        panelNumberOfInstallments.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumberOfInstallments.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberOfInstallments.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtNumberOfInstallments.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumberOfInstallments.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtNumberOfInstallments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfInstallmentsActionPerformed(evt);
            }
        });
        panelNumberOfInstallments.add(txtNumberOfInstallments, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        labelNumberOfInstallments.setBackground(new java.awt.Color(255, 255, 255));
        labelNumberOfInstallments.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelNumberOfInstallments.setForeground(new java.awt.Color(0, 0, 0));
        labelNumberOfInstallments.setText("Số Lần Trả Góp:");
        panelNumberOfInstallments.add(labelNumberOfInstallments, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelNumberOfInstallments, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, 40));

        panelMethod.setBackground(new java.awt.Color(255, 255, 255));
        panelMethod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelMethod.setBackground(new java.awt.Color(255, 255, 255));
        labelMethod.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelMethod.setForeground(new java.awt.Color(0, 0, 0));
        labelMethod.setText("Phương Thức:");
        panelMethod.add(labelMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        comboMethod.setFont(new java.awt.Font("Bahnschrift", 1, 18));
        comboMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trả Hết", "Trả Góp"}));
        comboMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeFunction(evt);
            }
        });
        panelMethod.add(comboMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        head.add(panelMethod, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, -1, 40));

        panelDayContract.setBackground(new java.awt.Color(255, 255, 255));
        panelDayContract.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDayContract.setBackground(new java.awt.Color(255, 255, 255));
        txtDayContract.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtDayContract.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDayContract.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtDayContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDayContractActionPerformed(evt);
            }
        });
        panelDayContract.add(txtDayContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        labelDayContract.setBackground(new java.awt.Color(255, 255, 255));
        labelDayContract.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelDayContract.setForeground(new java.awt.Color(0, 0, 0));
        labelDayContract.setText("Ngày Hợp Đồng:");
        panelDayContract.add(labelDayContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelDayContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, -1, 40));

        panelEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        panelEmployeeID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtEmployeeID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmployeeID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });
        panelEmployeeID.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        labelEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        labelEmployeeID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        labelEmployeeID.setText("Mã Nhân Viên:");
        panelEmployeeID.add(labelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        panelCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        panelCustomerID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        txtCustomerID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtCustomerID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCustomerID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIDActionPerformed(evt);
            }
        });
        panelCustomerID.add(txtCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        labelCustomerID.setBackground(new java.awt.Color(255, 255, 255));
        labelCustomerID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelCustomerID.setForeground(new java.awt.Color(0, 0, 0));
        labelCustomerID.setText("Mã Khách Hàng:");
        panelCustomerID.add(labelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 40));

        panelContractID.setBackground(new java.awt.Color(255, 255, 255));
        panelContractID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtContractID.setBackground(new java.awt.Color(255, 255, 255));
        txtContractID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtContractID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtContractID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtContractID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContractIDActionPerformed(evt);
            }
        });
        panelContractID.add(txtContractID, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 260, 30));

        labelContractID.setBackground(new java.awt.Color(255, 255, 255));
        labelContractID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelContractID.setForeground(new java.awt.Color(0, 0, 0));
        labelContractID.setText("Mã Hợp Đồng:");
        panelContractID.add(labelContractID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelContractID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 40));

        panelMoneyToPay.setBackground(new java.awt.Color(255, 255, 255));
        panelMoneyToPay.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMoneyToPay.setBackground(new java.awt.Color(255, 255, 255));
        txtMoneyToPay.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtMoneyToPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtMoneyToPay.setBorder(null);
        txtMoneyToPay.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelMoneyToPay.add(txtMoneyToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 300, 30));

        labelMoneyToPay.setBackground(new java.awt.Color(255, 255, 255));
        labelMoneyToPay.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelMoneyToPay.setForeground(new java.awt.Color(0, 0, 0));
        labelMoneyToPay.setText("Tổng Số Tiền Cần Thanh Toán:");
        panelMoneyToPay.add(labelMoneyToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 30));

        head.add(panelMoneyToPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, -1, 50));

        panelVoucher.setBackground(new java.awt.Color(255, 255, 255));
        panelVoucher.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtVoucher.setBackground(new java.awt.Color(255, 255, 255));
        txtVoucher.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtVoucher.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtVoucher.setBorder(null);
        txtVoucher.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtVoucher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVoucherActionPerformed(evt);
            }
        });
        panelVoucher.add(txtVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 300, 30));

        labelVoucher.setBackground(new java.awt.Color(255, 255, 255));
        labelVoucher.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelVoucher.setForeground(new java.awt.Color(0, 0, 0));
        labelVoucher.setText("Giảm Giá:");
        panelVoucher.add(labelVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelVoucher, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, 40));

        panelTotal.setBackground(new java.awt.Color(255, 255, 255));
        panelTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtTotal.setFont(new java.awt.Font("Bookman Old Style", 0, 24)); // NOI18N
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTotal.setBorder(null);
        txtTotal.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        panelTotal.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 300, 30));

        labelTotal.setBackground(new java.awt.Color(255, 255, 255));
        labelTotal.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelTotal.setForeground(new java.awt.Color(0, 0, 0));
        labelTotal.setText("Tổng Tiền:");
        panelTotal.add(labelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 30));

        head.add(panelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, 40));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));
        scrollTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ád", "ád", "ád"},
                {"áđá", "ád", "ád"},
                {"áđá", "d", "ád"},
                {"áđá", "áđá", "áđá"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        table.setColorBackgoundHead(new java.awt.Color(102, 102, 102));
        table.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        table.setColorBordeHead(new java.awt.Color(255, 255, 255));
        table.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        table.setColorFilasForeground1(new java.awt.Color(0, 0, 0));
        table.setColorFilasForeground2(new java.awt.Color(0, 0, 0));
        table.setColorSelBackgound(new java.awt.Color(51, 51, 51));
        table.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        table.setFuenteFilas(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        table.setFuenteHead(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setGridColor(new java.awt.Color(0, 0, 0));
        table.setRowHeight(25);
        table.setSelectionBackground(new java.awt.Color(255, 255, 255));
        table.setShowGrid(false);
        table.setShowVerticalLines(true);
        table.setSurrendersFocusOnKeystroke(true);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableChange(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tableChange(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tableChange(evt);
            }
        });
        scrollTable.setViewportView(table);
        model = new DefaultTableModel(new String[] {"Mã Xe", "Số Lượng","Số Tiền"},0);

        table.setModel(model);

        head.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 930, 260));

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        head.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 910, -1));

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-done-20.png"))); // NOI18N
        buttonAdd.setText("ĐÔNG Ý");
        buttonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonAdd.setIconTextGap(15);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        head.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 770, 170, 50));

        getContentPane().add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddCustomerActionPerformed

    private void buttonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelActionPerformed

    private void txtContractIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContractIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContractIDActionPerformed

    private void txtCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerIDActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtDayContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDayContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDayContractActionPerformed

    private void txtNumberOfInstallmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfInstallmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfInstallmentsActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
        String voucherFloat = String.valueOf(txtVoucher.getText().trim().replace("%", ""));
        entity.Contract temp = new Contract(Integer.valueOf(txtContractID.getText()), 
                Integer.valueOf(txtCustomerID.getText()), 
                LocalDate.parse(txtDayContract.getText(), DateTimeFormatter.ofPattern("d-M-yyyy")),
                Integer.valueOf(txtEmployeeID.getText()),
                Double.valueOf(txtMoneyToPay.getText()),
                Float.valueOf(voucherFloat),
                Double.valueOf("0"),
                Integer.valueOf(txtNumberOfInstallments.getText()),
                String.valueOf(comboMethod.getSelectedItem()));
        try {
            contractDao.addContract(temp);
            
        } catch (SQLException ex) {
            Logger.getLogger(ContractAdd.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonAddCustomer(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddCustomer

        customerADD.setVisible(true);
    }//GEN-LAST:event_buttonAddCustomer

    private void changeFunction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeFunction
        // TODO add your handling code here:
        if (evt.getSource().equals(comboMethod)){
            System.out.println("ql_xe.ContractAdd.changeFunction()");
            if (comboMethod.getSelectedIndex() == 1){
                txtNumberOfInstallments.setEnabled(true);
                txtNumberOfInstallments.setBackground(Color.white);
                txtNumberOfInstallments.setText("");
            }
            else{
                txtNumberOfInstallments.setEnabled(false);
                txtNumberOfInstallments.setBackground(Color.getHSBColor(0f, 0f,0.79f));
                txtNumberOfInstallments.setText("1");
            }
        }
    }//GEN-LAST:event_changeFunction

    private void tableChange(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableChange
        // TODO add your handling code here:
        if (evt.getSource().equals(table)){
            double totalMoney = 0;
            int totalMotobike = 0;
            int voucher = 0;
            for (int i = 0 ; i < table.getRowCount(); i++){
                totalMoney += Double.valueOf(String.valueOf(table.getValueAt(i, 1))) * Double.valueOf(String.valueOf(table.getValueAt(i, 2)));
                totalMotobike += Integer.valueOf(String.valueOf(table.getValueAt(i, 1)));
            }
            txtTotal.setText(String.format("%.3f", totalMoney));
            if (totalMotobike >=3){
                voucher +=5;
            }
            if (txtNumberOfInstallments.getText().equals("1")){
                voucher +=2;
            }
            txtVoucher.setText(String.valueOf(voucher+"%"));
            txtMoneyToPay.setText(String.format("%.3f", Double.valueOf(totalMoney * ((voucher*1.0)/100))));
        }
    }//GEN-LAST:event_tableChange

    private void txtVoucherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVoucherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVoucherActionPerformed

    
    
    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddCustomer;
    private javax.swing.JButton buttonCancel;
    private javax.swing.JComboBox<String> comboMethod;
    private javax.swing.JPanel head;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelContractID;
    private javax.swing.JLabel labelCustomerID;
    private javax.swing.JLabel labelDayContract;
    private javax.swing.JLabel labelEmployeeID;
    private javax.swing.JLabel labelMethod;
    private javax.swing.JLabel labelMoneyToPay;
    private javax.swing.JLabel labelNumberOfInstallments;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JLabel labelVoucher;
    private javax.swing.JPanel panelContractID;
    private javax.swing.JPanel panelCustomerID;
    private javax.swing.JPanel panelDayContract;
    private javax.swing.JPanel panelEmployeeID;
    private javax.swing.JPanel panelMethod;
    private javax.swing.JPanel panelMoneyToPay;
    private javax.swing.JPanel panelNumberOfInstallments;
    private javax.swing.JPanel panelTotal;
    private javax.swing.JPanel panelVoucher;
    private rojerusan.RSFotoSquareResizeBeanInfo rSFotoSquareResizeBeanInfo1;
    private efectos.Roboto roboto1;
    private javax.swing.JScrollPane scrollTable;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JTextField txtContractID;
    private javax.swing.JTextField txtCustomerID;
    private javax.swing.JTextField txtDayContract;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtMoneyToPay;
    private javax.swing.JTextField txtNumberOfInstallments;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtVoucher;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private CustomerAdd customerADD;
    private dao.Contract_DAO contractDao = new Contract_DAO();

    public class RoundJTextField extends JTextField {
        private Shape shape;
        public RoundJTextField(int size) {
            super(size);
            setOpaque(false); // As suggested by @AVD in comment.
        }
        protected void paintComponent(Graphics g) {
             g.setColor(getBackground());
             g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
             super.paintComponent(g);
        }
        protected void paintBorder(Graphics g) {
             g.setColor(Color.BLACK);
             g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 15, 15);
        }
        public boolean contains(int x, int y) {
             if (shape == null || !shape.getBounds().equals(getBounds())) {
                 shape = new RoundRectangle2D.Float(0, 0, getWidth()-1, getHeight()-1, 15, 15);
             }
             return shape.contains(x, y);
        }
    }
    
    
    public void loadFirstTimeAdd() throws SQLException{
        txtContractID.setText(String.valueOf(contractDao.getLastID()));
        txtEmployeeID.setText(String.valueOf(GUI.employeeID));
        txtDayContract.setText(String.valueOf( LocalDate.now().format(DateTimeFormatter.ofPattern("d-M-yyyy"))));
        txtNumberOfInstallments.setText(String.valueOf(1));
        dao.Motobike_DAO dao = new Motobike_DAO();
        ArrayList<entity.Motobike> temp = dao.getAllMotobike();
        for (Motobike motobike : temp) {
            model.addRow(new String[] {String.valueOf(motobike.getMotobikeID()),"0", String.format("%.0f", motobike.getMoney())});
        }
        txtTotal.setText("0");
        txtTotal.setBackground(Color.white);
        txtVoucher.setBackground(Color.white);
        txtMoneyToPay.setBackground(Color.white);
       
    }
    
    
    public void disableTextField (){
        txtContractID.setEnabled(false);
        txtCustomerID.setEnabled(false);
        txtDayContract.setEnabled(false);
        txtEmployeeID.setEnabled(false);
        txtMoneyToPay.setEnabled(false);
        txtNumberOfInstallments.setEnabled(false);
        txtTotal.setEnabled(false);
        txtVoucher.setEnabled(false);
        
        
        
        txtContractID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtCustomerID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtDayContract.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtEmployeeID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtMoneyToPay.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtNumberOfInstallments.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtTotal.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        txtVoucher.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    }
    
    public void enableTextField (){
        txtContractID.setEnabled(true);
        txtCustomerID.setEnabled(true);
        txtDayContract.setEnabled(true);
        txtEmployeeID.setEnabled(true);
        txtMoneyToPay.setEnabled(true);
        txtNumberOfInstallments.setEnabled(true);
        txtTotal.setEnabled(true);
        txtVoucher.setEnabled(true);
        
        
        
        txtContractID.setBackground(Color.white);
        txtCustomerID.setBackground(Color.white);
        txtDayContract.setBackground(Color.white);
        txtEmployeeID.setBackground(Color.white);
        txtMoneyToPay.setBackground(Color.white);
        txtNumberOfInstallments.setBackground(Color.white);
        txtTotal.setBackground(Color.white);
        txtVoucher.setBackground(Color.white);
    }
    
    
    

    
    
}
