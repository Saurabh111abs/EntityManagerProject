package com.without.consumer;

public class Consumer {
	
	private String tea_Name;
	private String emp_Name;
	private String ply_sport;
	
	public String getTea_Name() {
		return tea_Name;
	}
	public void setTea_Name(String tea_Name) {
		this.tea_Name = tea_Name;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public String getPly_sport() {
		return ply_sport;
	}
	public void setPly_sport(String ply_sport) {
		this.ply_sport = ply_sport;
	}
	public Consumer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Consumer [tea_Name=" + tea_Name + ", emp_Name=" + emp_Name + ", ply_sport=" + ply_sport + "]";
	}
	
	
	
	
	

}
