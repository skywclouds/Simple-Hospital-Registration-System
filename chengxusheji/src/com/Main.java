/**
 * 医院挂号系统
 * Date: 2021-06-29
 * Author: Henry Wang
 * */
package com;

import java.sql.*;
import java.util.ArrayList;
/**主类
 * */
public class Main {

	/**连接数据库的对象
	 * */
	public static Connection con;
	/**传递T-SQL语句的对象
	 * */
	public static Statement st;
	/**获取结果的对象
	 * */
	public static ResultSet rs;
	/**main方法
	 * */
	public static void main(String [] args){
		link();//连接数据库
		new LogDialog().setVisible(true);
		//new MainFrame().setVisible(true);
		//new CustomFrame().setVisible(true);
		
	}
	/**连接数据库
	 * */
	public static void link() {
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=neuedu";
		String userName="sa";
		String userPwd="123456";
		try{
			
			con=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("连接数据库成功");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**查询数据库的内容
	 * */
	public static ArrayList<ArrayList<String>> select(String sqlCodes, int n) {
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
		//将查询结果以二维字符串数组形式返回
		try {
			st=con.createStatement();
			rs = st.executeQuery(sqlCodes);//执行sql语句
			while(rs.next()) {
				//将结果插入二维数组
				ArrayList<String> temp = new ArrayList<String>();
				for(int i = 1;i <= n;i++) {
					if(rs.getString(i) != null) 
						temp.add(rs.getString(i).trim());					
					else 
						temp.add("null");					
				}
				list.add(temp);
			}
			System.out.println("查询成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;//返回结果
	}
	/**将list转换为二维数组
	 * */
	public static String[][] toArray(ArrayList<ArrayList<String>> list){
		int m = list.size();
		if(m == 0)
			return null;
		int n = list.get(0).size();
		String[][] array = new String[m][n];
		for(int i = 0;i < m;i++) {
			for(int j = 0;j < n;j++) {
				array[i][j] = list.get(i).get(j);
			}
		}
		return array;
	}
	/**生成随机id
	 * */
	public static String randBianhao() {
		String s = "";
		for(int i = 0;i < 9;i++) {
			s = s + (char)('a' + (int)(Math.random()*26));
		}
		return s;
	}
	/**向数据库中插入数据
	 * */
	public static void insert(String sqlCodes) {
		try {
			st=con.createStatement();
			st.executeUpdate(sqlCodes);//执行sql语句
			
			System.out.println("插入成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**更新数据库中数据
	 * */
	public static void update(String sqlCodes) {
		try {
			st=con.createStatement();
			st.executeUpdate(sqlCodes);//执行sql语句
			System.out.println("更新成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**删除数据库中数据
	 * */
	public static void delete(String sqlCodes) {
		try {
			st=con.createStatement();
			st.executeUpdate(sqlCodes);//执行sql语句
			
			System.out.println("删除成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


