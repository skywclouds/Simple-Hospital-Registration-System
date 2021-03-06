/**
 * 医院挂号系统
 * Date: 2021-06-29
 * Author: Henry Wang
 * */
package com;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
	
	/**查看挂号信息窗口的对象
	 * */
	static CkFrame ck = null;
	
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form NewJFrame
     */
    public MainFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("欢迎使用挂号系统");
        
        jLabel1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel1.setText("请选择科室：");

        jLabel2.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel2.setText("请选择医生：");

        jLabel3.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel3.setText("请选择时间：");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "请选择", "外科", "内科", "皮肤科", "眼科", "口腔科" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jComboBox3.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        //获取患者姓名
    	String sql = "select name from yonghu_tab where id = '";
    	sql = sql + LogDialog.userid+"'";
    	String[][] results = Main.toArray(Main.select(sql, 1));
        
        jLabel4.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jLabel4.setText("患者姓名："+results[0][0]);
        
        jButton1.setFont(new java.awt.Font("宋体", 0, 18)); // NOI18N
        jButton1.setText("确定");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("宋体", 0, 14)); // NOI18N
        jButton2.setText("查看挂号信息");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>                        

    /**选择科室
     * */
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        int index = jComboBox1.getSelectedIndex();
        String sql = null;
        String[][] result = null;
        if(index == 1) {
        	sql = "select name from yuangong_tab where keshi = "
        	+"'外科' and zaigang = 1";
        }else if(index == 2) {
        	sql = "select name from yuangong_tab where keshi = "
        	+"'内科' and zaigang = 1";
        }else if(index == 3) {
        	sql = "select name from yuangong_tab where keshi = "
        	+"'皮肤科' and zaigang = 1";
        }else if(index == 4) {
        	sql = "select name from yuangong_tab where keshi = "
        	+"'眼科' and zaigang = 1";
        }else if(index == 5) {
        	sql = "select name from yuangong_tab where keshi = "
        	+"'口腔科' and zaigang = 1";
        }
        //根据选择的科室查找对应的医生
        if(index != 0) {
        	result = Main.toArray(Main.select(sql, 1));
            String[] doctor = new String[result.length];
            for(int i = 0;i < result.length;i++) {
            	doctor[i] = result[i][0];
            }
            jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(doctor));
        }else {
        	jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        }
        
    }
    /**选择医生
     * */
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    	String name = jComboBox2.getSelectedItem().toString();
    	//根据姓名找出对应的医生对象
    	int doctorIndex = Doctor.getindex(name);
    	jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
    			Doctor.doctors[doctorIndex].times));
    	
    }     
    /**确定按钮
     * */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	String time = jComboBox3.getSelectedItem().toString();
    	String name = jComboBox2.getSelectedItem().toString();
    	int doctorIndex = Doctor.getindex(name);
    	int index = jComboBox3.getSelectedIndex();
    	Doctor.doctors[doctorIndex].deleteTime(index);
    	jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
    			Doctor.doctors[doctorIndex].times));
    	
    	//获取患者姓名
    	String sql = "select name from yonghu_tab where id = '";
    	sql = sql + LogDialog.userid+"'";
    	String[][] results = Main.toArray(Main.select(sql, 1));
    	//患者不能在同一个时间挂两个号
    	sql = "select count(*) from jiezhen_tab where patient = '";
    	sql = sql + results[0][0] +"' and chuli = 0 ";
    	Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		sql = sql + "and time = '" + sd.format(date) +" "+ time + "'";
		System.out.println(sql);
		results = Main.toArray(Main.select(sql, 1));
		if(!results[0][0].equals("0")) {
			JOptionPane.showMessageDialog(this, "该时间端已挂号，不能再次挂号！", "提示", 0);
		}else {
			//挂号信息插入数据库
			//获取患者姓名
	    	sql = "select name from yonghu_tab where id = '";
	    	sql = sql + LogDialog.userid+"'";
	    	results = Main.toArray(Main.select(sql, 1));
	    	sql = "insert into jiezhen_tab values('";
	    	sql = sql + Main.randBianhao()+"','";    	
	    	sql = sql + results[0][0]+"','";
	    	sql = sql + jComboBox2.getSelectedItem().toString()+"','";
	    	date = new Date();
			sd = new SimpleDateFormat("yyyy-MM-dd");
			sql = sql + sd.format(date)+" "+time+"',0,null)";
			System.out.println(sql);
			Main.insert(sql);
	    	JOptionPane.showMessageDialog(this, "挂号成功", "温馨提示", 1);
		}
    	
    	
    }
    /**查看挂号信息
     * */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    	ck = new CkFrame();
    	ck.setVisible(true);
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration                   
}
