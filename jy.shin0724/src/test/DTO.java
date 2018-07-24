package test;

import java.util.Date;

public class DTO {
	private int num;
	private String name;
	private int jumsu;
	private String date;
	Date d=new Date();
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getJumsu() {
		return jumsu;
	}
	public void setJumsu(int jumsu) {
		this.jumsu = jumsu;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "DTO [num=" + num + ", name=" + name + ", jumsu=" + jumsu + ", date=" + d.toString() + "]";
	}

}
