/**
 * 医院挂号系统
 * Date: 2021-06-29
 * Author: Henry Wang
 * */
package com;

/**
*撤销挂号窗体
*/
public class CxFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;
/**
    * Creates new form NewJFrame5
    */
   public CxFrame() {
       initComponents();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   
   // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jComboBox1 = new javax.swing.JComboBox<>();
       jButton1 = new javax.swing.JButton();

       setTitle("撤销挂号");

       jLabel1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
       jLabel1.setText("请选择您要撤销第几个挂号:");
       int n = CkFrame.r.length;
       String[] model = new String[n];
       for(int i = 0;i < n;i++) {
    	   model[i] = "第" + (i+1) + "个";
       }
       
       

       jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(model));

       jButton1.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
       jButton1.setText("撤销挂号");
       jButton1.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               jButton1ActionPerformed(evt);
           }
       });

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(layout.createSequentialGroup()
                       .addGap(35, 35, 35)
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                   .addGroup(layout.createSequentialGroup()
                       .addGap(70, 70, 70)
                       .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addContainerGap(32, Short.MAX_VALUE))
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(30, 30, 30)
               .addComponent(jLabel1)
               .addGap(18, 18, 18)
               .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
               .addComponent(jButton1)
               .addGap(46, 46, 46))
       );

       pack();
   }// </editor-fold>                        

   /**撤销挂号信息
    * */
   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       // TODO add your handling code here:
	   int index = jComboBox1.getSelectedIndex();
	   String id = CkFrame.r[index][0];
	   String sql = "delete from jiezhen_tab where id = '";
	   sql = sql + id +"'";
	   System.out.println(sql);
	   Main.delete(sql);
	   System.out.println("删除成功");
	   //撤销挂号之后刷新表格
	   MainFrame.ck.refreshTable();
	   setVisible(false);
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
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(CxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(CxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(CxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(CxFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new CxFrame().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JButton jButton1;
   private javax.swing.JComboBox<String> jComboBox1;
   private javax.swing.JLabel jLabel1;
   // End of variables declaration                   
}
