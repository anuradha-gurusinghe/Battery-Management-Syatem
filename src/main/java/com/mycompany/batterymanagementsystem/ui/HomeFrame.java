/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.batterymanagementsystem.ui;

import javax.swing.JFrame;

/**
 *
 * @author Anuradha Gurusinghe
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MeterPanel = new javax.swing.JPanel();
        gaugeChart = new com.mycompany.batterymanagementsystem.ui.GaugeChart();
        BatteryVoltagePanel = new javax.swing.JPanel();
        BatteryVoltageTextField = new javax.swing.JTextField();
        CurrentPanel = new javax.swing.JPanel();
        BatteryCurrentTextField = new javax.swing.JTextField();
        SyatemStatusPanel = new javax.swing.JPanel();
        WarnAndProtectPanel = new javax.swing.JPanel();
        BMSInformationPanel = new javax.swing.JPanel();
        CellVoltagePanel = new javax.swing.JPanel();
        MaxVoltagePanel = new javax.swing.JPanel();
        MinVoltagePanel = new javax.swing.JPanel();
        VoltageDifferencePanel = new javax.swing.JPanel();
        BatteryInformationPanel = new javax.swing.JPanel();
        TempreatureInformationPanel = new javax.swing.JPanel();
        PortConfigPanel = new javax.swing.JPanel();
        PortNumLabel = new javax.swing.JLabel();
        BaundRateLabel = new javax.swing.JLabel();
        COMPortComboBox = new javax.swing.JComboBox<>();
        BoundRateComboBox = new javax.swing.JComboBox<>();
        ConnectButton = new javax.swing.JButton();
        BreakButton = new javax.swing.JButton();
        TargetConfigPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MeterPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Meter"));

        javax.swing.GroupLayout MeterPanelLayout = new javax.swing.GroupLayout(MeterPanel);
        MeterPanel.setLayout(MeterPanelLayout);
        MeterPanelLayout.setHorizontalGroup(
            MeterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MeterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gaugeChart, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addContainerGap())
        );
        MeterPanelLayout.setVerticalGroup(
            MeterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gaugeChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        BatteryVoltagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Battery Voltage"));

        BatteryVoltageTextField.setEditable(false);
        BatteryVoltageTextField.setBackground(new java.awt.Color(255, 255, 255));
        BatteryVoltageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatteryVoltageTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BatteryVoltagePanelLayout = new javax.swing.GroupLayout(BatteryVoltagePanel);
        BatteryVoltagePanel.setLayout(BatteryVoltagePanelLayout);
        BatteryVoltagePanelLayout.setHorizontalGroup(
            BatteryVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BatteryVoltagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BatteryVoltageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        BatteryVoltagePanelLayout.setVerticalGroup(
            BatteryVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BatteryVoltagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BatteryVoltageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CurrentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Battery Current"));

        BatteryCurrentTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatteryCurrentTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CurrentPanelLayout = new javax.swing.GroupLayout(CurrentPanel);
        CurrentPanel.setLayout(CurrentPanelLayout);
        CurrentPanelLayout.setHorizontalGroup(
            CurrentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BatteryCurrentTextField)
                .addContainerGap())
        );
        CurrentPanelLayout.setVerticalGroup(
            CurrentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CurrentPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(BatteryCurrentTextField)
                .addContainerGap())
        );

        SyatemStatusPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("System Status"));

        javax.swing.GroupLayout SyatemStatusPanelLayout = new javax.swing.GroupLayout(SyatemStatusPanel);
        SyatemStatusPanel.setLayout(SyatemStatusPanelLayout);
        SyatemStatusPanelLayout.setHorizontalGroup(
            SyatemStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        SyatemStatusPanelLayout.setVerticalGroup(
            SyatemStatusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        WarnAndProtectPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Warn and Protect"));

        javax.swing.GroupLayout WarnAndProtectPanelLayout = new javax.swing.GroupLayout(WarnAndProtectPanel);
        WarnAndProtectPanel.setLayout(WarnAndProtectPanelLayout);
        WarnAndProtectPanelLayout.setHorizontalGroup(
            WarnAndProtectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        WarnAndProtectPanelLayout.setVerticalGroup(
            WarnAndProtectPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        BMSInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("BMS Information"));

        javax.swing.GroupLayout BMSInformationPanelLayout = new javax.swing.GroupLayout(BMSInformationPanel);
        BMSInformationPanel.setLayout(BMSInformationPanelLayout);
        BMSInformationPanelLayout.setHorizontalGroup(
            BMSInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BMSInformationPanelLayout.setVerticalGroup(
            BMSInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        CellVoltagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Cell Voltage"));

        MaxVoltagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Max Voltage"));

        javax.swing.GroupLayout MaxVoltagePanelLayout = new javax.swing.GroupLayout(MaxVoltagePanel);
        MaxVoltagePanel.setLayout(MaxVoltagePanelLayout);
        MaxVoltagePanelLayout.setHorizontalGroup(
            MaxVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );
        MaxVoltagePanelLayout.setVerticalGroup(
            MaxVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MinVoltagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Min Voltage"));

        javax.swing.GroupLayout MinVoltagePanelLayout = new javax.swing.GroupLayout(MinVoltagePanel);
        MinVoltagePanel.setLayout(MinVoltagePanelLayout);
        MinVoltagePanelLayout.setHorizontalGroup(
            MinVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
        );
        MinVoltagePanelLayout.setVerticalGroup(
            MinVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        VoltageDifferencePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Voltage Difference"));

        javax.swing.GroupLayout VoltageDifferencePanelLayout = new javax.swing.GroupLayout(VoltageDifferencePanel);
        VoltageDifferencePanel.setLayout(VoltageDifferencePanelLayout);
        VoltageDifferencePanelLayout.setHorizontalGroup(
            VoltageDifferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        VoltageDifferencePanelLayout.setVerticalGroup(
            VoltageDifferencePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout CellVoltagePanelLayout = new javax.swing.GroupLayout(CellVoltagePanel);
        CellVoltagePanel.setLayout(CellVoltagePanelLayout);
        CellVoltagePanelLayout.setHorizontalGroup(
            CellVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CellVoltagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CellVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VoltageDifferencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(CellVoltagePanelLayout.createSequentialGroup()
                        .addComponent(MaxVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(MinVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        CellVoltagePanelLayout.setVerticalGroup(
            CellVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CellVoltagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CellVoltagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(MinVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MaxVoltagePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VoltageDifferencePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(449, 449, 449))
        );

        BatteryInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Battery Information"));

        javax.swing.GroupLayout BatteryInformationPanelLayout = new javax.swing.GroupLayout(BatteryInformationPanel);
        BatteryInformationPanel.setLayout(BatteryInformationPanelLayout);
        BatteryInformationPanelLayout.setHorizontalGroup(
            BatteryInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 179, Short.MAX_VALUE)
        );
        BatteryInformationPanelLayout.setVerticalGroup(
            BatteryInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TempreatureInformationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Tempreature Information"));

        javax.swing.GroupLayout TempreatureInformationPanelLayout = new javax.swing.GroupLayout(TempreatureInformationPanel);
        TempreatureInformationPanel.setLayout(TempreatureInformationPanelLayout);
        TempreatureInformationPanelLayout.setHorizontalGroup(
            TempreatureInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TempreatureInformationPanelLayout.setVerticalGroup(
            TempreatureInformationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PortConfigPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Port Config"));

        PortNumLabel.setText("Port Num");

        BaundRateLabel.setText("Baund Rate");

        COMPortComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM PORT" }));

        BoundRateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1200", "2400", "4800", "9600", "19200", "38400", "57600", "115200", " ", " " }));

        ConnectButton.setText("Connect");

        BreakButton.setText("Break");
        BreakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BreakButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PortConfigPanelLayout = new javax.swing.GroupLayout(PortConfigPanel);
        PortConfigPanel.setLayout(PortConfigPanelLayout);
        PortConfigPanelLayout.setHorizontalGroup(
            PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PortConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PortConfigPanelLayout.createSequentialGroup()
                        .addComponent(ConnectButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BreakButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PortConfigPanelLayout.createSequentialGroup()
                        .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PortNumLabel)
                            .addComponent(BaundRateLabel))
                        .addGap(8, 8, 8)
                        .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BoundRateComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(COMPortComboBox, 0, 82, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        PortConfigPanelLayout.setVerticalGroup(
            PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PortConfigPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortNumLabel)
                    .addComponent(COMPortComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BaundRateLabel)
                    .addComponent(BoundRateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(PortConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConnectButton)
                    .addComponent(BreakButton))
                .addGap(28, 28, 28))
        );

        TargetConfigPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Target Config"));

        javax.swing.GroupLayout TargetConfigPanelLayout = new javax.swing.GroupLayout(TargetConfigPanel);
        TargetConfigPanel.setLayout(TargetConfigPanelLayout);
        TargetConfigPanelLayout.setHorizontalGroup(
            TargetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TargetConfigPanelLayout.setVerticalGroup(
            TargetConfigPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CellVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SyatemStatusPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(MeterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BatteryVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CurrentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(WarnAndProtectPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BMSInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BatteryInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TempreatureInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PortConfigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TargetConfigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CellVoltagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BatteryInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TempreatureInformationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PortConfigPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TargetConfigPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BatteryVoltagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(CurrentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(MeterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SyatemStatusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WarnAndProtectPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BMSInformationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BreakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BreakButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BreakButtonActionPerformed

    private void BatteryVoltageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatteryVoltageTextFieldActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_BatteryVoltageTextFieldActionPerformed

    private void BatteryCurrentTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatteryCurrentTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BatteryCurrentTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BMSInformationPanel;
    private javax.swing.JTextField BatteryCurrentTextField;
    private javax.swing.JPanel BatteryInformationPanel;
    private javax.swing.JPanel BatteryVoltagePanel;
    private javax.swing.JTextField BatteryVoltageTextField;
    private javax.swing.JLabel BaundRateLabel;
    private javax.swing.JComboBox<String> BoundRateComboBox;
    private javax.swing.JButton BreakButton;
    private javax.swing.JComboBox<String> COMPortComboBox;
    private javax.swing.JPanel CellVoltagePanel;
    private javax.swing.JButton ConnectButton;
    private javax.swing.JPanel CurrentPanel;
    private javax.swing.JPanel MaxVoltagePanel;
    private javax.swing.JPanel MeterPanel;
    private javax.swing.JPanel MinVoltagePanel;
    private javax.swing.JPanel PortConfigPanel;
    private javax.swing.JLabel PortNumLabel;
    private javax.swing.JPanel SyatemStatusPanel;
    private javax.swing.JPanel TargetConfigPanel;
    private javax.swing.JPanel TempreatureInformationPanel;
    private javax.swing.JPanel VoltageDifferencePanel;
    private javax.swing.JPanel WarnAndProtectPanel;
    private com.mycompany.batterymanagementsystem.ui.GaugeChart gaugeChart;
    // End of variables declaration//GEN-END:variables
}