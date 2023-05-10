/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ql_xe;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.Motobike_DAO;
import entity.Motobike;


/**
 *
 * @author Admin
 */
public class MotobikeGUI extends javax.swing.JPanel implements ActionListener {

    /**
     * Creates new form ..
     * @throws SQLException 
     */
    public MotobikeGUI() throws SQLException {
        initComponents();       
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        panelMotobikeID = new javax.swing.JPanel();
        txtMotobikeID = new RoundJTextField(30);
        labelMotobikeID = new javax.swing.JLabel();
        panelCountryOfmanufacture = new javax.swing.JPanel();
        txtCountryOfmanufacture = new RoundJTextField(30);
        labelCountryOfmanufacture = new javax.swing.JLabel();
        panelRangeOfVehicle = new javax.swing.JPanel();
        txtRangeOfVehicle = new RoundJTextField(30);
        labelRangeOfVehicle = new javax.swing.JLabel();
        panelCubic = new javax.swing.JPanel();
        txtCubic = new RoundJTextField(30);
        labelCubic = new javax.swing.JLabel();
        panelTheFrameOfTheMachine = new javax.swing.JPanel();
        txtTheFrameOfTheMachine = new RoundJTextField(30);
        labelTheFrameOfTheMachine = new javax.swing.JLabel();
        panelNumberOfRibs = new javax.swing.JPanel();
        txtNumberOfRibs = new RoundJTextField(30);
        labelNumberOfRibs = new javax.swing.JLabel();
        panelColor = new javax.swing.JPanel();
        txtColor = new RoundJTextField(30);
        labelColor = new javax.swing.JLabel();
        panelMoney = new javax.swing.JPanel();
        txtMoney = new RoundJTextField(30);
        labelMoney = new javax.swing.JLabel();
        panelWarrantyPeriod = new javax.swing.JPanel();
        labelWarrantyPeriod = new javax.swing.JLabel();
        comboWarrantyPeriod = new javax.swing.JComboBox<>();
        buttonAdd = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonUpdate = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();

        setPreferredSize(new java.awt.Dimension(1580, 770));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("QUẢN LÝ XE");
        Main.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1580, 60));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Header.setPreferredSize(new java.awt.Dimension(1580, 770));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMotobikeID.setBackground(new java.awt.Color(255, 255, 255));
        panelMotobikeID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMotobikeID.setBackground(new java.awt.Color(255, 255, 255));
        txtMotobikeID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtMotobikeID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMotobikeID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtMotobikeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotobikeIDActionPerformed(evt);
            }
        });
        panelMotobikeID.add(txtMotobikeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));

        labelMotobikeID.setBackground(new java.awt.Color(255, 255, 255));
        labelMotobikeID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelMotobikeID.setForeground(new java.awt.Color(0, 0, 0));
        labelMotobikeID.setText("Mã Xe:");
        panelMotobikeID.add(labelMotobikeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        Header.add(panelMotobikeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 40));

        panelCountryOfmanufacture.setBackground(new java.awt.Color(255, 255, 255));
        panelCountryOfmanufacture.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCountryOfmanufacture.setBackground(new java.awt.Color(255, 255, 255));
        txtCountryOfmanufacture.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtCountryOfmanufacture.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCountryOfmanufacture.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCountryOfmanufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryOfmanufactureActionPerformed(evt);
            }
        });
        panelCountryOfmanufacture.add(txtCountryOfmanufacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));

        labelCountryOfmanufacture.setBackground(new java.awt.Color(255, 255, 255));
        labelCountryOfmanufacture.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelCountryOfmanufacture.setForeground(new java.awt.Color(0, 0, 0));
        labelCountryOfmanufacture.setText("Nước Sản Xuất:");
        panelCountryOfmanufacture.add(labelCountryOfmanufacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelCountryOfmanufacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 410, 40));

        panelRangeOfVehicle.setBackground(new java.awt.Color(255, 255, 255));
        panelRangeOfVehicle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRangeOfVehicle.setBackground(new java.awt.Color(255, 255, 255));
        txtRangeOfVehicle.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtRangeOfVehicle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRangeOfVehicle.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtRangeOfVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRangeOfVehicleActionPerformed(evt);
            }
        });
        panelRangeOfVehicle.add(txtRangeOfVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));

        labelRangeOfVehicle.setBackground(new java.awt.Color(255, 255, 255));
        labelRangeOfVehicle.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelRangeOfVehicle.setForeground(new java.awt.Color(0, 0, 0));
        labelRangeOfVehicle.setText("Loại Xe:");
        panelRangeOfVehicle.add(labelRangeOfVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelRangeOfVehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 410, 40));

        panelCubic.setBackground(new java.awt.Color(255, 255, 255));
        panelCubic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCubic.setBackground(new java.awt.Color(255, 255, 255));
        txtCubic.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtCubic.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCubic.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCubic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCubicActionPerformed(evt);
            }
        });
        panelCubic.add(txtCubic, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));

        labelCubic.setBackground(new java.awt.Color(255, 255, 255));
        labelCubic.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelCubic.setForeground(new java.awt.Color(0, 0, 0));
        labelCubic.setText("Số Phân Khối:");
        panelCubic.add(labelCubic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelCubic, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 410, 40));

        panelTheFrameOfTheMachine.setBackground(new java.awt.Color(255, 255, 255));
        panelTheFrameOfTheMachine.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTheFrameOfTheMachine.setBackground(new java.awt.Color(255, 255, 255));
        txtTheFrameOfTheMachine.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtTheFrameOfTheMachine.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTheFrameOfTheMachine.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtTheFrameOfTheMachine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTheFrameOfTheMachineActionPerformed(evt);
            }
        });
        panelTheFrameOfTheMachine.add(txtTheFrameOfTheMachine, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));

        labelTheFrameOfTheMachine.setBackground(new java.awt.Color(255, 255, 255));
        labelTheFrameOfTheMachine.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelTheFrameOfTheMachine.setForeground(new java.awt.Color(0, 0, 0));
        labelTheFrameOfTheMachine.setText("Số Khung:");
        panelTheFrameOfTheMachine.add(labelTheFrameOfTheMachine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelTheFrameOfTheMachine, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, 40));

        panelNumberOfRibs.setBackground(new java.awt.Color(255, 255, 255));
        panelNumberOfRibs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumberOfRibs.setBackground(new java.awt.Color(255, 255, 255));
        txtNumberOfRibs.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtNumberOfRibs.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNumberOfRibs.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtNumberOfRibs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberOfRibsActionPerformed(evt);
            }
        });
        panelNumberOfRibs.add(txtNumberOfRibs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 270, 30));
        txtNumberOfRibs.getAccessibleContext().setAccessibleDescription("");

        labelNumberOfRibs.setBackground(new java.awt.Color(255, 255, 255));
        labelNumberOfRibs.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelNumberOfRibs.setForeground(new java.awt.Color(0, 0, 0));
        labelNumberOfRibs.setText("Số Sườn:");
        panelNumberOfRibs.add(labelNumberOfRibs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelNumberOfRibs, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 410, 40));

        panelColor.setBackground(new java.awt.Color(255, 255, 255));
        panelColor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtColor.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });
        panelColor.add(txtColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 270, 30));

        labelColor.setBackground(new java.awt.Color(255, 255, 255));
        labelColor.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelColor.setForeground(new java.awt.Color(0, 0, 0));
        labelColor.setText("Màu Xe:");
        panelColor.add(labelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, 40));

        panelMoney.setBackground(new java.awt.Color(255, 255, 255));
        panelMoney.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMoney.setBackground(new java.awt.Color(255, 255, 255));
        txtMoney.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtMoney.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtMoney.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoneyActionPerformed(evt);
            }
        });
        panelMoney.add(txtMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 270, 30));

        labelMoney.setBackground(new java.awt.Color(255, 255, 255));
        labelMoney.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelMoney.setForeground(new java.awt.Color(0, 0, 0));
        labelMoney.setText("Giá Tiền:");
        panelMoney.add(labelMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 100, 460, 40));

        panelWarrantyPeriod.setBackground(new java.awt.Color(255, 255, 255));
        panelWarrantyPeriod.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWarrantyPeriod.setBackground(new java.awt.Color(255, 255, 255));
        labelWarrantyPeriod.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelWarrantyPeriod.setForeground(new java.awt.Color(0, 0, 0));
        labelWarrantyPeriod.setText("Thời gian bảo hành:");
        panelWarrantyPeriod.add(labelWarrantyPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        comboWarrantyPeriod.setFont(new java.awt.Font("Bahnschrift", 1, 18));
        comboWarrantyPeriod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"6 Tháng", "12 Tháng", "36 Tháng"}));
        comboWarrantyPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboWarrantyPeriodActionPerformed(evt);
            }
        });
        panelWarrantyPeriod.add(comboWarrantyPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 270, 30));

        Header.add(panelWarrantyPeriod, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 460, 40));

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-50 (2) (2).png"))); // NOI18N
        buttonAdd.setText("THÊM");
        buttonAdd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonAdd.setIconTextGap(15);
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        Header.add(buttonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 40, 140, 40));

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-20.png"))); // NOI18N
        buttonDelete.setText("XÓA");
        buttonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonDelete.setIconTextGap(15);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        Header.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 90, 140, 40));

        buttonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-write-20.png"))); // NOI18N
        buttonUpdate.setText("SỬA");
        buttonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonUpdate.setIconTextGap(15);
        buttonUpdate.setOpaque(false);
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateActionPerformed(evt);
            }
        });
        Header.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 140, 140, 40));

        buttonSearch.setBackground(new java.awt.Color(255, 255, 255));
        buttonSearch.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonSearch.setForeground(new java.awt.Color(0, 0, 0));
        buttonSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-search-20.png"))); // NOI18N
        buttonSearch.setText("TÌM");
        buttonSearch.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonSearch.setIconTextGap(15);
        buttonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchActionPerformed(evt);
            }
        });
        Header.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 190, 140, 40));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1560, 251));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));
        scrollTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        scrollTable.setEnabled(false);
        scrollTable.setOpaque(false);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.MatteBorder(null));
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
        scrollTable.setViewportView(table);
        model = new DefaultTableModel(new String[] {"Mã Xe", "Nước Sản Xuất", "Loại Xe", "Số Phân Khúc", "Số Khung", "Số Sườn", "Màu Xe", "Giá Tiền","Thời Gian Bảo Hành"},0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(model);

        Main.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 308, 1560, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Main, javax.swing.GroupLayout.PREFERRED_SIZE, 1584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCountryOfmanufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryOfmanufactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryOfmanufactureActionPerformed

    private void txtMotobikeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotobikeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotobikeIDActionPerformed

    private void txtRangeOfVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRangeOfVehicleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRangeOfVehicleActionPerformed

    private void txtCubicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCubicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCubicActionPerformed

    private void txtTheFrameOfTheMachineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTheFrameOfTheMachineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTheFrameOfTheMachineActionPerformed

    private void txtNumberOfRibsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberOfRibsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberOfRibsActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSearchActionPerformed

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateActionPerformed

    private void txtMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoneyActionPerformed

    private void comboWarrantyPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboWarrantyPeriodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboWarrantyPeriodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> comboWarrantyPeriod;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelCountryOfmanufacture;
    private javax.swing.JLabel labelCubic;
    private javax.swing.JLabel labelMoney;
    private javax.swing.JLabel labelMotobikeID;
    private javax.swing.JLabel labelNumberOfRibs;
    private javax.swing.JLabel labelRangeOfVehicle;
    private javax.swing.JLabel labelTheFrameOfTheMachine;
    private javax.swing.JLabel labelWarrantyPeriod;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPanel panelCountryOfmanufacture;
    private javax.swing.JPanel panelCubic;
    private javax.swing.JPanel panelMoney;
    private javax.swing.JPanel panelMotobikeID;
    private javax.swing.JPanel panelNumberOfRibs;
    private javax.swing.JPanel panelRangeOfVehicle;
    private javax.swing.JPanel panelTheFrameOfTheMachine;
    private javax.swing.JPanel panelWarrantyPeriod;
    private javax.swing.JScrollPane scrollTable;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtCountryOfmanufacture;
    private javax.swing.JTextField txtCubic;
    private javax.swing.JTextField txtMoney;
    private javax.swing.JTextField txtMotobikeID;
    private javax.swing.JTextField txtNumberOfRibs;
    private javax.swing.JTextField txtRangeOfVehicle;
    private javax.swing.JTextField txtTheFrameOfTheMachine;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private ArrayList<Motobike> data;
    
    
    
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
    
    
    //METHOD !IMPORTANT
    public void loadData() throws SQLException {
    	Motobike_DAO dao = new Motobike_DAO();
    	data = dao.getAllMotobike();
    	for (Motobike motobike : data) {
			System.out.println(motobike.toString());
		}
    	loadTable();
    }
    
    public void loadTable() {
    	model.setRowCount(0);
    	table.clearSelection();
    	for (Motobike motobike : data) {
			model.addRow(new String[] {String.valueOf(motobike.getMotobikeID()),
										motobike.getCountryOfmanufacture(),
										motobike.getRangeOfVehicle(),
										String.valueOf(motobike.getCubic()),
										motobike.getTheFrameOfTheMachine(),
										motobike.getNumberOfRibs(),
										motobike.getColor(),
										String.valueOf(motobike.getMoney()),
										motobike.getWarrantyPeriod()
			});

		}
    }
    
    // set all textField null
    public void setNullTextField() {
		txtMotobikeID.setText("");
		txtMotobikeID.requestFocus();
		txtWarrantyPeriod.setText("");
		txtColor.setText("");
		txtNumberOfRibs.setText("");
		txtTheFrameOfTheMachine.setText("");
		txtCubic.setText("");
		txtRangeOfVehicle.setText("");
		txtCountryOfmanufacture.setText("");
	}
    
	public void disableTextField() {
		txtMotobikeID.setEnabled(false);
		txtWarrantyPeriod.setEnabled(false);
		txtColor.setEnabled(false);
		txtNumberOfRibs.setEnabled(false);
		txtTheFrameOfTheMachine.setEnabled(false);
		txtCubic.setEnabled(false);
		txtRangeOfVehicle.setEnabled(false);
		txtCountryOfmanufacture.setEnabled(false);
		// set disable color
		txtMotobikeID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtWarrantyPeriod.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtColor.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtNumberOfRibs.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtTheFrameOfTheMachine.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtCubic.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtRangeOfVehicle.setBackground(Color.getHSBColor(0f, 0f,0.79f));
		txtCountryOfmanufacture.setBackground(Color.getHSBColor(0f, 0f,0.79f));
	}
	
	
	
    //set all textField enable
	public void enableTextField() {
		txtMotobikeID.setEnabled(true);
		txtWarrantyPeriod.setEnabled(true);
		txtColor.setEnabled(true);
		txtNumberOfRibs.setEnabled(true);
		txtTheFrameOfTheMachine.setEnabled(true);
		txtCubic.setEnabled(true);
		txtRangeOfVehicle.setEnabled(true);
		txtCountryOfmanufacture.setEnabled(true);
		// set enable color
		txtMotobikeID.setBackground(Color.WHITE);
		txtWarrantyPeriod.setBackground(Color.WHITE);
		txtColor.setBackground(Color.WHITE);
		txtNumberOfRibs.setBackground(Color.WHITE);
		txtTheFrameOfTheMachine.setBackground(Color.WHITE);
		txtCubic.setBackground(Color.WHITE);
		txtRangeOfVehicle.setBackground(Color.WHITE);
		txtCountryOfmanufacture.setBackground(Color.WHITE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(buttonAdd.equals("THÊM"))) {
				enableTextField();
				txtMotobikeID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
				txtCountryOfmanufacture.requestFocus();
				txtMotobikeID.setEditable(false);
				
				buttonAdd.setText("LƯU");
				buttonDelete.setText("HỦY");
				buttonSearch.setVisible(false);
				buttonUpdate.setVisible(false);
            }
		
                else if(o.equals(buttonDelete.getText().equals("HỦY"))) {
				setNullTextField();txtCountryOfmanufacture.requestFocus();
				disableTextField();
				buttonAdd.setText("THÊM");
				buttonDelete.setText("XÓA");
				buttonSearch.setVisible(true);
				buttonUpdate.setVisible(true);
		}
		
	}


}