package com.nnxy.student;
/**
 * @author zhengguizhi
 * create date :2019/5/16
 * description :学生的实体类
 * 
 */

public class Studentmodel {
	private int id;
	private String username;
	private int sxe;
	private int age;
	
	
	@Override
	public String toString() {
		return "Studentmodel [id=" + id + ", username=" + username + ", sxe=" + sxe + ", age=" + age + "]";
	}
	public Studentmodel(int id, String username, int sxe, int age) {
		super();
		this.id = id;
		this.username = username;
		this.sxe = sxe;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSxe() {
		return sxe;
	}
	public void setSxe(int sxe) {
		this.sxe = sxe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	
}
