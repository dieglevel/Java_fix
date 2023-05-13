/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ql_xe;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.Employee_DAO;
import dao.Motobike_DAO;
import entity.AdministrationEmp;
import entity.Employee;
import entity.Motobike;
import entity.TechnicalEmp;
import entity.Warranty;

/**
 *
 * @author Admin
 */
public class EmployeeGUI extends javax.swing.JPanel implements MouseListener{

    /**
     * Creates new form ..
     * @throws SQLException 
     */
    public EmployeeGUI() throws SQLException {
        initComponents();
        loadData();   
        setEditFalse();
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
        panelEmployeeID = new javax.swing.JPanel();
        txtEmployeeID = new RoundJTextField(30);
        labelEmployeeID = new javax.swing.JLabel();
        panelName = new javax.swing.JPanel();
        txtName = new RoundJTextField(30);
        labelName = new javax.swing.JLabel();
        panelWarrantyDate = new javax.swing.JPanel();
        labelWarrantyDate = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        panelDepartment = new javax.swing.JPanel();
        txtDepartment = new RoundJTextField(30);
        labelDepartment = new javax.swing.JLabel();
        panelAcademicLevel = new javax.swing.JPanel();
        txtAcademicLevel = new RoundJTextField(30);
        labelAcademicLevel = new javax.swing.JLabel();
        buttonUpdate = new javax.swing.JButton();
        buttonSearch = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonAdd1 = new javax.swing.JButton();
        scrollTable = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();

        setPreferredSize(new java.awt.Dimension(1580, 770));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("QUẢN LÝ NHÂN VIÊN");
        Main.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1580, 60));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Header.setPreferredSize(new java.awt.Dimension(1580, 770));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        panelEmployeeID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        txtEmployeeID.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        txtEmployeeID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmployeeID.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });
        panelEmployeeID.add(txtEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
        labelEmployeeID.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelEmployeeID.setForeground(new java.awt.Color(0, 0, 0));
        labelEmployeeID.setText("Mã Nhân Viên:");
        panelEmployeeID.add(labelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 30));

        Header.add(panelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 480, 40));

        panelName.setBackground(new java.awt.Color(255, 255, 255));
        panelName.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtName.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        panelName.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelName.setBackground(new java.awt.Color(255, 255, 255));
        labelName.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Tên Nhân Viên:");
        panelName.add(labelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 480, 40));

        panelWarrantyDate.setBackground(new java.awt.Color(255, 255, 255));
        panelWarrantyDate.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelWarrantyDate.setBackground(new java.awt.Color(255, 255, 255));
        labelWarrantyDate.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelWarrantyDate.setForeground(new java.awt.Color(0, 0, 0));
        labelWarrantyDate.setText("Chức Vụ:");
        panelWarrantyDate.add(labelWarrantyDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        jComboBox1.setFont(new java.awt.Font("Bahnschrift", 1, 18));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên Hành Chính", "Nhân Viên Kĩ Thuật"}));
        panelWarrantyDate.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        Header.add(panelWarrantyDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 480, 40));

        panelDepartment.setBackground(new java.awt.Color(255, 255, 255));
        panelDepartment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDepartment.setBackground(new java.awt.Color(255, 255, 255));
        txtDepartment.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtDepartment.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDepartment.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartmentActionPerformed(evt);
            }
        });
        panelDepartment.add(txtDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelDepartment.setBackground(new java.awt.Color(255, 255, 255));
        labelDepartment.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelDepartment.setForeground(new java.awt.Color(0, 0, 0));
        labelDepartment.setText("Phòng Ban:");
        panelDepartment.add(labelDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 30));

        Header.add(panelDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 480, 40));

        panelAcademicLevel.setBackground(new java.awt.Color(255, 255, 255));
        panelAcademicLevel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAcademicLevel.setBackground(new java.awt.Color(255, 255, 255));
        txtAcademicLevel.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtAcademicLevel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAcademicLevel.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtAcademicLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAcademicLevelActionPerformed(evt);
            }
        });
        panelAcademicLevel.add(txtAcademicLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 270, 30));

        labelAcademicLevel.setBackground(new java.awt.Color(255, 255, 255));
        labelAcademicLevel.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        labelAcademicLevel.setForeground(new java.awt.Color(0, 0, 0));
        labelAcademicLevel.setText("Trình Độ Học Vấn:");
        panelAcademicLevel.add(labelAcademicLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        Header.add(panelAcademicLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 480, 40));

        buttonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        buttonUpdate.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonUpdate.setForeground(new java.awt.Color(0, 0, 0));
        buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-write-20.png"))); // NOI18N
        buttonUpdate.setText("SỬA");
        buttonUpdate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonUpdate.setIconTextGap(15);
        buttonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonUpdateActionPerformed(evt);
				} catch (NumberFormatException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

        buttonDelete.setBackground(new java.awt.Color(255, 255, 255));
        buttonDelete.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(0, 0, 0));
        buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-20.png"))); // NOI18N
        buttonDelete.setText("XÓA RỖNG");
        buttonDelete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonDelete.setIconTextGap(15);
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        Header.add(buttonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 90, 140, 40));

        buttonAdd1.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 11)); // NOI18N
        buttonAdd1.setForeground(new java.awt.Color(0, 0, 0));
        buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-50 (2) (2).png"))); // NOI18N
        buttonAdd1.setText("THÊM");
        buttonAdd1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        buttonAdd1.setIconTextGap(15);
        buttonAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					buttonAddActionPerformed(evt);
					txtEmployeeID.setText(""+(++count));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        Header.add(buttonAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1390, 40, 140, 40));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1558, 250));

        scrollTable.setBackground(new java.awt.Color(255, 255, 255));
        scrollTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ád", "ád", "ád", "ád"},
                {"áđá", "ád", "ád", "ád"},
                {"áđá", "d", "ád", "áđá"},
                {"áđá", "áđá", "áđá", "ád"}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
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
        table.addMouseListener(this);
        scrollTable.setViewportView(table);
        model = new DefaultTableModel(new String[] {"Mã Nhân Viên", "Tên Nhân Viên", "Chức Vụ", "Phòng Ban", "Trình Độ Học Vấn", "Bậc Thợ","Số Năm Kinh Nghiệm"},0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(model);

        Main.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 1560, 450));

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
        
        jComboBox1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				addComboBoxPerformed(e);
			}
		});
    }// </editor-fold>//GEN-END:initComponents

    public void updateData() throws SQLException {
    	model.setRowCount(0);
    	loadData();
    }
    
    public boolean validDataAdEmp() {
    	String empID = txtEmployeeID.getText().trim();
    	String empName = txtName.getText().trim();
    	String depart = txtDepartment.getText().trim();
    	String level = txtAcademicLevel.getText().trim();
    	
    	Pattern pID = Pattern.compile("\\d+");
    	Matcher mID = pID.matcher(empID);
    	if(!(mID.matches())) {
    		JOptionPane.showMessageDialog(null, "Mã nhân viên phải là kí tự số");
    		return false;
    	}
    	Pattern pName = Pattern.compile("^[a-zA-Z' ]+$");
    	Matcher mName = pName.matcher(empName);
    	if(!(mName.matches())) {
    		JOptionPane.showMessageDialog(null, "Tên nhân viên phải có dạng X(X X ...)");
    		return false;
    	}
    	
    	if(depart.equalsIgnoreCase("")) {
    		JOptionPane.showMessageDialog(null, "Phòng ban không được để trống");
    		return false;
    	}
    	
    	if(level.equalsIgnoreCase("")) {
    		JOptionPane.showMessageDialog(null, "Trình độ học vấn không được để trống");
    		return false;
    	}
    	return true;
    }
    
    public boolean validDataTechEmp() {
    	String empID = txtEmployeeID.getText().trim();
    	String empName = txtName.getText().trim();
    	String depart = txtDepartment.getText().trim();
    	String level = txtAcademicLevel.getText().trim();
    	
    	Pattern pID = Pattern.compile("\\d+");
    	Matcher mID = pID.matcher(empID);
    	if(!(mID.matches())) {
    		JOptionPane.showMessageDialog(null, "Mã nhân viên phải là kí tự số");
    		return false;
    	}
    	Pattern pName = Pattern.compile("^[a-zA-Z' ]+$");
    	Matcher mName = pName.matcher(empName);
    	if(!(mName.matches())) {
    		JOptionPane.showMessageDialog(null, "Tên nhân viên phải có dạng X(X X ...)");
    		return false;
    	}
    	
    	if(depart.equalsIgnoreCase("")) {
    		JOptionPane.showMessageDialog(null, "Bậc thợ không được để trống");
    		return false;
    	}
    	
    	if(level.equalsIgnoreCase("")) {
    		JOptionPane.showMessageDialog(null, "Số năm kinh nghiệm không được để trống");
    		return false;
    	}
    	else if(Integer.parseInt(level)<=0) {
    		JOptionPane.showMessageDialog(null, "Số năm kinh nghiệm phải lớn hơn 0");
    		return false;
    	}
    	return true;
    }
    
 // Ẩn hiện các nút Update, Delete khi click nút Lưu + Thêm dữ liệu
    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {//GEN-FIRST:event_buttonAddActionPerformed
    	if(buttonAdd1.getText().equalsIgnoreCase("Lưu")) {
				Employee e = new Employee(txtEmployeeID.getText(), txtName.getText(), String.valueOf(jComboBox1.getSelectedItem()));
				if(jComboBox1.getSelectedItem().equals("Nhân Viên Hành Chính")) {
					if(validDataAdEmp()) {
						AdministrationEmp ae = new AdministrationEmp(txtEmployeeID.getText(), txtName.getText(), 
		        				String.valueOf(jComboBox1.getSelectedItem()), txtDepartment.getText(), txtAcademicLevel.getText());
						emp_DAO.addEmployee(e);
						emp_DAO.addAdEmp(ae);
						JOptionPane.showMessageDialog(null, "Đã lưu vào Database");
					}
				}
				
				else {
					if(validDataTechEmp()) {
						TechnicalEmp te = new TechnicalEmp(txtEmployeeID.getText(), txtName.getText(), 
		        				String.valueOf(jComboBox1.getSelectedItem()), txtDepartment.getText(), Integer.parseInt(txtAcademicLevel.getText()));
		            	
						emp_DAO.addEmployee(e);
						emp_DAO.addTechEmp(te);
						JOptionPane.showMessageDialog(null, "Đã lưu vào Database");
					}
					
				}
				loadData();
		}
    	
    	// Không cần chỉ cần vô sql -> rồi load lại table là được
    	
    	setEditTrue();
		buttonAdd1.setText("LƯU");
		buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-save-20.png")));
		buttonDelete.setText("HỦY");
		buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon.png")));
		buttonSearch.setVisible(false);
		buttonUpdate.setVisible(false);
    }//GEN-LAST:event_buttonAddActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
            if (evt.getSource().equals(buttonDelete)) { 
                if (buttonDelete.getText().equalsIgnoreCase("HỦY")){
                    buttonUpdate.setText("SỬA");
                    buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-done-20.png")));
                    buttonDelete.setText("XÓA RỖNG");
                    buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon.png")));
                    buttonAdd1.setVisible(true);
                    buttonSearch.setVisible(true);

                    txtName.setEditable(false);
                    txtDepartment.setEditable(false);
                    txtAcademicLevel.setEditable(false);
                    //background
                    txtName.setBackground(Color.getHSBColor(0f, 0f,0.79f));
                    txtDepartment.setBackground(Color.getHSBColor(0f, 0f,0.79f));
                    txtAcademicLevel.setBackground(Color.getHSBColor(0f, 0f,0.79f));
        			buttonAdd1.setText("THÊM");
					buttonAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-add-50 (2) (2).png")));
					buttonDelete.setText("XÓA RỖNG");
					buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-delete-20.png")));
					buttonSearch.setVisible(true);
					buttonUpdate.setVisible(true);
					setEditFalse();
                }
                else {
                	deleteField();
                	table.clearSelection();
                }
            }


//		}
    	
//		Header.revalidate();
//    	Header.repaint();
//		Header.add(buttonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 140, 140, 40));
//		Header.add(buttonSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 190, 140, 40));
    }//GEN-LAST:event_buttonDeleteActionPerformed


    private void buttonUpdateActionPerformed(java.awt.event.ActionEvent evt) throws NumberFormatException, SQLException {//GEN-FIRST:event_buttonUpdateActionPerformed
        if (evt.getSource().equals(buttonUpdate)){
            if (buttonUpdate.getText().equalsIgnoreCase("SỬA")){
                    buttonUpdate.setText("OK");
                    buttonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-done-20.png")));
                    buttonDelete.setText("HỦY");
                    buttonDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close_icon.png")));
                    buttonAdd1.setVisible(false);
                    buttonSearch.setVisible(false);

                    txtName.setEditable(true);
                    txtDepartment.setEditable(true);
                    txtAcademicLevel.setEditable(true);
                    //background
                    txtName.setBackground(new java.awt.Color(255, 255, 255));
                    txtDepartment.setBackground(new java.awt.Color(255, 255, 255));
                    txtAcademicLevel.setBackground(new java.awt.Color(255, 255, 255));
            }
            else if(buttonUpdate.getText().equalsIgnoreCase("OK")) {
            	if (model.getValueAt(table.getSelectedRow(), 2).toString().equalsIgnoreCase("Nhân Viên Hành Chính")){
            		if(validDataAdEmp()) {
            			emp_DAO.updateEmp(Integer.parseInt(txtEmployeeID.getText()), txtName.getText());
    	        		emp_DAO.updateAdEmp(Integer.parseInt(txtEmployeeID.getText()), txtDepartment.getText(), txtAcademicLevel.getText());
    	        		updateData();
            		}
            	}
            	else {
            		if(validDataTechEmp()) {
            			emp_DAO.updateEmp(Integer.parseInt(txtEmployeeID.getText()), txtName.getText());
    	        		emp_DAO.updateTechEmp(Integer.parseInt(txtEmployeeID.getText()), txtDepartment.getText(), txtAcademicLevel.getText());
    	        		updateData();
            		}
            	}
        	}    
        }
    	
    }//GEN-LAST:event_buttonUpdateActionPerformed
    
    private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchActionPerformed
    	if(evt.getSource().equals(buttonSearch)) {
    		if(jComboBox1.getSelectedItem().equals("Nhân Viên Hành Chính")) {
    			String text = JOptionPane.showInputDialog("Nhập dữ liệu cần tìm: ");
    			try {
    				data = emp_DAO.searchAdEmp(text);
    				// load dữ liệuu tìm được
    		    	model.setRowCount(0);
    		    	table.clearSelection();
		    		for (AdministrationEmp ae : data) {
		    			model.addRow(new String[] {ae.getMaNhanVien(),
		    										ae.getTenNhanVien(),
		    										ae.getChucVu(),
		    										ae.getPhongBan(),
		    										ae.getHocVan()
		    			});
		    		}

    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
    		else {
    			String text = JOptionPane.showInputDialog("Nhập dữ liệu cần tìm: ");
    			try {
    				data = emp_DAO.searchAdEmp(text);
    				// load dữ liệuu tìm được
    		    	model.setRowCount(0);
    		    	table.clearSelection();
    		    	for (TechnicalEmp te : data2) {
    					model.addRow(new String[] {te.getMaNhanVien(),
    												te.getTenNhanVien(),
    												te.getChucVu(),
    												"",
    												"",
    												te.getBacTho(),
    												String.valueOf(te.getSoNamKinhNghiem())
    					});

    				}

    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    		}
			
       }
    }//GEN-LAST:event_buttonSearchActionPerformed
    
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartmentActionPerformed

    private void txtAcademicLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAcademicLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAcademicLevelActionPerformed

  //METHOD !IMPORTANT
    public void loadData() throws SQLException {
    	Employee_DAO dao1 = new Employee_DAO();
    	data = dao1.getAllAdEmployee();
    	Employee_DAO dao2 = new Employee_DAO();
    	data2 = dao2.getAllTechEmployee();
    	loadTable();
    }
    
    public void loadTable() {
    	model.setRowCount(0);
    	table.clearSelection();
    	for (AdministrationEmp ae : data) {
			model.addRow(new String[] {ae.getMaNhanVien(),
										ae.getTenNhanVien(),
										ae.getChucVu(),
										ae.getPhongBan(),
										ae.getHocVan()
			});

		}
    	for (TechnicalEmp te : data2) {
			model.addRow(new String[] {te.getMaNhanVien(),
										te.getTenNhanVien(),
										te.getChucVu(),
										"",
										"",
										te.getBacTho(),
										String.valueOf(te.getSoNamKinhNghiem())
			});

		}
    }
    
    // Sự kiện thay đổi lable tương ứng với nhân viên Kỹ thuật hoặc Hành chính
    private void addComboBoxPerformed(java.awt.event.ActionEvent evt) {
    	if(jComboBox1.getSelectedItem().equals("Nhân Viên Kĩ Thuật")) {
    		labelDepartment.setText("Bậc Thợ: ");
    		labelAcademicLevel.setText("Số Năm Kinh Nghiệm: ");
    	}
    	else {
    		labelDepartment.setText("Phòng Ban: ");
    		labelAcademicLevel.setText("Trình Độ Học Vấn: ");
    	}
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JButton buttonAdd1;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonSearch;
    private javax.swing.JButton buttonUpdate;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel labelAcademicLevel;
    private javax.swing.JLabel labelDepartment;
    private javax.swing.JLabel labelEmployeeID;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelWarrantyDate;
    private javax.swing.JPanel panelAcademicLevel;
    private javax.swing.JPanel panelDepartment;
    private javax.swing.JPanel panelEmployeeID;
    private javax.swing.JPanel panelName;
    private javax.swing.JPanel panelWarrantyDate;
    private javax.swing.JScrollPane scrollTable;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtAcademicLevel;
    private javax.swing.JTextField txtDepartment;
    public javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private ArrayList<AdministrationEmp> data = new ArrayList<>();
    private ArrayList<TechnicalEmp> data2 = new ArrayList<>();
    private Employee_DAO emp_DAO = new Employee_DAO();
    private int count  = emp_DAO.getID();
    
    
    
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

    public class RoundBorderArea implements Border {

        private int radius;

        public RoundBorderArea(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.draw(new RoundRectangle2D.Double(x, y, width - 1, height - 1, getRadius(), getRadius()));
            g2d.dispose();
        }

        @Override
        public Insets getBorderInsets(Component c) {
            int value = getRadius() / 2;
            return new Insets(value, value, value, value);
        }

        @Override
        public boolean isBorderOpaque() {
            return false;
        }

    }
    
    public void setEditFalse() {
    	txtEmployeeID.setEditable(false);
    	txtName.setEditable(false);
    	txtDepartment.setEditable(false);
    	txtAcademicLevel.setEditable(false);
    	jComboBox1.setEnabled(false);
    	//background
    	txtEmployeeID.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    	txtName.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    	txtDepartment.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    	txtAcademicLevel.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    	jComboBox1.setBackground(Color.getHSBColor(0f, 0f,0.79f));
    }
    
    public void setEditTrue() {
    	txtEmployeeID.setEditable(true);
    	txtName.setEditable(true);
    	txtDepartment.setEditable(true);
    	txtAcademicLevel.setEditable(true);
    	jComboBox1.setEnabled(true);
    	//background
    	txtEmployeeID.setBackground(new java.awt.Color(255, 255, 255));
    	txtName.setBackground(new java.awt.Color(255, 255, 255));
    	txtDepartment.setBackground(new java.awt.Color(255, 255, 255));
    	txtAcademicLevel.setBackground(new java.awt.Color(255, 255, 255));
    	jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
    }
    
    public void deleteField() {
    	txtEmployeeID.setText("");
    	txtName.setText("");
    	txtDepartment.setText("");
    	txtAcademicLevel.setText("");
    }

	@Override
	public void mouseClicked(MouseEvent e) {
		Object o = e.getSource();
		if(o.equals(table)) {
			txtEmployeeID.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
			txtName.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
			if (model.getValueAt(table.getSelectedRow(), 2).toString().equalsIgnoreCase("Nhân Viên Hành Chính")){
				jComboBox1.setSelectedIndex(0);
				txtDepartment.setText(table.getValueAt(table.getSelectedRow(), 3).toString());
				txtAcademicLevel.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
			}
			else {
				jComboBox1.setSelectedIndex(1);
				txtDepartment.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
				txtAcademicLevel.setText(table.getValueAt(table.getSelectedRow(), 6).toString());
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
    
    
}