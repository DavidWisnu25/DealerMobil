/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.PembelianControl;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import control.CustomerControl;
import control.KendaraanControl;
import control.SuplierControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import model.Kendaraan;
import model.Pembelian;
import model.Suplier;
import table.TableAdjuster;
import Exception.inputKosongException;

/**
Kevin PK Wilson / A / 210711076
Gabriel David Wisnu Dewangga / A / 210711097
AG Arka Atmaja / A / 210711109
Axel Christian Nugroho / A / 210711114
 */
public class PembelianView extends javax.swing.JInternalFrame {

    /**
     * Creates new form PembelianView
     */
    private PembelianControl pembelianControl;
    private SuplierControl suplierControl;
    private KendaraanControl kendaraanControl;
    private int selectedID = 0;
    private List<Kendaraan> listKendaraan;
    private List<Suplier> listSuplier;
    
    public PembelianView() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        pembelianControl = new PembelianControl();
        suplierControl = new SuplierControl();
        kendaraanControl = new KendaraanControl();
        setTablePembelian();
        setSuplierDropdown();
        setKendaraanDropdown();
        setJenisDropdown();
        setTotalHarga();
        confirmBtn.setEnabled(false);
        totalHargaListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        header1Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jumlahInput = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        totalHargaTxt = new javax.swing.JTextField();
        confirmBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        header2Panel = new javax.swing.JPanel();
        suplierTab = new javax.swing.JTabbedPane();
        suplierOld = new javax.swing.JPanel();
        suplierDropdown = new javax.swing.JComboBox<>();
        suplierNew = new javax.swing.JPanel();
        namaSuplierTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        kendaraanTab = new javax.swing.JTabbedPane();
        kendaraanOld = new javax.swing.JPanel();
        kendaraanDropdown = new javax.swing.JComboBox<>();
        kendaraanNew = new javax.swing.JPanel();
        namaTxt = new javax.swing.JTextField();
        merkTxt = new javax.swing.JTextField();
        jenisDropdown = new javax.swing.JComboBox<>();
        hargaTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        containerPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePembelian = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        logoPanel.setBackground(new java.awt.Color(126, 196, 207));
        logoPanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo/logoAutocarDealer.png"))); // NOI18N

        javax.swing.GroupLayout logoPanelLayout = new javax.swing.GroupLayout(logoPanel);
        logoPanel.setLayout(logoPanelLayout);
        logoPanelLayout.setHorizontalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        logoPanelLayout.setVerticalGroup(
            logoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(logoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        header1Panel.setBackground(new java.awt.Color(126, 196, 207));
        header1Panel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Jumlah");

        jumlahInput.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Total");

        totalHargaTxt.setBackground(new java.awt.Color(204, 255, 255));
        totalHargaTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        totalHargaTxt.setForeground(new java.awt.Color(0, 0, 0));
        totalHargaTxt.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        totalHargaTxt.setText("0");

        confirmBtn.setBackground(new java.awt.Color(51, 204, 0));
        confirmBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        confirmBtn.setForeground(new java.awt.Color(0, 0, 0));
        confirmBtn.setText("Confirm");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(153, 153, 255));
        clearBtn.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(0, 0, 0));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout header1PanelLayout = new javax.swing.GroupLayout(header1Panel);
        header1Panel.setLayout(header1PanelLayout);
        header1PanelLayout.setHorizontalGroup(
            header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1PanelLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(confirmBtn)
                .addGap(50, 50, 50)
                .addComponent(clearBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header1PanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalHargaTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumlahInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        header1PanelLayout.setVerticalGroup(
            header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header1PanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jumlahInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(totalHargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(header1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmBtn)
                    .addComponent(clearBtn))
                .addGap(34, 34, 34))
        );

        header2Panel.setBackground(new java.awt.Color(126, 196, 207));
        header2Panel.setForeground(new java.awt.Color(255, 255, 255));

        suplierTab.setBackground(new java.awt.Color(204, 255, 255));
        suplierTab.setForeground(new java.awt.Color(0, 0, 0));

        suplierOld.setBackground(new java.awt.Color(204, 255, 255));
        suplierOld.setForeground(new java.awt.Color(0, 0, 0));

        suplierDropdown.setBackground(new java.awt.Color(126, 196, 207));
        suplierDropdown.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        suplierDropdown.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout suplierOldLayout = new javax.swing.GroupLayout(suplierOld);
        suplierOld.setLayout(suplierOldLayout);
        suplierOldLayout.setHorizontalGroup(
            suplierOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suplierOldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(suplierDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        suplierOldLayout.setVerticalGroup(
            suplierOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suplierOldLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(suplierDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        suplierTab.addTab("Current", suplierOld);

        suplierNew.setBackground(new java.awt.Color(204, 255, 255));
        suplierNew.setForeground(new java.awt.Color(0, 0, 0));

        namaSuplierTxt.setBackground(new java.awt.Color(126, 196, 207));
        namaSuplierTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        namaSuplierTxt.setForeground(new java.awt.Color(0, 0, 0));
        namaSuplierTxt.setText("Nama");

        javax.swing.GroupLayout suplierNewLayout = new javax.swing.GroupLayout(suplierNew);
        suplierNew.setLayout(suplierNewLayout);
        suplierNewLayout.setHorizontalGroup(
            suplierNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suplierNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaSuplierTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        suplierNewLayout.setVerticalGroup(
            suplierNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(suplierNewLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(namaSuplierTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        suplierTab.addTab("Add New", suplierNew);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Suplier");

        kendaraanTab.setBackground(new java.awt.Color(204, 255, 255));
        kendaraanTab.setForeground(new java.awt.Color(0, 0, 0));

        kendaraanOld.setBackground(new java.awt.Color(204, 255, 255));
        kendaraanOld.setForeground(new java.awt.Color(0, 0, 0));

        kendaraanDropdown.setBackground(new java.awt.Color(126, 196, 207));
        kendaraanDropdown.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        kendaraanDropdown.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout kendaraanOldLayout = new javax.swing.GroupLayout(kendaraanOld);
        kendaraanOld.setLayout(kendaraanOldLayout);
        kendaraanOldLayout.setHorizontalGroup(
            kendaraanOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kendaraanOldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kendaraanDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        kendaraanOldLayout.setVerticalGroup(
            kendaraanOldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kendaraanOldLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(kendaraanDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        kendaraanTab.addTab("Current", kendaraanOld);

        kendaraanNew.setBackground(new java.awt.Color(204, 255, 255));
        kendaraanNew.setForeground(new java.awt.Color(0, 0, 0));

        namaTxt.setBackground(new java.awt.Color(126, 196, 207));
        namaTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        namaTxt.setForeground(new java.awt.Color(0, 0, 0));
        namaTxt.setText("Nama");

        merkTxt.setBackground(new java.awt.Color(126, 196, 207));
        merkTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        merkTxt.setForeground(new java.awt.Color(0, 0, 0));
        merkTxt.setText("Merk");

        jenisDropdown.setBackground(new java.awt.Color(126, 196, 207));
        jenisDropdown.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jenisDropdown.setForeground(new java.awt.Color(0, 0, 0));

        hargaTxt.setBackground(new java.awt.Color(126, 196, 207));
        hargaTxt.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        hargaTxt.setForeground(new java.awt.Color(0, 0, 0));
        hargaTxt.setText("0");

        javax.swing.GroupLayout kendaraanNewLayout = new javax.swing.GroupLayout(kendaraanNew);
        kendaraanNew.setLayout(kendaraanNewLayout);
        kendaraanNewLayout.setHorizontalGroup(
            kendaraanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kendaraanNewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kendaraanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jenisDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(merkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        kendaraanNewLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hargaTxt, jenisDropdown, merkTxt, namaTxt});

        kendaraanNewLayout.setVerticalGroup(
            kendaraanNewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kendaraanNewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(merkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        kendaraanTab.addTab("Add New", kendaraanNew);

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Kendaraan");

        javax.swing.GroupLayout header2PanelLayout = new javax.swing.GroupLayout(header2Panel);
        header2Panel.setLayout(header2PanelLayout);
        header2PanelLayout.setHorizontalGroup(
            header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header2PanelLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(header2PanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(suplierTab, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, header2PanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addComponent(kendaraanTab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        header2PanelLayout.setVerticalGroup(
            header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(header2PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(header2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kendaraanTab)
                    .addComponent(suplierTab))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.setBackground(new java.awt.Color(126, 196, 207));
        containerPanel.setForeground(new java.awt.Color(255, 255, 255));

        tablePembelian.setBackground(new java.awt.Color(204, 255, 255));
        tablePembelian.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        tablePembelian.setForeground(new java.awt.Color(0, 0, 0));
        tablePembelian.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablePembelian);

        javax.swing.GroupLayout containerPanelLayout = new javax.swing.GroupLayout(containerPanel);
        containerPanel.setLayout(containerPanelLayout);
        containerPanelLayout.setHorizontalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        containerPanelLayout.setVerticalGroup(
            containerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(header2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(header1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(logoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(header1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(header2Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        Suplier suplier = null;
        Kendaraan kendaraan = null;
        
        if(suplierTab.getSelectedIndex()==0){
            int selectedSuplierIndex = suplierDropdown.getSelectedIndex();
            suplier = listSuplier.get(selectedSuplierIndex);
        }else{
            suplier = new Suplier(namaSuplierTxt.getText());
            suplierControl.insertSuplier(suplier);
            suplier = suplierControl.searchSuplier(suplier.getNama());
        }
        if(kendaraanTab.getSelectedIndex()==0){
            int selectedKendaraanIndex = kendaraanDropdown.getSelectedIndex();
            kendaraan = listKendaraan.get(selectedKendaraanIndex);
        }else{
            kendaraan = new Kendaraan(namaTxt.getText(), (String)jenisDropdown.getSelectedItem(), merkTxt.getText(), Float.parseFloat(hargaTxt.getText()), 0);
            kendaraanControl.insertKendaraan(kendaraan);
            kendaraan = kendaraanControl.searchKendaraan(kendaraan.getNama());
        }
        if(kendaraan!=null && suplier!=null){
            int jumlahSuplai = (int)jumlahInput.getValue();
            Pembelian p = new Pembelian(suplier, kendaraan, Float.parseFloat(totalHargaTxt.getText()), jumlahSuplai);
            pembelianControl.insertPembelian(p);
            kendaraanControl.updateJumlahKendaraan(kendaraan.getId(), jumlahSuplai, "+");
            setTablePembelian();
            clearAll();
        }
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clearAll();
    }//GEN-LAST:event_clearBtnActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PembelianView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JTextField hargaTxt;
    private javax.swing.JPanel header1Panel;
    private javax.swing.JPanel header2Panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenisDropdown;
    private javax.swing.JSpinner jumlahInput;
    private javax.swing.JComboBox<Kendaraan> kendaraanDropdown;
    private javax.swing.JPanel kendaraanNew;
    private javax.swing.JPanel kendaraanOld;
    private javax.swing.JTabbedPane kendaraanTab;
    private javax.swing.JPanel logoPanel;
    private javax.swing.JTextField merkTxt;
    private javax.swing.JTextField namaSuplierTxt;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JComboBox<Suplier> suplierDropdown;
    private javax.swing.JPanel suplierNew;
    private javax.swing.JPanel suplierOld;
    private javax.swing.JTabbedPane suplierTab;
    private javax.swing.JTable tablePembelian;
    private javax.swing.JTextField totalHargaTxt;
    // End of variables declaration//GEN-END:variables

    private void setTablePembelian() {
        tablePembelian.setModel(pembelianControl.getTablePembelian(""));
        TableAdjuster.resizeColumnWidth(tablePembelian);
    }

    private void setSuplierDropdown() {
        listSuplier = suplierControl.getListSuplier("");
        for(Suplier item : listSuplier){
            suplierDropdown.addItem(item);
        }
    }

    private void setKendaraanDropdown() {
        listKendaraan = kendaraanControl.getListKendaraan("");
        for(Kendaraan item : listKendaraan){
            kendaraanDropdown.addItem(item);
        }
    }
    
    private void setJenisDropdown() {
        String items[]= {"Hatchback","Sedan","SUV","Sport","Coupe","Convertible"};
        for(int i=0;i<items.length;i++){
            jenisDropdown.addItem(items[i]);
        }
    }
    
    private void clearAll(){
        namaSuplierTxt.setText("Nama");
        namaTxt.setText("Nama");
        merkTxt.setText("Merk");
        jenisDropdown.setSelectedIndex(0);
        hargaTxt.setText("0");
        jumlahInput.setValue(0);
    }
    
    private void setTotalHarga(){
        kendaraanTab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateTotalHarga();
            }
        });
        kendaraanDropdown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateTotalHarga();
            }
        });
        jumlahInput.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = (int) jumlahInput.getValue();
                if (value < 0) {
                    jumlahInput.setValue(0);
                }
                updateTotalHarga();
            }
        });
        hargaTxt.getDocument().addDocumentListener(new DocumentListener() {
            
                @Override
                public void insertUpdate(DocumentEvent e) {
                    try{
                        updateTotalHarga();
                    }catch(NumberFormatException nfe){
                        System.out.println(nfe.getMessage());
                        totalHargaTxt.setText("0");
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    try{
                        updateTotalHarga();
                    }catch(NumberFormatException nfe){
                        System.out.println(nfe.getMessage());
                        totalHargaTxt.setText("0");
                    }
                }

                @Override
                public void changedUpdate(DocumentEvent e) {
                    try{
                        updateTotalHarga();
                    }catch(NumberFormatException nfe){
                        System.out.println(nfe.getMessage());
                        totalHargaTxt.setText("0");
                    }
                }
        });
    }
    
    private void updateTotalHarga(){
        
        float totalHarga;
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        if(kendaraanTab.getSelectedIndex()==0){
            int selectedIndexKendaraan = kendaraanDropdown.getSelectedIndex();
            Kendaraan k = listKendaraan.get(selectedIndexKendaraan);
            totalHarga=(k.getHarga() * (int)jumlahInput.getValue());
            if(totalHarga==0){
                totalHargaTxt.setText("0");
            }else{
                String formattedValue = decimalFormat.format(totalHarga);
                totalHargaTxt.setText(formattedValue);
            }
        }else{
            totalHarga=(Float.parseFloat(hargaTxt.getText()) * (int)jumlahInput.getValue());
            if(totalHarga<=0){
                totalHargaTxt.setText("0");
            }else{
                String formattedValue = decimalFormat.format(totalHarga);
                totalHargaTxt.setText(formattedValue);
            }
        }
    }

    private void totalHargaListener() {
        totalHargaTxt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkAndUpdate();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkAndUpdate();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                checkAndUpdate();
            }
            private void checkAndUpdate(){
                try{
                    float value = Float.parseFloat(totalHargaTxt.getText());
                    confirmBtn.setEnabled(value>0);
                }catch(NumberFormatException nfe){
                    confirmBtn.setEnabled(false);
                }
            }
        });
    }


}
