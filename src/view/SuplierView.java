/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import control.SuplierControl;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.TableModel;
import model.Suplier;
import table.TableAdjuster;
import Exception.inputKosongException;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */
public class SuplierView extends javax.swing.JInternalFrame {

    /**
     * Creates new form SuplierView
     */
    private SuplierControl suplierControl;
    private int selectedID;
    public SuplierView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        suplierControl = new SuplierControl();
        setTableSuplier();
        setEditDelBtn(false);
    }
    
    public void inputKosongException() throws inputKosongException{
        if(namaTxt.getText().isEmpty()){
            throw new inputKosongException();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSuplier = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        cleartBtn = new javax.swing.JButton();
        namaTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        headerPanel.setBackground(new java.awt.Color(193, 211, 254));
        headerPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logoAutocarDealer.png"))); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
        );

        containerPanel.setBackground(new java.awt.Color(193, 211, 254));

        tableSuplier.setBackground(new java.awt.Color(153, 153, 255));
        tableSuplier.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        tableSuplier.setForeground(new java.awt.Color(0, 0, 0));
        tableSuplier.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSuplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSuplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSuplier);

        delBtn.setBackground(new java.awt.Color(255, 51, 51));
        delBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        delBtn.setForeground(new java.awt.Color(0, 0, 0));
        delBtn.setText("Hapus");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 204, 51));
        editBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        editBtn.setForeground(new java.awt.Color(0, 0, 0));
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        addbtn.setBackground(new java.awt.Color(0, 204, 51));
        addbtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        addbtn.setForeground(new java.awt.Color(0, 0, 0));
        addbtn.setText("Tambah");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        cleartBtn.setBackground(new java.awt.Color(153, 153, 255));
        cleartBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        cleartBtn.setForeground(new java.awt.Color(0, 0, 0));
        cleartBtn.setText("Clear");
        cleartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartBtnActionPerformed(evt);
            }
        });

        namaTxt.setBackground(new java.awt.Color(153, 153, 255));
        namaTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        namaTxt.setForeground(new java.awt.Color(0, 0, 0));
        namaTxt.setText("Nama");

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerPanelLayout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn))
                    .addComponent(cleartBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(namaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        containerPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbtn, delBtn, editBtn});

        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(containerPanelLayout.createSequentialGroup()
                        .addGroup(containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbtn)
                            .addComponent(editBtn)
                            .addComponent(delBtn))
                        .addGap(42, 42, 42)
                        .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(cleartBtn)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        try{
            inputKosongException();
            Suplier s = new Suplier(namaTxt.getText());
            suplierControl.insertSuplier(s);
            setTableSuplier();
            clearAll();
        }catch(inputKosongException ke){
            JOptionPane.showMessageDialog(this, ke.message());
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void cleartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartBtnActionPerformed
        // TODO add your handling code here:
        clearAll();
    }//GEN-LAST:event_cleartBtnActionPerformed

    private void tableSuplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSuplierMouseClicked
        // TODO add your handling code here:
        int clickedRow = tableSuplier.getSelectedRow();
        TableModel table = tableSuplier.getModel();
        namaTxt.setText(table.getValueAt(clickedRow, 1).toString());
        selectedID = Integer.parseInt(table.getValueAt(clickedRow, 0).toString());
        setEditDelBtn(true);
    }//GEN-LAST:event_tableSuplierMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
       try{
            Suplier s = new Suplier(selectedID, namaTxt.getText());
            suplierControl.updateSuplier(s);
            setTableSuplier();
            clearAll();
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(rootPane, "Hapus data?","Confirm",JOptionPane.YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
            suplierControl.deleteSuplier(selectedID);
            setTableSuplier();
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
                new SuplierView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JButton cleartBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JTable tableSuplier;
    // End of variables declaration//GEN-END:variables


    private void setTableSuplier() {
        tableSuplier.setModel(suplierControl.getTableSuplier(""));
        TableAdjuster.resizeColumnWidth(tableSuplier);
    }

    private void setEditDelBtn(boolean b) {
        editBtn.setEnabled(b);
        delBtn.setEnabled(b);
        addbtn.setEnabled(!b);
    }
    private void clearAll(){
        namaTxt.setText("");;
        setEditDelBtn(false);
    }
}
