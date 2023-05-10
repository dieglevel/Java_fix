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
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import dao.Motobike_DAO;
import dao.Warranty_DAO;
import entity.Customer;
import entity.Motobike;
import entity.Warranty;

/**
 *
 * @author Admin
 */
public class HistoryGUI extends javax.swing.JPanel {

    /**
     * Creates new form ..
     * @throws SQLException 
     */
    public HistoryGUI() throws SQLException {
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
        scrollTable = new javax.swing.JScrollPane();
        table = new rojeru_san.complementos.RSTableMetro();

        setPreferredSize(new java.awt.Dimension(1580, 770));

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("LỊCH SỬ THAO TÁC");
        Main.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1580, 60));

        Header.setBackground(new java.awt.Color(255, 255, 255));
        Header.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Thông tin ", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dubai Medium", 1, 24), new java.awt.Color(0, 0, 0))); // NOI18N
        Header.setPreferredSize(new java.awt.Dimension(1580, 770));
        Header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        scrollTable.setViewportView(table);
        model = new DefaultTableModel(new String[] {"Mã Lịch Sử", "Nhân Viên", "Công Việc", "Cũ", "Mới", "Thời Gian"},0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        table.setModel(model);

        Header.add(scrollTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1540, 600));

        Main.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 1558, 670));

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

    
  //METHOD !IMPORTANT
    public void loadData() throws SQLException {
    	Warranty_DAO dao = new Warranty_DAO();
    	data = dao.getAllWarranty();
    	for (Warranty w : data) {
			System.out.println(w.toString());
		}
    	loadTable();
    }
    
    public void loadTable() {
    	model.setRowCount(0);
    	table.clearSelection();
    	for (Warranty w : data) {
			model.addRow(new String[] {w.getMaBaoHanh(),
										w.getMaHopDong(),
										w.getMaXe(),
										w.getMaNhanVien(),
										String.valueOf(w.getNgayBaoHanh().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))),
										w.getTenLinhKien(),
										w.getLoiBaoHanh(),
										String.valueOf(w.getSoTien())
			});

		}
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JScrollPane scrollTable;
    private rojeru_san.complementos.RSTableMetro table;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel model;
    private ArrayList<Warranty> data = new ArrayList<>();
    private Warranty_DAO war_DAO = new Warranty_DAO();
    
    
    
    
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
    
}