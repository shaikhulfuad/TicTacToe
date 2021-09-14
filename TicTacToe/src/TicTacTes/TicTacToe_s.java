
package TicTacTes;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;

public class TicTacToe_s extends javax.swing.JFrame {
    private String initgame="X";
    private int Xwins = 0;
    private int Owins = 0;
    
    
    
    
    public TicTacToe_s() {
        initComponents();
        setSize(1000,600);
        setLocationRelativeTo(null);
        setResizable(false);
        ImageIcon icon = new ImageIcon(getClass().getResource("icon.png"));
        setIconImage(icon.getImage());
        
    }
    
    
    void gamePoints(){
        jButton10.setText(String.valueOf(Xwins));
        jButton12.setText(String.valueOf(Owins));
    }
    
    
    private void chooseplayer(){
        if(initgame.equalsIgnoreCase("X")){
            initgame="O";
        }
        else
            initgame="X";
    }
    
    
    private void gamegoal()
    {
        String B1=jButton1.getText();
        String B2=jButton2.getText();
        String B3=jButton3.getText();
        
        String B4=jButton4.getText();
        String B5=jButton5.getText();
        String B6=jButton6.getText();
        
        String B7=jButton7.getText();
        String B8=jButton8.getText();
        String B9=jButton9.getText();
        
        if(B1==("X") && B2==("X") && B3==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton1.setBackground(Color.PINK);
            jButton2.setBackground(Color.PINK);
            jButton3.setBackground(Color.PINK);
            
        }
        
        
        if(B4==("X") && B5==("X") && B6==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton4.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton6.setBackground(Color.PINK);
        }
        
        
        if(B7==("X") && B8==("X") && B9==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton7.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
        }
        
        
        if(B1==("X") && B4==("X") && B7==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        
        
        if(B2==("X") && B5==("X") && B8==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        
        
        
        if(B3==("X") && B6==("X") && B9==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        
        
        
        if(B1==("X") && B5==("X") && B9==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton1.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton9.setBackground(Color.LIGHT_GRAY);
        }
        
        
        
        if(B3==("X") && B5==("X") && B7==("X"))
        {
            JOptionPane.showMessageDialog(null,"Player X wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Xwins++;
            gamePoints();
            
            jButton3.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton7.setBackground(Color.LIGHT_GRAY);
        }
        
        
        
        ///////////////////////////////////////////////*CODE FOR O*/////////////////////////////////////////////////////////////////
        
        
        
        
        if(B1==("O") && B2==("O") && B3==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton1.setBackground(Color.PINK);
            jButton2.setBackground(Color.PINK);
            jButton3.setBackground(Color.PINK);
        }
        
        
        if(B4==("O") && B5==("O") && B6==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton4.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton6.setBackground(Color.PINK);
        }
        
        
        if(B7==("O") && B8==("O") && B9==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton7.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
        }
        
        
        if(B1==("O") && B4==("O") && B7==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton1.setBackground(Color.GREEN);
            jButton4.setBackground(Color.GREEN);
            jButton7.setBackground(Color.GREEN);
        }
        
        
        if(B2==("O") && B5==("O") && B8==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton2.setBackground(Color.GREEN);
            jButton5.setBackground(Color.GREEN);
            jButton8.setBackground(Color.GREEN);
        }
        
        
        
        if(B3==("O") && B6==("O") && B9==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton3.setBackground(Color.GREEN);
            jButton6.setBackground(Color.GREEN);
            jButton9.setBackground(Color.GREEN);
        }
        
        
        
        if(B1==("O") && B5==("O") && B9==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton1.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton9.setBackground(Color.LIGHT_GRAY);
        }
        
        
        
        if(B3==("O") && B5==("O") && B7==("O"))
        {
            JOptionPane.showMessageDialog(null,"Player O wins ! ! ! ! !", "***WINNER***", JOptionPane.INFORMATION_MESSAGE);
            Owins++;
            gamePoints();
            
            jButton3.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton7.setBackground(Color.LIGHT_GRAY);
        }
        
          
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bradley Hand ITC", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("T!C-TAC-TOE");
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(290, 0, 410, 75);

        jPanel3.setLayout(new java.awt.GridLayout(3, 3));

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setBackground(java.awt.Color.yellow);
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel2);

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setBackground(java.awt.Color.yellow);
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setBackground(java.awt.Color.yellow);
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton4.setBackground(java.awt.Color.yellow);
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 204, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton5.setBackground(java.awt.Color.yellow);
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 204, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton6.setBackground(java.awt.Color.yellow);
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 204, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton7.setBackground(java.awt.Color.yellow);
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 204, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setBackground(java.awt.Color.yellow);
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 204, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jButton9.setBackground(java.awt.Color.yellow);
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel11);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(504, 109, 392, 369);

        jLabel2.setFont(new java.awt.Font("Bradley Hand ITC", 1, 24)); // NOI18N
        jLabel2.setText("PLAYER X   -   PLAYER O");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(22, 109, 313, 42);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(153, 0, 153));
        jButton10.setText("0");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(60, 160, 52, 50);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 0, 153));
        jButton12.setText("0");
        jPanel1.add(jButton12);
        jButton12.setBounds(230, 160, 50, 50);

        jButton11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 51, 255));
        jButton11.setText("PLAY AGAIN");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);
        jButton11.setBounds(110, 380, 130, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacTes/imgn2.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(120, 0, 80, 100);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TicTacTes/nerd2.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(780, -40, 80, 110);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            jButton1.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton1.setForeground(Color.BLUE);
        }
        else
            jButton1.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
            
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            jButton2.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton2.setForeground(Color.BLUE);
        }
        else
            jButton2.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         jButton3.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton3.setForeground(Color.BLUE);
        }
        else
            jButton3.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
            jButton4.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton4.setForeground(Color.BLUE);
        }
        else
            jButton4.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            jButton5.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton5.setForeground(Color.BLUE);
        }
        else
            jButton5.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
            jButton6.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton6.setForeground(Color.BLUE);
        }
        else
            jButton6.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            
            jButton7.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton7.setForeground(Color.BLUE);
        }
        else
            jButton7.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           
            jButton8.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton8.setForeground(Color.BLUE);
        }
        else
            jButton8.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            
            jButton9.setText(initgame);
        if(initgame.equalsIgnoreCase("X")){
            
            jButton9.setForeground(Color.BLUE);
        }
        else
            jButton9.setForeground(Color.RED);
        
        
        chooseplayer();
        gamegoal();
        
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        
        
        
        jButton1.setBackground(Color.YELLOW);
        jButton2.setBackground(Color.YELLOW);
        jButton3.setBackground(Color.YELLOW);
        
        
        jButton4.setBackground(Color.YELLOW);
        jButton5.setBackground(Color.YELLOW);
        jButton6.setBackground(Color.YELLOW);
        
        jButton7.setBackground(Color.YELLOW);
        jButton8.setBackground(Color.YELLOW);
        jButton9.setBackground(Color.YELLOW);
    }//GEN-LAST:event_jButton11ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
