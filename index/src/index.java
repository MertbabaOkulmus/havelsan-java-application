
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gernas
 */
public class index extends javax.swing.JFrame {

    /**
     * Creates new form index
     */
    public index() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrpSecimler = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        radioSlave = new javax.swing.JRadioButton();
        radioMaster = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Start");
        jButton1.setName(""); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btngrpSecimler.add(radioSlave);
        radioSlave.setText("Slave");
        radioSlave.setActionCommand("radioSlave");

        btngrpSecimler.add(radioMaster);
        radioMaster.setText("Master");
        radioMaster.setActionCommand("radioMaster");
        radioMaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMasterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Index");

        jLabel2.setText("Çalıştırmak İstediğiniz Uygulamayı Seçiniz");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioMaster)
                                .addGap(38, 38, 38)
                                .addComponent(radioSlave)
                                .addGap(34, 34, 34)
                                .addComponent(jButton1)))))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioSlave)
                    .addComponent(radioMaster)
                    .addComponent(jButton1))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try(FileWriter process_writer=new FileWriter("../process_state.txt")){//dosyaların oluşturulması
            
             
            
            if (radioMaster.isSelected()) {
                process_writer.write("Application:Master/Slave, State=Start/Stop");
            }
            else if(radioSlave.isSelected()){
                process_writer.write("Application:Master/Slave, State=Stop/Start");
            }
           
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"IOException hatası var...");
        }
        
        
        try(Scanner process_reader=new Scanner(new FileReader("../process_state.txt"))){
            
            
             while(process_reader.hasNextLine()){
                  String kontrol=process_reader.nextLine();
                  //Application:Master/Slave, State=Start/Stop
                  int startIndex=kontrol.indexOf("=");
                  int stopIndex=kontrol.lastIndexOf("/");
                  String master=kontrol.substring(startIndex+1, stopIndex);
                  String slave=kontrol.substring(stopIndex+1,kontrol.length());
                  
                  String message="Master : "+master+" \n Slave : "+slave;
                 
                  
                  JOptionPane.showMessageDialog(this,message);
                  
                  
                 
            }
            
        
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this,"FileFileNotFoundException hatası var...");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,"IOException hatası var...");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void radioMasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMasterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioMasterActionPerformed

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
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngrpSecimler;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton radioMaster;
    private javax.swing.JRadioButton radioSlave;
    // End of variables declaration//GEN-END:variables
}
