package com.mycompany.aplicationloginandregister;


import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;


/**
 *
 * @author Eduardo Andretta
 */
public class Interface extends javax.swing.JFrame {


    public Interface() {
        initComponents();
        
        resizeImage(labelImage, "C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\leafFlorest.jpg");
        
    }

    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelImage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        miniLabel = new javax.swing.JLabel();
        closeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(labelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 315, 520));

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
        jPanel2.add(miniLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 40, 30));
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
        jPanel2.add(closeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 40, 30));
        // Set icon to the jLabel
        closeLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eduardo Andretta\\Documents\\AplicationLoginAndRegister\\src\\main\\java\\images\\close.png"));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miniLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseClicked

        // Seting the Event MouseClicked in miniLabel (minimize)
        this.setState(LoginFrame.ICONIFIED);

    }//GEN-LAST:event_miniLabelMouseClicked

    private void miniLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseEntered

        //-----------------//Minimize Button//-----------------//
        Border actionButton = BorderFactory.createMatteBorder(1,1,0,1, Color.BLACK);
        miniLabel.setBorder(actionButton);

    }//GEN-LAST:event_miniLabelMouseEntered

    private void miniLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniLabelMouseExited

        //-----------------//Minimize Button//-----------------//
        miniLabel.setBorder(null);

    }//GEN-LAST:event_miniLabelMouseExited

    private void closeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseClicked

        // Seting the Event MouseClicked in closeLabel (close)
        System.exit(0);

    }//GEN-LAST:event_closeLabelMouseClicked

    private void closeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseEntered

        //-----------------//Close Button//-----------------//
        Border actionButton = BorderFactory.createMatteBorder(1,1,0,1, Color.BLACK);
        closeLabel.setBorder(actionButton);

    }//GEN-LAST:event_closeLabelMouseEntered

    private void closeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLabelMouseExited

        //-----------------//Close Button//-----------------//
        closeLabel.setBorder(null);
    }//GEN-LAST:event_closeLabelMouseExited

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged

        //Source to Drag (Drag Windows with mouse)
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);

    }//GEN-LAST:event_jPanel2MouseDragged

    int xx = 0;
    int xy = 0;
    
    
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        //Drag this pane (Drag Windows with mouse)
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

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
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel miniLabel;
    // End of variables declaration//GEN-END:variables
}
