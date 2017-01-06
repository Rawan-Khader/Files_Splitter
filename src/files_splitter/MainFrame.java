/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files_splitter;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    FileSplit file_split;

    public MainFrame() {
        initComponents();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2,
                size.height / 2 - getHeight() / 2);
        setLocationRelativeTo(null);

        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);

        jRadioButton1.setSelected(true);
        jRadioButton1ActionPerformed(null);

        jComboBox1.removeAllItems();
        jComboBox1.addItem("KB");
        jComboBox1.addItem("MB");
        jComboBox1.addItem("GB");
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/icon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton5 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Files Splitter & Collector");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("File to split: ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 400, -1));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 62, -1));

        jTextField3.setName(""); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 89, -1));
        jTextField3.getAccessibleContext().setAccessibleName("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 80, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 89, -1));

        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Size of each part");
        jRadioButton1.setName(""); // NOI18N
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 40));

        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Number of parts");
        jRadioButton2.setName(""); // NOI18N
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 40));

        jButton5.setText("Split");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 170, -1));

        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel7.setPreferredSize(new java.awt.Dimension(34, 1));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 472, 4));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bar.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(695, 3));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("File Size: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back11.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 350));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("choosertitle");
        chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        //chooser.setAcceptAllFileFilterUsed(false);

        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
            System.out.println("No Selection ");
        }

        jTextField1.setText(chooser.getSelectedFile().getAbsolutePath());
        String size_unit = "";
        double size = 0.00;
        if (chooser.getSelectedFile().length() > 1073741824) {
            size = chooser.getSelectedFile().length() / 1073741824;
            size_unit = "GB";
        } else if (chooser.getSelectedFile().length() > 1048576 && chooser.getSelectedFile().length() < 1073741824) {
            size = chooser.getSelectedFile().length() / 1048576;
            size_unit = "MB";
        } else if (chooser.getSelectedFile().length() > 1024 && chooser.getSelectedFile().length() < 1048576) {
            size = chooser.getSelectedFile().length() / 1024;
            size_unit = "KB";
        } else {
            size = chooser.getSelectedFile().length();
            size_unit = "Bytes";
        }
        jLabel5.setText(Double.toString(size) + "  " + size_unit);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jTextField3.setEnabled(false);
        jTextField4.setEnabled(true);
        jComboBox1.setEnabled(false);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jTextField3.setEnabled(true);
        jTextField4.setEnabled(false);
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        file_split = new FileSplit();

        if (!jTextField1.getText().isEmpty()) {

            if (jRadioButton1.isSelected()) {
                if (!jTextField3.getText().isEmpty()) {
                    int bytes_convertor = 1024;

                    if (jComboBox1.getSelectedIndex() == 0) {
                        bytes_convertor = 1024;
                    } else if (jComboBox1.getSelectedIndex() == 1) {
                        bytes_convertor = 1048576;
                    } else if (jComboBox1.getSelectedIndex() == 2) {
                        bytes_convertor = 1073741824;
                    }
                    if (file_split.splitFileBySizeForEachPart(jTextField1.getText(), Byte.parseByte(jTextField3.getText()), bytes_convertor) > 0) {
                        JOptionPane.showMessageDialog(this, "Your File Splitted Successfully By size of each part !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please fill the field of size of each part !");
                }
            } else {
                try {
                    if (!jTextField4.getText().isEmpty()) {
                        file_split.splitFileByNumberofChunks(jTextField1.getText(), Integer.parseInt(jTextField4.getText()));
                        JOptionPane.showMessageDialog(this, "Your File Splitted Successfully By Number of Chunks !");

                    } else {
                        JOptionPane.showMessageDialog(this, "Please fill the field of Number of parts !");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please browse for a file to split !");
        }

    }//GEN-LAST:event_jButton5ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
