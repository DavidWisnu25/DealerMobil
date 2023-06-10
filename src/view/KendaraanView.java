/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import control.KendaraanControl;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import model.Kendaraan;
import table.TableAdjuster;

/**
 *
 * 
 */
public class KendaraanView extends javax.swing.JInternalFrame {

    /**
     * Creates new form KendaraanView
     */
    private KendaraanControl kendaraanControl;
    private int selectedID;
    public KendaraanView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        kendaraanControl = new KendaraanControl();
        setJenisDropdown();
        setTableKendaraan();
        setEditDelBtn(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableKendaraan = new javax.swing.JTable();
        addbtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        namaTxt = new javax.swing.JTextField();
        merkTxt = new javax.swing.JTextField();
        hargaTxt = new javax.swing.JTextField();
        jenisDropdown = new javax.swing.JComboBox<>();
        jumlahInput = new javax.swing.JSpinner();
        cleartBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tableKendaraan.setModel(new javax.swing.table.DefaultTableModel(
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
        tableKendaraan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableKendaraanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableKendaraan);

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        namaTxt.setText("Nama");

        merkTxt.setText("Merek");
        merkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                merkTxtActionPerformed(evt);
            }
        });

        hargaTxt.setText("Harga");

        cleartBtn.setText("clear");
        cleartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(merkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jenisDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jumlahInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cleartBtn))))
                .addGap(20, 20, 20))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hargaTxt, jenisDropdown, jumlahInput, merkTxt, namaTxt});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbtn, delBtn, editBtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(editBtn)
                    .addComponent(delBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(merkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jenisDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jumlahInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cleartBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void merkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_merkTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_merkTxtActionPerformed

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            float harga = Float.parseFloat(hargaTxt.getText());
            int jumlah = (int) jumlahInput.getValue();
            if(harga>0 && jumlah>0){
                Kendaraan k = new Kendaraan(namaTxt.getText(), (String) jenisDropdown.getSelectedItem(), merkTxt.getText(), harga, jumlah);
                kendaraanControl.insertKendaraan(k);
                setTableKendaraan();
                clearAll();
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, nfe.getMessage());
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void cleartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartBtnActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_cleartBtnActionPerformed

    private void tableKendaraanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableKendaraanMouseClicked
        // TODO add your handling code here:
        int clickedRow = tableKendaraan.getSelectedRow();
        TableModel table = tableKendaraan.getModel();
        namaTxt.setText(table.getValueAt(clickedRow, 2).toString());
        merkTxt.setText(table.getValueAt(clickedRow, 1).toString());
        hargaTxt.setText(table.getValueAt(clickedRow, 3).toString());
        jumlahInput.setValue(Integer.parseInt(table.getValueAt(clickedRow, 4).toString()));
        jenisDropdown.setSelectedItem(table.getValueAt(clickedRow, 0).toString());
        selectedID = Integer.parseInt(table.getValueAt(clickedRow, 5).toString());
        setEditDelBtn(true);
    }//GEN-LAST:event_tableKendaraanMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
       try{
            float harga = Float.parseFloat(hargaTxt.getText());
            int jumlah = (int) jumlahInput.getValue();
            if(harga>0 && jumlah>0){
                Kendaraan k = new Kendaraan(selectedID, namaTxt.getText(), (String) jenisDropdown.getSelectedItem(), merkTxt.getText(), harga, jumlah);
                kendaraanControl.updateKendaraan(k);
                setTableKendaraan();
                clearAll();
            }
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane, nfe.getMessage());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Hapus data?","Confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
            kendaraanControl.deleteKendaraan(selectedID);
            setTableKendaraan();
            clearAll();
        }
    }//GEN-LAST:event_delBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        FlatMacLightLaf.setup();
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KendaraanView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cleartBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField hargaTxt;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisDropdown;
    private javax.swing.JSpinner jumlahInput;
    private javax.swing.JTextField merkTxt;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTable tableKendaraan;
    // End of variables declaration//GEN-END:variables

    private void setJenisDropdown() {
        String items[]= {"Hatchback","Sedan","SUV","Sport","Coupe","Convertible"};
        for(int i=0;i<items.length;i++){
            jenisDropdown.addItem(items[i]);
        }
    }

    private void setTableKendaraan() {
        tableKendaraan.setModel(kendaraanControl.getTableKendaraan(""));
        TableAdjuster.resizeColumnWidth(tableKendaraan);
    }

    private void setEditDelBtn(boolean b) {
        editBtn.setEnabled(b);
        delBtn.setEnabled(b);
        addbtn.setEnabled(!b);
    }
    private void clearAll(){
        namaTxt.setText("");
        merkTxt.setText("");
        jenisDropdown.setSelectedIndex(0);
        hargaTxt.setText("0");
        jumlahInput.setValue(0);
        setEditDelBtn(false);
    }
}