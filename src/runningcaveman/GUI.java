package runningcaveman;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


/**
 *
 * @author Eric
 */
public class GUI extends javax.swing.JFrame {

    RunningCaveMan cave = new RunningCaveMan(this);

    public GUI() throws InterruptedException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);

    }

    public void setMinIcon(String minnesStr) {
        runningLabel.setIcon(null);
            try{
                BufferedImage img = ImageIO.read(new File(minnesStr));
//                bgLabel.revalidate();
//                bgLabel.repaint();
//                bgLabel.update(bgLabel.getGraphics());
                runningLabel.setIcon(new ImageIcon(img));
                runningLabel.revalidate();
                runningLabel.repaint();
                runningLabel.update(runningLabel.getGraphics());

            }catch (IOException ex){
                
            }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        runingPanel = new javax.swing.JPanel();
        runningLabel = new javax.swing.JLabel();
        walkBtn = new javax.swing.JButton();
        runBtn = new javax.swing.JButton();
        sprintBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        runingPanel.setPreferredSize(new java.awt.Dimension(1100, 1100));
        runingPanel.setLayout(null);

        runningLabel.setBackground(new java.awt.Color(51, 51, 51));
        runningLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        runningLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        runningLabel.setMaximumSize(new java.awt.Dimension(1076, 1000));
        runningLabel.setMinimumSize(new java.awt.Dimension(1076, 1000));
        runningLabel.setOpaque(true);
        runingPanel.add(runningLabel);
        runningLabel.setBounds(10, -60, 1060, 850);

        walkBtn.setText("Walk");
        walkBtn.setPreferredSize(new java.awt.Dimension(60, 35));
        walkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                walkBtnActionPerformed(evt);
            }
        });
        runingPanel.add(walkBtn);
        walkBtn.setBounds(10, 790, 121, 60);

        runBtn.setText("Run");
        runBtn.setPreferredSize(new java.awt.Dimension(60, 35));
        runBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runBtnActionPerformed(evt);
            }
        });
        runingPanel.add(runBtn);
        runBtn.setBounds(150, 790, 121, 60);

        sprintBtn1.setText("Sprint");
        sprintBtn1.setPreferredSize(new java.awt.Dimension(60, 35));
        sprintBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sprintBtn1ActionPerformed(evt);
            }
        });
        runingPanel.add(sprintBtn1);
        sprintBtn1.setBounds(290, 790, 121, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(runingPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1076, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(runingPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void walkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_walkBtnActionPerformed
        try {
            cave.setImageTre(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_walkBtnActionPerformed

    private void runBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runBtnActionPerformed
       try {
            cave.setImageTre(50);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_runBtnActionPerformed

    private void sprintBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sprintBtn1ActionPerformed
                    try {
            cave.setImageTre(3);
        } catch (InterruptedException ex) {
            Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sprintBtn1ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GUI().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton runBtn;
    private javax.swing.JPanel runingPanel;
    private javax.swing.JLabel runningLabel;
    private javax.swing.JButton sprintBtn1;
    private javax.swing.JButton walkBtn;
    // End of variables declaration//GEN-END:variables
}
