/* * To change this license header, choose License Headers in Project Properties. * To change this template file, choose Tools | Templates * and open the template in the editor. */


import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class NewRequests extends javax.swing.JFrame {
    int requestNumber;
    String userID;
    String userType;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    int count = 100;

    /**
     * Creates new form NewRequests     * @param new_userID
     */
    public NewRequests(String new_userID) {
        initComponents();
        userID = new_userID;
        try {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:./resources/HealthConnectDb");
            //JOptionPane.showMessageDialog (null, "Connected");
            Statement statement = conn.createStatement();
            String sql = "select RID from Request";
            rs = statement.executeQuery(sql);
            while (rs.next()) count++;
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        RequestID.setText("RequestID: " + count);
        PatientID.setText("PatientID: " + userID);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * * WARNING: Do NOT modify this code. The content of this method is always
     * * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
// <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        jLabel6 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        createButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        RequestID = new javax.swing.JLabel();
        PatientID = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("HealthConnect");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Title.setFont(new java.awt.Font("Eras Demi ITC", 2, 18)); // NOI18N
        Title.setText("Create a New Request");
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Insert new request here...");
        jScrollPane1.setViewportView(jTextArea1);
        createButton.setText("Create Request");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });
        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        RequestID.setText("Request ID:");
        PatientID.setText("Patient ID:");
        jLabel7.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText("HealthConnect");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(RequestID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(PatientID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap())
                                .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(createButton))
                                        .addContainerGap(56, Short.MAX_VALUE))))
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(RequestID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(173, 173, 173))
                .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        int pane = JOptionPane.showConfirmDialog(null, "Are you sure you want to create the request?", "Create Request", JOptionPane.YES_NO_OPTION);
        if (pane == 0) {
            String sql = "insert into Message (RID, DUsername, TimeStamp, Message) values (?, ?, ?, ?)";
            try {
                pst = conn.prepareStatement(sql);
                String temp = Integer.toString(count);
                pst.setString(1, temp);
                pst.setString(2, null);
                Date date = new Date();
                String timestamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(date);
                pst.setString(3, timestamp);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\n");
                stringBuilder.append(jTextArea1.getText());
                stringBuilder.append("\n Added by ").append("Patient").append(" ").append(userID);
                String finalString = stringBuilder.toString();
                pst.setString(4, finalString);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Message created");
                sql = "insert into Request (RID, PUsername, Date, Status) values (?, ?, ?, ?)";
                pst = conn.prepareStatement(sql);
                pst.setString(1, temp);
                pst.setString(2, userID);
                pst.setString(3, timestamp);
                pst.setString(4, "New");
                pst.execute();
            } catch (SQLException | HeadlessException e) {
                JOptionPane.showMessageDialog(null, e);
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
            PatientView j = new PatientView(userID);
            j.setVisible(true);
            dispose();
        }
    }

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        Profile p = new Profile(userID);
        p.setVisible(true);
        dispose();
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
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewRequests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }        //</editor-fold>
        NewJFrame n = new NewJFrame();
        final PatientView v = new PatientView(n.getUsername());        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewRequests(v.getUsername()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel PatientID;
    private javax.swing.JLabel RequestID;
    private javax.swing.JLabel Title;
    private javax.swing.JButton createButton;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;    // End of variables declaration
}
