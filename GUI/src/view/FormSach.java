/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.IOFile;
import controller.SoLuongException;
import controller.TrongException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Sach;

/**
 *
 * @author DELL
 */
public class FormSach extends javax.swing.JPanel {

    DefaultTableModel tm;
    private boolean them, sua;
    private String fsach;
    private List<Sach> lsach;
    /**
     * Creates new form FormSach
     */
    public FormSach() {
        initComponents();
        setSize(1100, 750);
        String [] cols = {"Ma sach", "Ten sach", "Tac gia", "Chuyen nganh", "So luong"};
        tm = new DefaultTableModel(cols, 0);
        jTable1.setModel(tm);
        buttonState(true);
        them = false;
        sua = false;
        fsach = "src/controller/sach.txt";
        loadData();
    }
    
    private void loadData() {
        File f = new File(fsach);
        if(f.exists()){
            lsach = IOFile.doc(fsach);
        }else
            lsach = new ArrayList<>();
    }

    private void buttonState(boolean b){
        btThemMoi.setEnabled(b);
        btCapNhat.setEnabled(!b);
        btBoQua.setEnabled(!b);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btThemMoi = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btHienThi = new javax.swing.JButton();
        btLuuVaoFile = new javax.swing.JButton();
        btCapNhat = new javax.swing.JButton();
        btBoQua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btThemMoi.setText("Them moi");
        btThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemMoiActionPerformed(evt);
            }
        });

        btSua.setText("Sua");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xoa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btHienThi.setText("Hien thi");
        btHienThi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHienThiActionPerformed(evt);
            }
        });

        btLuuVaoFile.setText("Luu vao file");
        btLuuVaoFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuVaoFileActionPerformed(evt);
            }
        });

        btCapNhat.setText("Cap nhat");
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });

        btBoQua.setText("Bo qua");
        btBoQua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoQuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btThemMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(btCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBoQua, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(105, 105, 105)
                .addComponent(btXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113)
                .addComponent(btHienThi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLuuVaoFile)
                .addGap(157, 157, 157))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btThemMoi)
                    .addComponent(btSua)
                    .addComponent(btXoa)
                    .addComponent(btHienThi)
                    .addComponent(btLuuVaoFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCapNhat)
                    .addComponent(btBoQua))
                .addContainerGap())
        );

        jLabel1.setText("Ma sach:");

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ten sach:");

        jLabel3.setText("Tac gia:");

        jLabel4.setText("Chuyen nganh: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khoa h???c t??? nhi??n", "V??n H???c", "Ngh??? Thu???t", "??i???n t??? vi???n th??ng", "C??ng ngh??? th??ng tin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("So luong:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField4)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(55, 105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getColumnCount() - 1){
            JOptionPane.showMessageDialog(this, "Chon sach de sua");
        }else{
            sua = true;
            buttonState(false);
            jTextField2.requestFocus();
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btBoQuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoQuaActionPerformed
        if(them)
            them = false;
        buttonState(true);
    }//GEN-LAST:event_btBoQuaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemMoiActionPerformed
        buttonState(false);
        them = true;
        if(lsach != null && lsach.size() > 0)
            Sach.setSma(lsach.get(lsach.size() - 1).getMa() + 1);
        else
            lsach = new ArrayList<>();
        jTextField1.setText(Sach.getSma()+"");
        jTextField2.requestFocus();
    }//GEN-LAST:event_btThemMoiActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        if(them) {
            String ten, tg;
            try {
                ten = jTextField2.getText();
                tg = jTextField3.getText();
                if(ten.isEmpty() || tg.isEmpty()) throw new TrongException();
                int sl = Integer.parseInt(jTextField4.getText());
                if(sl < 0) throw new SoLuongException();
                int ma = Integer.parseInt(jTextField1.getText());
                Sach s = new Sach(ma, ten, tg, jComboBox1.getSelectedItem().toString(), sl);
                tm.addRow(s.toObject());
                lsach.add(s);
                buttonState(true);
                them = false;
            } catch (TrongException e) {
                JOptionPane.showMessageDialog(this, "Khong de trong!!");
                jTextField2.requestFocus();
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Nhap so"); 
                jTextField4.requestFocus();
            } catch (SoLuongException e) {
                JOptionPane.showMessageDialog(this, "Nhap so duong"); 
                jTextField4.requestFocus();
            }
            
        }
        if(sua) {
            int row = jTable1.getSelectedRow();
            String ten, tg;
            ten = jTextField2.getText();
            tg = jTextField3.getText();
            int ma = Integer.parseInt(jTextField1.getText());
            String cn = jComboBox1.getSelectedItem().toString();
            int sl = Integer.parseInt(tm.getValueAt(row, 4).toString());
            try {
                sl = Integer.parseInt(jTextField4.getText());
            } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(this, "Nhap so");
            }
            Sach s = new Sach(ma, ten, tg, cn, sl);
            tm.setValueAt(ma, row, 0);
            tm.setValueAt(ten, row, 1);
            tm.setValueAt(tg, row, 2);
            tm.setValueAt(cn, row, 3);
            tm.setValueAt(sl, row, 4);
            lsach.set(row, s);
            sua = false;
            buttonState(true);
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getColumnCount() - 1){
            JOptionPane.showMessageDialog(this, "Chon sach de xoa");
        }else{
            tm.removeRow(row);
            lsach.remove(row);
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        if(row < 0 || row > jTable1.getColumnCount() - 1){
            JOptionPane.showMessageDialog(this, "Chon sach de sua");
        }else{
            jTextField1.setText(tm.getValueAt(row, 0).toString());
            jTextField2.setText(tm.getValueAt(row, 1).toString());
            jTextField3.setText(tm.getValueAt(row, 2).toString());
            jTextField4.setText(tm.getValueAt(row, 4).toString());
            String cn = tm.getValueAt(row, 3).toString();
            for (int i = 0; i < jComboBox1.getItemCount(); i++) {
                if(jComboBox1.getItemAt(i).toString().equals(cn)){
                    jComboBox1.setSelectedIndex(i);
                    break;
                }
            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btLuuVaoFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuVaoFileActionPerformed
        IOFile.viet(fsach, lsach);
    }//GEN-LAST:event_btLuuVaoFileActionPerformed

    private void btHienThiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHienThiActionPerformed
        loadData();
        tm.setRowCount(0);
        for (Sach x : lsach) {
            tm.addRow(x.toObject());
        }
    }//GEN-LAST:event_btHienThiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoQua;
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btHienThi;
    private javax.swing.JButton btLuuVaoFile;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThemMoi;
    private javax.swing.JButton btXoa;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
