/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import com.formdev.flatlaf.FlatLightLaf;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author thnrg
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoVaTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        btnKiemTra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý nhân viên");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        jLabel2.setText("HỌ VÀ TÊN");

        jLabel3.setText("NGÀY SINH");

        jLabel4.setText("LƯƠNG");

        btnKiemTra.setText("KIỂM TRA");
        btnKiemTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKiemTraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoVaTen))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgaySinh))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnKiemTra)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtLuong))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKiemTra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKiemTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKiemTraActionPerformed
        kiemTraHoTen();
        kiemTraNgay();
        kiemTraLuong();
    }//GEN-LAST:event_btnKiemTraActionPerformed

    public void kiemTraNgay()
    {
        if(!txtNgaySinh.getText().equals(""))
        {
            try
            {
                SimpleDateFormat formatter = new SimpleDateFormat();
                formatter.applyPattern("dd-MM-yyyy");
                Date ngay = formatter.parse(txtNgaySinh.getText());
            }
            catch(ParseException ex)
            {
                JOptionPane.showMessageDialog(this, "Ngày phải theo định dạng dd-MM-yyyy!", "Warning", JOptionPane.WARNING_MESSAGE);
                txtNgaySinh.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Ngày sinh không được để trống!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtNgaySinh.requestFocus();
        }
    }
    
    public void kiemTraHoTen()
    {
        if(txtHoVaTen.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Họ và tên không được để trống!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtHoVaTen.requestFocus();
        }
    }
    
    public void kiemTraLuong()
    {
        if(!txtLuong.getText().equals(""))
        {
            try
            {
                Double luong = Double.valueOf(txtLuong.getText());
                if(luong < 0)
                {
                    JOptionPane.showMessageDialog(this, "Lương không được là số âm", "Warning", JOptionPane.WARNING_MESSAGE);
                    txtLuong.requestFocus();
                }
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(this, "Lương phải là số", "Warning", JOptionPane.WARNING_MESSAGE);
                txtLuong.requestFocus();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Lương không được để trống!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtLuong.requestFocus();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKiemTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtHoVaTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
