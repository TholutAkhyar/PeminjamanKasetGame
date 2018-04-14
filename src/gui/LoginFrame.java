package gui;


import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TholutAkhyar
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    ResultSet LoginResultSet;
    lib.Master Master = new lib.Master();
    gui.DashboardFrame Dashboard = new gui.DashboardFrame();
    
    public LoginFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginMainPanel = new javax.swing.JPanel();
        LoginImage = new javax.swing.JLabel();
        LoginCloseButton = new javax.swing.JLabel();
        LoginMinimizeButton = new javax.swing.JLabel();
        LoginButton = new javax.swing.JLabel();
        LoginUsernameLine = new javax.swing.JPanel();
        LoginPasswordInput = new javax.swing.JPasswordField();
        LoginPasswordLine = new javax.swing.JPanel();
        LoginUsernameInput = new javax.swing.JTextField();
        LoginLabel = new javax.swing.JLabel();
        LoginUsernameTitle = new javax.swing.JLabel();
        LoginPasswordTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Peminjaman Kaset Game - Login");
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        setSize(new java.awt.Dimension(700, 400));

        LoginMainPanel.setBackground(new java.awt.Color(44, 47, 51));

        LoginImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoginPageImage.png"))); // NOI18N

        LoginCloseButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginCloseButton.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        LoginCloseButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginCloseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginCloseButton.setText("X");
        LoginCloseButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginCloseButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginCloseButton.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginCloseButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginCloseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginCloseButtonMouseClicked(evt);
            }
        });

        LoginMinimizeButton.setBackground(new java.awt.Color(255, 255, 255));
        LoginMinimizeButton.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        LoginMinimizeButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginMinimizeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginMinimizeButton.setText("-");
        LoginMinimizeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginMinimizeButton.setMaximumSize(new java.awt.Dimension(40, 40));
        LoginMinimizeButton.setMinimumSize(new java.awt.Dimension(40, 40));
        LoginMinimizeButton.setPreferredSize(new java.awt.Dimension(40, 40));
        LoginMinimizeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginMinimizeButtonMouseClicked(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(114, 137, 218));
        LoginButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setText("Login");
        LoginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LoginButton.setOpaque(true);
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginButtonMouseExited(evt);
            }
        });

        LoginUsernameLine.setBackground(new java.awt.Color(35, 39, 42));

        javax.swing.GroupLayout LoginUsernameLineLayout = new javax.swing.GroupLayout(LoginUsernameLine);
        LoginUsernameLine.setLayout(LoginUsernameLineLayout);
        LoginUsernameLineLayout.setHorizontalGroup(
            LoginUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        LoginUsernameLineLayout.setVerticalGroup(
            LoginUsernameLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        LoginPasswordInput.setBackground(new java.awt.Color(44, 47, 51));
        LoginPasswordInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LoginPasswordInput.setForeground(new java.awt.Color(255, 255, 255));
        LoginPasswordInput.setText("Password");
        LoginPasswordInput.setBorder(null);
        LoginPasswordInput.setOpaque(false);
        LoginPasswordInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginPasswordInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginPasswordInputFocusLost(evt);
            }
        });
        LoginPasswordInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginPasswordInputKeyPressed(evt);
            }
        });

        LoginPasswordLine.setBackground(new java.awt.Color(35, 39, 42));

        javax.swing.GroupLayout LoginPasswordLineLayout = new javax.swing.GroupLayout(LoginPasswordLine);
        LoginPasswordLine.setLayout(LoginPasswordLineLayout);
        LoginPasswordLineLayout.setHorizontalGroup(
            LoginPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        LoginPasswordLineLayout.setVerticalGroup(
            LoginPasswordLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        LoginUsernameInput.setBackground(new java.awt.Color(44, 47, 51));
        LoginUsernameInput.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        LoginUsernameInput.setForeground(new java.awt.Color(255, 255, 255));
        LoginUsernameInput.setText("Username");
        LoginUsernameInput.setBorder(null);
        LoginUsernameInput.setOpaque(false);
        LoginUsernameInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LoginUsernameInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LoginUsernameInputFocusLost(evt);
            }
        });
        LoginUsernameInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginUsernameInputKeyPressed(evt);
            }
        });

        LoginLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        LoginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginLabel.setText("Login");

        LoginUsernameTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LoginUsernameTitle.setForeground(new java.awt.Color(255, 255, 255));
        LoginUsernameTitle.setText(" ");

        LoginPasswordTitle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LoginPasswordTitle.setForeground(new java.awt.Color(255, 255, 255));
        LoginPasswordTitle.setText(" ");

        javax.swing.GroupLayout LoginMainPanelLayout = new javax.swing.GroupLayout(LoginMainPanel);
        LoginMainPanel.setLayout(LoginMainPanelLayout);
        LoginMainPanelLayout.setHorizontalGroup(
            LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginMainPanelLayout.createSequentialGroup()
                .addComponent(LoginImage)
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginMainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LoginMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoginCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(LoginMainPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LoginUsernameLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginPasswordInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginPasswordLine, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginUsernameInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginUsernameTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginPasswordTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LoginLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 54, Short.MAX_VALUE))))
        );
        LoginMainPanelLayout.setVerticalGroup(
            LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LoginMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoginCloseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginMinimizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LoginLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoginUsernameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginUsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(LoginUsernameLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(LoginPasswordTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(LoginPasswordLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void LoginMaster() {
        String data_login[] = {LoginUsernameInput.getText(), LoginPasswordInput.getText()}; 
        if(!"".equals(data_login[0]) && !"Username".equals(data_login[0])) {
            if(!"".equals(data_login[1]) && !"Password".equals(data_login[1])) {
                try {
            
                    lib.MySQL MySQL = new lib.MySQL();
            
                    String sql = "select * from user where username = '"+ data_login[0] + "' && password = '"+data_login[1]+ "'";
                    LoginResultSet = MySQL.MySQLQuery(sql);
            
                    if (LoginResultSet.next()) {
                        System.out.println("UserID: "+LoginResultSet.getString("user_id"));
                        String data_dashboard[] = {LoginResultSet.getString("user_id"),LoginResultSet.getString("user_jabatan")};
                        /*
                        Note:
                        1 = pemilik
                        2 = karyawan
                        3 = pelanggan (tidak bisa masuk)
                        */
                        if (!"Pelanggan".equals(Master.RankName(Integer.parseInt(data_dashboard[1])))) {
                            Master.showTholutDashboard(Integer.parseInt(data_dashboard[0]));
                            this.setVisible(false);
                            Master.showTholutDialogOk("Informasi", "Login berhasil sebagai "+data_login[0], "Success");
                        } else { // Pelanggan
                            Master.showTholutDialogOk("Informasi", "Maaf "+data_login[0]+" bukan pemilik/karyawan", "Failed");
                        }
                        
                    } else {
                        Master.showTholutDialogOk("Informasi", "Username dan password salah", "Error");
                    }
            
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
                
            } else {
                Master.showTholutDialogOk("Informasi", "Password tidak boleh kosong", "Warning");
            }
        } else {
            Master.showTholutDialogOk("Informasi", "Username tidak boleh kosong", "Warning");
        }
    }
    
    private void LoginCloseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginCloseButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_LoginCloseButtonMouseClicked

    private void LoginMinimizeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMinimizeButtonMouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_LoginMinimizeButtonMouseClicked

    private void LoginUsernameInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameInputFocusGained
        // TODO add your handling code here:
        LoginUsernameLine.setBackground(new java.awt.Color(255,255,255));
        if ("Username".equals(LoginUsernameInput.getText())) {
            LoginUsernameInput.setText("");
            LoginUsernameTitle.setText("Username");
        }
    }//GEN-LAST:event_LoginUsernameInputFocusGained

    private void LoginUsernameInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginUsernameInputFocusLost
        // TODO add your handling code here:
        LoginUsernameLine.setBackground(new java.awt.Color(35, 39, 42));
        if ("".equals(LoginUsernameInput.getText())) {
            LoginUsernameInput.setText("Username");
            LoginUsernameTitle.setText(" ");
        }
    }//GEN-LAST:event_LoginUsernameInputFocusLost

    private void LoginPasswordInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginPasswordInputFocusGained
        // TODO add your handling code here:
        LoginPasswordLine.setBackground(new java.awt.Color(255,255,255));
        if ("Password".equals(LoginPasswordInput.getText())) {
            LoginPasswordInput.setText("");
            LoginPasswordTitle.setText("Password");
        }
    }//GEN-LAST:event_LoginPasswordInputFocusGained

    private void LoginPasswordInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LoginPasswordInputFocusLost
        // TODO add your handling code here:
        LoginPasswordLine.setBackground(new java.awt.Color(35, 39, 42));
        if ("".equals(LoginPasswordInput.getText())) {
            LoginPasswordInput.setText("Password");
            LoginPasswordTitle.setText(" ");
        }
    }//GEN-LAST:event_LoginPasswordInputFocusLost

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        // TODO add your handling code here:
        LoginMaster();
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void LoginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseEntered
        // TODO add your handling code here:
        LoginButton.setBackground(new java.awt.Color(103, 123, 196));
    }//GEN-LAST:event_LoginButtonMouseEntered

    private void LoginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseExited
        // TODO add your handling code here:
        LoginButton.setBackground(new java.awt.Color(114, 137, 218));
    }//GEN-LAST:event_LoginButtonMouseExited

    private void LoginUsernameInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginUsernameInputKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            LoginMaster();
        }
    }//GEN-LAST:event_LoginUsernameInputKeyPressed

    private void LoginPasswordInputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginPasswordInputKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            LoginMaster();
        }
    }//GEN-LAST:event_LoginPasswordInputKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginButton;
    private javax.swing.JLabel LoginCloseButton;
    private javax.swing.JLabel LoginImage;
    private javax.swing.JLabel LoginLabel;
    private javax.swing.JPanel LoginMainPanel;
    private javax.swing.JLabel LoginMinimizeButton;
    private javax.swing.JPasswordField LoginPasswordInput;
    private javax.swing.JPanel LoginPasswordLine;
    private javax.swing.JLabel LoginPasswordTitle;
    private javax.swing.JTextField LoginUsernameInput;
    private javax.swing.JPanel LoginUsernameLine;
    private javax.swing.JLabel LoginUsernameTitle;
    // End of variables declaration//GEN-END:variables
}
