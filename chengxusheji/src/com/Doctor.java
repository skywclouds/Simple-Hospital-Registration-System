/**
 * 医院挂号系统
 * Date: 2021-06-30
 * Author: Henry Wang
 * */
package com;
/**医生类
 * */
public class Doctor {
	/**储存所有医生对象的数组
	 * */
	static Doctor[] doctors = null;
	/**医生姓名
	 * */
	String name = "";
	/**时间数组
	 * */
	String[] times = {"09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30"};
	
	/**初始化医生方法
	 * */
	static public void inDoctors() {
		String sql = "select * from yuangong_tab";
		String[][] results = Main.toArray(Main.select(sql, 4));
		doctors = new Doctor[results.length];
		for(int i = 0;i < results.length;i++) {
			doctors[i] = new Doctor(results[i][1]);
		}
	}
	
	/**构造方法
	 * */
	public Doctor(String name) {
		this.name = name;
	}
	
	/**获取医生在数组中的位置
	 * */
	static public int getindex(String name) {
		for(int i = 0;i < doctors.length;i++) 
			if(doctors[i].name.equals(name))
				return i;		
		return 0;
	}
	
	/**将已预约的时间删除
	 * */
	public void deleteTime(int index) {
    	String[] t_times = new String[times.length-1];
    	for(int i = 0;i < index;i++)
    		t_times[i] = times[i];
    	for(int i = index;i+1 < times.length;i++)
    		t_times[i] = times[i+1];
    	times = t_times;
	}

}
