/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePkg.tools;

import DataPkg.SavedFileObj;
import DataPkg.dataManager;
import DataPkg.frequencyFileReader;
import DataPkg.graphFileReader;
import DataPkg.posMeasuresFileReader;
import InterfacePkg.MainMenuFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ignacio
 */
public class baseKnowlegeFrame extends javax.swing.JFrame {

    /**
     * Creates new form baseKnowlegeFrame
     */
    public baseKnowlegeFrame(int selector){
        initComponents();
        dataManager a = new dataManager(selector);
        textArea.setText(a.getInfo());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadMBtn = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        graphMBtn = new javax.swing.JMenuItem();
        frequencyMBtn = new javax.swing.JMenuItem();
        posMeasuresMBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane2.setViewportView(textArea);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("Archivo");

        loadMBtn.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        loadMBtn.setText("Cargar");
        loadMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMBtnActionPerformed(evt);
            }
        });
        jMenu1.add(loadMBtn);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        graphMBtn.setText("Graficador");
        graphMBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graphMBtnActionPerformed(evt);
            }
        });
        jMenu2.add(graphMBtn);

        frequencyMBtn.setText("Frecuencias");
        jMenu2.add(frequencyMBtn);

        posMeasuresMBtn.setText("Medidas de Posición");
        jMenu2.add(posMeasuresMBtn);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MainMenuFrame main =  new MainMenuFrame();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loadMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMBtnActionPerformed
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("DSTF Files", "dstf");
        fc.setFileFilter(filter);
        int returnVal = fc.showOpenDialog(this);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            //Parts of the file manager(path, and savedFileObj)
            File file = fc.getSelectedFile();
            String path = file.getAbsolutePath();
            Path pathS = Paths.get(path);
            SavedFileObj e = null;
            
            //
            try{           
                FileInputStream fileIn = new FileInputStream(path);
                ObjectInputStream in = new ObjectInputStream(fileIn);
                e = (SavedFileObj) in.readObject();
                if(e.getWindowType() == 1){
                    graphFileReader a = (graphFileReader) in.readObject();
                    in.close();
                    fileIn.close();
                    graphicBarFrame b =  new graphicBarFrame(a,pathS.getFileName().toString());
                    b.setVisible(true);
                    this.dispose();
                }
                else if(e.getWindowType() == 2){
                    frequencyFileReader a = (frequencyFileReader) in.readObject();
                    in.close();
                    fileIn.close();
                    frequencyMeasuresFrame b = new frequencyMeasuresFrame(a, pathS.getFileName().toString());
                    b.setVisible(true);
                    this.dispose();
                }
                else if(e.getWindowType() == 3){
                    posMeasuresFileReader a = (posMeasuresFileReader) in.readObject();
                    in.close();
                    fileIn.close();
                    posMeasuresFrame b = new posMeasuresFrame(a, pathS.getFileName().toString());
                    b.setVisible(true);
                    this.dispose();
                }
                else{
                    in.close();
                    fileIn.close();
                }
            }
            catch(IOException i){
                i.printStackTrace();
            }
            catch(ClassNotFoundException c){
                c.printStackTrace();
            };
        }
    }//GEN-LAST:event_loadMBtnActionPerformed

    private void graphMBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graphMBtnActionPerformed
        graphicBarFrame a = new graphicBarFrame(null, null);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_graphMBtnActionPerformed

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
            java.util.logging.Logger.getLogger(baseKnowlegeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(baseKnowlegeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(baseKnowlegeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(baseKnowlegeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new baseKnowlegeFrame(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JMenuItem frequencyMBtn;
    private javax.swing.JMenuItem graphMBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadMBtn;
    private javax.swing.JMenuItem posMeasuresMBtn;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
