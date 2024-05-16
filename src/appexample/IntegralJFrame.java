
package appexample;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.*;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 * @author Myata
 */
public class IntegralJFrame extends javax.swing.JFrame {
    
    
    public IntegralJFrame() {
        initComponents();
    }

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldUp = new javax.swing.JTextField();
        jTextFieldLower = new javax.swing.JTextField();
        jTextFieldStep = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonAdd = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonCalc = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonFill = new javax.swing.JButton();
        jButtonSaveText = new javax.swing.JButton();
        jButtonLoadText = new javax.swing.JButton();
        jButtonSaveSer = new javax.swing.JButton();
        jButtonLoadSer = new javax.swing.JButton();
        jLabelTime = new javax.swing.JLabel();
        jLabelTime1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBackground(new java.awt.Color(0, 153, 153));
        jPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Integral of cos(x)"));
        jPanel.setName(""); // NOI18N

        jLabel1.setText("Upper border");

        jLabel2.setText("Lower border");

        jLabel3.setText("Step of calculate");

        jScrollPane1.setBackground(new java.awt.Color(0, 102, 102));

        jTable.setBackground(new java.awt.Color(0, 153, 153));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lower border", "Upper border", "Step", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setGridColor(new java.awt.Color(0, 102, 102));
        jTable.setSelectionForeground(new java.awt.Color(102, 255, 255));
        jScrollPane1.setViewportView(jTable);

        jButtonAdd.setBackground(new java.awt.Color(0, 153, 153));
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonDel.setBackground(new java.awt.Color(0, 153, 153));
        jButtonDel.setText("Delete");
        jButtonDel.setToolTipText("");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonCalc.setBackground(new java.awt.Color(0, 153, 153));
        jButtonCalc.setText("Calculate");
        jButtonCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(new java.awt.Color(0, 153, 153));
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonFill.setBackground(new java.awt.Color(0, 153, 153));
        jButtonFill.setText("Fill from collection");
        jButtonFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFillActionPerformed(evt);
            }
        });

        jButtonSaveText.setText("Save Text");
        jButtonSaveText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveTextActionPerformed(evt);
            }
        });

        jButtonLoadText.setText("Load Text");
        jButtonLoadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadTextActionPerformed(evt);
            }
        });

        jButtonSaveSer.setText("Save Ser");
        jButtonSaveSer.setToolTipText("");
        jButtonSaveSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveSerActionPerformed(evt);
            }
        });

        jButtonLoadSer.setText("Load Ser");
        jButtonLoadSer.setToolTipText("");
        jButtonLoadSer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadSerActionPerformed(evt);
            }
        });

        jLabelTime.setText("Time of calculate");

        jLabelTime1.setToolTipText("");

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldUp, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLower, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTime1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
            .addGroup(jPanelLayout.createSequentialGroup()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFill, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonLoadText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonLoadSer, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelLayout.createSequentialGroup()
                                .addComponent(jButtonSaveText, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSaveSer, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(88, 88, 88))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(52, 52, 52)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdd)
                    .addComponent(jButtonDel)
                    .addComponent(jButtonCalc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClear)
                    .addComponent(jButtonFill))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSaveText)
                    .addComponent(jButtonSaveSer))
                .addGap(19, 19, 19)
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLoadText)
                    .addComponent(jButtonLoadSer))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //необходимые переменные
    ArrayList<RecIntegral> arrList = new ArrayList<>();
    
    
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        
        DefaultTableModel tModel = (DefaultTableModel) jTable.getModel();
        int rowNum = 0;
        
        double upLim, lowLim, step, res;
        
        try{
            upLim = Double.parseDouble(jTextFieldUp.getText());
            lowLim = Double.parseDouble(jTextFieldLower.getText());
            step = Double.parseDouble(jTextFieldStep.getText());

            if(lowLim >= upLim)
            {
                throw new myException("Нижний порог > или = верхнему");
            }
            if(step > (upLim - lowLim))
            {
                throw new myException("Шаг интегрирования превышает интервал интегрирования");
            }
            
            if(lowLim <0.000001 || lowLim >1000000)
            {
                throw new myException("Нижний порог не находится в диапазоне [0.000001 ; 1000000]");
            }
            if(upLim <0.000001 || upLim >1000000)
            {
                throw new myException("Верхний порог не находится в диапазоне [0.000001 ; 1000000]");
            }
            if(step <0.000001 || step >1000000)
            {
                throw new myException("Шаг не находится в диапазоне [0.000001 ; 1000000]");
            }
         
        } catch (NumberFormatException ex) // обработка ошибок ввода данных
        { 
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }
        catch (myException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return;
        }        
                
        tModel.addRow(new Object[]{lowLim, upLim, step});
        
        jTextFieldUp.setText("");
        jTextFieldLower.setText("");
        jTextFieldStep.setText("");
        
//        rowNum = tModel.getRowCount() - 1;
        
        arrList.add(new RecIntegral(lowLim, upLim, step));
//                Double.parseDouble(tModel.getValueAt(rowNum, 0).toString()),
//                Double.parseDouble(tModel.getValueAt(rowNum, 1).toString()),
//                Double.parseDouble(tModel.getValueAt(rowNum, 2).toString())
//        ));
        
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        
        DefaultTableModel tModel = (DefaultTableModel) jTable.getModel();
        int rowNum = jTable.getSelectedRow();
        
        if (rowNum == -1){
            JOptionPane.showMessageDialog(null, "Выбеите строку");
            return;
        }else{
            tModel.removeRow(rowNum);
            arrList.remove(rowNum);
        }
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        
        DefaultTableModel tModel = (DefaultTableModel) jTable.getModel();
        tModel.setRowCount(0);
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcActionPerformed
        
        DefaultTableModel tModel = (DefaultTableModel) jTable.getModel();
        int rowNum = jTable.getSelectedRow();
        
        double upLim, lowLim, step, res = 0;
        
        if (rowNum == -1){
            JOptionPane.showMessageDialog(null, "Выбеите строку");
            return;
        }else{
            
            lowLim = Double.parseDouble(tModel.getValueAt(rowNum, 0).toString());
            upLim = Double.parseDouble(tModel.getValueAt(rowNum, 1).toString());
            step = Double.parseDouble(tModel.getValueAt(rowNum, 2).toString());
            
            long startTime = System.nanoTime();

            res = CalcInt(lowLim, upLim, step);
            
            long endTime = System.nanoTime();
            long duration = (endTime - startTime);//1000000;
            
            String st1 = String.valueOf(duration);
            double db1 = Double.parseDouble(st1)/1000000;
            //db1 /= 1000000;
            
            jLabelTime1.setText(String.valueOf(db1) + " msec");

            tModel.setValueAt(res, rowNum, 3);
            arrList.set(rowNum, new RecIntegral(lowLim, upLim, step, res));
        }
    }//GEN-LAST:event_jButtonCalcActionPerformed

    private void jButtonFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFillActionPerformed
        
        DefaultTableModel tModel = (DefaultTableModel) jTable.getModel();
        tModel.setRowCount(0);
        
        for (RecIntegral item: arrList){
            tModel.addRow(new Object[]{item.getDownLim(),item.getUpLim(),item.getStep(), item.getResult()});
        }
        
//        arrList.forEach((RecIntegral obj)->{
//            tModel.addRow(new Object[]{obj.getDownLim(),obj.getUpLim(),obj.getStep(), obj.getResult()});
//            });
    }//GEN-LAST:event_jButtonFillActionPerformed

    private void jButtonSaveTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveTextActionPerformed
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file (*.txt)", "txt");
        f.setFileFilter(filter);
        f.showSaveDialog(null);
        
        File file = f.getSelectedFile();
        
        if(!file.getPath().endsWith(".txt"))
        {
            file = new File(file.getPath()+ ".txt");
        }
        
        try(FileWriter writer = new FileWriter(file, false))
        {
            String temp = "";
            
            for(RecIntegral o : arrList)
            {
                writer.write(o.getDownLim() + " " +
                            o.getUpLim() + " " +
                            o.getStep() + " " +
                            o.getResult() + "\n");
//                temp += o.getDownLim() + " ";
//                temp += o.getUpLim() + " ";
//                temp += o.getStep() + " ";
//                temp += o.getResult() + "\n";
//                writer.write(temp);
//                temp = "";
            }
            writer.flush();
            writer.close();
        } catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    
    }//GEN-LAST:event_jButtonSaveTextActionPerformed

    private void jButtonLoadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadTextActionPerformed
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Text file (*.txt)", "txt");
        f.setFileFilter(filter);
        f.showOpenDialog(null);
        File file = f.getSelectedFile();

//        try(FileReader reader = new FileReader(file))//посимвольное чтение
//        {
//            String temp = "";
//            int c;
//            while((c = reader.read()) != -1){
//                temp += (char)c;
//            }
//            reader.close();
//            arrList.clear();
            //var list = new ArrayList<RecIntegral>();
            
//            String [] StrObj = temp.split("\n");
//            for(String s : StrObj)
//            {
//                String[] StrVal = s.split(" ");
//                arrList.add(new RecIntegral(
//                    Double.parseDouble(StrVal[0]),
//                    Double.parseDouble(StrVal[1]),
//                    Double.parseDouble(StrVal[2]),
//                    Double.parseDouble(StrVal[3])
//                ));
//                        
//            }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {//построчное чтение
            arrList.clear();
            String temp = "";
            while((temp = reader.readLine())!= null){
                String[] part = temp.split(" ");
                arrList.add(new RecIntegral(
                    Double.parseDouble(part[0]),
                    Double.parseDouble(part[1]),
                    Double.parseDouble(part[2]),
                    Double.parseDouble(part[3])
                ));
            };
            reader.close();

            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);
            arrList.forEach((RecIntegral obj)->{
                model.addRow(new Object[]{obj.getDownLim(),obj.getUpLim(),obj.getStep(), obj.getResult()});
            });
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButtonLoadTextActionPerformed

    private void jButtonSaveSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveSerActionPerformed
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary file (*.ser)", "ser");
        f.setFileFilter(filter);
        f.showSaveDialog(null);
        
        File file = f.getSelectedFile();
        
        if(!file.getPath().endsWith(".ser"))
        {
            file = new File(file.getPath()+ ".ser");
        }
        
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file)))
        {
            out.writeObject(arrList);
            out.flush();
            out.close();
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButtonSaveSerActionPerformed

    private void jButtonLoadSerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadSerActionPerformed
        JFileChooser f = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("(*.ser)", "ser");
        f.setFileFilter(filter);
        f.showOpenDialog(null);  
        File file = f.getSelectedFile();

        
        try(ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))))
        {
            arrList = (ArrayList<RecIntegral>)in.readObject();
            in.close();
            
            DefaultTableModel model = (DefaultTableModel) jTable.getModel();
            model.setRowCount(0);
            
            arrList.forEach((RecIntegral obj)->{
                model.addRow(new Object[]{obj.getDownLim(),obj.getUpLim(),obj.getStep(), obj.getResult()});
            });
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButtonLoadSerActionPerformed
    
    public double CalcInt(double lowLim, double upLim, double step){
        
        double start, h, sumS = 0;
        
        start = lowLim;
        
        do{
            h = Math.min(step, (upLim - start));
            sumS += h * (Math.cos(start) + Math.cos(start + h))/2;
            start += h;
        }while((start) < upLim);
        
//        for (double tmp = lowLim; ;){
//            
//        }
        
        return sumS;
        
    }

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
            java.util.logging.Logger.getLogger(IntegralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntegralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntegralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntegralJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntegralJFrame().setVisible(true);
            }
        });
    }

    private static class myException extends Exception {

        public myException(String message) {
            super(message);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCalc;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonFill;
    private javax.swing.JButton jButtonLoadSer;
    private javax.swing.JButton jButtonLoadText;
    private javax.swing.JButton jButtonSaveSer;
    private javax.swing.JButton jButtonSaveText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTime;
    private javax.swing.JLabel jLabelTime1;
    private javax.swing.JPanel jPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldLower;
    private javax.swing.JTextField jTextFieldStep;
    private javax.swing.JTextField jTextFieldUp;
    // End of variables declaration//GEN-END:variables
}
