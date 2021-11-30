
package com.mycompany.aplicationloginandregister;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Eduardo Andretta
 */
public class LoginFrame extends javax.swing.JFrame {

  
    public LoginFrame() {
        initComponents();
        
        
        //forestLabel.setIcon(new javax.swing.ImageIcon);
        
        //resizeImage(forestLabel, "C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\forest1.jpg");
        
        /* Connector - JAVA - MySQL Database */
        
        
        
        
        
        
        //Center the Form Inicialization
        this.setLocationRelativeTo(null);
        
        //Border Creation (jPanel title)
        //Border title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.WHITE);
        //jPanelTitle.setBorder(title_border); 
        
        //-----------------//Minimize Button//-----------------//
        Border globalBorderM = BorderFactory.createMatteBorder(1,1,1,1, new Color(0,0,0));
        jPanel2.setBorder(globalBorderM);
  
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        miniLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 153));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(108, 104, 252));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        userField.setBackground(new java.awt.Color(108, 104, 252));
        userField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userField.setForeground(new java.awt.Color(204, 204, 204));
        userField.setText("username");
        userField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        userField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                userFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                userFieldFocusLost(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(108, 104, 252));
        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("password");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(108, 104, 252));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.lightGray, java.awt.Color.lightGray));
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginButtonMouseExited(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                    .addComponent(userField)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(userField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        // Set icon to the jLabel
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\password.png"));
        // Set icon to the jLabel
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\customer.png"));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 460, 410));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        miniLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        miniLabel.setForeground(new java.awt.Color(230, 230, 230));
        miniLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        miniLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniLabelMouseExited(evt);
            }
        });
        jPanel2.add(miniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 40, 30));
        // Set icon to the jLabel
        miniLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\minimize.png"));

        closeLabel.setBackground(new java.awt.Color(230, 230, 230));
        closeLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeLabel.setForeground(new java.awt.Color(230, 230, 230));
        closeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeLabelMouseExited(evt);
            }
        });
        jPanel2.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 40, 30));
        // Set icon to the jLabel
        closeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\close.png"));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 30));

        jPanel1.setBackground(new java.awt.Color(53, 50, 124));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanelTitle.setBackground(new java.awt.Color(87, 84, 204));
        jPanelTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setBackground(new java.awt.Color(230, 230, 230));
        jLabelTitle.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(230, 230, 230));
        jLabelTitle.setText("Login");
        jPanelTitle.add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 350, 60));

        getContentPane().add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 460, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void resizeImage(JLabel variableJlabel, String photo)
    {  
        BufferedImage icon = null;
        
        try 
        {
            
            icon = ImageIO.read(new File(photo));
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
        
        Image dimg = icon.getScaledInstance(variableJlabel.getWidth(), variableJlabel.getHeight(),
        Image.SCALE_SMOOTH);

        ImageIcon profileIcon = new ImageIcon(dimg);
        
        variableJlabel.setIcon(profileIcon); 
        
    }
    
    private void miniLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseEntered
        
        //-----------------//Minimize Button//-----------------//
        Border actionButton = BorderFactory.createMatteBorder(1,1,0,1, Color.BLACK);
        miniLabel.setBorder(actionButton);
  
    }//GEN-LAST:event_miniLabelMouseEntered

    private void miniLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseExited
        
        //-----------------//Minimize Button//-----------------//
        miniLabel.setBorder(null);
        
    }//GEN-LAST:event_miniLabelMouseExited

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered
        
        //-----------------//Close Button//-----------------//
        Border actionButton = BorderFactory.createMatteBorder(1,1,0,1, Color.BLACK);
        closeLabel.setBorder(actionButton);
        
    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited
        
        //-----------------//Close Button//-----------------//
        closeLabel.setBorder(null);
    }//GEN-LAST:event_closeLabelMouseExited

    private void userFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusGained
        
        // Clear - TextField on Focus [Param - Text == "username" or is empty]
        if(userField.getText().trim().toLowerCase().equals("username") ||
           userField.getText().trim().isEmpty())
        {
            userField.setText("");
            userField.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_userFieldFocusGained

    private void userFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userFieldFocusLost
        
        // Seting - TextField on Focus [If the text field is empty]
        if(userField.getText().trim().isEmpty())
        {
            userField.setText("username");
            userField.setForeground(new Color(204,204,204));
        }
        
        // Border - Field
        userField.setBorder(null);     
    }//GEN-LAST:event_userFieldFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        
        // Clear - TextField on Focus [Param - Text == "password" or is empty]
        
        // Get the password words
        String password = String.valueOf(passwordField.getPassword());
        
        if(password.trim().equals("password") ||
           password.trim().isEmpty())
        {
            passwordField.setText("");
            passwordField.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
       
        // Seting - TextField on Focus [If the text field is empty]
        
        // Get the password words
        String password = String.valueOf(passwordField.getPassword());
        
        if(password.trim().isEmpty())
        {
            passwordField.setText("password");
            passwordField.setForeground(new Color(204,204,204));
        }
        
        // Border - Field
        passwordField.setBorder(null);
    }//GEN-LAST:event_passwordFieldFocusLost

    private void miniLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseClicked
        
        // Seting the Event MouseClicked in miniLabel (minimize)
        this.setState(LoginFrame.ICONIFIED);
        
    }//GEN-LAST:event_miniLabelMouseClicked

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked
        
        // Seting the Event MouseClicked in closeLabel (close)
        System.exit(0);
  
    }//GEN-LAST:event_closeLabelMouseClicked

        int xx,xy;
    
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        
        //Drag this pane (Drag Windows with mouse)
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        
        //Source to Drag (Drag Windows with mouse)
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
        
    }//GEN-LAST:event_jPanel2MouseDragged

    private void loginButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseEntered
        
        // Button Login - MouseEntered
        
        loginButton.setBackground(new Color(87,84,204));
           
    }//GEN-LAST:event_loginButtonMouseEntered

    private void loginButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseExited
        
        // Button Login - MouseExited
        
        loginButton.setBackground(new Color(108,104,252));
           
    }//GEN-LAST:event_loginButtonMouseExited

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        //---// LOGIN - Button //---//
        
        PreparedStatement st;
        ResultSet rs;
        
        // get the username and setting .trim() for clear empty camp on left or right
        String username = userField.getText().trim();
        String password = String.valueOf(passwordField.getPassword()).trim();
        
        // verification - null or ""
        if(username == null || "".equals(username) || (password == null || "".equals(password))||
           (username.toUpperCase() == "USERNAME") || (password.toUpperCase() == "PASSWORD"))
        {
            
            JOptionPane.showMessageDialog(null, "Empty or invalid username / password","Error", 2);
            
        }else
        {
            // create a select query on SQL database to check if the username and password exist
            String query = "SELECT * FROM users WHERE username = ? AND password = md5(?)";
            
            try 
            {
                st = My_CNX.getConnection().prepareStatement(query);
                
                st.setString(1, username);
                st.setString(2, password);
                rs = st.executeQuery();
                
                if(rs.next())
                {
                    // show a new form
                    //--------------//
                    Interface form = new Interface();
                    form.setVisible(true);
                    form.pack();
                    form.setLocationRelativeTo(null);
                    
                    // close the LoginFrame
                    this.dispose();
                    
                }else
                {
                    // show error message
                    JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error", 2);
                    
                }
                
            } catch (SQLException ex) 
            {
                Logger.getLogger(LoginFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
            
            
        
    }//GEN-LAST:event_loginButtonActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel miniLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userField;
    // End of variables declaration//GEN-END:variables
}
